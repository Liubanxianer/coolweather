package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by MSE on 2019/3/22.
 */
public class Weather {
    public Basic basic;
    public Now now;
    public String status;
    //public Suggestion suggestion;
    //@SerializedName("daily_forecast")
    //public List<Forecast> forecastList;
}
