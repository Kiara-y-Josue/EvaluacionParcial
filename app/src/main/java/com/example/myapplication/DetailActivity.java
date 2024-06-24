package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView detailImage = findViewById(R.id.detailImage);
        TextView detailCategoria = findViewById(R.id.detailCategoria);
        TextView detailPrecio = findViewById(R.id.detailPrecio);
        TextView detailDescripcion = findViewById(R.id.detailDescripcion);


        String categoria = getIntent().getStringExtra("categoria");
        String precio = getIntent().getStringExtra("precio");
        String descripcion = getIntent().getStringExtra("descripcion");
        String imageUrl = getIntent().getStringExtra("image");


        detailCategoria.setText(categoria);
        detailPrecio.setText(precio);
        detailDescripcion.setText(descripcion);

        Glide.with(this)
                .load(imageUrl)
                .into(detailImage);
    }
}