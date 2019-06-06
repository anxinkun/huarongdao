package com.example.recyclerviewhomework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> mMenuList = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private DishListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 20; i++) {
            mMenuList.addLast("Dish " + i);
        }

        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new DishListAdapter(this, mMenuList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.addItemDecoration(new );
    }
}
