package com.example.recyclerviewhomework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String title = intent.getStringExtra("name");

        Log.d("DetailActivity ", " in onCreate");

        TextView detail = findViewById(R.id.detail);
        detail.setText("假装这里是 " + title + " 的详细信息");
//        if (title.equals(getResources().getString(R.string.article_one))) {
//            detail.setText(R.string.text1);
//        } else if (title.equals(getResources().getString(R.string.article_two))) {
//            detail.setText(R.string.text2);
//        } else if (title.equals(getResources().getString(R.string.article_three))) {
//            detail.setText(R.string.text3);
//        }
    }
}
