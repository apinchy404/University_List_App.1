package com.example.universitylistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPublic = findViewById(R.id.btn_public);
        Button btnPrivate = findViewById(R.id.btn_private);
//        Button btnCUET = findViewById(R.id.btn_cuet);
//        Button btnCU = findViewById(R.id.btn_cu);
//        Button btnNSTU = findViewById(R.id.btn_nstu);
//        Button btnIIUC = findViewById(R.id.btn_iiuc);
//        Button btnPUC = findViewById(R.id.btn_puc);

        btnPublic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnotherActivity.class);
                startActivity(i);
            }
        });

        btnPrivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnotherActivity2.class);
                startActivity(i);

            }
        });





    }
}