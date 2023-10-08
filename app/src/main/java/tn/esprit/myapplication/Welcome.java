package tn.esprit.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

import tn.esprit.myapplication.Fragments.ChatFragment;
import tn.esprit.myapplication.Fragments.HomeFragment;

public class Welcome extends AppCompatActivity {
    ImageButton homeButton,
            chatButton,
            favoriteButton,
            profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        homeButton = findViewById(R.id.homeIcon);
        chatButton = findViewById(R.id.chatIcon);
        favoriteButton = findViewById(R.id.favoriteIcon);
        profileButton = findViewById(R.id.profileIcon);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new HomeFragment()).commit();

        chatButton.setOnClickListener(e ->
        {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new ChatFragment()).commit();
        });

        homeButton.setOnClickListener(e ->
        {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new HomeFragment()).commit();
        });
    }
}