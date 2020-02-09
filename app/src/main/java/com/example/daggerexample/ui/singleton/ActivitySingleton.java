package com.example.daggerexample.ui.singleton;

import com.example.daggerexample.core.di.ActivityScope;
import com.example.daggerexample.core.util.Log;

import javax.inject.Inject;

@ActivityScope
public class ActivitySingleton {

    @Inject ActivitySingleton() {}

    public void doSomething() {
        Log.d("ActivitySingleton.doSomething " + hashCode());
    }

}
