package com.example.daggerexample.app;

import com.example.daggerexample.ui.main.MainModule;
import com.example.daggerexample.ui.play.PlayModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        MainModule.class,
        PlayModule.class,
})
public interface AppComponent { // extends AndroidInjector<DaggerApplication> {

    void inject(App app);

    //@Override void inject(DaggerApplication instance);

    /*
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

     */
}
