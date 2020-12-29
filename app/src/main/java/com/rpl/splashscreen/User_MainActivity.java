package com.rpl.splashscreen;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class User_MainActivity extends AppCompatActivity{
    private static final String TAG = User_MainActivity.class.getSimpleName();

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
            User_MainFragment userMainFragment = new User_MainFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, userMainFragment)
                    .commit();
        }

        btm_navigation.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {
                Fragment fragment = null;
                switch (id){
                    case R.id.home:
                        fragment = new User_MainFragment();
                        break;
                    case R.id.favorite:
                        fragment = new User_FavoriteFragment();
                        break;
                    case R.id.keranjang:
                        fragment = new User_KeranjangFragment();
                        break;
                    case R.id.kategori:
                        fragment = new User_KategoriFragment();
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