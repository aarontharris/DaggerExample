package com.example.daggerexample.ui.main;

import com.example.daggerexample.core.di.ActivityScope;
import com.example.daggerexample.ui.main.fragment.main.MainFragmentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = MainFragmentModule.class)
public interface MainComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<MainActivity> {
    }
}