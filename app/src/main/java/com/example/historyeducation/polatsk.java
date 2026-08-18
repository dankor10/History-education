package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class polatsk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polatsk);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageButtonbackpol1 = (ImageView) findViewById(R.id.imageButtonbackpol1);
        imageButtonbackpol1.setOnClickListener(v -> startActivity(new Intent(polatsk.this, home.class)));

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = (Button) findViewById(R.id.buttonfirsttaskpolatsk);
        button.setOnClickListener(v -> startActivity(new Intent(polatsk.this, firsttaskpolatsk.class)));

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonpol2 = (Button) findViewById(R.id.buttonGoFourFirstTasklvl2);
        buttonpol2.setOnClickListener(v -> startActivity(new Intent(polatsk.this, firsttaskpolatsklvl2.class)));

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button69567856 = (Button) findViewById(R.id.buttonGoFourserdTasklvl2);
        button69567856.setOnClickListener(v -> startActivity(new Intent(polatsk.this, serdTasckpolatsk.class)));

        Button button695 = (Button) findViewById(R.id.button69567856);
        button695.setOnClickListener(v -> startActivity(new Intent(polatsk.this, LoginTry.class)));

        ImageView imageViewGerbStorepolatsk234 = (ImageView) findViewById(R.id.imageViewGerbStorepolatsk234);
        imageViewGerbStorepolatsk234.setOnClickListener(v -> startActivity(new Intent(polatsk.this, GerbStore.class)));

        ImageView imageViewProfilPolatskqwer = (ImageView) findViewById(R.id.imageViewProfilPolatskqwer);
        imageViewProfilPolatskqwer.setOnClickListener(v -> startActivity(new Intent(polatsk.this, account.class)));

        ImageView imageViewmessegPolatsk2781634 = (ImageView) findViewById(R.id.imageViewmessegPolatsk2781634);
        imageViewmessegPolatsk2781634.setOnClickListener(v -> startActivity(new Intent(polatsk.this, Masseg.class)));

        ImageView imageViewboooook = (ImageView) findViewById(R.id.imageViewboooook);
        imageViewboooook.setOnClickListener(v -> startActivity(new Intent(polatsk.this, Matireal.class)));
    }
}