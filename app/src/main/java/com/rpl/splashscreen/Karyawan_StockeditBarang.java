package com.rpl.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Karyawan_StockeditBarang extends AppCompatActivity implements View.OnClickListener {
    private ImageView returneditbarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_edit_barang);
        returneditbarang = findViewById(R.id.iv_returneditbarang);
        returneditbarang.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returneditbarang) {
            Intent balik_produkstok = new Intent(Karyawan_StockeditBarang.this, Karyawan_stockProduk.class);
            startActivity(balik_produkstok);
        }
    }
}