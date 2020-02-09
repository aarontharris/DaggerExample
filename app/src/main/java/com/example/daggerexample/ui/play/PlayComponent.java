package com.example.daggerexample.ui.play;

import com.example.daggerexample.core.di.ActivityScope;
import com.example.daggerexample.ui.play.fragment.play.PlayFragmentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = PlayFragmentModule.class)
public interface PlayComponent extends AndroidInjector<PlayActivity> {
    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<PlayActivity> {
    }
}