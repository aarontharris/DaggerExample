package com.example.daggerexample.ui.play;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggerexample.R;
import com.example.daggerexample.app.AppSingleton;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class PlayActivity extends AppCompatActivity {

    @Inject AppSingleton appSingleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, PlayFragment.newInstance())
                    .commitNow();
        }

        appSingleton.doSomething();
    }
}
