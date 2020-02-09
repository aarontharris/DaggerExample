package com.example.daggerexample.ui.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface MainComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<MainActivity> {
    }
}