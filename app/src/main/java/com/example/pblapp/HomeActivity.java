package com.example.pblapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView Txthidro;
    private TextView Txttomat;
    private TextView Txtlemon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Txthidro = findViewById(R.id.Txthidro);
        Txttomat = findViewById(R.id.Txttomat);
        Txtlemon = findViewById(R.id.Txtlemon);

        Txthidro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(getApplicationContext(), Hidro.class);
                startActivity(register);
            }
        });

        Txttomat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(getApplicationContext(), Tomato.class);
                startActivity(register);
            }
        });

        Txtlemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(getApplicationContext(), Lemon.class);
                startActivity(register);
            }
        });
    }


}