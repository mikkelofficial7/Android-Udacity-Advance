package com.example.android.myapplication.models.main;

import com.example.android.myapplication.utils.URLs;

import java.util.ArrayList;

import okhttp3.Request;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public class MainModelImp implements MainModel{
    private ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }

    public class Data{
        private int id;
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    @Override
    public Request build() {
        return new Request.Builder()
                .get()
                .url(URLs.getMainURL())
                .build();
    }
}
