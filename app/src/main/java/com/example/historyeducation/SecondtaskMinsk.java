package com.example.historyeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondtaskMinsk extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageViewotvetsecMinsk;
    private Button buttongoforserdtaskMinskSec;
    private TextView textViewotvetMinskSec;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondtask_minsk);

        imageViewotvetsecMinsk = findViewById(R.id.imageViewotvetsecMinsk);
        buttongoforserdtaskMinskSec = findViewById(R.id.buttongoforserdtaskMinskSec);
        textViewotvetMinskSec = findViewById(R.id.textViewotvetMinskSec);

        ImageView imageViewSetMinskSec = (ImageView) findViewById(R.id.imageViewSetMinskSec);
        imageViewSetMinskSec.setOnClickListener(v -> startActivity(new Intent(SecondtaskMinsk.this, Minsk.class)));

        ImageView imageViewGerbStoreMinskSec = (ImageView) findViewById(R.id.imageViewGerbStoreMinskSec);
        imageViewGerbStoreMinskSec.setOnClickListener(v -> startActivity(new Intent(SecondtaskMinsk.this, GerbStore.class)));

        ImageView imageViewProfilMinskSec = (ImageView) findViewById(R.id.imageViewProfilMinskSec);
        imageViewProfilMinskSec.setOnClickListener(v -> startActivity(new Intent(SecondtaskMinsk.this, account.class)));

        ImageView imageViewmessegMinskSec = (ImageView) findViewById(R.id.imageViewmessegMinskSec);
        imageViewmessegMinskSec.setOnClickListener(v -> startActivity(new Intent(SecondtaskMinsk.this, Masseg.class)));

        TextView textView1067gMinsk = (TextView) findViewById(R.id.textView1067gMinsk);
        textView1067gMinsk.setOnClickListener(this);

        TextView textView980gMinsk = (TextView) findViewById(R.id.textView980gMinsk);
        textView980gMinsk.setOnClickListener(this);

        TextView textView1051gMinsk = (TextView) findViewById(R.id.textView1051gMinsk);
        textView1051gMinsk.setOnClickListener(this);

        TextView textView1021gMinsk = (TextView) findViewById(R.id.textView1021gMinsk);
        textView1021gMinsk.setOnClickListener(this);

        TextView textView780gMinsk = (TextView) findViewById(R.id.textView780gMinsk);
        textView780gMinsk.setOnClickListener(this);

        TextView textView961gMinsk = (TextView) findViewById(R.id.textView961gMinsk);
        textView961gMinsk.setOnClickListener(this);

        TextView textView862gMinsk = (TextView) findViewById(R.id.textView862gMinsk);
        textView862gMinsk.setOnClickListener(this);

        buttongoforserdtaskMinskSec.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.textView1067gMinsk) {
            imageViewotvetsecMinsk.setVisibility(View.VISIBLE);
            buttongoforserdtaskMinskSec.setVisibility(View.VISIBLE);
            textViewotvetMinskSec.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.textView980gMinsk) {
            TextView textView980gMinsk = v.findViewById(R.id.textView980gMinsk);
            textView980gMinsk.setText("Падумай лепш. Гэта дата першай згадкі Турава");
            textView980gMinsk.setTextSize(11);
        } else if (v.getId() == R.id.textView1051gMinsk) {
            TextView textView1051gMinsk = v.findViewById(R.id.textView1051gMinsk);
            textView1051gMinsk.setText("Падумай лепш. Гэта дата першай згадкі Вiцебска");
            textView1051gMinsk.setTextSize(11);
        } else if (v.getId() == R.id.textView1021gMinsk) {
            TextView textView1021gMinsk = v.findViewById(R.id.textView1021gMinsk);
            textView1021gMinsk.setText("Падумай лепш. Гэта дата першай згадкі Магiлева");
            textView1021gMinsk.setTextSize(11);
        } else if (v.getId() == R.id.textView780gMinsk) {
            TextView textView780gMinsk = v.findViewById(R.id.textView780gMinsk);
            textView780gMinsk.setText("Падумай лепш. Гэта дата першай згадкі Гомеля");
            textView780gMinsk.setTextSize(11);
        } else if (v.getId() == R.id.textView961gMinsk) {
            TextView textView961gMinsk = v.findViewById(R.id.textView961gMinsk);
            textView961gMinsk.setText("Падумай лепш. Гэта дата першай згадкі Брэста");
            textView961gMinsk.setTextSize(11);
        } else if (v.getId() == R.id.textView862gMinsk) {
            TextView textView862gMinsk = v.findViewById(R.id.textView862gMinsk);
            textView862gMinsk.setText("Падумай лепш. Гэта дата першай згадкі Полацка");
            textView862gMinsk.setTextSize(11);
        }else if (v.getId() == R.id.buttongoforserdtaskMinskSec ) {
            Button buttongoforserdtaskMinskSec = v.findViewById(R.id.buttongoforserdtaskMinskSec);
            Intent intent = new Intent(SecondtaskMinsk.this, SerdTaskMinsk.class);
            startActivity(intent);
        }
    }
}