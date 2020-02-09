package com.example.daggerexample.ui.common.fragment.exampleshared;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface SharedFragmentComponent extends AndroidInjector<SharedFragment> {

    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<SharedFragment> {
    }

}
