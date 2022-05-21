package com.example.e_souk.adapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;


import com.example.e_souk.MainActivity;
import com.example.e_souk.R;
import com.example.e_souk.login;
import com.example.e_souk.model.discountedProducts;

import java.util.List;
public class discountedProductsAdapter extends RecyclerView.Adapter<discountedProductsAdapter.DiscountedProductViewHolder> {

    Context context;
    List<discountedProducts> discountedProductsList;

    public discountedProductsAdapter(Context context, List<discountedProducts> discountedProductsList) {
        this.context = context;
        this.discountedProductsList = discountedProductsList;
    }

    @NonNull
    @Override
    public DiscountedProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.discounted_row_items, parent, false);
        return new DiscountedProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull discountedProductsAdapter.DiscountedProductViewHolder holder, int position) {
        holder.discountImageView.setImageResource(discountedProductsList.get(position).getImageurl());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(context, DetailProduct.class);
                context.startActivity(intent);

            }
        });

    }


    @Override
    public int getItemCount() {
        return discountedProductsList.size();
    }

    public static class DiscountedProductViewHolder extends  RecyclerView.ViewHolder{

        ImageView discountImageView;

        public DiscountedProductViewHolder(@NonNull  View itemView) {
            super(itemView);
            discountImageView = itemView.findViewById(R.id.discount_Image);
        }
    }}