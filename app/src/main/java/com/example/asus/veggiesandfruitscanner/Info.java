package com.example.asus.veggiesandfruitscanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void btnDiatas(View view) {
        Intent pindah = new Intent();
        pindah.setClass(view.getContext(),Info1.class);
        startActivity(pindah);
    }

    public void btnDibawah(View view) {
        Intent pindah = new Intent();
        pindah.setClass(view.getContext(),Info2.class);
        startActivity(pindah);
    }
}
