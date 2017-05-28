package com.example.android.myapplication.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Yosefricaro on 14/05/2017.
 */

public class MainListHolder extends RecyclerView.ViewHolder{
    @BindView(R.id.txt_name) TextView txtName;

    @BindView(R.id.item_employee) LinearLayout itemEmployee;

    public MainListHolder(View itemView){
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(String name){
        txtName.setText(name);
    }

    public LinearLayout getItemEmployee() {
        return itemEmployee;
    }
}
