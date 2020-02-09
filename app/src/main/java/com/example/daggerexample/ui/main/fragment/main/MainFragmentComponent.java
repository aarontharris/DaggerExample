package com.example.daggerexample.ui.main.fragment.main;

import com.example.daggerexample.ui.common.fragment.exampleshared.SharedFragmentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = SharedFragmentModule.class)
public interface MainFragmentComponent extends AndroidInjector<MainFragment> {

    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<MainFragment> {
    }

}
