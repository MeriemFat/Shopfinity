package com.example.myapplicationfin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import tn.esprit.myapplication.R;

public class activity_login extends AppCompatActivity {
    Button login;
    Button signup;
    TextView forgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);
        forgot = findViewById(R.id.forgot);

        login.setOnClickListener(e -> {
            Intent intent = new Intent(this,Welcome.class);
            startActivity(intent);
        });

        signup.setOnClickListener(e -> {
            Intent intent = new Intent(this,activity_signup.class);
            startActivity(intent);
        });

        forgot.setOnClickListener(e -> {
            Intent intent = new Intent(this,activity_recover_password.class);
            startActivity(intent);
        });
    }
}
