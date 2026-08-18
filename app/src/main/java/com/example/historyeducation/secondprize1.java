package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class secondprize1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondprize1);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttongoforprize2polatsk = (Button) findViewById(R.id.buttongoforprize2polatsk);
        buttongoforprize2polatsk.setOnClickListener(v -> startActivity(new Intent(secondprize1.this, secondprize2.class)));
    }
}