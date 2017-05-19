package com.example.asus.veggiesandfruitscanner;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari);
    }

    public void btnLamnyong(View view) {
        String url = "https://www.google.co.id/maps/place/Pasar+Sayur+Lamnyong/@5.5761747,95.3539791,209m/data=!3m1!1e3!4m12!1m6!3m5!1s0x304037aa4a39270b:0xaf825e61905c4267!2sPasar+Sayur+Lamnyong!8m2!3d5.5756308!4d95.3544476!3m4!1s0x304037aa4a39270b:0xaf825e61905c4267!8m2!3d5.5756308!4d95.3544476";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void btnKedai(View view) {
        String url ="https://www.google.co.id/maps/place/Kedai+Sayur/@5.545745,95.3279615,209m/data=!3m1!1e3!4m12!1m6!3m5!1s0x3040375cf79bbb45:0x48fa7d4406932a9e!2sKedai+Sayur!8m2!3d5.5458284!4d95.327843!3m4!1s0x3040375cf79bbb45:0x48fa7d4406932a9e!8m2!3d5.5458284!4d95.327843";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void btnNeusu(View view) {
        String url = "https://www.google.co.id/maps/place/Pasar+Neusu/@5.5403369,95.3133937,802m/data=!3m1!1e3!4m12!1m6!3m5!1s0x304037567f160e8f:0x5da966456674aa7d!2sPasar+Neusu!8m2!3d5.5403316!4d95.3155824!3m4!1s0x304037567f160e8f:0x5da966456674aa7d!8m2!3d5.5403316!4d95.3155824";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void btnAteuk(View view) {
        String url = "https://www.google.co.id/maps/place/Pasar+Lam+Ateuk/@5.5351913,95.3958768,208m/data=!3m1!1e3!4m12!1m6!3m5!1s0x304047ffab709993:0xdbeb42b06d268bda!2sPasar+Lam+Ateuk!8m2!3d5.5349008!4d95.3964359!3m4!1s0x304047ffab709993:0xdbeb42b06d268bda!8m2!3d5.5349008!4d95.3964359";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
