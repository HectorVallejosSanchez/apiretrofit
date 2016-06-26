package com.example.android.retrofit;

import android.app.Application;

import com.example.android.retrofit.api.OAuthUtil;

/**
 * Created by hector on 26/06/16.
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        OAuthUtil.initSharedPref(this);
    }
}
