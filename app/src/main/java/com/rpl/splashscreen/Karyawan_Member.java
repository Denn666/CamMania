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
    private String[] movie = {"Bulloh","Chabib","Gendhot","Hamdan","Adine"};
    private String[] movieYear = {"Category","Category","Category","Category","Category"};
    private String[] price = {"Members","Members","Members","Members","Members"};

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
            Movie mov = new Movie(movie[i],movieYear[0],price[i],0);
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