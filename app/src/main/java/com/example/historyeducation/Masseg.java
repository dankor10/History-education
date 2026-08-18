package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Masseg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masseg);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView buttonGoSetHome = (ImageView) findViewById(R.id.imageViewsetHomeMasseg);
        buttonGoSetHome.setOnClickListener(v -> startActivity(new Intent(Masseg.this, home.class)));
    }
}