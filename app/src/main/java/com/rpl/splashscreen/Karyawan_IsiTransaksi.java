package com.rpl.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Karyawan_IsiTransaksi extends AppCompatActivity implements View.OnClickListener {
    private ImageView returnKaryawanList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_isi_transaksi);
        returnKaryawanList = findViewById(R.id.iv_returnisitransaksi);
        returnKaryawanList.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returnisitransaksi) {
            Intent balik_krwlist= new Intent(Karyawan_IsiTransaksi.this, Karyawan_ListTransaksi.class);
            startActivity(balik_krwlist);
        }
    }
}
