package com.example.gotravel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PesanTiket extends AppCompatActivity {

    Button tombol1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_tiket);

        tombol1 = (Button) findViewById(R.id.btn_pesantiket);

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tombol1 = new Intent(PesanTiket.this,PesanTiket2.class);
                startActivity(tombol1);
            }
        });
    }
}