package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class prizePolatsk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prize_polatsk);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonprize = (Button) findViewById(R.id.buttongoforsecondlvlpolatsk);
        buttonprize.setOnClickListener(v -> startActivity(new Intent(prizePolatsk.this, polatsk.class)));

    }
}