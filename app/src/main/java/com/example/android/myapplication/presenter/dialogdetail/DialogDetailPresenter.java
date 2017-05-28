package com.example.android.myapplication.presenter.dialogdetail;

import com.example.android.myapplication.models.dialogdetail.DialogDetailModelImp;

import rx.Observable;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public interface DialogDetailPresenter {
    Observable<DialogDetailModelImp> getResult(String id);
}
