package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SixTaskPolatsk extends AppCompatActivity implements View.OnClickListener {

    private Button Buttonsix2;
    private TextView TextViewsix8;
    private ImageView ImageViewsix1;
    private TextView TextViewsix7;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_task_polatsk);

        TextViewsix8 = findViewById(R.id.textView12446);
        ImageViewsix1 = findViewById(R.id.imageViewotvetsixprav);
        TextViewsix7 = findViewById(R.id.textViewOtvetsixprav);
        Buttonsix2 = findViewById(R.id.buttongoforPrizePolSix);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttongoforPrizePolSix = (Button) findViewById(R.id.buttongoforPrizePolSix);
        buttongoforPrizePolSix.setOnClickListener(v -> startActivity(new Intent(SixTaskPolatsk.this, foursTaskPolatsk.class)));

        ImageView buttonbackSixTask = (ImageView) findViewById(R.id.buttonbackSixTask);
        buttonbackSixTask.setOnClickListener(v -> startActivity(new Intent(SixTaskPolatsk.this, polatsk.class)));

        ImageView imageViewGerbStorepolatskserd = (ImageView) findViewById(R.id.imageViewGerbStorepolatskserd);
        imageViewGerbStorepolatskserd.setOnClickListener(v -> startActivity(new Intent(SixTaskPolatsk.this, GerbStore.class)));

        ImageView imageViewProfilPolatskserd = (ImageView) findViewById(R.id.imageViewProfilPolatskserd);
        imageViewProfilPolatskserd.setOnClickListener(v -> startActivity(new Intent(SixTaskPolatsk.this, account.class)));

        ImageView imageViewmessegPolatskserd = (ImageView) findViewById(R.id.imageViewmessegPolatskserd);
        imageViewmessegPolatskserd.setOnClickListener(v -> startActivity(new Intent(SixTaskPolatsk.this, Masseg.class)));

        TextView textViewsix = (TextView) findViewById(R.id.textViewNach1);
        textViewsix.setOnClickListener(this);

        TextView textViewsix1 = (TextView) findViewById(R.id.textViewNach2);
        textViewsix1.setOnClickListener(this);

        TextView textViewsix2 = (TextView) findViewById(R.id.textViewNach3);
        textViewsix2.setOnClickListener(this);

        TextView textViewsix3 = (TextView) findViewById(R.id.textViewNach4);
        textViewsix3.setOnClickListener(this);

        TextView textViewsix4 = (TextView) findViewById(R.id.textViewNach5);
        textViewsix4.setOnClickListener(this);

        TextView textViewsix5 = (TextView) findViewById(R.id.textViewNach6);
        textViewsix5.setOnClickListener(this);

        TextView textViewsix6 = (TextView) findViewById(R.id.textViewNach7);
        textViewsix6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.textViewNach1) {
            TextView textView = v.findViewById(R.id.textViewNach1);
            TextViewsix8.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.textViewNach2) {
            TextView textViewsix1 = v.findViewById(R.id.textViewNach2);
            TextViewsix8.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.textViewNach3) {
            TextView textViewsix2 = v.findViewById(R.id.textViewNach3);
            TextViewsix8.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.textViewNach4) {
            TextView textViewsix3 = v.findViewById(R.id.textViewNach4);
            TextViewsix8.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.textViewNach5) {
            TextView textViewsix4 = v.findViewById(R.id.textViewNach5);
            TextViewsix8.setVisibility(View.VISIBLE);
        }else if (v.getId() == R.id.textViewNach6) {
            TextView textViewsix5 = v.findViewById(R.id.textViewNach6);
            TextViewsix8.setVisibility(View.VISIBLE);
        }else if (v.getId() == R.id.textViewNach7) {
            TextView textViewsix6 = v.findViewById(R.id.textViewNach7);
            TextViewsix8.setVisibility(View.GONE);
            Buttonsix2.setVisibility(View.VISIBLE);
            TextViewsix7.setVisibility(View.VISIBLE);
            ImageViewsix1.setVisibility(View.VISIBLE);
        }
    }
}