package com.rpl.splashscreen;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class Karyawan_Main extends AppCompatActivity {
    private static final String TAG = Karyawan_Main.class.getSimpleName();

    private ChipNavigationBar btm_navigation;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_main);


        btm_navigation = findViewById(R.id.botnav_karyawan);

        if(savedInstanceState==null){
            btm_navigation.setItemSelected(R.id.krw_home, true);
            fragmentManager = getSupportFragmentManager();
            Karyawan_HomeFragment Karyawan_HomeFragment = new Karyawan_HomeFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container3, Karyawan_HomeFragment)
                    .commit();
        }

        btm_navigation.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {
                Fragment fragment = null;
                switch (id){
                    case R.id.krw_home:
                        fragment = new Karyawan_HomeFragment();
                        break;

                    case R.id.krw_user:
                        fragment = new Karyawan_ProfileFragment();
                        break;
                }
                if (fragment!=null){
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container3, fragment)
                            .commit();
                }else {
                    Log.e(TAG, "Error in creating fragment");
                }
            }
        });




    }
}