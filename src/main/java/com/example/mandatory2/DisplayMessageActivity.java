package com.example.mandatory2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        TextView textView = findViewById(R.id.textView);
        textView.setText(getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE));

    }
}
