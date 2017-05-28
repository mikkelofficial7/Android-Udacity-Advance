package com.example.android.myapplication.base;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Yosefricaro on 13/05/2017.
 */

public class BaseActivity extends AppCompatActivity{

    protected Subscription subscriber = new CompositeSubscription();

    protected void bind(int layout){
        setContentView(layout);
        ButterKnife.bind(this);
    }

    protected void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    protected void openNewActivity(Class activity){
        startActivity(new Intent(this, activity));
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        subscriber.unsubscribe();
    }
}
