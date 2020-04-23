package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class lab2_4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        LinearLayout layout = new LinearLayout(this);
        LinearLayout text = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);

        Button englishversion = new Button(this);
        Button swedishversion = new Button(this);
        Button finnishversion = new Button(this);
        Button vietnamversion = new Button(this);

        englishversion.setText("English");
        swedishversion.setText("Swedish");
        finnishversion.setText("Finnish");
        vietnamversion.setText("Vietnamese");

        text.addView(englishversion);
        text.addView(swedishversion);
        text.addView(finnishversion);
        text.addView(vietnamversion);

        final TextView textView = new TextView(this);
        final EditText editText = new EditText(this);

        layout.addView(text);
        layout.addView(editText);
        layout.addView(textView);

        englishversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(" Hello " + editText.getText());
            }
        });
        swedishversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(" Hej " + editText.getText());
            }
        });
        finnishversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(" Hei " + editText.getText());
            }
        });
       vietnamversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(" DCM " + editText.getText());
            }
        });
    }
}
