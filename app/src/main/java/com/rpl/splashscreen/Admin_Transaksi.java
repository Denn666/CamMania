package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Admin_Transaksi extends AppCompatActivity implements View.OnClickListener {
    private String[] movie = {"Nama Barang 1","Nama Barang 2","Nama Barang 3","Nama Barang 4","Nama Barang 5"};
    private String[] movieYear = {"Category","Category","Category","Category","Category"};
    private String[] price = {"17 Nov 2020","17 Nov 2020","17 Nov 2020","17 Nov 2020","17 Nov 2020"};
    private ArrayList<Movie> listMovie;
    private RecyclerView rv_admin;
    private ImageView iv_returnadmintransaksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_transaksi);

        iv_returnadmintransaksi = findViewById(R.id.iv_returnadmintransaksi);
        iv_returnadmintransaksi.setOnClickListener(this);

        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length ; i++) {
            Movie mov = new Movie(movie[i],movieYear[i],price[i],0);
            listMovie.add(mov);

        }

        rv_admin = findViewById(R.id.rv_admin);
        rv_admin.setHasFixedSize(true);

        rv_admin.setLayoutManager(new LinearLayoutManager(this));
        Admin_TransaksiAdapter movieAdapter = new Admin_TransaksiAdapter(listMovie);
        rv_admin.setAdapter(movieAdapter);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.iv_returnadmintransaksi){
            Intent balik_admin_home = new Intent(Admin_Transaksi.this, Admin_Main.class);
            startActivity(balik_admin_home);
        }
    }
}
