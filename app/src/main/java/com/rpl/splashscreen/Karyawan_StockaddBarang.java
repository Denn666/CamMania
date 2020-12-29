package com.rpl.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Karyawan_StockaddBarang extends AppCompatActivity implements View.OnClickListener {
    private ImageView returnaddbarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_add_barang);
        returnaddbarang = findViewById(R.id.iv_returnaddbarang);
        returnaddbarang.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returnaddbarang) {
            Intent balik_listprodukstok = new Intent(Karyawan_StockaddBarang.this, Karyawan_stockProduk.class);
            startActivity(balik_listprodukstok);
        }
    }
}