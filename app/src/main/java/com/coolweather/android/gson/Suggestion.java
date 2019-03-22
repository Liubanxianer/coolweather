package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MSE on 2019/3/22.
 */

public class Suggestion {

    public Sport sport;
    @SerializedName("cw")
    public CarWash carWash;
    @SerializedName("comf")
    public Comfort comfort;

    public class Sport{
        @SerializedName("txt")
        public  String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public  String info;
    }
    public class Comfort{
        @SerializedName("txt")
        public  String info;
    }
}
