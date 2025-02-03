package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<Item> items = new ArrayList<Item>(
        Arrays.asList(
            new Item(2,"a","arduino"),
            new Item(3,"b","breadboard"),
            new Item(4,"b","breadboard"),
            new Item(5,"b","breadboard"),
            new Item(6,"b","breadboard"),
            new Item(7,"b","breadboard"),
            new Item(8,"b","breadboard"),
            new Item(9,"b","breadboard"),
            new Item(10,"b","breadboard"),
            new Item(11,"b","breadboard"),
            new Item(12,"b","breadboard"),
            new Item(13,"b","breadboard")
        )
    );

    Button button;
    RecyclerView recyclerView;
    CatRecyclerViewAdapter catAdapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // RecyclerView 설정
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CatRecyclerViewAdapter(items));

        // helloBtn 설정
        button = findViewById(R.id.helloBtn);
        button.setOnClickListener(this);

        // webBtn 설정
        Button webBtn = findViewById(R.id.webBtn);
        webBtn.setOnClickListener(v -> {
            openNaver();
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this.getApplicationContext(),
                "Hello",Toast.LENGTH_SHORT)
                .show();
    }

    void openNaver(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"));
        startActivity(intent);
    }
}