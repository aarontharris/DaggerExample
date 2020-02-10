package com.example.daggerexample.ui.common.fragment.exampleshared;

import com.example.daggerexample.ui.common.view.SharedCustomView.SharedCustomViewModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = SharedCustomViewModule.class)
public interface SharedFragmentComponent extends AndroidInjector<SharedFragment> {

    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<SharedFragment> {
    }

}
