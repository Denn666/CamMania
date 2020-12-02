package com.rpl.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UserAkun extends AppCompatActivity implements View.OnClickListener {
    private Button btn_profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);
        btn_profile = findViewById(R.id.btn_profile);
        btn_profile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_profile) {
            Intent edit_profile = new Intent(UserAkun.this, UserProfile.class);
            startActivity(edit_profile);
        }
    }
}
