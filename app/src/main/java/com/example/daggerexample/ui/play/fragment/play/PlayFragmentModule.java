package com.example.daggerexample.ui.play.fragment.play;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = PlayFragmentComponent.class)
public abstract class PlayFragmentModule {

    @Binds
    @IntoMap
    @ClassKey(PlayFragment.class)
    abstract AndroidInjector.Factory<?> bindMainFragmentInjectorFactory(PlayFragmentComponent.Factory factory);

}
