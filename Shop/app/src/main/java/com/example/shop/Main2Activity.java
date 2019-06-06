package com.example.shop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button choosebutton;
    public static final String EXTRA_MESSAGE = "com.example.android.Main2Activity.extra.MESSAGE";
    public static final int TEXT_REQUEST1 = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void buy(View view) {
        Intent buyintent = new Intent(this,MainActivity.class);
        choosebutton = findViewById(view.getId());
        String message = choosebutton.getText().toString();
        buyintent.putExtra(EXTRA_MESSAGE,message);
        startActivityForResult(buyintent, TEXT_REQUEST1);
        }

}
