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


public class serdtasckpolatsklvl2 extends AppCompatActivity implements View.OnClickListener {


    private Button buttoncheckserdlvl2 , Button;
    private EditText editTextTextMultiLinelvl2;
    private TextView textViewResultserdlvl2;
    private ImageView ImageView , ImageView1 , ImageView2;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serdtasckpolatsklvl2);

        editTextTextMultiLinelvl2 = findViewById(R.id.editTextTextMultiLinelvl2);
        editTextTextMultiLinelvl2.setOnClickListener(this);

        buttoncheckserdlvl2 = findViewById(R.id.buttoncheckserdlvl2);
        buttoncheckserdlvl2.setOnClickListener(this);

        textViewResultserdlvl2 = findViewById(R.id.textViewResultserdlvl2);
        ImageView = findViewById(R.id.imageViewotvetsec3497856);
        ImageView1 = findViewById(R.id.textViewotvet7465);
        ImageView2 = findViewById(R.id.buttongosecondtasklvl2);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView buttonbackserdtask = (ImageView) findViewById(R.id.buttonbackserdtask);
        buttonbackserdtask.setOnClickListener(v -> startActivity(new Intent(serdtasckpolatsklvl2.this, polatsk.class)));

        Button buttongoforserdtasklvl2 = (Button) findViewById(R.id.buttongoforserdtasklvl2);
        buttongoforserdtasklvl2.setOnClickListener(v -> startActivity(new Intent(serdtasckpolatsklvl2.this, foursTaskPolatsk.class)));

        ImageView imageViewGerbStorepolatskfirst344 = (ImageView) findViewById(R.id.imageViewGerbStorepolatskfirst344);
        imageViewGerbStorepolatskfirst344.setOnClickListener(v -> startActivity(new Intent(serdtasckpolatsklvl2.this, GerbStore.class)));

        ImageView imageViewProfilPolatskfirst267867 = (ImageView) findViewById(R.id.imageViewProfilPolatskfirst267867);
        imageViewProfilPolatskfirst267867.setOnClickListener(v -> startActivity(new Intent(serdtasckpolatsklvl2.this, account.class)));

        ImageView imageViewmessegPolatskfirst2235 = (ImageView) findViewById(R.id.imageViewmessegPolatskfirst2235);
        imageViewmessegPolatskfirst2235.setOnClickListener(v -> startActivity(new Intent(serdtasckpolatsklvl2.this, Masseg.class)));
    }

    @Override
    public void onClick(View v) {
        String text = editTextTextMultiLinelvl2.getText().toString().trim();
        if (TextUtils.isEmpty(text)) {
            textViewResultserdlvl2.setText("увядзіце правільны адказ");
        } else if (text.equalsIgnoreCase("готическом")) {
            textViewResultserdlvl2.setText("правільны адказ");
            ImageView.setVisibility(View.VISIBLE);
            ImageView1.setVisibility(View.VISIBLE);
            ImageView2.setVisibility(View.VISIBLE);
        } else {
            textViewResultserdlvl2.setText("няправільны адказ");
        }
    }
}
