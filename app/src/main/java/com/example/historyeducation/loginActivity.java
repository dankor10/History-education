package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class loginActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private Button buttonLogin;
    private EditText editTextPassword;

    private boolean isInternetConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();


        if (networkInfo != null && networkInfo.isConnected()) {

            try {
                URL url = new URL("https://www.google.com");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestProperty("User-Agent", "Android");
                connection.setRequestProperty("Connection", "close");
                connection.setConnectTimeout(1500);


                return (connection.getResponseCode() == 200);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (servermanager.login(username, password)) {
                    Intent intent = new Intent(loginActivity.this, firsttaskpolatsk.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(loginActivity.this, "няправільны лагін або пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}