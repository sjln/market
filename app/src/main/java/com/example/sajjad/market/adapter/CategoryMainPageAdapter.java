package com.example.sajjad.market.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sajjad.market.posts.CategoryMainPage;
import com.example.sajjad.market.R;

import java.util.List;

/**
 * Created by Sajjad on 4/4/2018.
 */

public class CategoryMainPageAdapter extends RecyclerView.Adapter<CategoryMainPageAdapter.CategoryNameViewHolder> {

    private Context context;
    private List<CategoryMainPage> categories;

    public CategoryMainPageAdapter(Context context, List<CategoryMainPage> categories){

        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryNameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_category_main_page,parent,false);
        return new CategoryNameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryNameViewHolder holder, int position) {
        CategoryMainPage categoryMainPage = categories.get(position);
        holder.categoryName.setText(categoryMainPage.getProductName());

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }


    public class CategoryNameViewHolder extends RecyclerView.ViewHolder{
        private TextView categoryName;

        public CategoryNameViewHolder(View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.category_name_main_page);
        }
    }
}
