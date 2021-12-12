package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class SecondActivity extends AppCompatActivity {
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_v2);
        backButton = findViewById(R.id.backButtonActivity2);
        backButton.setOnClickListener(view -> startActivity(new Intent(SecondActivity.this, MainActivity.class)));
    }
}