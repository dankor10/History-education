package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginTry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_try);

        Button buttonregistr = (Button) findViewById(R.id.buttonregistr);
        buttonregistr.setOnClickListener(v -> startActivity(new Intent(LoginTry.this, home.class)));

        TextView buttonlogintest = (TextView) findViewById(R.id.buttonlogintest);
        buttonlogintest.setOnClickListener(v -> startActivity(new Intent(LoginTry.this, RegistrationTry.class)));
    }
}