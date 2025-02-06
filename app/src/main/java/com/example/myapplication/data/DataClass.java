package com.example.myapplication.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DataClass{
    @Expose
    @SerializedName("name") String name;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
}

//{
//        "coord": {
//        "lon": 10.99,
//        "lat": 44.34
//        },
//        "weather": [
//        {
//        "id": 803,
//        "main": "Clouds",
//        "description": "broken clouds",
//        "icon": "04n"
//        }
//        ],
//        "base": "stations",
//        "main": {
//        "temp": 276.8,
//        "feels_like": 276.8,
//        "temp_min": 271.6,
//        "temp_max": 276.8,
//        "pressure": 1033,
//        "humidity": 44,
//        "sea_level": 1033,
//        "grnd_level": 962
//        },
//        "visibility": 10000,
//        "wind": {
//        "speed": 0.85,
//        "deg": 214,
//        "gust": 0.3
//        },
//        "clouds": {
//        "all": 64
//        },
//        "dt": 1738812873,
//        "sys": {
//        "type": 1,
//        "id": 6812,
//        "country": "IT",
//        "sunrise": 1738823301,
//        "sunset": 1738859516
//        },
//        "timezone": 3600,
//        "id": 3163858,
//        "name": "Zocca",
//        "cod": 200
//        }