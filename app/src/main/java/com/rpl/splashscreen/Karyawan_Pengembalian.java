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

public class Karyawan_Pengembalian extends AppCompatActivity implements View.OnClickListener {
    private String[] movie = {"Nama Barang 1","Nama Barang 2","Nama Barang 3","Nama Barang 4","Nama Barang 5"};
    private String[] movieYear = {"Category","Category","Category","Category","Category"};
    private String[] price = {"17 Nov 2020","17 Nov 2020","17 Nov 2020","17 Nov 2020","17 Nov 2020"};
    private ArrayList<Movie> listMovie;
    private RecyclerView rv_karyawan1;
    private ImageView returnpengembalian;
    private ImageView addPengembalian;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_pengembalian);
        returnpengembalian  = findViewById(R.id.iv_returnpengembalian);
        returnpengembalian.setOnClickListener(this);
        addPengembalian = findViewById(R.id.karyawan_add_pengembalian);
        addPengembalian.setOnClickListener(this);
        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length; i++) {
            Movie mov = new Movie(movie[i], movieYear[i], "Rp. " + price[i], 0);
            listMovie.add(mov);

        }

        rv_karyawan1 = findViewById(R.id.rv_karyawan1);
        rv_karyawan1.setHasFixedSize(true);

        rv_karyawan1.setLayoutManager(new LinearLayoutManager(this));
        Karyawan_PengembalianAdapter movieAdapter = new Karyawan_PengembalianAdapter(listMovie);
        rv_karyawan1.setAdapter(movieAdapter);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returnpengembalian) {
            Intent balik_krwHome = new Intent(Karyawan_Pengembalian.this, Karyawan_Main.class);
            startActivity(balik_krwHome);
        }
        if (v.getId() == R.id.karyawan_add_pengembalian) {
            Intent masuk_KrwIsiBarang = new Intent(Karyawan_Pengembalian.this, Karyawan_IsiPengembalian.class);
            startActivity(masuk_KrwIsiBarang);
        }
    }
}