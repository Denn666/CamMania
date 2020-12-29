package com.rpl.splashscreen;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class Admin_Main extends AppCompatActivity {
    private static final String TAG = Admin_Main.class.getSimpleName();

    private ChipNavigationBar btm_navigation;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_main);


        btm_navigation = findViewById(R.id.botnav_admin);

        if(savedInstanceState==null){
            btm_navigation.setItemSelected(R.id.adm_home, true);
            fragmentManager = getSupportFragmentManager();
            Admin_HomeFragment Admin_HomeFragment = new Admin_HomeFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container2, Admin_HomeFragment)
                    .commit();
        }

        btm_navigation.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {
                Fragment fragment = null;
                switch (id){
                    case R.id.adm_home:
                        fragment = new Admin_HomeFragment();
                        break;
                    case R.id.adm_user:
                        fragment = new Admin_UserFragment();
                        break;
                }
                if (fragment!=null){
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container2, fragment)
                            .commit();
                }else {
                    Log.e(TAG, "Error in creating fragment");
                }
            }
        });




    }
}
