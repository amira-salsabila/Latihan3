package com.example.latihan3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHero;
    private ArrayList<ListPahlawanModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHero = findViewById(R.id.activitymain_rv);
        rvHero.setHasFixedSize(true);
        list.addAll(ListPahlawanData.getHeroList());

        rvHero.setLayoutManager(new LinearLayoutManager(this));
        ListPahlawanAdapter listPahlawanAdapter = new ListPahlawanAdapter(ListPahlawanData.getHeroList(), this);
        rvHero.setAdapter(listPahlawanAdapter);
    }
}
