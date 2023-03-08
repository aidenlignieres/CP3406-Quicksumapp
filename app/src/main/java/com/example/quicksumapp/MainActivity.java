package com.example.quicksumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public <View> void buttonClicked(View view) {
        Button button = (Button) view;

        int sum = Integer.parseInt(button.getText().toString());

        TextView textView = findViewById(R.id.sum);
        String result = "" + sum;
        textView.setText(result);
    }
}