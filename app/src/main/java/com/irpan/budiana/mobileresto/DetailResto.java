package com.irpan.budiana.mobileresto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailResto extends AppCompatActivity implements View.OnClickListener {

    private String title = "Detail";

    public static final String DATA_NAMA = "data_nama";
    public static final String DATA_ALAMAT = "data_alamat";
    public static final String DATA_TELEPON = "data_telepon";
    public static final String DATA_JAM = "data_jam";
    public static final String DATA_RATE = "data_rate";
    public static final String DATA_HARGA = "data_harga";
    public static final String DATA_SERVICE = "data_service";
    public static final String DATA_DETAIL = "data_detail";
    public static final String DATA_FOTO = "data_foto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resto);

        setActionBarTitle(title);

        TextView tvRestoName = findViewById(R.id.tv_resto_name);
        TextView tvRestoAddress = findViewById(R.id.tv_resto_address);
        ImageView imgRestoFoto = findViewById(R.id.image_main);
        TextView tvRestoPhone = findViewById(R.id.tv_resto_telepon);
        TextView tvRestoHour = findViewById(R.id.tv_resto_open_hour);
        TextView tvRestoRate = findViewById(R.id.tv_resto_rate);
        TextView tvRestoService = findViewById(R.id.tv_resto_service);
        TextView tvRestoPrice = findViewById(R.id.tv_resto_price);
        TextView tvRestoDetail = findViewById(R.id.tv_resto_description);

        String nama = getIntent().getStringExtra(DATA_NAMA);
        String alamat = getIntent().getStringExtra(DATA_ALAMAT);
        String phone = getIntent().getStringExtra(DATA_TELEPON);
        String hour = getIntent().getStringExtra(DATA_JAM);
        String rate = getIntent().getStringExtra(DATA_RATE);
        String service = getIntent().getStringExtra(DATA_SERVICE);
        String price = getIntent().getStringExtra(DATA_HARGA);
        int foto = getIntent().getIntExtra(DATA_FOTO,0 );
        String description = getIntent().getStringExtra(DATA_DETAIL);

        tvRestoName.setText(nama);
        tvRestoAddress.setText(alamat);
        tvRestoPhone.setText(phone);
        tvRestoHour.setText(hour);
        tvRestoRate.setText(rate);
        tvRestoService.setText(service);
        imgRestoFoto.setImageResource(foto);
        tvRestoDetail.setText(description);
        tvRestoPrice.setText(price);

        Button btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                Intent intentMain = new Intent(DetailResto.this, MainActivity.class);
                startActivity(intentMain);
                break;
        }
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

}