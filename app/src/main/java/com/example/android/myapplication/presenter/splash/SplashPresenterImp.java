package com.example.android.myapplication.presenter.splash;

import android.os.Handler;

import com.example.android.myapplication.view.splash.SplashView;


/**
 * Created by Yosefricaro on 13/05/2017.
 */

public class SplashPresenterImp implements SplashPresenter{

    SplashView view;

    public SplashPresenterImp(SplashView view){
        this.view = view;
    }
    @Override
    public void waitSplash(int duration) {
        new Handler().postDelayed(() -> {
            view.showAlert();
            view.openMain();
        }, duration);
    }


}
