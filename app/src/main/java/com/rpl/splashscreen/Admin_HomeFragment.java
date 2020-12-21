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

public class Admin_HomeFragment extends Fragment implements View.OnClickListener{
    private ImageView Transaksi;
    private ImageView IsiTransaksi;
    private ImageView MemberOperator;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_admin_home, container, false);
        Transaksi = view.findViewById(R.id.iv_transaction);
        Transaksi.setOnClickListener(this);
        IsiTransaksi = view.findViewById(R.id.iv_product_in);
        IsiTransaksi.setOnClickListener(this);
        MemberOperator = view.findViewById(R.id.iv_members);
        MemberOperator.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_transaction) {
            Intent masuk_admin_transaksi = new Intent(getView().getContext(), Admin_Transaksi.class);
            startActivity(masuk_admin_transaksi);
        }
        if (v.getId() == R.id.iv_product_in) {
            Intent masuk_admin_isitransaksi = new Intent(getView().getContext(), Admin_IsiTransaksi.class);
            startActivity(masuk_admin_isitransaksi);
        }
        if (v.getId() == R.id.iv_members) {
            Intent masuk_admin_memberOperator = new Intent(getView().getContext(), Admin_MemberOperator.class);
            startActivity(masuk_admin_memberOperator);
        }
    }
}
