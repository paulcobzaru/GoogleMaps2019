package com.paulcobzaru.googlemaps2019;

import android.app.Application;

import com.paulcobzaru.googlemaps2019.models.User;


public class UserClient extends Application {

    private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
