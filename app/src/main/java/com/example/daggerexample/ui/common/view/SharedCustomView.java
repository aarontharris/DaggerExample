package com.example.daggerexample.ui.common.view;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.LinearLayoutCompat;

import com.example.daggerexample.R;
import com.example.daggerexample.core.di.Di;
import com.example.daggerexample.core.util.Views;

public class SharedCustomView extends LinearLayoutCompat {
    public SharedCustomView(Context context) {
        this(context, null);
    }

    public SharedCustomView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SharedCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        Di.inject(this);
        Views.merge(this, R.layout.shared_custom_view);
        setOrientation(VERTICAL);
    }
}
