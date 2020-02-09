package com.example.daggerexample.ui.main.fragment.main;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainFragmentComponent.class)
public abstract class MainFragmentModule {

    @Binds
    @IntoMap
    @ClassKey(MainFragment.class)
    abstract AndroidInjector.Factory<?> bindMainFragmentInjectorFactory(MainFragmentComponent.Factory factory);

}
