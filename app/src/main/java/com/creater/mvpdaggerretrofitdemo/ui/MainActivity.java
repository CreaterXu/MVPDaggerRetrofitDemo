package com.creater.mvpdaggerretrofitdemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.creater.mvpdaggerretrofitdemo.R;
import com.creater.mvpdaggerretrofitdemo.model.SubUser;
import com.creater.mvpdaggerretrofitdemo.model.User;
import com.creater.mvpdaggerretrofitdemo.presenter.MainActivityPresenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainActivityPresenter mainActivityPresenter;
    @Inject
    SubUser subUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User();

    }
}
