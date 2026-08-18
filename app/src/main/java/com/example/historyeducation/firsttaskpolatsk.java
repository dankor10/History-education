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

public class firsttaskpolatsk extends AppCompatActivity implements View.OnClickListener {

    private View ImageView;
    private TextView TextView;
    private View Buttonfir1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsttaskpolatsk);

        ImageView = findViewById(R.id.imageViewotvet);
        TextView = findViewById(R.id.textView12);
        Buttonfir1 = findViewById(R.id.buttongoforsecondtask);

        ImageView imageViewSetPolatsk = (ImageView) findViewById(R.id.imageViewSetPolatsk);
        imageViewSetPolatsk.setOnClickListener(v -> startActivity(new Intent(firsttaskpolatsk.this, polatsk.class)));

        ImageView imageViewGerbStorepolatsk = (ImageView) findViewById(R.id.imageViewGerbStorepolatsk);
        imageViewGerbStorepolatsk.setOnClickListener(v -> startActivity(new Intent(firsttaskpolatsk.this, GerbStore.class)));

        ImageView imageViewProfilPolatsk = (ImageView) findViewById(R.id.imageViewProfilPolatsk);
        imageViewProfilPolatsk.setOnClickListener(v -> startActivity(new Intent(firsttaskpolatsk.this, account.class)));

        ImageView imageViewmessegPolatsk = (ImageView) findViewById(R.id.imageViewmessegPolatsk);
        imageViewmessegPolatsk.setOnClickListener(v -> startActivity(new Intent(firsttaskpolatsk.this, Masseg.class)));

        TextView textView = (TextView) findViewById(R.id.textView1067g);
        textView.setOnClickListener(this);

        TextView textView1 = (TextView) findViewById(R.id.textView980g);
        textView1.setOnClickListener(this);

        TextView textView2 = (TextView) findViewById(R.id.textView1051g);
        textView2.setOnClickListener(this);

        TextView textView3 = (TextView) findViewById(R.id.textView1021g);
        textView3.setOnClickListener(this);

        TextView textView4 = (TextView) findViewById(R.id.textView780g);
        textView4.setOnClickListener(this);

        TextView textView5 = (TextView) findViewById(R.id.textView961g);
        textView5.setOnClickListener(this);

        TextView textView6 = (TextView) findViewById(R.id.textView862g);
        textView6.setOnClickListener(this);

        Button button1 = (Button) findViewById(R.id.buttongoforsecondtask);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.textView1067g) {
            TextView textView = v.findViewById(R.id.textView1067g);
            textView.setText("Падумай лепш. Гэта дата першай згадкі Менска");
            textView.setTextSize(11);
        } else if (v.getId() == R.id.textView980g) {
            TextView textView1 = v.findViewById(R.id.textView980g);
            textView1.setText("Падумай лепш. Гэта дата першай згадкі Турава");
            textView1.setTextSize(11);
        } else if (v.getId() == R.id.textView1051g) {
            TextView textView2 = v.findViewById(R.id.textView1051g);
            textView2.setText("Падумай лепш. Гэта дата першай згадкі Вiцебска");
            textView2.setTextSize(11);
        } else if (v.getId() == R.id.textView1021g) {
            TextView textView3 = v.findViewById(R.id.textView1021g);
            textView3.setText("Падумай лепш. Гэта дата першай згадкі Магiлева");
            textView3.setTextSize(11);
        } else if (v.getId() == R.id.textView780g) {
            TextView textView4 = v.findViewById(R.id.textView780g);
            textView4.setText("Падумай лепш. Гэта дата першай згадкі Гомеля");
            textView4.setTextSize(11);
        } else if (v.getId() == R.id.textView961g) {
            TextView textView5 = v.findViewById(R.id.textView961g);
            textView5.setText("Падумай лепш. Гэта дата першай згадкі Брэста");
            textView5.setTextSize(11);
        } else if (v.getId() == R.id.textView862g) {
            TextView textView6 = v.findViewById(R.id.textView862g);
            textView6.setTextSize(37);
            ImageView.setVisibility(View.VISIBLE);
            TextView.setVisibility(View.VISIBLE);
            Buttonfir1.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.buttongoforsecondtask ) {
            Button button1 = v.findViewById(R.id.buttongoforsecondtask);
            Intent intent = new Intent(firsttaskpolatsk.this, secondtaskpolatsk.class);
            startActivity(intent);
        }
    }
}