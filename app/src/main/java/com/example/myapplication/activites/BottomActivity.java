package com.example.myapplication.activites;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.R;
import com.example.myapplication.fragments.AFragment;
import com.example.myapplication.fragments.BFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomActivity extends AppCompatActivity  {

    private final AFragment fragmentA = new AFragment();
    private final BFragment fragmentB = new BFragment();

    private Toolbar toolbar;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bottom);
        int number = getIntent().getIntExtra("zzz",0);
        toolbar = findViewById(R.id.bottom_toolbar);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        setSupportActionBar(toolbar);
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.bottom_container, fragmentA).commitAllowingStateLoss();

        bottomNavigationView.setOnItemSelectedListener(item->{
                var id = item.getItemId();
                transaction = fragmentManager.beginTransaction();
                Log.d("BottomActivity", "onNavigationItemReselected: "+id);
                if(id == R.id.tab1){
                    Log.d("BottomActivity", "tab1 is selected: "+id);
                    transaction.replace(R.id.bottom_container, fragmentA).commitAllowingStateLoss();
                }else if(id == R.id.tab2){
                    Log.d("BottomActivity", "tab2 is selected: "+id);
                    transaction.replace(R.id.bottom_container, fragmentB).commitAllowingStateLoss();
                }
                return true;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

}
