package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class GunlukKaloriIhtiyaciHesaplama extends AppCompatActivity {

    private Button hesaplama_butonu;
    private RadioButton radioButtonsifir, radioButtonhafif, radioButtonorta, radioButtonagir, radioButtonagirinagiri;
    private EditText bazal_metabolizma_hizi;
    private TextView sonuc_kismi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunluk_kalori_ihtiyaci_hesaplama);

        hesaplama_butonu = findViewById(R.id.hesaplama_butonu);
        radioButtonsifir = findViewById(R.id.radioButtonsifir);
        radioButtonhafif = findViewById(R.id.radioButtonhafif);
        radioButtonorta = findViewById(R.id.radioButtonorta);
        radioButtonagir = findViewById(R.id.radioButtonagir);
        radioButtonagirinagiri = findViewById(R.id.radioButtonagirinagiri);
        bazal_metabolizma_hizi = findViewById(R.id.bazal_metabolizma_hizi);
        sonuc_kismi = findViewById(R.id.sonuc_kismi);

        hesaplama_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gelenBMH = bazal_metabolizma_hizi.getText().toString();
                int bmh = Integer.parseInt(gelenBMH);

                if(radioButtonsifir.isChecked()){
                    sonuc_kismi.setText(String.valueOf("Günlük almanız gereken kalori ortalama = " + (int)(bmh * 1.2) + " kaloridir."));
                }
                else if(radioButtonhafif.isChecked()){
                    sonuc_kismi.setText(String.valueOf("Günlük almanız gereken kalori ortalama = " + (int)(bmh * 1.375) + " kaloridir."));
                }
                else if(radioButtonorta.isChecked()){
                    sonuc_kismi.setText(String.valueOf("Günlük almanız gereken kalori ortalama = " + (int)(bmh * 1.55) + " kaloridir."));
                }
                else if(radioButtonagir.isChecked()){
                    sonuc_kismi.setText(String.valueOf("Günlük almanız gereken kalori ortalama = " + (int)(bmh * 1.725) + " kaloridir."));
                }
                else if(radioButtonagirinagiri.isChecked()){
                    sonuc_kismi.setText(String.valueOf("Günlük almanız gereken kalori ortalama = " + (int)(bmh * 1.9) + " kaloridir."));
                }

            }
        });


    }
}