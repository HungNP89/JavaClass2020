package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class lab3_1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.next).setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.color, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        View showColor = findViewById(R.id.showColor);
        TextView text = findViewById(R.id.showText);
        switch (item.getItemId()) {
            case R.id.red:
               showColor.setBackgroundColor(Color.RED);
               text.setText("Red");
               return true;
            case R.id.green:
                showColor.setBackgroundColor(Color.GREEN);
                text.setText("Green");
                return true;
            case R.id.blue:
                showColor.setBackgroundColor(Color.BLUE);
                text.setText("Blue");
                return true;
            case R.id.yellow:
                showColor.setBackgroundColor(Color.YELLOW);
                text.setText("Yellow");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.next) {
            Intent intent = new Intent(this,lab3_2.class);
            startActivity(intent);
        }
    }
}
