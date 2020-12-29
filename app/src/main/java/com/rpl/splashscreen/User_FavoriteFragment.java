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


public class User_FavoriteFragment extends Fragment {
    private String[] movie = {"Camera EOS 90D","Nama Barang A","Nama Barang  B","Nama Barang C","TNama Barang D","Nama Barang E","Nama Barang F"};
    private String[] movieYear = {"Camera","Flash","Lens","Lighting","Aksesoris","Category A","Category B"};
    private String[] price = {"100000","20000","34000","11400","20000","45000","23000"};

    private ArrayList<Movie> listMovie;
    private RecyclerView rvMovie3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_favorite, container, false);

        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length ; i++) {
            Movie mov = new Movie(movie[i],movieYear[i],"Rp. "+price[i],0);
            listMovie.add(mov);

        }

        rvMovie3 = view.findViewById(R.id.rv_movie3);
        rvMovie3.setHasFixedSize(true);

        rvMovie3.setLayoutManager(new LinearLayoutManager(view.getContext()));
        User_FavoriteAdapter FavoriteAdapter = new User_FavoriteAdapter(listMovie);
        rvMovie3.setAdapter(FavoriteAdapter);

        return view;
    }
}
