package com.example.daggerexample.ui.common.fragment.main;

import android.content.Context;
import android.content.Intent;
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
import com.example.daggerexample.core.util.Pre;
import com.example.daggerexample.ui.main.MainViewModel;
import com.example.daggerexample.ui.play.PlayActivity;
import com.example.daggerexample.ui.singleton.ActivitySingleton;

import javax.inject.Inject;

import static com.example.daggerexample.core.util.Views.findView;


public class MainFragment extends CoreFragment {
    @Inject AppSingleton appSingleton;
    @Inject ActivitySingleton activitySingleton;

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        appSingleton.doSomething();
        activitySingleton.doSomething();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        findView(view, R.id.main_fragment_message).setOnClickListener(v -> {
            Pre.notNull(getActivity()).startActivity(new Intent(getActivity(), PlayActivity.class));
        });
    }
}
