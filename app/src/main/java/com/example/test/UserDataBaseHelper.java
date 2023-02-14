package com.example.test;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UserDataBaseHelper extends SQLiteOpenHelper
{
    SQLiteDatabase userDataBase; // static variable 3lshan ytshaf f kol 7ta register w login w el data 3lshan md5lhash tany w yb2a fe validation 3lahom mhma el table 7slo update
    private final static String USER_TABLE = "user";
    private final static String USER_COL_ID = "userID";//primary key
    private final static String USER_COL_NAME = "userName";
    private final static String USER_COL_PASSWORD = "userPassword";
    private final static String USER_COL_PHONE = "userPhoneNumber";
    private final static String USER_COL_EMAIL = "userEmail";

    public UserDataBaseHelper(Context context)
    {
        super(context, USER_TABLE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        //creation of the table
        db.execSQL("CREATE TABLE " +USER_TABLE+" ("+USER_COL_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+USER_COL_NAME+" TEXT, "+USER_COL_EMAIL+" TEXT, "+USER_COL_PASSWORD+" TEXT, "+USER_COL_PHONE+" TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS "+USER_TABLE+"");
        onCreate(db);
    }

    public void insertUserInDataBase(User user)//register fun.
    {
        ContentValues addRow = new ContentValues();//to add rows

        addRow.put(USER_COL_NAME, user.getUserName());
        addRow.put(USER_COL_EMAIL, user.getUserEmail());
        addRow.put(USER_COL_PASSWORD, user.getUserPassword());
        addRow.put(USER_COL_PHONE, user.getUserPhoneNumber());


        userDataBase = getWritableDatabase();// to save inside database(write)
        userDataBase.insert(USER_TABLE, null, addRow);
        userDataBase.close();
    }

    public boolean checkIfUserExists(User user)//for register
    {
        userDataBase = getReadableDatabase();
        String[] arg = {user.getUserEmail(), user.getUserPhoneNumber()};//read to check if email, phone number ,ect... if already found or not
        Cursor cursor = userDataBase.rawQuery("SELECT * FROM "+USER_TABLE+" WHERE "+USER_COL_EMAIL+"=? OR "+USER_COL_PHONE+"=? ", arg);
        //check on the given query   😊? means match)
        if(cursor.getCount() <= 0)//no data (empty) or no results match
        {
            cursor.close();
            return false;// hay3ml register
        }

        cursor.close();
        return true;//if found   msh hay3ml
    }

    public boolean checkIfEmailAndPasswordCorrect(String emailValue, String passwordValue)//for login check
    {
        //any check by getReadableDatabase()
        userDataBase = getReadableDatabase();

        String[] arg = {emailValue, passwordValue};

        Cursor cursor = userDataBase.rawQuery("SELECT "+USER_COL_EMAIL+" AND "+USER_COL_PASSWORD+" FROM "+USER_TABLE+" WHERE "+USER_COL_EMAIL+"=? AND "+USER_COL_PASSWORD+"=? " , arg);
// by3ml match el data ely da5la bl array of strings ely da5l
        if(cursor.getCount() > 0)//lw fe haga m3molha save
        {
            cursor.close();
            return true;  //hayd5ol

        }
        else {
            cursor.close();//failed to login
            return false; //msh hayd5ol
        }
    }
}