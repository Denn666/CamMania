package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Karyawan_ProfileFragment extends Fragment implements View.OnClickListener{
    private Button btn_krwprofile;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.karyawan_profile, container, false);
        btn_krwprofile = view.findViewById(R.id.btn_krw_profile);
        btn_krwprofile.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_krw_profile) {
            Intent edit_admin_profile = new Intent(getView().getContext(), Karyawan_EditProfile.class);
            startActivity(edit_admin_profile);
        }
    }
}