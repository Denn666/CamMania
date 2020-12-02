package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private static final String TAG = MainActivity.class.getSimpleName();

    private ChipNavigationBar btm_navigation;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btm_navigation = findViewById(R.id.botnav_home);

        if(savedInstanceState==null){
            btm_navigation.setItemSelected(R.id.home, true);
            fragmentManager = getSupportFragmentManager();
            MainFragment mainFragment = new MainFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, mainFragment)
                    .commit();
        }

        btm_navigation.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {
                Fragment fragment = null;
                switch (id){
                    case R.id.home:
                        fragment = new MainFragment();
                        break;
                    case R.id.favorite:
                        fragment = new FavoriteFragment();
                        break;
                    case R.id.keranjang:
                        fragment = new KeranjangFragment();
                        break;
                    case R.id.kategori:
                        fragment = new KategoriFragment();
                        break;
                    case R.id.user:
                        fragment = new UserFragment();
                        break;
                }
                if (fragment!=null){
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, fragment)
                            .commit();
                }else {
                    Log.e(TAG, "Error in creating fragment");
                }
            }
        });




    }
}