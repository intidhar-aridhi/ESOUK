package com.example.e_souk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.e_souk.R;
import com.example.e_souk.adapter.LcartAdapter;
import com.example.e_souk.adapter.discountedProductsAdapter;
import com.example.e_souk.model.ProductinCart;
import com.example.e_souk.model.discountedProducts;

import java.util.ArrayList;
import java.util.List;

public class LCartActivity extends AppCompatActivity {
    RecyclerView cartRecyclerView;
    Button Order;
    LcartAdapter cartAdapter;
    List<ProductinCart> cartProductsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcart);
        Order=(Button)findViewById(R.id.btnvcommande);
        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Rediriger vers login page
                Intent intent = new Intent(getApplicationContext(),login.class);
                startActivity(intent);
            }
        });
        cartRecyclerView= findViewById(R.id.rcv_cart);
        cartProductsList = new ArrayList<>();
        cartProductsList.add(new ProductinCart(1, R.drawable.discountberry,"Strawberry","4DT"));
        setcartRecycler(cartProductsList);
    }

    private void setcartRecycler(List<ProductinCart> cartProductsList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        cartRecyclerView.setLayoutManager(layoutManager);
        cartAdapter = new LcartAdapter(this, cartProductsList);
        cartRecyclerView.setAdapter(cartAdapter);
    }

}