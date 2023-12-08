package com.example.pblapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Hidro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidro);

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

        // Generate and set a random value for Buttons and TextView
        final Button button3 = findViewById(R.id.button3);
        TextView hp1 = findViewById(R.id.hp1);

        String randomValue = getRandomLastScanned();
        button3.setText(randomValue);
        hp1.setText(randomValue);
    }

    // Helper method to generate random last scanned date
    private String getRandomLastScanned() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault());
        Random random = new Random();

        // Assuming you want a random date within the last year
        long millis = System.currentTimeMillis() - random.nextInt(365) * 24 * 60 * 60 * 1000;

        // Add random hours and minutes to the date
        millis += random.nextInt(24) * 60 * 60 * 1000; // Hours
        millis += random.nextInt(60) * 60 * 1000; // Minutes

        return sdf.format(new Date(millis));
    }

}
