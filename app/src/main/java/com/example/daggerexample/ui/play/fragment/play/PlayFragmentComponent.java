package com.example.daggerexample.ui.play.fragment.play;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface PlayFragmentComponent extends AndroidInjector<PlayFragment> {

    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<PlayFragment> {
    }

}
