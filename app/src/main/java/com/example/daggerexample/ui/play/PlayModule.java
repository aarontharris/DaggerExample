package com.example.daggerexample.ui.play;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = PlayComponent.class)
public abstract class PlayModule {

    @Binds
    @IntoMap
    @ClassKey(PlayActivity.class)
    abstract AndroidInjector.Factory<?> bindMainAndroidInjectorFactory(PlayComponent.Factory factory);

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
