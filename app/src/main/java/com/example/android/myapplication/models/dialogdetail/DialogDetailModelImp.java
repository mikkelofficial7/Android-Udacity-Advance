package com.example.android.myapplication.models.dialogdetail;

import com.example.android.myapplication.utils.URLs;

import okhttp3.Request;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public class DialogDetailModelImp implements DialogDetailModel{

    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data{
        private String name;
        private String position;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }
    }

    @Override
    public Request build(String id) {
        return new Request.Builder()
                .get()
                .url(URLs.getDetailURL(id))
                .build();
    }
}
