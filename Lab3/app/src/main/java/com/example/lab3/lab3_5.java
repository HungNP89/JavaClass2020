package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class lab3_5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_lab3_5);
        Intent intent = getIntent();
        String message = intent.getStringExtra(lab3_4.EXTRA_MESSAGE);
        final TextView textView = findViewById(R.id.textView);
        textView.setText(message);
        new CountDownTimer(300000, 1000) {

            public void onTick(long millisUntilFinished) {
               textView.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
               textView.setText("done!");
            }
        }.start();
    }
    public void back(View v) {
        Intent backToLab3_1 = new Intent(this, lab3_1.class);
        startActivity(backToLab3_1);
    }
}
