package com.example.daggerexample.ui.common.fragment.exampleshared;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = SharedFragmentComponent.class)
public abstract class SharedFragmentModule {

    @Binds
    @IntoMap
    @ClassKey(SharedFragment.class)
    abstract AndroidInjector.Factory<?> bindMainFragmentInjectorFactory(SharedFragmentComponent.Factory factory);

}
