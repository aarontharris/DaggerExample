package com.example.daggerexample.ui.play;

import android.os.Bundle;

import com.example.daggerexample.R;
import com.example.daggerexample.app.AppSingleton;
import com.example.daggerexample.core.os.CoreActivity;
import com.example.daggerexample.ui.play.fragment.play.PlayFragment;
import com.example.daggerexample.ui.singleton.ActivitySingleton;

import javax.inject.Inject;

public class PlayActivity extends CoreActivity {
    @Inject AppSingleton appSingleton;
    @Inject ActivitySingleton activitySingleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.play_activity, PlayFragment.newInstance())
                    .commitNow();
        }

        appSingleton.doSomething();
        activitySingleton.doSomething();
    }
}
