package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Admin_UserAkun extends AppCompatActivity implements View.OnClickListener {
    private Button btn_admprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_akun);
        btn_admprofile = findViewById(R.id.btn_adm_profile);
        btn_admprofile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_adm_profile) {
            Intent edit_admin_profile = new Intent(Admin_UserAkun.this, Admin_UserProfile.class);
            startActivity(edit_admin_profile);
        }
    }
}