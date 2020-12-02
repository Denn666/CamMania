package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class UserProfile extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_returnprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        iv_returnprofile = findViewById(R.id.iv_returnprofile);
        iv_returnprofile.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returnprofile) {
            Intent balik_akun = new Intent(UserProfile.this, UserAkun.class);
            startActivity(balik_akun);
        }
    }
}
