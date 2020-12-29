package com.rpl.splashscreen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Karyawan_stockProdukAdapter extends RecyclerView.Adapter<Karyawan_stockProdukAdapter.ListViewHolder> {


    private ArrayList<Movie> listMovie;

    public Karyawan_stockProdukAdapter(ArrayList<Movie> listMovie) {

        this.listMovie = listMovie;

    }

    @NonNull
    @Override
    public Karyawan_stockProdukAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_karyawan_produkstok,parent,false);
        return new Karyawan_stockProdukAdapter.ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Karyawan_stockProdukAdapter.ListViewHolder holder, int position) {
        Movie mov = listMovie.get(position);

        holder.txtTitle.setText(mov.getTitle());
        holder.txtYear.setText(mov.getYear());
        holder.txtPrice.setText(mov.getPrice());

    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle;
        TextView txtYear;
        TextView txtPrice;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);


            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtYear = itemView.findViewById(R.id.txtYear);
            txtPrice = itemView.findViewById(R.id.txtPrice);


        }
    }
}