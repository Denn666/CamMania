package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity implements View.OnClickListener{
    private TextView tv_btnLogIn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tv_btnLogIn = findViewById(R.id.tv_btnLogIn);
        tv_btnLogIn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.tv_btnLogIn){
            Intent tv_btnLogIn = new Intent(Register.this, Login.class );
            startActivity(tv_btnLogIn);
        }
    }
}
