package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VucutKitleIndeksi extends AppCompatActivity {

    private Button hesapla;
    private TextView mesaj_yazdir;
    private EditText editTextKilo, boy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vucut_kitle_indeksi);

        hesapla = findViewById(R.id.hesapla);
        mesaj_yazdir = findViewById(R.id.mesaj_yazdir);
        editTextKilo = findViewById(R.id.editTextKilo);
        boy = findViewById(R.id.boy);

        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gelenkilo = editTextKilo.getText().toString();
                String gelenboy = boy.getText().toString();

                int kilo = Integer.parseInt(gelenkilo);
                double boy = Double.parseDouble(gelenboy);

                double bmi = kilo / (boy * boy);

                mesaj_yazdir.setText("Vücut Kitle İndeksiniz (BMI) = " + (int)bmi + " BMI'dır." );

            }
        });
    }
}