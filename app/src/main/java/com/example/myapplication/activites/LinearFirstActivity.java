package com.example.myapplication.activites;


import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class LinearFirstActivity extends AppCompatActivity {
    LinearLayout mainLayout;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_linear);
        EdgeToEdge.enable(this);
        mainLayout = findViewById(R.id.first_linear);
//        mainLayout.setOrientation();

        mainLayout.setGravity(Gravity.CENTER_HORIZONTAL);
    }

}
