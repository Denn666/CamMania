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
    private String[] movie = {"Bad Boys for Life","The Old Guard","Raised by Wolves","Elite","The Walking Dead: World Beyond","Artemis Fowl","Black Box","Riverdale","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice "};
    private String[] movieYear = {"Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category"};
    private String[] price = {"20001","20002","20003","20004","20005","20006","20007","20008","20009","20010","2011","2012","2013","2014","2015","2016"};
    private ArrayList<Movie> listMovie;
    private RecyclerView rv_karyawan;
    private ImageView iv_returntransaksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_list_transaksi);

        iv_returntransaksi = findViewById(R.id.iv_returntransaksi);
        iv_returntransaksi.setOnClickListener(this);

        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length ; i++) {
            Movie mov = new Movie(movie[i],movieYear[i],"Rp. "+price[i],0);
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
        if (v.getId() == R.id.iv_returnisitransaksi) {
            Intent balik_krwHome = new Intent(Karyawan_ListTransaksi.this, Karyawan_Main.class);
            startActivity(balik_krwHome);
        }
        if (v.getId() == R.id.karyawan_add_transaksi) {
            Intent masuk_KrwIsiTransaksi = new Intent(Karyawan_ListTransaksi.this, Karyawan_IsiTransaksi.class);
            startActivity(masuk_KrwIsiTransaksi);
        }
    }
}
