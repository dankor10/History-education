package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class serdprize2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serdprize2);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttongoforsecondlvlpolatsk78989 = (Button) findViewById(R.id.buttongoforsecondlvlpolatsk78989);
        buttongoforsecondlvlpolatsk78989.setOnClickListener(v -> startActivity(new Intent(serdprize2.this, polatsk.class)));

    }
}