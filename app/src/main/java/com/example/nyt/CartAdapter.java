/*
package com.example.nyt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    public ArrayList<CartItems> itemToAdapt;

    public void setData(ArrayList<CartItems> itemsToAdapt) {

        this.itemToAdapt = itemsToAdapt;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_activity, parent, false);
        CartViewHolder cartViewHolder = new CartViewHolder(view);
        return cartViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {

        final CartItems articleAtPosition = itemToAdapt.get(position);
        holder.headlineTextView.setText(articleAtPosition.getHeadline());
        holder.summaryTextView.setText(articleAtPosition.getSummary());


    }

    @Override
    public int getItemCount() {
        return itemToAdapt.size();
    }

    public static class CartViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView headlineTextView;
        public TextView summaryTextView;

        public CartViewHolder(View v) {
            super(v);
            view = v;
            headlineTextView = v.findViewById(R.id.itemHeadline);
            summaryTextView = v.findViewById(R.id.itemDetails);
        }
    }
}*/
