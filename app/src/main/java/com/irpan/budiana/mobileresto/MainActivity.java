package com.irpan.budiana.mobileresto;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvResto;
    private ArrayList<Resto> list = new ArrayList<>();

    private String title = "Mobile Resto Guide";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setActionBarTitle(title);

        rvResto = findViewById(R.id.rv_resto);
        rvResto.setHasFixedSize(true);

        list.addAll(RestoData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                title = "About";
                showAboutScreen();
                break;
        }
        setActionBarTitle(title);
    }

    private void showDetailScreen() {
        Intent intentDetail = new Intent(MainActivity.this, DetailResto.class);
        startActivity(intentDetail);
    }

    private void showAboutScreen() {
        Intent intentAbout = new Intent(MainActivity.this, About.class);
        startActivity(intentAbout);
    }

    private void showRecyclerList() {
        rvResto.setLayoutManager(new LinearLayoutManager(this));
        ListRestoAdapter listRestoAdapter = new ListRestoAdapter(list);
        rvResto.setAdapter(listRestoAdapter);
        listRestoAdapter.setOnItemClickCallBack(new ListRestoAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Resto data) {
                showSelectedResto(data);
            }
        });
    }

    private void showSelectedResto(Resto resto) {
        Intent intentDetail = new Intent(MainActivity.this, DetailResto.class);
        intentDetail.putExtra(DetailResto.DATA_NAMA, resto.getName());
        intentDetail.putExtra(DetailResto.DATA_ALAMAT, resto.getAddress());
        intentDetail.putExtra(DetailResto.DATA_DETAIL, resto.getDetail());
        intentDetail.putExtra(DetailResto.DATA_FOTO, resto.getPhoto());
        intentDetail.putExtra(DetailResto.DATA_ALAMAT, resto.getAddress());
        intentDetail.putExtra(DetailResto.DATA_TELEPON, resto.getPhone());
        intentDetail.putExtra(DetailResto.DATA_JAM, resto.getHour());
        intentDetail.putExtra(DetailResto.DATA_RATE, resto.getRate());
        intentDetail.putExtra(DetailResto.DATA_HARGA, resto.getPrice());
        intentDetail.putExtra(DetailResto.DATA_SERVICE, resto.getService());

        startActivity(intentDetail);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}