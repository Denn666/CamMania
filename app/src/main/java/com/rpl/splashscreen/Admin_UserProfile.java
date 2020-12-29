package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Admin_UserProfile extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_returnadminprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_profile);
        iv_returnadminprofile = findViewById(R.id.iv_returnadminprofile);
        iv_returnadminprofile.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returnadminprofile) {
            Intent balik_akun_admin = new Intent(Admin_UserProfile.this, Admin_Main.class);
            startActivity(balik_akun_admin);
        }
    }
}