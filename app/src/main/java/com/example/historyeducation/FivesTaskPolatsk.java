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

public class FivesTaskPolatsk extends AppCompatActivity implements View.OnClickListener {


    private View TextViewfiv4;
    private View TextViewfiv5;
    private View ImageViewfiv1;
    private View buttonfiv1;
    private View buttonfiv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fives_task_polatsk);

        TextViewfiv4 = findViewById(R.id.textViewOtvetfiv);
        ImageViewfiv1 = findViewById(R.id.imageViewotvetfivprav);
        TextViewfiv5 = findViewById(R.id.textViewOtvetfivprav);
        buttonfiv = findViewById(R.id.buttongoforsix);


        Button buttonfiv = (Button) findViewById(R.id.buttongoforsix);
        buttonfiv.setOnClickListener(v -> startActivity(new Intent(FivesTaskPolatsk.this, SixTaskPolatsk.class)));

        ImageView buttonbackfivesTask = (ImageView) findViewById(R.id.buttonbackfivesTask);
        buttonbackfivesTask.setOnClickListener(v -> startActivity(new Intent(FivesTaskPolatsk.this, polatsk.class)));

        ImageView imageViewGerbStorepolatskSkend = (ImageView) findViewById(R.id.imageViewGerbStorepolatskSkend);
        imageViewGerbStorepolatskSkend.setOnClickListener(v -> startActivity(new Intent(FivesTaskPolatsk.this, GerbStore.class)));

        ImageView imageViewmessegPolatskSecond = (ImageView) findViewById(R.id.imageViewmessegPolatskSecond);
        imageViewmessegPolatskSecond.setOnClickListener(v -> startActivity(new Intent(FivesTaskPolatsk.this, Masseg.class)));

        ImageView imageViewProfilPolatkSecond = (ImageView) findViewById(R.id.imageViewProfilPolatkSecond);
        imageViewProfilPolatkSecond.setOnClickListener(v -> startActivity(new Intent(FivesTaskPolatsk.this, account.class)));

        TextView textViewfiv1 = (TextView) findViewById(R.id.textViewkrivichi);
        textViewfiv1.setOnClickListener(this);

        TextView textViewfiv2 = (TextView) findViewById(R.id.textViewRadzimichi);
        textViewfiv2.setOnClickListener(this);

        TextView textViewfiv3 = (TextView) findViewById(R.id.textViewDrigavichi);
        textViewfiv3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.textViewkrivichi) {
            TextView textView = findViewById(R.id.textViewkrivichi);
            TextViewfiv4.setVisibility(View.GONE);
            ImageViewfiv1.setVisibility(View.VISIBLE);
            TextViewfiv5.setVisibility(View.VISIBLE);
            TextViewfiv4.setVisibility(View.GONE);
            buttonfiv.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.textViewRadzimichi) {
            TextView textView = findViewById(R.id.textViewRadzimichi);
            TextViewfiv4.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.textViewDrigavichi) {
            TextView textView = findViewById(R.id.textViewDrigavichi);
            TextViewfiv4.setVisibility(View.VISIBLE);
        }
    }
}