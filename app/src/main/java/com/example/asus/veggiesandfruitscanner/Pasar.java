package com.example.asus.veggiesandfruitscanner;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pasar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar);
    }

    public void bangmamat(View view) {
        String url = "https://www.google.co.id/maps/@5.5692707,95.3833665,20z";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void kangeman(View view) {
        String url = "https://www.google.co.id/maps/place/Kedai+sayur+kang+Eman/@5.5753317,95.3604893,21z/data=!4m5!3m4!1s0x0:0x8bc98029fcb52696!8m2!3d5.5752724!4d95.360451";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void kedaisayur(View view) {
        String url = "https://www.google.co.id/maps/place/Kedai+Sayur/@5.5462037,95.3280928,18.5z/data=!4m12!1m6!3m5!1s0x3040375cf79bbb45:0x48fa7d4406932a9e!2sKedai+Sayur!8m2!3d5.5458284!4d95.327843!3m4!1s0x3040375cf79bbb45:0x48fa7d4406932a9e!8m2!3d5.5458284!4d95.327843";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void sayursegar(View view) {
        String url = "https://www.google.co.id/maps/@5.573282,95.3627077,20.75z";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
