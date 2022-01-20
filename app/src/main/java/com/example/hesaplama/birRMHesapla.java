package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class birRMHesapla extends AppCompatActivity {

    private Button buttonHesapla;
    private EditText editTextAgirlikAlani, editTextTekrarAlani;
    private TextView textViewSonucAlani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bir_rmhesapla);

        buttonHesapla = findViewById(R.id.buttonHesapla);
        editTextAgirlikAlani = findViewById(R.id.editTextAgirlikAlani);
        editTextTekrarAlani = findViewById(R.id.editTextTekrarAlani);
        textViewSonucAlani = findViewById(R.id.textViewSonucAlani);

        buttonHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gelenAgirlik = editTextAgirlikAlani.getText().toString();
                String gelenTekrar = editTextTekrarAlani.getText().toString();

                int agirlik = Integer.parseInt(gelenAgirlik);
                int tekrar = Integer.parseInt(gelenTekrar);

                double rm = (100 * agirlik)/(101.3 - 2.67123 * tekrar);

                textViewSonucAlani.setText(String.valueOf("1RM YAPABİLECEĞİNİZ AĞIRLIK = " + (int)rm + " kg'dır"));

            }
        });

    }
}