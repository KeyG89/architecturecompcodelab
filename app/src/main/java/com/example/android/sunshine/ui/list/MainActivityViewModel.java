package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.ListWeatherEntry;
import com.example.android.sunshine.data.database.WeatherEntry;
import com.example.android.sunshine.utilities.SunshineDateUtils;

import java.util.Date;
import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private final LiveData<List<ListWeatherEntry>> mWeather;
    private final SunshineRepository mRepository;


    public MainActivityViewModel(SunshineRepository mRepository) {
        this.mRepository = mRepository;
        mWeather = mRepository.getCurrentWeatherForecasts();

    }

    public LiveData<List<ListWeatherEntry>> getWeather() {
        return mWeather;
    }
}
