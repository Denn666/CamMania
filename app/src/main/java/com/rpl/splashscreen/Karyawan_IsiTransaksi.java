package com.rpl.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Karyawan_IsiTransaksi extends AppCompatActivity implements View.OnClickListener {
    private ImageView returnKaryawanHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_isi_transaksi);
        returnKaryawanHome = findViewById(R.id.iv_returnisitransaksi);
        returnKaryawanHome.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returnisitransaksi) {
            Intent balik_krwHome = new Intent(Karyawan_IsiTransaksi.this, Karyawan_Main.class);
            startActivity(balik_krwHome);
        }
    }
}
