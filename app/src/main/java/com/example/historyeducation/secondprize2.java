package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class secondprize2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondprize2);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttongoforsecondlvlpolatsk456456 = (Button) findViewById(R.id.buttongoforsecondlvlpolatsk456456);
        buttongoforsecondlvlpolatsk456456.setOnClickListener(v -> startActivity(new Intent(secondprize2.this, polatsk.class)));
    }
}