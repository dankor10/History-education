package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView buttonGoSetHome = (ImageView) findViewById(R.id.imageViewsetHomeAccount);
        buttonGoSetHome.setOnClickListener(v -> startActivity(new Intent(account.this, home.class)));

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textViewGoToRegistr = (TextView) findViewById(R.id.textViewGoToRegistr);
        textViewGoToRegistr.setOnClickListener(v -> startActivity(new Intent(account.this, LoginTry.class)));
    }
}