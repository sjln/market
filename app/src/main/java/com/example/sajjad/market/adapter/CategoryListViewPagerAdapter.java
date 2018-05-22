package com.example.sajjad.market.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.sajjad.market.Fragment.CategoryListFragment;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Sajjad on 4/18/2018.
 */

public class CategoryListViewPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "CategoryListViewPagerAd";
    private JSONObject response;

    public CategoryListViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    JsonObjectRequest requestCategoryList = new JsonObjectRequest(Request.Method.GET,
            "http://4nal.ir/api/get_category_index", null, new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {
            Log.i(TAG, "onResponse: " + response.toString());
            getCategories(response);
        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            Log.e(TAG, "onErrorResponse: "+error.toString());
        }
    });

    private void getCategories(JSONObject response) {


        this.response = response;
    }


    @Override
    public Fragment getItem(int position) {
        return CategoryListFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        try {
//            JSONArray categoryJsonArray = response.getJSONArray("categories");
//            for (int i = 0; i < categoryJsonArray.length() ; i++) {
//                   JSONObject categoryJsonObject = categoryJsonArray.getJSONObject(i);
//            return categoryJsonObject.getString("title");
//
//            }
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
        // this tabs is reverse. so I should write the tab number inverted.
        switch (position){
            case 0:
                return "مادر و کودک";
            case 1:
                return "کالای دیجیتال";
            case 2:
                return "مد و پوشاک";
            case 3:
                return "خانه";
            case 4:
                return "آرایشی و بهداشتی";
            case 5:
                return "کتاب، فرهنگ و هنر";
            case 6:
                return "ورزش و سفر";
            default:
                return "";
        }
//        return "";
    }
}
