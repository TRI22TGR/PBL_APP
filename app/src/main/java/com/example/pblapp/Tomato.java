package com.example.pblapp;

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

public class Tomato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato);

        ImageButton arrowLeftButton = findViewById(R.id.arrow_left);
        arrowLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk kembali ke HomeActivity
                finish();
            }
        });

        // Generate random values for TextViews
        TextView txtHP = findViewById(R.id.txtHP);

        // Generate random values for Buttons
        Button buttonMS = findViewById(R.id.buttonMS);
        Button buttonSM = findViewById(R.id.buttonSM);
        Button buttonM = findViewById(R.id.buttonM);
        Button buttonTB = findViewById(R.id.buttonTB);
        //Button buttonLsc = findViewById(R.id.buttonLsc);

        // Generate and set a random value for Buttons and TextView
        final Button buttonLsc = findViewById(R.id.buttonLsc);
        TextView hp1 = findViewById(R.id.hp1);

        String randomValue = getRandomLastScanned();
        buttonLsc.setText(randomValue);
        hp1.setText(randomValue);

        // Set random values for Buttons
        buttonMS.setText(String.valueOf(new Random().nextInt(10)));  // Random value for buttonMS
        buttonSM.setText(String.valueOf(new Random().nextInt(10)));  // Random value for buttonSM
        buttonM.setText(String.valueOf(new Random().nextInt(30)));  // Random value for buttonM
        buttonTB.setText(String.valueOf(new Random().nextInt(120)));  // Random value for buttonTB

        // Hitung total dan set pada buttonTB
        int totalBuah = Integer.parseInt(buttonMS.getText().toString())
                + Integer.parseInt(buttonSM.getText().toString())
                + Integer.parseInt(buttonM.getText().toString());

        buttonTB.setText(String.valueOf(totalBuah));
    }


    // Helper method to generate random status
    private String getRandomStatus(String condition) {
        String[] statuses = {"2", "6", "23"};  // Example random values for buttons
        return condition + " " + statuses[new Random().nextInt(statuses.length)];
    }


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
