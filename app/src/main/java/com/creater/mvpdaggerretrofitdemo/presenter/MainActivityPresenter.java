package com.creater.mvpdaggerretrofitdemo.presenter;

import com.creater.mvpdaggerretrofitdemo.model.User;
import com.creater.mvpdaggerretrofitdemo.ui.MainActivity;

/**
 * Created by Administrator on 2016/11/25.
 */

public class MainActivityPresenter {
    private  MainActivity activity;
    private  User user;


    public MainActivityPresenter(MainActivity activity,User user){
        this.activity=activity;
    }
}
