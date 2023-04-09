package com.example.kuis1_sitiaisyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        email=(EditText) findViewById(R.id.input1);
        password=(EditText) findViewById(R.id.input2);
        signin=(Button) findViewById(R.id.buttonSignin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(email.getText().toString().equals("2041720061") && password.getText().toString().equals("password")){
                    startActivity(new Intent(MainActivity.this,MainActivity_page2.class));
                } else if(email.getText().toString().equals("083857129219") && password.getText().toString().equals("password")) {
                    startActivity(new Intent(MainActivity.this,MainActivity_page2.class));
                } else if(email.getText().toString().equals("sitiaisyah4110@gmail.com") && password.getText().toString().equals("password")){
                    startActivity(new Intent(MainActivity.this,MainActivity_page2.class));
                } else{
                    email.setError("No.Anggota/HP/Email harus diisi");
                    password.setError("Password harus diisi");
                }
            }
        });
    }
}