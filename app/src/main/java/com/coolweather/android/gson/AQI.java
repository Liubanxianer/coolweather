package com.coolweather.android.gson;

/**
 * Created by MSE on 2019/3/22.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public  String pm25;
    }
}
