package com.example.android.myapplication.models.dialogdetail;

import okhttp3.Request;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public interface DialogDetailModel {
    Request build(String id);
}
