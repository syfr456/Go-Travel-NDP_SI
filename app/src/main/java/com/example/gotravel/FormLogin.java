package com.example.gotravel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FormLogin extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_login);

        Button btn = findViewById(R.id.btn_login);
        btn.setOnClickListener(this);
        Button btnn = findViewById(R.id.sign_up);
        btnn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
            if (v.getId() == R.id.btn_login) {
                Intent move = new Intent(FormLogin.this, PesanTiket.class);
                startActivity(move);
            }

            if (v.getId() == R.id.sign_up) {
                Intent movee = new Intent(FormLogin.this, FormRegistrasi.class);
                startActivity(movee);
            }
        }
}