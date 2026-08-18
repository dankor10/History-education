package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Minsk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minsk);

        Button buttonfirsttaskMinsk = (Button) findViewById(R.id.buttonfirsttaskMinsk);
        buttonfirsttaskMinsk.setOnClickListener(v -> startActivity(new Intent(Minsk.this, FirstTaskMinsk.class)));

        ImageView imageButtonbackMinsk = (ImageView) findViewById(R.id.imageButtonbackMinsk);
        imageButtonbackMinsk.setOnClickListener(v -> startActivity(new Intent(Minsk.this, home.class)));

        ImageView imageViewGerbStoreMinsk = (ImageView) findViewById(R.id.imageViewGerbStoreMinsk);
        imageViewGerbStoreMinsk.setOnClickListener(v -> startActivity(new Intent(Minsk.this, GerbStore.class)));

        ImageView imageViewProfilMinsk = (ImageView) findViewById(R.id.imageViewProfilMinsk);
        imageViewProfilMinsk.setOnClickListener(v -> startActivity(new Intent(Minsk.this, account.class)));

        ImageView imageViewmessegMinsk = (ImageView) findViewById(R.id.imageViewmessegMinsk);
        imageViewmessegMinsk.setOnClickListener(v -> startActivity(new Intent(Minsk.this, Masseg.class)));

        ImageView imageViewbokMinsk = (ImageView) findViewById(R.id.imageViewbokMinsk);
        imageViewbokMinsk.setOnClickListener(v -> startActivity(new Intent(Minsk.this, Matireal.class)));
    }
}