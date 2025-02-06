package com.example.myapplication.activites;

import static retrofit2.converter.gson.GsonConverterFactory.*;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.manager.RetrofitInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Objects;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class WeatherActivity extends AppCompatActivity {

    Gson gson = new GsonBuilder().setLenient().create();
    Retrofit retrofit = new Retrofit.Builder().baseUrl("https://www.naver.com")
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
//        int num = Objects.requireNonNull(getIntent().getExtras()).getInt("hello",0);
//        String data = getIntent().getExtras().getString("wow");
        String data = getIntent().getStringExtra("wow");
        TextView txtView = findViewById(R.id.weatherText);
        txtView.setText(data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
