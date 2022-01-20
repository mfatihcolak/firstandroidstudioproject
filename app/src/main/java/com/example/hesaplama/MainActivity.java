package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1rm, buttonYagOrani, buttonGunlukProtein, buttonBazalMetabolizmaHizi,buttonBmi, buttonGerekliKalori, buttonYagsizVucutKutlesi, buttonYagsizKitleIndeksi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1rm = findViewById(R.id.button1rm);
        buttonYagOrani = findViewById(R.id.buttonYagOrani);
        buttonGunlukProtein = findViewById(R.id.buttonGunlukProtein);
        buttonBazalMetabolizmaHizi = findViewById(R.id.buttonBazalMetabolizmaHizi);
        buttonBmi = findViewById(R.id.buttonBmi);
        buttonGerekliKalori = findViewById(R.id.buttonGerekliKalori);
        buttonYagsizVucutKutlesi = findViewById(R.id.buttonYagsizVucutKutlesi);
        buttonYagsizKitleIndeksi = findViewById(R.id.buttonYagsizKitleIndeksi);

        button1rm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent birrm = new Intent(MainActivity.this,birRMHesapla.class);
                startActivity(birrm);
            }
        });

        buttonGunlukProtein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent protein_hesabi = new Intent(MainActivity.this,gunlukProtein.class);
                startActivity(protein_hesabi);
            }
        });
        buttonYagOrani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yagOrani = new Intent(MainActivity.this,YagOraniHesapla.class);
                startActivity(yagOrani);

            }
        });
        buttonBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bmi = new Intent(MainActivity.this,VucutKitleIndeksi.class);
                startActivity(bmi);
            }
        });
        buttonBazalMetabolizmaHizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bazalMetabolizmaHizi = new Intent(MainActivity.this,BazalMetabolizmaHizi.class);
                startActivity(bazalMetabolizmaHizi);
            }
        });
        buttonGerekliKalori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gerekliKalori = new Intent(MainActivity.this,GunlukKaloriIhtiyaciHesaplama.class);
                startActivity(gerekliKalori);
            }
        });
        buttonYagsizVucutKutlesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yagsizVucutKutlesi = new Intent(MainActivity.this,YagsizVucutKutlesiHesapla.class);
                startActivity(yagsizVucutKutlesi);

            }
        });
        buttonYagsizKitleIndeksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent YagsizKıtleIndeksi = new Intent(MainActivity.this,YagsizKitleIndeksi.class);
                startActivity(YagsizKıtleIndeksi);

            }
        });
    }
}