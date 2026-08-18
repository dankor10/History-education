package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class serdTasckpolatsk extends AppCompatActivity  implements View.OnClickListener{

    private EditText editTextTextMultiLine;
    private Button buttoncheckserd;
    private Button buttonSer1;
    private TextView textViewResult;
    private View ImageView;
    private View TextViewser1;
    private Button buttonSer3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serd_tasckpolatsk);


        editTextTextMultiLine = findViewById(R.id.editTextTextMultiLine);
        editTextTextMultiLine.setOnClickListener(this);

        buttoncheckserd = findViewById(R.id.buttoncheckserd);
        buttoncheckserd.setOnClickListener(this);

        textViewResult = findViewById(R.id.textViewResult);
        buttonSer3 = findViewById(R.id.buttongoforfourstask);

        ImageView buttonbackserdtask = (ImageView) findViewById(R.id.buttonbackserdtask);
        buttonbackserdtask.setOnClickListener(v -> startActivity(new Intent(serdTasckpolatsk.this, polatsk.class)));

        buttonSer3.setOnClickListener(v -> startActivity(new Intent(serdTasckpolatsk.this, serdprize1.class)));

        ImageView imageViewGerbStorepolatskfirstertjk2 = (ImageView) findViewById(R.id.imageViewGerbStorepolatskfirstertjk2);
        imageViewGerbStorepolatskfirstertjk2.setOnClickListener(v -> startActivity(new Intent(serdTasckpolatsk.this, GerbStore.class)));

        ImageView imageViewProfilP3947856girst2 = (ImageView) findViewById(R.id.imageViewProfilP3947856girst2);
        imageViewProfilP3947856girst2.setOnClickListener(v -> startActivity(new Intent(serdTasckpolatsk.this, account.class)));

        ImageView imageViewmessegPolatsk23482 = (ImageView) findViewById(R.id.imageViewmessegPolatsk23482);
        imageViewmessegPolatsk23482.setOnClickListener(v -> startActivity(new Intent(serdTasckpolatsk.this, Masseg.class)));
    }

    @Override
    public void onClick(View v) {
        String text = editTextTextMultiLine.getText().toString().trim();
        if (TextUtils.isEmpty(text)){
            textViewResult.setText("увядзіце правільны адказ");
        } else if (text.equalsIgnoreCase("рагнеда")) {
            textViewResult.setText("правільны адказ");
            buttonSer3.setVisibility(View.VISIBLE);
        } else {
            textViewResult.setText("няправільны адказ");
        }
    }
}