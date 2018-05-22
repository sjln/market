package com.example.sajjad.market.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sajjad.market.R;
import com.example.sajjad.market.posts.ProductMainPage;

import java.util.List;

/**
 * Created by Sajjad on 4/7/2018.
 */

public class ProductMainPageAdapter extends RecyclerView.Adapter<ProductMainPageAdapter.ProductMainPageViewHolder> {

    private final Context context;
    private final List<ProductMainPage> products;

    public ProductMainPageAdapter(Context context, List<ProductMainPage> products){

        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductMainPageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_products_main_page,parent,false);
        return new ProductMainPageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductMainPageViewHolder holder, int position) {
        ProductMainPage productMainPage = products.get(position);
        holder.productPic.setImageDrawable(productMainPage.getProductImage());
        holder.content.setText(productMainPage.getContent());
        holder.price.setText(productMainPage.getPrice());

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ProductMainPageViewHolder extends RecyclerView.ViewHolder{
        private ImageView productPic;
        private TextView content;
        private TextView price;

        public ProductMainPageViewHolder(View itemView) {
            super(itemView);
            productPic = itemView.findViewById(R.id.product_pic);
            content = itemView.findViewById(R.id.content_product_main_page);
            price = itemView.findViewById(R.id.price_product_main_page);
        }
    }
}
