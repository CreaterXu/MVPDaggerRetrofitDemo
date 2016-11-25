package com.creater.mvpdaggerretrofitdemo;

import android.app.Application;
import android.content.Context;


/**
 * Created by clevo on 2015/6/9.
 */
public class AppApplication extends Application {

    private AppComponent appComponent;


    public static AppApplication get(Context context) {
        return (AppApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}
