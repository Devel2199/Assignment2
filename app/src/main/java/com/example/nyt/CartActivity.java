package com.example.nyt;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CartActivity extends AppCompatActivity {

/*    private RecyclerView recyclerView2;
    private RecyclerView.LayoutManager layoutManager2;*/
     public TextView textview;
     public TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_activity);
      textview = findViewById(R.id.textView);
      textview2 = findViewById(R.id.totalPrice);

        textview2.setText(String.valueOf(CartItems.t()));

 /*       recyclerView2 = findViewById(R.id.rv_cart);
        layoutManager2 = new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(layoutManager2);

        CartAdapter cartAdapter = new CartAdapter();

        recyclerView2.setAdapter(cartAdapter);*/
        Intent intent = getIntent();

        for (int o=0; o < MainActivity.orderList.size(); o++) {
            textview.setText(textview.getText() + " " + MainActivity.orderList.get(o) + " , "); }

  }

        }




