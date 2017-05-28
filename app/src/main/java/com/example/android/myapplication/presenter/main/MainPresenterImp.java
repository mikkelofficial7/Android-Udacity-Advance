package com.example.android.myapplication.presenter.main;

import com.example.android.myapplication.models.main.MainModel;
import com.example.android.myapplication.models.main.MainModelImp;
import com.example.android.myapplication.utils.OkHttpTime;
import com.example.android.myapplication.utils.RxOkhttp;
import com.example.android.myapplication.view.main.MainView;
import com.google.gson.Gson;

import okhttp3.Request;
import rx.Observable;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public class MainPresenterImp implements MainPresenter {

    MainModel model;
    MainView view;

    public MainPresenterImp(MainView view) {
        model = new MainModelImp();
        this.view = view;
    }

    @Override
    public Observable<MainModelImp> getResult() {
        Request request = model.build();
        return RxOkhttp.streamStrings(OkHttpTime.client, request).map(json->
            new Gson().fromJson(json,MainModelImp.class)
        );
    }
}
