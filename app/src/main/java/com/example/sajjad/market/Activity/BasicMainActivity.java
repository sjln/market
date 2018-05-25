package com.example.sajjad.market.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sajjad.market.Fragment.FragmentAdd;
import com.example.sajjad.market.Fragment.FragmentCategorize;
import com.example.sajjad.market.Fragment.FragmentNotice;
import com.example.sajjad.market.Fragment.FragmentProfile;
import com.example.sajjad.market.R;
import com.ss.bottomnavigation.BottomNavigation;
import com.ss.bottomnavigation.events.OnSelectedItemChangeListener;

public class BasicMainActivity extends AppCompatActivity {
    private android.support.v4.app.FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_main);

        setupBottomNavigation();
    }

    private void setupBottomNavigation() {
        BottomNavigation bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnSelectedItemChangeListener(new OnSelectedItemChangeListener() {
            @Override
            public void onSelectedItemChanged(int i) {
                switch (i){
                    case R.id.tab_notice:
                        transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_fragment_container,new FragmentNotice());
                        break;
                    case R.id.tab_add:
                        transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_fragment_container,new FragmentAdd());
                        break;
                    case R.id.tab_categorize:
                        transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_fragment_container,new FragmentCategorize());
                        break;
                    case R.id.tab_profile:
                        transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_fragment_container,new FragmentProfile());
                        break;
                }
                transaction.commit();
            }
        });
    }
}
