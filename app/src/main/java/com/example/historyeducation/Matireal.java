package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Matireal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matireal);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageViewsetHomeMaseeg = (ImageView) findViewById(R.id.imageViewsetHomeMaseeg);
        imageViewsetHomeMaseeg.setOnClickListener(v -> startActivity(new Intent(Matireal.this, home.class)));

    }
}