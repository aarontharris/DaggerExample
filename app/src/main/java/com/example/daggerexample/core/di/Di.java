package com.example.daggerexample.core.di;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.daggerexample.core.util.Pre;

import dagger.Lazy;
import dagger.android.HasAndroidInjector;

public final class Di {

    public static <T> T get(@NonNull Lazy<T> lazy) {
        return Pre.notNull(lazy.get());
    }

    private Di() { }

    public static void inject(@NonNull Fragment fragment) {
        Pre.notNull(Pre.notNull(Di.findHasAndroidInjectorForFragment(fragment)).androidInjector()).inject(fragment);
    }

    private static HasAndroidInjector findHasAndroidInjectorForFragment(@NonNull Fragment fragment) {
        Fragment parentFragment = fragment;
        while ((parentFragment = parentFragment.getParentFragment()) != null) {
            if (parentFragment instanceof HasAndroidInjector) {
                return (HasAndroidInjector) parentFragment;
            }
        }
        Activity activity = fragment.getActivity();
        if (activity instanceof HasAndroidInjector) {
            return (HasAndroidInjector) activity;
        }
        if (activity.getApplication() instanceof HasAndroidInjector) {
            return (HasAndroidInjector) activity.getApplication();
        }
        throw new IllegalArgumentException(
                String.format("No injector was found for %s", fragment.getClass().getCanonicalName()));
    }
}
