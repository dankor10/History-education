package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class serdprize1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serdprize1);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttongoforprize3polatsk = (Button) findViewById(R.id.buttongoforprize3polatsk);
        buttongoforprize3polatsk.setOnClickListener(v -> startActivity(new Intent(serdprize1.this, serdprize2.class)));
    }
}