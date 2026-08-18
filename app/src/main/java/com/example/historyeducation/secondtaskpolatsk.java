package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class secondtaskpolatsk extends AppCompatActivity {

    private View imageButton2;
    private View ImageButton1;
    private View textView1;
    private View textView2;
    private View buttonsec3;
    private View buttonsec4;
    private View textView3;
    private View textView4;
    private View ImageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondtaskpolatsk);

        ImageButton1 = findViewById(R.id.imageButtonriver);
        imageButton2 = findViewById(R.id.imageButtonvolat);
        textView1 = findViewById(R.id.textViewriver);
        textView2 = findViewById(R.id.textViewvolat);
        textView3 = findViewById(R.id.textViewbaad);
        textView4 = findViewById(R.id.textViewotvet);
        buttonsec3 = findViewById(R.id.buttonRightSecondTask);
        buttonsec4 = findViewById(R.id.buttonLeftSecondTask);
        ImageView = findViewById(R.id.imageViewotvetsec);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView buttonbacksecondtask = (ImageView) findViewById(R.id.buttonbacksecondtask);
        buttonbacksecondtask.setOnClickListener(v -> startActivity(new Intent(secondtaskpolatsk.this, polatsk.class)));

        ImageView imageViewGerbStorepolatsksecond = (ImageView) findViewById(R.id.imageViewGerbStorepolatsksecond);
        imageViewGerbStorepolatsksecond.setOnClickListener(v -> startActivity(new Intent(secondtaskpolatsk.this, GerbStore.class)));

        ImageView imageViewProfilPolatskfirst = (ImageView) findViewById(R.id.imageViewProfilPolatsksecond);
        imageViewProfilPolatskfirst.setOnClickListener(v -> startActivity(new Intent(secondtaskpolatsk.this, account.class)));

        ImageView imageViewmessegPolatskfirst = (ImageView) findViewById(R.id.imageViewmessegPolatsksecond);
        imageViewmessegPolatskfirst.setOnClickListener(v -> startActivity(new Intent(secondtaskpolatsk.this, Masseg.class)));

        Button buttonsec2 = (Button ) findViewById(R.id.buttongofoserddtask);
        buttonsec2.setVisibility(View.GONE);

        buttonsec2.setOnClickListener(v -> startActivity(new Intent(secondtaskpolatsk.this, FivesTaskPolatsk.class)));

        imageButton2.setOnClickListener(v -> {
            if (textView3.getVisibility() != View.VISIBLE) {
                textView3.setVisibility(View.VISIBLE);
            } else {
                textView3.setVisibility(View.GONE);
            }
        });

        ImageButton1.setOnClickListener(v -> {
            if (textView4.getVisibility() != View.VISIBLE) {
                textView4.setVisibility(View.VISIBLE);
                ImageView.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.GONE);
                buttonsec2.setVisibility(View.VISIBLE);

            } else {
                textView4.setVisibility(View.GONE);
                ImageView.setVisibility(View.GONE);
            }
        });


        buttonsec3.setOnClickListener(v -> {
            imageButton2.setVisibility(View.VISIBLE);
            textView2.setVisibility(View.VISIBLE);

            ImageButton1.setVisibility(View.GONE);
            textView1.setVisibility(View.GONE);

        });
        buttonsec4.setOnClickListener(v -> {
            ImageButton1.setVisibility(View.VISIBLE);
            textView1.setVisibility(View.VISIBLE);

            imageButton2.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
        });
    }

}
