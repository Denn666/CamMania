package com.rpl.splashscreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class KeranjangFragment extends Fragment {
    private String[] movie = {"Bad Boys for Life","The Old Guard","Raised by Wolves","Elite","The Walking Dead: World Beyond","Artemis Fowl","Black Box","Riverdale","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice "};
    private String[] movieYear = {"Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category","Category"};
    private String[] price = {"20001","20002","20003","20004","20005","20006","20007","20008","20009","20010","2011","2012","2013","2014","2015","2016"};
    private int[] jumlahBeli = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    private ArrayList<Movie> listMovie;
    private RecyclerView rvMovie4;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_keranjang, container, false);

        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length ; i++) {
            Movie mov = new Movie(movie[i],movieYear[i],"Rp. "+price[i],jumlahBeli[i]);
            listMovie.add(mov);

        }
        rvMovie4 = view.findViewById(R.id.rv_movie4);
        rvMovie4.setHasFixedSize(true);

        rvMovie4.setLayoutManager(new LinearLayoutManager(view.getContext()));
        KeranjangAdapter KeranjangAdapter = new KeranjangAdapter(listMovie);
        rvMovie4.setAdapter(KeranjangAdapter);

        return view;
    }
}
