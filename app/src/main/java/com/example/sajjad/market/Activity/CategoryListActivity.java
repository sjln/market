package com.example.sajjad.market.Activity;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.sajjad.market.R;
import com.example.sajjad.market.adapter.CategoryListViewPagerAdapter;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class CategoryListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
        TabLayout categoryListTabLayout = findViewById(R.id.category_list_tab_layout);
        ViewPager categoryListViewPager = findViewById(R.id.category_list_view_pager);
        CategoryListViewPagerAdapter categoryListViewPagerAdapter = new CategoryListViewPagerAdapter(getSupportFragmentManager());
        categoryListViewPager.setAdapter(categoryListViewPagerAdapter);
        categoryListTabLayout.setupWithViewPager(categoryListViewPager);
        categoryListViewPager.setCurrentItem(9);
        Toolbar toolbarCategoryFragment = findViewById(R.id.toolbar_category_fragment);
        setSupportActionBar(toolbarCategoryFragment);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return true;
    }
}
