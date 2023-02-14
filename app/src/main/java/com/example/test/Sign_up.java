package com.example.test;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_up extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final EditText editTextName = (EditText) findViewById(R.id.name);
        final EditText editTextEmail = (EditText) findViewById(R.id.email1);
        final EditText editTextPassword = (EditText) findViewById(R.id.pass);
        final EditText editTextPhoneNumber = (EditText) findViewById(R.id.phone);
        TextView log=(TextView)findViewById(R.id.textView70);
        log.setPaintFlags(log.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        Button signUpFormBtn = (Button) findViewById(R.id.button2);

        final UserDataBaseHelper userDB = new UserDataBaseHelper(this);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Sign_up.this,login.class);
                startActivity(i);
            }
        });


        // Some operations are running on the user inputs when he pressed on the "Sign Up" button in "Sign Up Form"
        signUpFormBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                //Using "User" class and pass the inputs above to the constructor of "User" class.
                //We needed to convert the password text and phone number text into String then parse the String into Integer


                User user = new User(editTextName.getText().toString(), editTextEmail.getText().toString(),
                        editTextPhoneNumber.getText().toString(), editTextPassword.getText().toString()
                );



                //We need now to check if the user is already in the Data Base or is not
                //So we should search on him\her, using the his\her "Phone Number and email" as a primary key of register
                //primary key of the table is id


                    if(!(editTextName.getText().toString().equals("")||editTextEmail.getText().toString().equals("")||editTextPhoneNumber.getText().toString().equals("")||editTextPassword.getText().toString().equals(""))){
                        if(userDB.checkIfUserExists(user))//check of register
                        {
                            Toast.makeText(getApplicationContext(), "User already exists!", Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            userDB.insertUserInDataBase(user);//for register
                            Toast.makeText(getApplicationContext(), "You have been registered successfully", Toast.LENGTH_LONG).show();
                        }
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "sorry, there is missing data", Toast.LENGTH_LONG).show();
                    }




            }
        });
    }
}