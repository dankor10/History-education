package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SerdTaskMinsk extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextTextMultiLineMinskSer;
    private Button buttoncheckserdMinsk , buttongoforfourstaskMinsk;
    private TextView textViewResultSerMinsk;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serd_task_minsk);

        editTextTextMultiLineMinskSer = findViewById(R.id.editTextTextMultiLineMinskSer);
        editTextTextMultiLineMinskSer.setOnClickListener(this);

        buttoncheckserdMinsk = findViewById(R.id.buttoncheckserdMinsk);
        buttoncheckserdMinsk.setOnClickListener(this);

        textViewResultSerMinsk = findViewById(R.id.textViewResultSerMinsk);
        buttongoforfourstaskMinsk = findViewById(R.id.buttongoforfourstaskMinsk);

        ImageView imageViewSetMinskSer = (ImageView) findViewById(R.id.imageViewSetMinskSer);
        imageViewSetMinskSer.setOnClickListener(v -> startActivity(new Intent(SerdTaskMinsk.this, Minsk.class)));

        buttongoforfourstaskMinsk.setOnClickListener(v -> startActivity(new Intent(SerdTaskMinsk.this, serdprize1.class)));

        ImageView imageViewGerbStoreMinskSer = (ImageView) findViewById(R.id.imageViewGerbStoreMinskSer);
        imageViewGerbStoreMinskSer.setOnClickListener(v -> startActivity(new Intent(SerdTaskMinsk.this, GerbStore.class)));

        ImageView imageViewProfilMinskSer = (ImageView) findViewById(R.id.imageViewProfilMinskSer);
        imageViewProfilMinskSer.setOnClickListener(v -> startActivity(new Intent(SerdTaskMinsk.this, account.class)));

        ImageView imageViewmessegminskSer = (ImageView) findViewById(R.id.imageViewmessegminskSer);
        imageViewmessegminskSer.setOnClickListener(v -> startActivity(new Intent(SerdTaskMinsk.this, Masseg.class)));
    }

    @Override
    public void onClick(View v) {
        String text = editTextTextMultiLineMinskSer.getText().toString().trim();
        if (TextUtils.isEmpty(text)){
            textViewResultSerMinsk.setText("увядзіце правільны адказ");
        } else if (text.equalsIgnoreCase("мiнск горад герой")) {
            textViewResultSerMinsk.setText("правільны адказ");
            buttongoforfourstaskMinsk.setVisibility(View.VISIBLE);
        } else {
            textViewResultSerMinsk.setText("няправільны адказ");
        }
    }
}