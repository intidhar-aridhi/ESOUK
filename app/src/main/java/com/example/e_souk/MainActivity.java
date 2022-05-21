package com.example.e_souk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;


import com.example.e_souk.adapter.CategoryAdapter;
import com.example.e_souk.adapter.ProductAdapter;
import com.example.e_souk.adapter.discountedProductsAdapter;
import com.example.e_souk.model.Category;
import com.example.e_souk.model.Product;
import com.example.e_souk.model.discountedProducts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView discountRecyclerView, categoryRecyclerView, productRecyclerView,recentlyViewedRecycler;
    //Adapter and list of discounted products
    discountedProductsAdapter discountedProductAdapter;
    List<discountedProducts> discountedProductsList;
    //Adapter and list of categories
    CategoryAdapter categoryAdapter;
    List<Category> categoryList;
    TextView allCategory;
    //Adapter and list of products
    ProductAdapter productAdapter;
    List<Product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //List of discounted products
        discountRecyclerView = findViewById(R.id.rcv_listdiscountedproducts);
        categoryRecyclerView = findViewById(R.id.rcv_listcategories);
       productRecyclerView = findViewById(R.id.rcv_listproducts);
        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new discountedProducts(1, R.drawable.discountberry));
        discountedProductsList.add(new discountedProducts(2, R.drawable.discountbrocoli));
        discountedProductsList.add(new discountedProducts(3, R.drawable.discountmeat));
        discountedProductsList.add(new discountedProducts(4, R.drawable.discountberry));
        discountedProductsList.add(new discountedProducts(5, R.drawable.discountbrocoli));
        discountedProductsList.add(new discountedProducts(6, R.drawable.discountmeat));
        //List of categories
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, R.drawable.fruits));
        categoryList.add(new Category(2, R.drawable.fishes));
        categoryList.add(new Category(3, R.drawable.meats));
        categoryList.add(new Category(4, R.drawable.vegetables));
        categoryList.add(new Category(5, R.drawable.fruits));
        categoryList.add(new Category(6, R.drawable.fishes));
        categoryList.add(new Category(7, R.drawable.meats));
        categoryList.add(new Category(8, R.drawable.vegetables));
        //List of products
        productList = new ArrayList<>();
        productList.add(new Product(1, R.drawable.banane));
        productList.add(new Product(2, R.drawable.pomme));
        productList.add(new Product(4, R.drawable.chips));
        productList.add(new Product(5, R.drawable.banane));
        productList.add(new Product(6, R.drawable.pomme));
        productList.add(new Product(7, R.drawable.chips));


        setDiscountedRecycler(discountedProductsList);
        setCategoryRecycler(categoryList);
        setProductRecycler(productList);




    }

    private void setProductRecycler(List<Product> productList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        productRecyclerView.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this,productList);
        productRecyclerView.setAdapter(productAdapter);
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