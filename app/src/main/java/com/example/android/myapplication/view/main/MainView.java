package com.example.android.myapplication.view.main;

import com.example.android.myapplication.models.main.MainModelImp;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public interface MainView {
    void onSuccess(MainModelImp result);
    void onError(Throwable err);
}
