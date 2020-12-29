package com.rpl.splashscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class User_KeranjangAdapter extends RecyclerView.Adapter<User_KeranjangAdapter.ListViewHolder> {

    private ArrayList<Movie> listMovie;

    public User_KeranjangAdapter(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    @NonNull
    @Override
    public User_KeranjangAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usr_keranjang,parent,false);
        return new ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull User_KeranjangAdapter.ListViewHolder holder, int position) {
        Movie mov = listMovie.get(position);

        final int[] jumlahBeli_ = {mov.getJumlahBeli()};

        holder.txtTitle.setText(mov.getTitle());
        holder.txtYear.setText(mov.getYear());
        holder.txtPrice.setText(mov.getPrice());
        holder.jml.setText(String.valueOf(mov.getJumlahBeli()));

        holder.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jumlahBeli_[0]==0){
                    jumlahBeli_[0] = 0;
                    holder.jml.setText(String.valueOf(jumlahBeli_[0]));
                }else{
                    jumlahBeli_[0] = jumlahBeli_[0] -1;
                    holder.jml.setText(String.valueOf(jumlahBeli_[0]));
                }
            }
        });

        holder.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jumlahBeli_[0] <100){
                    jumlahBeli_[0] = jumlahBeli_[0] +1;
                    holder.jml.setText(String.valueOf(jumlahBeli_[0]));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle;
        TextView txtYear;
        TextView txtPrice;
        EditText jml;
        ImageButton plus;
        ImageButton minus;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtYear = itemView.findViewById(R.id.txtYear);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            jml = itemView.findViewById(R.id.jml);
            plus = itemView.findViewById(R.id.plus);
            minus = itemView.findViewById(R.id.minus);
        }
    }
}
