package com.example.coolweather.gson;

/**
 * Created by jason on 2018/1/28.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
