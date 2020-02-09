package com.example.daggerexample.ui.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggerexample.R;
import com.example.daggerexample.app.AppSingleton;
import com.example.daggerexample.ui.common.fragment.main.MainFragment;
import com.example.daggerexample.ui.singleton.ActivitySingleton;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public class MainActivity extends AppCompatActivity implements HasAndroidInjector {

    @Inject DispatchingAndroidInjector<Object> injector;
    @Inject AppSingleton appSingleton;
    @Inject ActivitySingleton activitySingleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }

        appSingleton.doSomething();
        activitySingleton.doSomething();
    }

    @Override public AndroidInjector<Object> androidInjector() {
        return injector;
    }
}
