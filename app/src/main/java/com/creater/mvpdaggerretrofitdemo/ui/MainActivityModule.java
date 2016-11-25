package com.creater.mvpdaggerretrofitdemo.ui;

import com.creater.mvpdaggerretrofitdemo.model.SubUser;
import com.creater.mvpdaggerretrofitdemo.model.User;
import com.creater.mvpdaggerretrofitdemo.presenter.MainActivityPresenter;


import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/11/25.
 */
@Module
public class MainActivityModule {
    private  MainActivity mainActivity;
    private  User user;

    public MainActivityModule(MainActivity mainActivity,User user){
        this.mainActivity=mainActivity;
        this.user=user;
    }
    @ActivityScope
    @Provides
    MainActivity providMainActivity(){
        return mainActivity;
    }



    @ActivityScope
    @Provides
    MainActivityPresenter provideMainActivityPresenter(MainActivity mainActivit,User user){
        return new MainActivityPresenter(mainActivit,this.user);
    }



}
