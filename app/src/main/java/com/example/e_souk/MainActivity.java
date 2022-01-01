package com.example.e_souk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;


import com.example.e_souk.adapter.CategoryAdapter;
import com.example.e_souk.adapter.discountedProductsAdapter;
import com.example.e_souk.model.Category;
import com.example.e_souk.model.discountedProducts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView discountRecyclerView, categoryRecyclerView, recentlyViewedRecycler;
    discountedProductsAdapter discountedProductAdapter;
    List<discountedProducts> discountedProductsList;

    CategoryAdapter categoryAdapter;
    List<Category> categoryList;
    TextView allCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        discountRecyclerView = findViewById(R.id.rcv_listproducts);
        categoryRecyclerView = findViewById(R.id.rcv_listcategoeies);
        discountedProductsList = new ArrayList<>();

        discountedProductsList.add(new discountedProducts(1, R.drawable.discountberry));
        discountedProductsList.add(new discountedProducts(2, R.drawable.discountbrocoli));
        discountedProductsList.add(new discountedProducts(3, R.drawable.discountmeat));
        discountedProductsList.add(new discountedProducts(4, R.drawable.discountberry));
        discountedProductsList.add(new discountedProducts(5, R.drawable.discountbrocoli));
        discountedProductsList.add(new discountedProducts(6, R.drawable.discountmeat));
        categoryList = new ArrayList<>();

        categoryList.add(new Category(1, R.drawable.ic_home_fruits));
        categoryList.add(new Category(2, R.drawable.ic_home_fish));
        categoryList.add(new Category(3, R.drawable.ic_home_meats));
        categoryList.add(new Category(4, R.drawable.ic_home_veggies));
        categoryList.add(new Category(5, R.drawable.ic_home_fruits));
        categoryList.add(new Category(6, R.drawable.ic_home_fish));
        categoryList.add(new Category(7, R.drawable.ic_home_meats));
        categoryList.add(new Category(8, R.drawable.ic_home_veggies));

        setDiscountedRecycler(discountedProductsList);
        setCategoryRecycler(categoryList);



    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this,categoryList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }


    private void setDiscountedRecycler(List<discountedProducts> discountedProductsList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new discountedProductsAdapter(this, discountedProductsList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }
}