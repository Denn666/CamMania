package com.rpl.splashscreen;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LihatBarang extends AppCompatActivity  implements View.OnClickListener {
    private ImageButton ib_fav;
    private ImageView return_lihatbarang;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_barang);
        ib_fav = findViewById(R.id.ib_fav);
        ib_fav.setOnClickListener(this);
        return_lihatbarang = findViewById(R.id.iv_returnlihatbarang);
        return_lihatbarang.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ib_fav) {
            Intent balik_kategori = new Intent(LihatBarang.this, Favorite.class);
            startActivity(balik_kategori);
        }
        if (v.getId() == R.id.iv_returnlihatbarang) {
            Intent balik_kategori = new Intent(LihatBarang.this, MainActivity.class);
            startActivity(balik_kategori);
        }

    }


}
