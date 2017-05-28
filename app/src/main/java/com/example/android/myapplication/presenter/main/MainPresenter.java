package com.example.android.myapplication.presenter.main;

import com.example.android.myapplication.models.main.MainModelImp;

import rx.Observable;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public interface MainPresenter {
    Observable<MainModelImp> getResult();
}
