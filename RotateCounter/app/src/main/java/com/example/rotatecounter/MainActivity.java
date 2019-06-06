package com.example.rotatecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textview;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            count=savedInstanceState.getInt("count");
        }
        textview=findViewById(R.id.show_count);
        textview.setText(count+"");

    }

    public void add(View view) {
        count=count+1;
        textview.setText(count+"");

    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("count",count);
    }
}
