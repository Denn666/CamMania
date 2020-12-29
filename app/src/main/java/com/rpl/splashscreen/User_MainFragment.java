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

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;


public class User_MainFragment extends Fragment {
    private String[] movie = {"Camera EOS 90D","Nama Barang A","Nama Barang  B","Nama Barang C","TNama Barang D","Nama Barang E","Nama Barang F"};
    private String[] movieYear = {"Camera","Flash","Lens","Lighting","Aksesoris","Category A","Category B"};
    private String[] price = {"100000","20000","34000","11400","20000","45000","23000"};

    private ArrayList<Movie> listMovie;
    private RecyclerView rvMovie;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_home, container, false);

        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length ; i++) {
            Movie mov = new Movie(movie[i],movieYear[i],"Rp. "+price[i],0);
            listMovie.add(mov);

        }


        rvMovie = view.findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        rvMovie.setLayoutManager(new LinearLayoutManager(view.getContext()));
        User_MainAdapter userMainAdapter = new User_MainAdapter(listMovie,view.getContext());
        rvMovie.setAdapter(userMainAdapter);

        ImageSlider imageSlider = view.findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://cdn.mos.cms.futurecdn.net/7UKru4akuGz2QcUPp6smqX-970-80.jpg.webp", "Kamera A"));
        slideModels.add(new SlideModel("https://www.borrowlenses.com/blog/wp-content/uploads/2016/07/vlogging-gear-best-of-2019.jpg", "Kamera B"));
        slideModels.add(new SlideModel("https://i1.adis.ws/i/canon/EOS-r5_Martin_Bissig_Lifestyle_hero-e90f9dd2-be19-11ea-b23c-8c04ba195b5f?w=100%&sm=aspect&aspect=16:9&qlt=80&fmt=jpg&fmt.options=interlaced&bg=rgb(255,255,255)", "Kamera C"));
        imageSlider.setImageList(slideModels, true);

        return view;
    }



}
