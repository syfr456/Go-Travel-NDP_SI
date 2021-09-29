package com.example.gotravel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intro_1 extends AppCompatActivity {

    Button tombol1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro1);

        tombol1 = (Button) findViewById(R.id.button1);


        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tombol1 = new Intent(intro_1.this,intro_2.class);
                startActivity(tombol1);
            }
        });
    }
}