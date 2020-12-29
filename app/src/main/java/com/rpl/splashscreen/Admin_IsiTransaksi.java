package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Admin_IsiTransaksi extends AppCompatActivity implements View.OnClickListener {
    private ImageView returnAdminHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_isi_transaksi);
        returnAdminHome = returnAdminHome = findViewById(R.id.iv_returnadminisitransaksi);
        returnAdminHome.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returnadminisitransaksi) {
            Intent balik_adminHome = new Intent(Admin_IsiTransaksi.this, Admin_Main.class);
            startActivity(balik_adminHome);
        }
    }
}
