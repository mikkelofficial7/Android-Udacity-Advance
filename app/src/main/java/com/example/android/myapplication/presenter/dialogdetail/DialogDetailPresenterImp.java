package com.example.android.myapplication.presenter.dialogdetail;

import com.example.android.myapplication.models.dialogdetail.DialogDetailModel;
import com.example.android.myapplication.models.dialogdetail.DialogDetailModelImp;
import com.example.android.myapplication.utils.OkHttpTime;
import com.example.android.myapplication.utils.RxOkhttp;
import com.example.android.myapplication.view.fragment.DialogDetailView;
import com.google.gson.Gson;

import okhttp3.Request;
import rx.Observable;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public class DialogDetailPresenterImp implements DialogDetailPresenter{

    DialogDetailView view;
    DialogDetailModel model;

    public DialogDetailPresenterImp(DialogDetailView view) {
        model = new DialogDetailModelImp();
        this.view = view;
    }

    @Override
    public Observable<DialogDetailModelImp> getResult(String id) {
        Request request = model.build(id);
        return RxOkhttp.streamStrings(OkHttpTime.client, request).map(json->
                new Gson().fromJson(json, DialogDetailModelImp.class)
        );
    }
}
