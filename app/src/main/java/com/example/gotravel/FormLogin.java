package com.example.gotravel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FormLogin extends AppCompatActivity{

    Button tombol1,tombol2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_login);

        tombol1 = (Button) findViewById(R.id.btn_login);

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tombol1 = new Intent(FormLogin.this,Home.class);
                startActivity(tombol1);
            }
        });
    }
}