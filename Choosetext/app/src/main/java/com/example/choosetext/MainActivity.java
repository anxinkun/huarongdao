package com.example.choosetext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    public static final String EXTRA_MESSAGE = "com.example.androidChoosetext.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity1(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        String message = "1";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);

    }

    public void launchSecondActivity2(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        String message = "2";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void launchSecondActivity3(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        String message = "3";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }
}
