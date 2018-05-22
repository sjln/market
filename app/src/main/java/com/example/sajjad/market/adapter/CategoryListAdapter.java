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
import com.example.sajjad.market.posts.CategoryFragmentDataModel;

import java.util.List;

/**
 * Created by Sajjad on 4/17/2018.
 */

public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.CategoryListViewHolder> {

    private Context context;
    private List<CategoryFragmentDataModel> categoryFragmentDataModelList;

    public CategoryListAdapter (Context context, List<CategoryFragmentDataModel> categoryFragmentDataModelList){

        this.context = context;
        this.categoryFragmentDataModelList = categoryFragmentDataModelList;
    }

    @NonNull
    @Override
    public CategoryListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_category_list,parent,false);
        return new CategoryListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListViewHolder holder, int position) {
        CategoryFragmentDataModel categoryFragmentDataModel = categoryFragmentDataModelList.get(position);
        holder.categoryListImage.setImageDrawable(categoryFragmentDataModel.getCategoryImage());
        holder.CategoryListName.setText(categoryFragmentDataModel.getCategoryName());
        //listName

    }

    @Override
    public int getItemCount() {
        return categoryFragmentDataModelList.size();
    }


    public class CategoryListViewHolder extends RecyclerView.ViewHolder{
        private ImageView categoryListImage;
        private TextView CategoryListName;

        public CategoryListViewHolder(View itemView) {
            super(itemView);
            categoryListImage = itemView.findViewById(R.id.category_list_image);
            CategoryListName = itemView.findViewById(R.id.category_list_name);
        }
    }
}
