package com.example.gotravel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MPembayaran extends AppCompatActivity {

    Button mpembayaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpembayaran);

        mpembayaran = (Button) findViewById(R.id.btn_mpembayaran);

        mpembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mpembayaran = new Intent(MPembayaran.this,Pembayaran.class);
                startActivity(mpembayaran);
            }
        });
    }
}