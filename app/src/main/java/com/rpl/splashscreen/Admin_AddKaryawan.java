package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Admin_AddKaryawan extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_returnmemberoperator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_add_karyawan);
        iv_returnmemberoperator = findViewById(R.id.iv_returntambahkaryawan);
        iv_returnmemberoperator.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returntambahkaryawan) {
            Intent balik_memberOP = new Intent(Admin_AddKaryawan.this, Admin_MemberOperator.class);
            startActivity(balik_memberOP);
        }
    }
}