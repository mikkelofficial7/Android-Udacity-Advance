package com.example.android.myapplication.view.fragment;

import com.example.android.myapplication.models.dialogdetail.DialogDetailModelImp;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public interface DialogDetailView {
        void onSuccess(DialogDetailModelImp result);
        void onError(Throwable err);
}
