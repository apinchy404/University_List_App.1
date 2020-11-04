package com.example.universitylistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Button btnCUET = findViewById(R.id.btn_cuet);
        Button btnCU = findViewById(R.id.btn_cu);
        Button btnNSTU = findViewById(R.id.btn_nstu);

        btnCUET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cuet.ac.bd/"));
                startActivity(i);
            }
        });

        btnCU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cu.ac.bd/"));
                startActivity(i);
            }
        });

        btnNSTU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nstu.edu.bd/"));
                startActivity(i);
            }
        });
    }
}