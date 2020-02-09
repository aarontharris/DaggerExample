package com.example.daggerexample.ui.main;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainComponent.class)
public abstract class MainModule {

    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    abstract AndroidInjector.Factory<?> bindMainAndroidInjectorFactory(MainComponent.Factory factory);

    /*

    // TODO:

    Pro-tip: If your subcomponent and its factory have no other methods or supertypes other than the ones mentioned in step #2,
    you can use @ContributesAndroidInjector to generate them for you. Instead of steps 2 and 3, add an abstract module method
    that returns your activity, annotate it with @ContributesAndroidInjector, and specify the modules you want to install into
    the subcomponent. If the subcomponent needs scopes, apply the scope annotations to the method as well.

    @ActivityScope
    @ContributesAndroidInjector(modules = {  })
    abstract YourActivity contributeYourAndroidInjector();


     */
}
