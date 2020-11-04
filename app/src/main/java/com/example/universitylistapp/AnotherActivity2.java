package com.example.universitylistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnotherActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another2);

        Button btnIIUC = findViewById(R.id.btn_iiuc);
        Button btnPUC = findViewById(R.id.btn_puc);

        btnIIUC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iiuc.ac.bd/"));
                startActivity(i);
            }
        });

        btnPUC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://puc.ac.bd/"));
                startActivity(i);
            }
        });
    }
}