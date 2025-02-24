package com.example.myapplication.activites;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class FirstFrameActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    FrameLayout frame1,frame2,frame3;
    ImageView img1,img2,img3;
    Button chBtnImg;
    int idx = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_frame);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img1.setVisibility(VISIBLE);
        img2.setVisibility(INVISIBLE);
        img3.setVisibility(INVISIBLE);
        chBtnImg = findViewById(R.id.chImageBtn);
        chBtnImg.setOnClickListener(V->{
            int val = (idx++) % 3;
            if(val == 0){
                img1.setVisibility(INVISIBLE);
                img2.setVisibility(VISIBLE);
                img3.setVisibility(INVISIBLE);
            }else if(val == 1){
                img1.setVisibility(INVISIBLE);
                img2.setVisibility(VISIBLE);
                img3.setVisibility(INVISIBLE);
            }else if(val == 2){
                img1.setVisibility(INVISIBLE);
                img2.setVisibility(INVISIBLE);
                img3.setVisibility(VISIBLE);
            }
        });
    }
}
