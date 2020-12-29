package com.rpl.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Karyawan_IsiPengembalian extends AppCompatActivity implements View.OnClickListener {
    private ImageView returnKaryawan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_isi_pengembalian);
        returnKaryawan = findViewById(R.id.iv_returnisipengembalian);
        returnKaryawan.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returnisipengembalian) {
            Intent balik_krwproductin = new Intent(Karyawan_IsiPengembalian.this, Karyawan_Pengembalian.class);
            startActivity(balik_krwproductin);
        }
    }
}