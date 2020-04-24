package com.example.lab3;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class lab3_3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.animal, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.birds:
                this.setContentView(R.layout.birds);
                return true;
            case R.id.mammals:
                this.setContentView(R.layout.mammals);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void bear(View v) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.bear);
        mediaPlayer.start();
    }
    public void elephant(View v) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
        mediaPlayer.start();
    }
    public void owl(View v) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.huuhkaja_norther_eagle_owl);
        mediaPlayer.start();
    }
    public void lamb(View v) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.lamb);
        mediaPlayer.start();
    }
    public void chaffinch(View v) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.peippo_chaffinch);
        mediaPlayer.start();
    }
    public void wren(View v) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.peukaloinen_wren);
        mediaPlayer.start();
    }
    public void bullfinch(View v) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.punatulkku_northern_bullfinch);
        mediaPlayer.start();
    }
    public void wolf(View v) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.wolf);
        mediaPlayer.start();
    }
    public void showNextLab(View v) {
        Intent intent = new Intent(this,lab3_4.class);
        startActivity(intent);
    }
}
