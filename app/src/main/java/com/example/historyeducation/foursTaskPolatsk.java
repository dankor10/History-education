package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class foursTaskPolatsk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fours_task_polatsk);

        Button buttonfours2 = (Button) findViewById(R.id.buttongoforprizepolatsk);
        buttonfours2.setOnClickListener(v -> startActivity(new Intent(foursTaskPolatsk.this, prizePolatsk.class)));
    }
}