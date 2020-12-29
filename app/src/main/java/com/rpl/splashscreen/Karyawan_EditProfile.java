package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Karyawan_EditProfile extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_returnkaryawanprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_profile_edit);
        iv_returnkaryawanprofile = findViewById(R.id.iv_returnkaryawanprofile);
        iv_returnkaryawanprofile.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returnkaryawanprofile) {
            Intent balik_akun_krw = new Intent(Karyawan_EditProfile.this, Karyawan_Main.class);
            startActivity(balik_akun_krw);
        }
    }
}