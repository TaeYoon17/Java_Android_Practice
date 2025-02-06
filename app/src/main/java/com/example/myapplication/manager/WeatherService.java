package com.example.myapplication.manager;


import com.example.myapplication.data.DataClass;
import com.example.myapplication.data.WeatherData;

import retrofit2.Call;
import retrofit2.http.*;
public interface WeatherService {
    @GET("/data/2.5/weather")
    Call<WeatherData> getCurrentWeather(@Query("lat") double latitude,
                                        @Query("lon") double longitude,
                                        @Query("appid") String apiKey);
    @POST("/qwer")
    Call<DataClass> kkkk( @Field("필드작성") String exmple );
}
