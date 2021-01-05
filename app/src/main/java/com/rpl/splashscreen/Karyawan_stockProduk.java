package com.rpl.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import java.util.ArrayList;

public class Karyawan_stockProduk extends AppCompatActivity implements View.OnClickListener {
    private String[] movie = {"Nama Barang 1","Nama Barang 2","Nama Barang 3","Nama Barang 4","Nama Barang 5"};
    private String[] movieYear = {"Camera","Category","Category","Category","Category"};
    private String[] price = {"17","1","20","202","170"};
    private ArrayList<Movie> listMovie;
    private RecyclerView rv_produkstok;
    private ImageView iv_returnprodukstok;
    private ImageView addProduk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_stock_produk);

        iv_returnprodukstok = findViewById(R.id.iv_returnProdukStok);
        iv_returnprodukstok.setOnClickListener(this);
        addProduk = findViewById(R.id.karyawan_add_produkStok);
        addProduk.setOnClickListener(this);

        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length ; i++) {
            Movie mov = new Movie(movie[i],movieYear[i],price[i],0);
            listMovie.add(mov);

        }

        rv_produkstok = findViewById(R.id.rv_produkstok);
        rv_produkstok.setHasFixedSize(true);

        rv_produkstok.setLayoutManager(new LinearLayoutManager(this));
        Karyawan_stockProdukAdapter movieAdapter = new Karyawan_stockProdukAdapter(this,listMovie);
        rv_produkstok.setAdapter(movieAdapter);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returnProdukStok) {
            Intent balik_krwHome = new Intent(Karyawan_stockProduk.this, Karyawan_Main.class);
            startActivity(balik_krwHome);
        }
        if (v.getId() == R.id.karyawan_add_produkStok) {
            Intent tambahBarang = new Intent(Karyawan_stockProduk.this, Karyawan_StockaddBarang.class);
            startActivity(tambahBarang);
        }
    }
}