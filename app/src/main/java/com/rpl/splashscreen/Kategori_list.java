package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Kategori_list extends AppCompatActivity implements View.OnClickListener {
    private String[] movie = {"Bad Boys for Life","The Old Guard","Raised by Wolves","Elite","The Walking Dead: World Beyond","Artemis Fowl","Black Box","Riverdale","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice "};
    private String[] movieYear = {"Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category"};
    private String[] price = {"20001","20002","20003","20004","20005","20006","20007","20008","20009","20010","2011","2012","2013","2014","2015","2016"};

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
        Kategori_listAdapter movieAdapter = new Kategori_listAdapter(listMovie);
        rvMovie2.setAdapter(movieAdapter);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.iv_returnkategori){
            Intent balik_kategori = new Intent(Kategori_list.this, MainActivity.class);
            startActivity(balik_kategori);
        }
    }
}
