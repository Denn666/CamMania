package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class User_Kategori_list extends AppCompatActivity implements View.OnClickListener {
    private String[] movie = {"Camera EOS 90D","Nama Barang A","Nama Barang  B","Nama Barang C","TNama Barang D","Nama Barang E","Nama Barang F"};
    private String[] movieYear = {"Camera","Flash","Lens","Lighting","Aksesoris","Category A","Category B"};
    private String[] price = {"100000","20000","34000","11400","20000","45000","23000"};

    private ArrayList<Movie> listMovie;
    private RecyclerView rvMovie2;
    private ImageView iv_returnkategori;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_list);

        iv_returnkategori = findViewById(R.id.iv_returnkategori);
        iv_returnkategori.setOnClickListener(this);

        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length ; i++) {
            Movie mov = new Movie(movie[i],movieYear[i],"Rp. "+price[i],0);
            listMovie.add(mov);

        }

        rvMovie2 = findViewById(R.id.rv_movie2);
        rvMovie2.setHasFixedSize(true);

        rvMovie2.setLayoutManager(new LinearLayoutManager(this));
        User_Kategori_listAdapter movieAdapter = new User_Kategori_listAdapter(listMovie);
        rvMovie2.setAdapter(movieAdapter);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.iv_returnkategori){
            Intent balik_kategori = new Intent(User_Kategori_list.this, User_MainActivity.class);
            startActivity(balik_kategori);
        }
    }
}
