package com.example.daggerexample.ui.main;

import android.os.Bundle;

import com.example.daggerexample.R;
import com.example.daggerexample.app.AppSingleton;
import com.example.daggerexample.core.os.CoreActivity;
import com.example.daggerexample.ui.main.fragment.main.MainFragment;
import com.example.daggerexample.ui.singleton.ActivitySingleton;

import javax.inject.Inject;

public class MainActivity extends CoreActivity {
    @Inject AppSingleton appSingleton;
    @Inject ActivitySingleton activitySingleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_activity, MainFragment.newInstance())
                    .commitNow();
        }

        appSingleton.doSomething();
        activitySingleton.doSomething();
    }
}
