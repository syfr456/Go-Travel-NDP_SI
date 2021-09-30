package com.example.gotravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pembayaran extends AppCompatActivity {

    Button konfirmasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        konfirmasi = (Button) findViewById(R.id.btn_konfirmasi);

        konfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konfirmasi = new Intent(Pembayaran.this,Home.class);
                startActivity(konfirmasi);
            }
        });
    }
}