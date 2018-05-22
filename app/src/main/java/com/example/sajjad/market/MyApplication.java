package com.example.sajjad.market;

import android.app.Application;
import android.graphics.Typeface;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Sajjad on 4/22/2018.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/iran_sans.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
