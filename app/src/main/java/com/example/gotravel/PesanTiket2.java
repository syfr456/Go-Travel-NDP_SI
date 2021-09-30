package com.example.gotravel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class PesanTiket2 extends AppCompatActivity {

    Button pesan2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_tiket2);

        pesan2 = (Button) findViewById(R.id.btn_pesantiket2);

        pesan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pesan2 = new Intent(PesanTiket2.this, Detail.class);
                startActivity(pesan2);
            }
        });
    }
}