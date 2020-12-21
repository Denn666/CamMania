package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Karyawan_Profile extends AppCompatActivity implements View.OnClickListener {
    private Button btn_krwprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_profile);
        btn_krwprofile = findViewById(R.id.btn_krw_profile);
        btn_krwprofile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_krw_profile) {
            Intent edit_krw_profile = new Intent(Karyawan_Profile.this, Admin_UserProfile.class);
            startActivity(edit_krw_profile);
        }
    }
}