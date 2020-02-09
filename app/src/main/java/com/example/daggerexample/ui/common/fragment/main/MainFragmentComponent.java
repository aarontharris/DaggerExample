package com.example.daggerexample.ui.common.fragment.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface MainFragmentComponent extends AndroidInjector<MainFragment> {

    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<MainFragment> {
    }

}
