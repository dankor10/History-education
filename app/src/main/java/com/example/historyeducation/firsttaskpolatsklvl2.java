package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class firsttaskpolatsklvl2 extends AppCompatActivity implements View.OnClickListener {


    private View ImageView;
    private View TextView;
    private View TextView1;
    private Button Button6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsttaskpolatsklvl2);

        ImageView = findViewById(R.id.imageViewotvetsec2);
        TextView = findViewById(R.id.textVieOtvetPravsec2);
        TextView1 = findViewById(R.id.textVieOtvetnePravsec2);
        Button6 = findViewById(R.id.buttongosecondtasklvl2);

        ImageView buttonbackfirsttasklvl2 = (ImageView) findViewById(R.id.buttonbackfirsttasklvl2);
        buttonbackfirsttasklvl2.setOnClickListener(v -> startActivity(new Intent(firsttaskpolatsklvl2.this, polatsk.class)));

        Button buttongosecondtasklvl2 = (Button) findViewById(R.id.buttongosecondtasklvl2);
        buttongosecondtasklvl2.setOnClickListener(v -> startActivity(new Intent(firsttaskpolatsklvl2.this, secondprize1.class)));

        ImageView imageViewGerbStorepolatskfirst2 = (ImageView) findViewById(R.id.imageViewGerbStorepolatskfirst2);
        imageViewGerbStorepolatskfirst2.setOnClickListener(v -> startActivity(new Intent(firsttaskpolatsklvl2.this, GerbStore.class)));

        ImageView imageViewProfilPolatskfirst2 = (ImageView) findViewById(R.id.imageViewProfilPolatskfirst2);
        imageViewProfilPolatskfirst2.setOnClickListener(v -> startActivity(new Intent(firsttaskpolatsklvl2.this, account.class)));

        ImageView imageViewmessegPolatskfirst2 = (ImageView) findViewById(R.id.imageViewmessegPolatskfirst2);
        imageViewmessegPolatskfirst2.setOnClickListener(v -> startActivity(new Intent(firsttaskpolatsklvl2.this, Masseg.class)));

        ImageView imageViewsafsab = (android.widget.ImageView) findViewById(R.id.imageViewsafsab);
        imageViewsafsab.setOnClickListener(this);

        ImageView imageViewkrasnsab = (android.widget.ImageView) findViewById(R.id.imageViewkrasnsab);
        imageViewkrasnsab.setOnClickListener(this);

        ImageView imageViewzerksvmih = (android.widget.ImageView) findViewById(R.id.imageViewzerksvmih);
        imageViewzerksvmih.setOnClickListener(this);

        ImageView imageViewfarncas = (android.widget.ImageView) findViewById(R.id.imageViewfarncas);
        imageViewfarncas.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageViewsafsab) {
            ImageView.setVisibility(View.VISIBLE);
            TextView.setVisibility(View.VISIBLE);
            Button6.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.imageViewkrasnsab) {
            TextView1.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.imageViewzerksvmih) {
            TextView1.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.imageViewfarncas) {
            TextView1.setVisibility(View.VISIBLE);
        }
    }
}
