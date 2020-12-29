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


public class User_KeranjangFragment extends Fragment {
    private String[] movie = {"Camera EOS 90D","Nama Barang A","Nama Barang  B","Nama Barang C","TNama Barang D","Nama Barang E","Nama Barang F"};
    private String[] movieYear = {"Camera","Flash","Lens","Lighting","Aksesoris","Category A","Category B"};
    private String[] price = {"100000","20000","34000","11400","20000","45000","23000"};
    private int[] jumlahBeli = {0,0,0,0,0,0,0};

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
        User_KeranjangAdapter User_KeranjangAdapter = new User_KeranjangAdapter(listMovie);
        rvMovie4.setAdapter(User_KeranjangAdapter);

        return view;
    }
}
