package com.rpl.splashscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Kategori_listAdapter extends RecyclerView.Adapter<Kategori_listAdapter.ListViewHolder> {

    private ArrayList<Movie> listMovie;

    public Kategori_listAdapter(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    @NonNull
    @Override
    public com.rpl.splashscreen.Kategori_listAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row2,parent,false);
        return new ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull com.rpl.splashscreen.Kategori_listAdapter.ListViewHolder holder, int position) {
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
