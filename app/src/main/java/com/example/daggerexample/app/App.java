package com.example.daggerexample.app;

import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public class App extends Application implements HasAndroidInjector {

    @Inject DispatchingAndroidInjector<Object> dispatchingAndroidInjector;

    @Override public void onCreate() {
        super.onCreate();
        //DaggerApp.create().inject(this);
        DaggerAppComponent.create().inject(this);
    }

    @Override public AndroidInjector<Object> androidInjector() {
        //AppComponent appComponent = DaggerAppComponent.builder().application(this).build(); appComponent.inject(this); return appComponent;
        return dispatchingAndroidInjector;
    }
}
