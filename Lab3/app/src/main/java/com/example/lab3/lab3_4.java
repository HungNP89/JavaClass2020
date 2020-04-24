package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class lab3_4 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_lab3_4);
    }
    public void clickStart(View v) {
        Intent intent = new Intent(this, lab3_5.class);
        EditText editText = findViewById(R.id.edit);
        String text = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, text);
        startActivity(intent);
    }
}
