package com.pk.fresco;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Pravin on 3/9/17.
 * Project: Fresco
 */

public class Tiny extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //initializing fresco

        Fresco.initialize(this);
    }
}
