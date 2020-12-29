package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Admin_MemberOperator extends AppCompatActivity implements View.OnClickListener {
    private String[] movie = {"Username 1","Username 2","Username 3","Username 3","Username 3","Username 4"};
    private String[] movieYear = {"Null","Null","Null","Null"};
    private String[] price = {"User","Operator","Operator","Cashier","Cashier","Cashier"};

    private ArrayList<Movie> listMovie;
    private RecyclerView rv_admin1;
    private ImageView iv_returnadminmembers;
    private ImageView tambah_operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_members_operator);

        iv_returnadminmembers = findViewById(R.id.iv_returnadminmembers);
        iv_returnadminmembers.setOnClickListener(this);
        tambah_operator = findViewById(R.id.admin_add_operator);
        tambah_operator.setOnClickListener(this);

        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length ; i++) {
            Movie mov = new Movie(movie[i],movieYear[0],"Type: "+price[i],0);
            listMovie.add(mov);

        }

        rv_admin1 = findViewById(R.id.rv_admin1);
        rv_admin1.setHasFixedSize(true);

        rv_admin1.setLayoutManager(new LinearLayoutManager(this));
        Admin_MemberOperatorAdapter movieAdapter = new Admin_MemberOperatorAdapter(listMovie);
        rv_admin1.setAdapter(movieAdapter);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.iv_returnadminmembers){
            Intent balik_adminHome = new Intent(Admin_MemberOperator.this, Admin_Main.class);
            startActivity(balik_adminHome);
        }
        if(v.getId()==R.id.admin_add_operator){
            Intent tambah_operator = new Intent(Admin_MemberOperator.this, Admin_AddKaryawan.class);
            startActivity(tambah_operator);
        }
    }
}