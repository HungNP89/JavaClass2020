package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class lab2_1 extends AppCompatActivity {
    public int clicked = 0;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        LinearLayout layout = new LinearLayout(this);
        setContentView(layout);
        final Button gameButton = new Button(this);

        Button nextButton = new  Button(this);

        gameButton.setText("Button");
        nextButton.setText("Next lab");
        layout.addView(gameButton);
        layout.addView(nextButton);

        final Intent intent = new Intent(this, lab2_3.class);

        gameButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                clicked ++;
                if(clicked == 1) {
                    gameButton.setText(" You have click " + clicked);
                } else {
                    gameButton.setText(" You have click " + clicked);
                }
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
