package com.example.android.myapplication.view.splash;

import android.os.Bundle;

import com.example.android.myapplication.R;
import com.example.android.myapplication.base.BaseActivity;
import com.example.android.myapplication.presenter.splash.SplashPresenter;
import com.example.android.myapplication.presenter.splash.SplashPresenterImp;
import com.example.android.myapplication.view.main.MainActivity;

public class SplashActivity extends BaseActivity implements SplashView{

    SplashPresenter splashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind(R.layout.activity_splash);
        splashPresenter = new SplashPresenterImp(this);
        splashPresenter.waitSplash(5000);
    }

    @Override
    public void showAlert() {
        showToast("Hai, selamat datang!");
    }

    @Override
    public void openMain() {
        openNewActivity(MainActivity.class);
    }
}
