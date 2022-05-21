package com.example.e_souk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_souk.LCartActivity;
import com.example.e_souk.R;
import com.example.e_souk.model.Product;
import com.example.e_souk.model.ProductinCart;
import com.example.e_souk.model.discountedProducts;

import java.util.List;

public class LcartAdapter extends RecyclerView.Adapter<LcartAdapter.LcartViewHolder> {
    Context context;
    List<ProductinCart> productinCart;

    public LcartAdapter(Context context, List<ProductinCart> cartProductsList) {
        this.context = context;
        this.productinCart = cartProductsList;
    }

    @Override
    public LcartAdapter.LcartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.productcart_row_items, parent, false);
        return new LcartAdapter.LcartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LcartAdapter.LcartViewHolder holder, int position) {
        holder.productCImageView.setImageResource(productinCart.get(position).getImageProductCurl());
        holder. ProductCname.setText(productinCart.get(position).getNameProduct());
        holder. ProductCprice.setText(productinCart.get(position).getProductPrice());
    }

    @Override
    public int getItemCount() {
        return productinCart.size();
    }

    public class LcartViewHolder extends  RecyclerView.ViewHolder{
        ImageView productCImageView;
        TextView ProductCname;
        TextView ProductCprice;
        public LcartViewHolder(View itemView) {
            super(itemView);
            productCImageView = itemView.findViewById(R.id.imageProd);
            ProductCname = itemView.findViewById(R.id.nomProd);
            ProductCprice = itemView.findViewById(R.id.prixProd);


        }
    }
}
