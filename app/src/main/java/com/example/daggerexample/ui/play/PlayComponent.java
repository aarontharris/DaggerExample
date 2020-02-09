package com.example.daggerexample.ui.play;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface PlayComponent extends AndroidInjector<PlayActivity> {
    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<PlayActivity> {
    }
}