package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Admin_UserFragment extends Fragment implements View.OnClickListener{
    private Button btn_admprofile;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.admin_akun, container, false);
        btn_admprofile = view.findViewById(R.id.btn_adm_profile);
        btn_admprofile.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_adm_profile) {
            Intent edit_admin_profile = new Intent(getView().getContext(), Admin_UserProfile.class);
            startActivity(edit_admin_profile);
        }
    }
}