package com.example.myapplicationfin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import tn.esprit.myapplication.R;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        button = findViewById(R.id.button);
        button.setOnClickListener(e ->
        {
            Intent intent = new Intent(this,activity_login.class);
            startActivity(intent);
        });
    }
}