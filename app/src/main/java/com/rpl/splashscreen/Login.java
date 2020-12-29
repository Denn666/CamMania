package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity implements View.OnClickListener{
    private ImageView iv_bglogin;
    private Button btn_login;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        iv_bglogin = findViewById(R.id.iv_bglogin);
        iv_bglogin.setOnClickListener(this);
        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.iv_bglogin){
            Intent iv_bglogin = new Intent(Login.this, Register.class);
            startActivity(iv_bglogin);
        }

        if (v.getId()==R.id.btn_login){
            Intent login = new Intent(Login.this, Karyawan_Main.class);
            startActivity(login);
        }
    }
}