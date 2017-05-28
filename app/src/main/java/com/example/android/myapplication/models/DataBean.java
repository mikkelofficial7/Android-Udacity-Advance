package com.example.android.myapplication.models;

/**
 * Created by Yosefricaro on 13/05/2017.
 */

public class DataBean {
    private String nama;
    private int umur;

    public DataBean(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}
