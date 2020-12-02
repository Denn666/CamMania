package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class KategoriFragment extends Fragment implements View.OnClickListener{
    private ImageView iv_kategorikamera;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_kategori, container, false);
        iv_kategorikamera = view.findViewById(R.id.iv_kategorikamera);
        iv_kategorikamera.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_kategorikamera) {
            Intent masuk_listkategori = new Intent(getView().getContext(), Kategori_list.class);
            startActivity(masuk_listkategori);
        }
    }
}
