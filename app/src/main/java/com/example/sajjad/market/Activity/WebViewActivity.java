package com.example.sajjad.market.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.sajjad.market.R;
import com.example.sajjad.market.posts.PostInfo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WebViewActivity extends AppCompatActivity {
    private static final String TAG = "WebViewActivity";
    private TextView postTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
//        WebView webView = findViewById(R.id.web_view);
//        Log.i(TAG, "onCreate: ");
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webView.loadUrl("http://store.yaghotco.ir/product/%da%a9%db%8c%d9%81-2/");
        json();


    }

    private void json() {
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,
                "http://store.yaghotco.ir/api/get_search_results/?s=%DA%A9%DB%8C%D9%81",
                null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.i(TAG, "onResponse: " + response.toString());
                yaroo(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "onErrorResponse: " + error.toString());
            }
        });

        request.setRetryPolicy(new DefaultRetryPolicy(8000, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }


    private void yaroo(JSONObject response) {
        PostInfo postInfo = new PostInfo();

        try {
            JSONArray postsJsonArray = response.getJSONArray("posts");
            JSONObject postJsonObject = postsJsonArray.getJSONObject(0);
            postInfo.setPostTitle(postJsonObject.getString("content"));
            Toast.makeText(this, postJsonObject.getString("content"), Toast.LENGTH_LONG).show();

            Log.i(TAG, "json: " + postJsonObject.getString("content"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (postInfo.getPostTitle() != null) {
            postTitle = (TextView) findViewById(R.id.json);
            postTitle.setText(postInfo.getPostTitle());
        } else
            Toast.makeText(this, postInfo.getPostTitle(), Toast.LENGTH_LONG).show();
    }
}
