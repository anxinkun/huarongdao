package com.example.choosetext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        System.out.println(message);
        TextView textView = findViewById(R.id.textView);
        if(message.equals("1")){
            textView.setText(this.getString(R.string.text1));
        }
        if(message.equals("2")){
            textView.setText(this.getString(R.string.text2));
        }
        if(message.equals("3")){
            textView.setText(this.getString(R.string.text3));
        }

    }
}
