package com.example.gotravel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pemesanan extends AppCompatActivity {

    Button pemesanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);

        pemesanan = (Button) findViewById(R.id.btn_pemesanan);

        pemesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pemesanan = new Intent(Pemesanan.this,MPembayaran.class);
                startActivity(pemesanan);
            }
        });
    }
}