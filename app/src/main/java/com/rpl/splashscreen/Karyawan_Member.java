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

public class Karyawan_Member extends AppCompatActivity implements View.OnClickListener {
    private String[] movie = {"Bad Boys for Life","The Old Guard","Raised by Wolves","Elite","The Walking Dead: World Beyond","Artemis Fowl","Black Box","Riverdale","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice "};
    private String[] movieYear = {"Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category"};
    private String[] price = {"20001","20002","20003","20004","20005","20006","20007","20008","20009","20010","2011","2012","2013","2014","2015","2016"};

    private ArrayList<Movie> listMovie;
    private RecyclerView rv_admin2;
    private ImageView iv_returnmembers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karyawan_members);

        iv_returnmembers =  findViewById(R.id.iv_returnmembers);
        iv_returnmembers.setOnClickListener(this);

        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length ; i++) {
            Movie mov = new Movie(movie[i],movieYear[0],"Rp. "+price[i],0);
            listMovie.add(mov);

        }

        rv_admin2 = findViewById(R.id.rv_admin2);
        rv_admin2.setHasFixedSize(true);

        rv_admin2.setLayoutManager(new LinearLayoutManager(this));
        Karyawan_MemberAdapter movieAdapter = new Karyawan_MemberAdapter(listMovie);
        rv_admin2.setAdapter(movieAdapter);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.iv_returnmembers){
            Intent kembali_Home = new Intent(Karyawan_Member.this, Karyawan_Main.class);
            startActivity(kembali_Home);
        }
    }
}