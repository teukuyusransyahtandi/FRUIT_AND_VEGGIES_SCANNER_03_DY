package com.example.asus.veggiesandfruitscanner;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnTakePhotoClicked(View view) {
    Intent intent = new Intent();
        intent.setClass(view.getContext(),ScannerActivity.class);
        startActivity(intent);
    }
}
