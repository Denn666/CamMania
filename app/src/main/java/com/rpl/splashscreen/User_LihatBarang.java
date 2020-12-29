package com.rpl.splashscreen;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class User_LihatBarang extends AppCompatActivity  implements View.OnClickListener {

    private ImageView return_lihatbarang;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_barang);
        return_lihatbarang = findViewById(R.id.iv_returnlihatbarang);
        return_lihatbarang.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_returnlihatbarang) {
            Intent balik_kategori = new Intent(User_LihatBarang.this, User_MainActivity.class);
            startActivity(balik_kategori);
        }

    }


}
