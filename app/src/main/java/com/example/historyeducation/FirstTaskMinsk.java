package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstTaskMinsk extends AppCompatActivity implements View.OnClickListener {

    private TextView TextView , textViewOtvetfirMinskprav;
    private Button buttonGoFourSecondMinsk;
    private ImageView imageViewotvetfirpravMinsk;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_task_minsk);

        TextView = findViewById(R.id.textViewPadumai);
        imageViewotvetfirpravMinsk = findViewById(R.id.imageViewotvetfirpravMinsk);
        textViewOtvetfirMinskprav = findViewById(R.id.textViewOtvetfirMinskprav);
        buttonGoFourSecondMinsk = findViewById(R.id.buttonGoFourSecondMinsk);

        ImageView imageViewSetMinskfir = (ImageView) findViewById(R.id.imageViewSetMinskfir);
        imageViewSetMinskfir.setOnClickListener(v -> startActivity(new Intent(FirstTaskMinsk.this, polatsk.class)));

        ImageView imageViewGerbStoreMinskFirst = (ImageView) findViewById(R.id.imageViewGerbStoreMinskFirst);
        imageViewGerbStoreMinskFirst.setOnClickListener(v -> startActivity(new Intent(FirstTaskMinsk.this, GerbStore.class)));

        ImageView imageViewProfilMinskFir = (ImageView) findViewById(R.id.imageViewProfilMinskFir);
        imageViewProfilMinskFir.setOnClickListener(v -> startActivity(new Intent(FirstTaskMinsk.this, account.class)));

        ImageView imageViewmessegminskFir = (ImageView) findViewById(R.id.imageViewmessegminskFir);
        imageViewmessegminskFir.setOnClickListener(v -> startActivity(new Intent(FirstTaskMinsk.this, Masseg.class)));

        buttonGoFourSecondMinsk.setOnClickListener(v -> startActivity(new Intent(FirstTaskMinsk.this, SecondtaskMinsk.class)));

        TextView textViewNazva = (TextView) findViewById(R.id.textViewNazva);
        textViewNazva.setOnClickListener(this);

        TextView textViewRes = (TextView) findViewById(R.id.textViewRes);
        textViewRes.setOnClickListener(this);

        TextView textViewMl = (TextView) findViewById(R.id.textViewMl);
        textViewMl.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.textViewNazva) {
            imageViewotvetfirpravMinsk.setVisibility(View.VISIBLE);
            textViewOtvetfirMinskprav.setVisibility(View.VISIBLE);
            buttonGoFourSecondMinsk.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.textViewRes) {
            TextView.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.textViewMl) {
            TextView.setVisibility(View.VISIBLE);
        }
    }
}