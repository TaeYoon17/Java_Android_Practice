package com.example.myapplication.activites;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class FirstFrameActivity extends AppCompatActivity {
    LinearLayout baseLayout;
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
        img1.setActivated(true);
        img2.setActivated(false);
        img3.setActivated(false);
        chBtnImg = findViewById(R.id.chImageBtn);
        chBtnImg.setOnClickListener(V->{
            int val = (idx++) % 3;
            if(val == 0){
                img1.setActivated(true);
                img2.setActivated(false);
                img3.setActivated(false);
            }else if(val == 1){
                img1.setActivated(false);
                img2.setActivated(true);
                img3.setActivated(false);
            }else if(val == 2){
                img1.setActivated(false);
                img2.setActivated(false);
                img3.setActivated(true);
            }
        });
    }
}
