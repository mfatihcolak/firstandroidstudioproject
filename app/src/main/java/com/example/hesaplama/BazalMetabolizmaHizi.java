package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class BazalMetabolizmaHizi extends AppCompatActivity {

    private Button hesapla_butonu;
    private EditText boy_alani, kilo_alani, yas_alani;
    private TextView sonuc_yazdir;
    private RadioButton kadin, erkek;
    private RadioGroup radioGroup3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazal_metabolizma_hizi);

        hesapla_butonu = findViewById(R.id.hesapla_butonu);
        boy_alani = findViewById(R.id.boy_alani);
        kilo_alani = findViewById(R.id.kilo_alani);
        yas_alani = findViewById(R.id.yas_alani);
        sonuc_yazdir = findViewById(R.id.sonuc_yazdir);
        kadin = findViewById(R.id.kadin);
        erkek = findViewById(R.id.erkek);


        hesapla_butonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(kadin.isChecked()){

                    String gelenKilo = kilo_alani.getText().toString();
                    String gelenBoy = boy_alani.getText().toString();
                    String gelenYas = yas_alani.getText().toString();

                    int kilo = Integer.parseInt(gelenKilo);
                    double boy = Double.parseDouble(gelenBoy);
                    int yas = Integer.parseInt(gelenYas);

                    double bmhkadin = (655 + 9.6 * kilo + 1.8 * boy - 4.7 * yas);

                    sonuc_yazdir.setText(String.valueOf("Bazal Metabolizma Hızınız = " + (int)bmhkadin + " kaloridir."));
                }
                else if(erkek.isChecked()){

                    String gelenKilo = kilo_alani.getText().toString();
                    String gelenBoy = boy_alani.getText().toString();
                    String gelenYas = yas_alani.getText().toString();

                    int kilo = Integer.parseInt(gelenKilo);
                    double boy = Double.parseDouble(gelenBoy);
                    int yas = Integer.parseInt(gelenYas);

                    double bmherkek = (66 + 13.7 * kilo + 5 * boy - 6.8 * yas);

                    sonuc_yazdir.setText(String.valueOf("Bazal Metabolizma Hızınız = " + (int)bmherkek + " kaloridir."));
                }

            }
        });

    }
}