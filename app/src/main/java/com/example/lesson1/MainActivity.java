package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button nextButton;
    Switch switchTextColor = findViewById(R.id.switchTextColor);
    EditText textForChange;
    ToggleButton buttonOff;
    CheckBox switchTextStyle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_v1);
        nextButton = findViewById(R.id.nextButtonActivity1);
        nextButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, SecondActivity.class)));
        textForChange = findViewById(R.id.inputText);
        switchTextColor.setOnClickListener(view -> {
            if (switchTextColor.isChecked()) textForChange.setTextColor(Color.RED);
            else textForChange.setTextColor(Color.BLACK);
        });
        buttonOff = findViewById(R.id.clearButton);
        buttonOff.setOnClickListener(view -> {
            if (buttonOff.isChecked()) {
                textForChange.setText("");
            }
        });
        switchTextStyle = findViewById(R.id.switchTextStyle);
        switchTextStyle.setOnCheckedChangeListener((compoundButton, b) -> {
            if (switchTextStyle.isChecked()) {
                textForChange.setTypeface(Typeface.DEFAULT_BOLD);
            } else textForChange.setTypeface(Typeface.DEFAULT);
        });

    }
}