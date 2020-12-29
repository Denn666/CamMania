package com.rpl.splashscreen;

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

public class User_MainAdapter extends RecyclerView.Adapter<User_MainAdapter.ListViewHolder> {


    private Context mContext;
    private ArrayList<Movie> listMovie;

    public User_MainAdapter(ArrayList<Movie> listMovie, Context mContext) {
        this.listMovie = listMovie;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public User_MainAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usr_main,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull User_MainAdapter.ListViewHolder holder, int position) {
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
        Button btnLihat;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            btnLihat = itemView.findViewById(R.id.btn_lihat);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtYear = itemView.findViewById(R.id.txtYear);
            txtPrice = itemView.findViewById(R.id.txtPrice);

            btnLihat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        Intent masuk_lihatbarang = new Intent(mContext.getApplicationContext(), User_LihatBarang.class);
                    mContext.startActivity(masuk_lihatbarang);
                }
            });

        }

    }
}
