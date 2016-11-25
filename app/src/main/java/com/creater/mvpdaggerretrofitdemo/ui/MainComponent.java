package com.creater.mvpdaggerretrofitdemo.ui;

import com.creater.mvpdaggerretrofitdemo.AppComponent;
import com.creater.mvpdaggerretrofitdemo.model.SubUser;
import com.creater.mvpdaggerretrofitdemo.model.User;
import com.creater.mvpdaggerretrofitdemo.presenter.MainActivityPresenter;

import javax.inject.Inject;

import dagger.Component;

/**
 * Created by Administrator on 2016/11/25.
 */
@ActivityScope
@Component(modules = {MainActivityModule.class})
public interface MainComponent {


   MainActivity inject(User user);

}
