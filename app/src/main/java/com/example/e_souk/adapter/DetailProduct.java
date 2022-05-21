package com.example.e_souk.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.e_souk.CommandProduct;
import com.example.e_souk.LCartActivity;
import com.example.e_souk.R;

public class DetailProduct extends AppCompatActivity {
    Button btnAddToCart,btnBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product);
        btnAddToCart=(Button)findViewById(R.id.btn_addtocart);
        btnBuy=(Button)findViewById(R.id.btn_buy);
        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LCartActivity.class);
                startActivity(intent);
            }
        });
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CommandProduct.class);
                startActivity(intent);
            }
        });
    }
}