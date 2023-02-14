package com.example.test;
import static com.example.test.R.id.phone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button Btn = (Button) findViewById(R.id.button2);
        final EditText editTextPassword = (EditText) findViewById(R.id.pass);
        final EditText Email = (EditText) findViewById(R.id.name);
        final EditText phone = (EditText) this.<View>findViewById(R.id.phone);
        final UserDataBaseHelper userDB = new UserDataBaseHelper(this);
        TextView t =(TextView) findViewById(R.id.textView69);
        t.setPaintFlags(t.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(login.this,Sign_up.class);
                startActivity(i);
            }
        });
        Btn.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {//check for login
                if(userDB.checkIfEmailAndPasswordCorrect(Email.getText().toString(), editTextPassword.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Signed in successfully", Toast.LENGTH_LONG).show();
                    Intent i= new Intent(login.this,home.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Wrong Email or Password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}