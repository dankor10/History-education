package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class GerbStore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerb_store);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView buttonGoSetHome = (ImageView) findViewById(R.id.buttonGoSetHomeGerbStore);
        buttonGoSetHome.setOnClickListener(v -> startActivity(new Intent(GerbStore.this, home.class)));
    }
}