package com.example.sajjad.market.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sajjad.market.R;
import com.example.sajjad.market.adapter.CategoryListAdapter;
import com.example.sajjad.market.fake_generator.DataFakeGenerator;

/**
 * Created by Sajjad on 4/17/2018.
 */

public class CategoryListFragment extends Fragment {
    private RecyclerView categoryListRecyclerView;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view  = inflater.inflate(R.layout.fragment_category,container,false);
        categoryListRecyclerView = view.findViewById(R.id.category_list_fragment_recycler);
        CategoryListAdapter categoryListAdapter = new CategoryListAdapter(getActivity(), DataFakeGenerator.getCategoryListData(getActivity()));
        categoryListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        categoryListRecyclerView.setAdapter(categoryListAdapter);
        return view;
    }

    public static CategoryListFragment newInstance() {
        
        Bundle args = new Bundle();
        
        CategoryListFragment fragment = new CategoryListFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
