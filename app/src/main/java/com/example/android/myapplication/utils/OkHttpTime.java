package com.example.android.myapplication.utils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public class OkHttpTime {
    public static OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(10000L, TimeUnit.MILLISECONDS)
            .readTimeout(1000L, TimeUnit.MILLISECONDS)
            .build();
}
