package com.example.daggerexample.core.di;

import androidx.annotation.NonNull;

import com.example.daggerexample.core.util.Pre;

import dagger.Lazy;

public final class Di {

    public static <T> T get(@NonNull Lazy<T> lazy) {
        return Pre.notNull(lazy.get());
    }

    private Di() { }
}
