package com.example.kuis1_sitiaisyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity_page2 extends AppCompatActivity {
    Button logout;

    ImageButton bukutabungan;
    ImageButton kartubelanja;
    ImageButton historybelanja;

    ImageButton rekapsimpanan;
    ImageButton rekappinjaman;
    ImageButton rekapshu;
    ImageButton info;

    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page2);
        getSupportActionBar().hide();

        logout=(Button) findViewById(R.id.buttonLogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity_page2.this,MainActivity.class));
            }
        });

        bukutabungan= findViewById(R.id.bukutabungan);
        bukutabungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Buku Tabungan", Toast.LENGTH_LONG).show();
            }
        });

        kartubelanja = findViewById(R.id.kartubelanja);
        kartubelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Kartu Belanja", Toast.LENGTH_LONG).show();
            }
        });

        historybelanja = findViewById(R.id.historybelanja);
        historybelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "History Belanja", Toast.LENGTH_LONG).show();
            }
        });

        rekapsimpanan = findViewById(R.id.rekapsimpanan2);
        rekapsimpanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Rekap Simpanan", Toast.LENGTH_LONG).show();
            }
        });

        rekappinjaman = findViewById(R.id.rekappinjaman2);
        rekappinjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Rekap Pinjaman", Toast.LENGTH_LONG).show();
            }
        });

        rekapshu = findViewById(R.id.rekapshu2);
        rekapshu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Rekap SHU", Toast.LENGTH_LONG).show();
            }
        });

        info = findViewById(R.id.infopay);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Info KPRIUB Pay", Toast.LENGTH_LONG).show();
            }
        });

        imageSlider = findViewById(R.id.imageSlider);

        //list for images
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.diskon1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.diskon2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.diskon3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.diskon4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.diskon5, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}