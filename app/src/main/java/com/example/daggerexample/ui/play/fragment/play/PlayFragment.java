package com.example.daggerexample.ui.play.fragment.play;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.example.daggerexample.R;
import com.example.daggerexample.app.AppSingleton;
import com.example.daggerexample.core.os.CoreFragment;
import com.example.daggerexample.ui.play.PlayViewModel;
import com.example.daggerexample.ui.singleton.ActivitySingleton;

import javax.inject.Inject;


public class PlayFragment extends CoreFragment {
    @Inject AppSingleton appSingleton;
    @Inject ActivitySingleton activitySingleton;

    private PlayViewModel mViewModel;

    public static PlayFragment newInstance() {
        return new PlayFragment();
    }

    @Override public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        appSingleton.doSomething();
        activitySingleton.doSomething();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.play_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(PlayViewModel.class);
        // TODO: Use the ViewModel
    }
}
