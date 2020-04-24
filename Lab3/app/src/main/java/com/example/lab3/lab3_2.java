package com.example.lab3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class lab3_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_lab3_2);
    }
    public void showMap(View v) {
        Uri location = Uri.parse("geo:37.422219,-122.08364?z=14");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }
    public void showPhoneNumber(View v) {
        Uri number = Uri.parse("tel:5551234");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }
    public void showWebsite(View v) {
        EditText editText = findViewById(R.id.editText);
        String text = editText.getText().toString();
        Uri webpage = Uri.parse(text);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void showNextLab(View v) {
        Intent intent = new Intent(this, lab3_3.class);
        startActivity(intent);
    }
}


