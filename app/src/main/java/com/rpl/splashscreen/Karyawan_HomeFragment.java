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

public class Karyawan_HomeFragment extends Fragment implements View.OnClickListener{
    private ImageView Transaksi;
    private ImageView IsiTransaksi;
    private ImageView MemberOperator;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.karyawan_home, container, false);
        Transaksi = view.findViewById(R.id.krw_transaction);
        Transaksi.setOnClickListener(this);
        IsiTransaksi = view.findViewById(R.id.krw_product_in);
        IsiTransaksi.setOnClickListener(this);
        MemberOperator = view.findViewById(R.id.krw_members);
        MemberOperator.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.krw_transaction) {
            Intent masuk_krw_transaksi = new Intent(getView().getContext(), Karyawan_ListTransaksi.class);
            startActivity(masuk_krw_transaksi);
        }
        if (v.getId() == R.id.krw_product_in) {
            Intent masuk_krw_productIn = new Intent(getView().getContext(), Karyawan_Pengembalian.class);
            startActivity(masuk_krw_productIn);
        }
        if (v.getId() == R.id.krw_members) {
            Intent masuk_krw_memberOperator = new Intent(getView().getContext(), Karyawan_Member.class);
            startActivity(masuk_krw_memberOperator);
        }
    }
}
