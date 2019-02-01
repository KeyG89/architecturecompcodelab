package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.ui.detail.DetailActivityViewModel;

public class MainViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final SunshineRepository mRepository;

    public MainViewModelFactory(SunshineRepository mRepository) {
        this.mRepository = mRepository;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new MainActivityViewModel(mRepository);
    }
}
