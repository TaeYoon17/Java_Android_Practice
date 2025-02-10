package com.example.myapplication.activites;

import static retrofit2.converter.gson.GsonConverterFactory.*;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.data.WeatherData;
import com.example.myapplication.manager.WeatherService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.text.BreakIterator;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class WeatherActivity extends AppCompatActivity {

    private final String BASE_URL = "https://api.openweathermap.org/";

    Gson gson = new GsonBuilder().setLenient().create();
    Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    WeatherService weatherService = retrofit.create(WeatherService.class);

    TextView txtView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        String data = getIntent().getStringExtra("wow");
        txtView = findViewById(R.id.weatherText);
        txtView.setText(data);
        getWeather();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    void getWeather(){
        Call<WeatherData> call = weatherService.getCurrentWeather(
                44.34,10.39,""
        );
        call.enqueue(new Callback<WeatherData>(){
            @Override
            public void onResponse(Call<WeatherData> call,
                                   retrofit2.Response<WeatherData> response) {
                if (response.isSuccessful() && response.body() != null){
                    WeatherData weatherData = response.body();
                    WeatherActivity.this.txtView.setText(weatherData.name);
                    Log.d("Weather API", "날씨 접근 성공!!");
                } else {
                    Log.d("Weather API", String.valueOf(response.code()));
                    WeatherActivity.this.txtView.setText("날씨 정보 접근 실패!!" + (response.isSuccessful() ? "" : "반응 실패"));
                }
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable throwable) {
                Log.d("Weather API", "Call Failed");
            }
        });
    }
}

