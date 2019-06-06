package com.example.batteryhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int level = 0;
    private final int MAX=8, MIN=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.batteryImg);
        imageView.setImageLevel(level);
    }

    public void increaseLevel(View view) {
        ImageView imageView = findViewById(R.id.batteryImg);
        if (level < MAX) {
            level++;
            imageView.setImageLevel(level);
        }
    }

    public void decreaseLevel(View view) {
        ImageView imageView = findViewById(R.id.batteryImg);
        if  (level > MIN) {
            level--;
            imageView.setImageLevel(level);
        }
    }
}
