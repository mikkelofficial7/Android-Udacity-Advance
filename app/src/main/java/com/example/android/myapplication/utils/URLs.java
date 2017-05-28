package com.example.android.myapplication.utils;

import com.example.android.myapplication.BuildConfig;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public class URLs {
    private static final String BASE_URL = BuildConfig.URI;
    private static final String DETAIL_URL = "/detail/";

    public static String getMainURL(){
        return BASE_URL;
    }

    public static String getDetailURL(String id){
        return BASE_URL + DETAIL_URL + id;
    }
}
