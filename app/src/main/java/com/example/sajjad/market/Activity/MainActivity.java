package com.example.sajjad.market.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sajjad.market.R;
import com.example.sajjad.market.adapter.CategoryMainPageAdapter;
import com.example.sajjad.market.adapter.ProductMainPageAdapter;
import com.example.sajjad.market.fake_generator.DataFakeGenerator;

import ss.com.bannerslider.
        banners.DrawableBanner;
import ss.com.bannerslider.views.BannerSlider;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class MainActivity extends AppCompatActivity {
        
        // ziad dari goh mikhori :D

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search_toolbar:
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_page, menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupNavigationView();
//Todo click back for close drawer
        setupRecyclerViews();
        setupBannerSlider();


    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    private void setupBannerSlider() {
        BannerSlider bannerSlider = findViewById(R.id.banner_slider_main_page);
        bannerSlider.addBanner(new DrawableBanner(R.drawable.banner_1));
        bannerSlider.addBanner(new DrawableBanner(R.drawable.banner_2));
        bannerSlider.addBanner(new DrawableBanner(R.drawable.banner_3));
        bannerSlider.addBanner(new DrawableBanner(R.drawable.banner_4));

    }

    private void setupRecyclerViews() {
        RecyclerView categoriesRecyclerView = findViewById(R.id.recycler_view_category_main_page);
        CategoryMainPageAdapter categoryMainPageAdapter = new CategoryMainPageAdapter(this, DataFakeGenerator.getCategoryDataMainPage(this));
        categoriesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        categoriesRecyclerView.setAdapter(categoryMainPageAdapter);


        RecyclerView specialOfferRecyclerView = findViewById(R.id.recycler_view_special_offer_main_page);
        ProductMainPageAdapter productMainPageAdapter = new ProductMainPageAdapter(this, DataFakeGenerator.getProductDataMainPage(this));
        specialOfferRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        specialOfferRecyclerView.setAdapter(productMainPageAdapter);

        RecyclerView mostSalesRecyclerView = findViewById(R.id.recycler_view_most_sales_main_page);
        ProductMainPageAdapter mostSaleAdapter = new ProductMainPageAdapter(this, DataFakeGenerator.getProductDataMainPage(this));
        mostSalesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mostSalesRecyclerView.setAdapter(mostSaleAdapter);

        RecyclerView newestsRecyclerView = findViewById(R.id.recycler_view_newests_main_page);
        ProductMainPageAdapter newestsAdapter = new ProductMainPageAdapter(this, DataFakeGenerator.getProductDataMainPage(this));
        newestsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        newestsRecyclerView.setAdapter(newestsAdapter);
    }

    private void setupNavigationView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        final DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                0, 0);
        drawerToggle.syncState();
        final NavigationView navigationViewMainPage = findViewById(R.id.navigation_view);
        final View navigationHeaderView = navigationViewMainPage.getHeaderView(0);
        TextView navigationHeaderTextView = navigationHeaderView.findViewById(R.id.login_navigation_header);
        ImageView navigationHeaderImage = navigationHeaderView.findViewById(R.id.login_pic_navigation_header);
        navigationHeaderImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginRegisterActivity.class));
                drawerLayout.closeDrawers();

            }
        });
        navigationHeaderTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginRegisterActivity.class));
                drawerLayout.closeDrawers();
            }

        });
        navigationViewMainPage.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_menu_category:
                        startActivity(new Intent(MainActivity.this, CategoryListActivity.class));
                        drawerLayout.closeDrawers();

                }
                return true;
            }
        });

    }

}
