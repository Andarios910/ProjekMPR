package com.example.projekmpr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.LayoutDirection;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ImageButton sejarah;
    ImageButton gedung;
    ImageButton lab;
    ImageButton kelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sejarah = findViewById(R.id.sejarah);
        gedung = findViewById(R.id.gedung);
        lab = findViewById(R.id.lab);
        kelas = findViewById(R.id.kelas);

        sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                halamanSejarah();
            }
        });

        gedung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                halamanGedung();
            }
        });

        lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                halamanLab();
            }
        });

        kelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                halamanKelas();
            }
        });

    }

    public void halamanKelas() {
        Intent intent = new Intent(this, kelasActivity.class);
        startActivity(intent);
    }

    public void halamanSejarah() {
        Intent i = new Intent(this, sejarahActivity.class);
        startActivity(i);
    }

    public void halamanGedung() {
        Intent j = new Intent(this, gedungActivity.class);
        startActivity(j);
    }

    public void halamanLab() {
        Intent k = new Intent(this, labActivity.class);
        startActivity(k);
    }
}