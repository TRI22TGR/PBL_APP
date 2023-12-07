package com.example.pblapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Hidro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyiraman);

        ImageButton arrowLeftButton = findViewById(R.id.arrow_left);
        arrowLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk kembali ke HomeActivity
                Intent intent = new Intent(Hidro.this, HomeActivity.class);
                startActivity(intent);
                finish(); // Optional, untuk menutup activity saat ini dari stack
            }
        });
    }
}
