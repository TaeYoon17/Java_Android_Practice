package com.example.myapplication.data;

import android.view.ViewDebug;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public final class WeatherData {
    public @Expose @SerializedName("weather") ArrayList<Weather> weather;
    public @Expose @SerializedName("coord") Coord coord;
    public @Expose @SerializedName("base") String base;
    public @Expose @SerializedName("main") Main main;
    public @Expose @SerializedName("visibility") int visibility;
    public @Expose @SerializedName("wind") Wind wind;
    public @Expose @SerializedName("clouds") Clouds clouds;
    public @Expose @SerializedName("dt") int dt;
    public @Expose @SerializedName("sys") Sys sys;
    public @Expose @SerializedName("timezone") int timezone;
    public @Expose @SerializedName("id") int id;
    public @Expose @SerializedName("name") String name;
    public @Expose @SerializedName("cod") int cod;





    static public class Coord{
        @Expose @SerializedName("lon") Double lon;
        @Expose @SerializedName("lat") Double lat;
    }
    static public class Weather{
        @Expose @SerializedName("id") int id;
        @Expose @SerializedName("main") String main;
        @Expose @SerializedName("description") String description;
        @Expose @SerializedName("icon") String icon;
    }
    static public final class Main{
        @Expose @SerializedName("temp") double temp;
        @Expose @SerializedName("feels_like") double feels_like;
        @Expose @SerializedName("temp_min") double temp_min;
        @Expose @SerializedName("temp_max") double temp_max;
        @Expose @SerializedName("pressure") double pressure;
        @Expose @SerializedName("humidity") double humidity;
        @Expose @SerializedName("sea_level") int sea_level;
        @Expose @SerializedName("grnd_level") int grnd_level;
    }
    static public final class Wind{
        @Expose @SerializedName("speed") double speed;
        @Expose @SerializedName("deg") int deg;
        @Expose @SerializedName("gust") double gust;
    }
    static public final class Clouds {
        @SerializedName("all")  @Expose
        private Integer all;

        public Integer getAll() {
            return all;
        }

        public void setAll(Integer all) {
            this.all = all;
        }
    }
    static public final class Sys {
        @Expose
        @SerializedName("type")
        int type;
        @Expose
        @SerializedName("id")
        int id;
        @Expose
        @SerializedName("country")
        String country;
        @Expose
        @SerializedName("sunrise")
        int sunrise;
        @Expose
        @SerializedName("sunset")
        int sunset;
    }
}