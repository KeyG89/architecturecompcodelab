package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.WeatherEntry;
import com.example.android.sunshine.utilities.SunshineDateUtils;

import java.util.Date;
import java.util.List;

public class MainActivityViewModel extends ViewModel {

    // Weather forecast the user is looking at
    private final LiveData<List<WeatherEntry>> mWeather;
    // Date for the weather forecast
    private final Date mDate;
    private final SunshineRepository mRepository;


    public MainActivityViewModel(SunshineRepository mRepository) {
        mDate = SunshineDateUtils.getNormalizedUtcDateForToday();
        this.mRepository = mRepository;
        mWeather = mRepository.getWeatherAfterDate(mDate);

    }

    public LiveData<List<WeatherEntry>> getWeather() {
        return mWeather;
    }
}
