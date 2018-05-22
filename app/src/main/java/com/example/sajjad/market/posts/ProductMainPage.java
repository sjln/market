package com.example.sajjad.market.posts;

import android.graphics.drawable.Drawable;

/**
 * Created by Sajjad on 4/7/2018.
 */

public class ProductMainPage {
    private int id;
    private Drawable productImage;
    private String content;
    private String price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getProductImage() {
        return productImage;
    }

    public void setProductImage(Drawable productImage) {
        this.productImage = productImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
