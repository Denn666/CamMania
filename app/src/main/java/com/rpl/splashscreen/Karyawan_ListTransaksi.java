package com.rpl.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Karyawan_ListTransaksi extends AppCompatActivity implements View.OnClickListener {
    private String[] movie = {"Nama Barang 1","Nama Barang 2","Nama Barang 3","Nama Barang 4","Nama Barang 5"};
    private String[] movieYear = {"Category","Category","Category","Category","Category"};
    private String[] price = {"17 Nov 2020","17 Nov 2020","17 Nov 2020","17 Nov 2020","17 Nov 2020"};
    private ArrayList<Movie> listMovie;
    private RecyclerView rv_karyawan;
    private ImageView iv_returntransaksi;
    private ImageView addTransaksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_list_transaksi);

        iv_returntransaksi = findViewById(R.id.iv_returntransaksi);
        iv_returntransaksi.setOnClickListener(this);
        addTransaksi = findViewById(R.id.karyawan_add_transaksi);
        addTransaksi.setOnClickListener(this);

        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length ; i++) {
            Movie mov = new Movie(movie[i],movieYear[i],price[i],0);
            listMovie.add(mov);

        }

        rv_karyawan = findViewById(R.id.rv_karyawan);
        rv_karyawan.setHasFixedSize(true);

        rv_karyawan.setLayoutManager(new LinearLayoutManager(this));
        Karyawan_ListTransaksiAdapter movieAdapter = new Karyawan_ListTransaksiAdapter(listMovie);
        rv_karyawan.setAdapter(movieAdapter);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returntransaksi) {
            Intent balik_krwHome = new Intent(Karyawan_ListTransaksi.this, Karyawan_Main.class);
            startActivity(balik_krwHome);
        }
        if (v.getId() == R.id.karyawan_add_transaksi) {
            Intent masuk_KrwIsiTransaksi = new Intent(Karyawan_ListTransaksi.this, Karyawan_IsiTransaksi.class);
            startActivity(masuk_KrwIsiTransaksi);
        }
    }
}
