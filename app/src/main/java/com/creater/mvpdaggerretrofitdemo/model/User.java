package com.creater.mvpdaggerretrofitdemo.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/11/25.
 */

public class User implements Parcelable{
    public String name;
    @Inject
    public SubUser subUser;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String password;



    public static final Creator<User> CREATOR=new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            User u=new User();
            u.setName(source.readString());
            u.setPassword(source.readString());
            return u;
        }

        @Override
        public User[] newArray(int size) {
            return new User[0];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
