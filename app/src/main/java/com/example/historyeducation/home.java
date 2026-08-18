package com.example.historyeducation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    private ImageView buttonHomeAkk , buttonHomeMes , buttonHomeGerb , buttonHomeMat;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        buttonHomeAkk = findViewById(R.id.buttonHomeAkk);
        buttonHomeMes = findViewById(R.id.buttonHomeMes);
        buttonHomeGerb = findViewById(R.id.buttonHomeGerb);
        buttonHomeMat = findViewById(R.id.buttonHomeMat);

        TextView textViewPolatsk = (TextView) findViewById(R.id.textViewPolatsk);
        textViewPolatsk.setOnClickListener(v -> startActivity(new Intent(home.this, polatsk.class)));

        TextView textViewMinsk = (TextView) findViewById(R.id.textViewMinsk);
        textViewMinsk.setOnClickListener(v -> startActivity(new Intent(home.this, Minsk.class)));

        ImageView buttonHomeAkk = (ImageView) findViewById(R.id.buttonHomeAkk);
        buttonHomeAkk.setOnClickListener(v -> startActivity(new Intent(home.this, account.class)));

        ImageView buttonHomeMes = (ImageView) findViewById(R.id.buttonHomeMes);
        buttonHomeMes.setOnClickListener(v -> startActivity(new Intent(home.this, Masseg.class)));

        ImageView buttonHomeGerb = (ImageView) findViewById(R.id.buttonHomeGerb);
        buttonHomeGerb.setOnClickListener(v -> startActivity(new Intent(home.this, GerbStore.class)));

        ImageView buttonHomeMat = (ImageView) findViewById(R.id.buttonHomeMat);
        buttonHomeMat.setOnClickListener(v -> startActivity(new Intent(home.this, Matireal.class)));



    }

}
