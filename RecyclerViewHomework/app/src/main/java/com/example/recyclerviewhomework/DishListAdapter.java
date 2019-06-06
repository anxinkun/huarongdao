package com.example.recyclerviewhomework;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class DishListAdapter extends RecyclerView.Adapter<DishListAdapter.DishViewHolder> {

    final LinkedList<String> mMenuList;
    private LayoutInflater mInflater;
    private Context context;

    public DishListAdapter(Context context, LinkedList<String> menuList) {
        this.context = context;
        this.mMenuList = menuList;
        mInflater = LayoutInflater.from(context);

    }

    class DishViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final TextView dishItemView;
        final DishListAdapter mAdapter;

        public DishViewHolder(View itemView, DishListAdapter adapter) {
            super(itemView);
            dishItemView = itemView.findViewById(R.id.dish);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
//            itemView.setTag();
        }

        @Override
        public void onClick(View v) {
            int mPosition = getLayoutPosition();
            String name = mMenuList.get(mPosition);
            Intent intentTitle = new Intent(context, DetailActivity.class);
            intentTitle.putExtra("name", name);
            context.startActivity(intentTitle);
//            mMenuList.set(mPosition, "Clicker! " + element);
//            mAdapter.notifyDataSetChanged();
        }
    }

    @NonNull
    @Override
    public DishListAdapter.DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View mItemView = mInflater.inflate(R.layout.menulist_item, parent, false);
        return new DishViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull DishListAdapter.DishViewHolder dishViewHolder, int i) {
        String mCurrent = mMenuList.get(i);
        dishViewHolder.dishItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mMenuList.size();
    }
}
