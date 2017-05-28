package com.example.android.myapplication.view.main;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.android.myapplication.R;
import com.example.android.myapplication.adapter.ListAdapter;
import com.example.android.myapplication.base.BaseActivity;
import com.example.android.myapplication.holder.MainListHolder;
import com.example.android.myapplication.models.main.MainModelImp;
import com.example.android.myapplication.presenter.main.MainPresenter;
import com.example.android.myapplication.presenter.main.MainPresenterImp;
import com.example.android.myapplication.view.fragment.DialogDetail;

import butterknife.BindView;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity implements MainView{

    private final String TAG = "MainActivity";

    private MainPresenter mainPresenter;

    private ListAdapter adapter;

    @BindView(R.id.lstemployee) RecyclerView lstEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind(R.layout.activity_main);
        mainPresenter = new MainPresenterImp(this);
        subscriber = mainPresenter.getResult()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onError);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onSuccess(MainModelImp result) {
        lstEmployee.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ListAdapter<MainModelImp.Data, MainListHolder>(
                R.layout.item_list,
                MainListHolder.class,
                MainModelImp.Data.class,
                result.getData()) {
            @Override protected void bindView(MainListHolder holder,
                                              MainModelImp.Data model,
                                              final int position) {
                holder.bind(model.getName());
                holder.getItemEmployee().setOnClickListener(view -> {
                    //clicked
                    DialogDetail detail = new DialogDetail();
                    Bundle bundle = new Bundle();
                    bundle.putString("id", String.valueOf(model.getId()));
                    detail.setArguments(bundle);
                    detail.show(getFragmentManager(), "Detail");
                });
            }
        };

        lstEmployee.setAdapter(adapter);
        Log.d(TAG, result.getData().get(0).getName());
        Log.d(TAG, result.getData().get(0).getId() + "");
    }

    @Override
    public void onError(Throwable err) {
        Log.e(TAG, err.getMessage());
    }
}
