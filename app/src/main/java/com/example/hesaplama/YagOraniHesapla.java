package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class YagOraniHesapla extends AppCompatActivity {

    private Button buttonHesaplama;
    private RadioButton radioButtonKadin, radioButtonErkek;
    private TextView textViewSonucKismi;
    private EditText editTextBoy, editTextBoyun, editTextBel, editTextKalca;
    private RadioGroup radioGroup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yag_orani_hesapla);

        buttonHesaplama = findViewById(R.id.buttonHesaplama);
        radioButtonKadin = findViewById(R.id.radioButtonKadin);
        radioButtonErkek = findViewById(R.id.radioButtonErkek);
        textViewSonucKismi = findViewById(R.id.textViewSonucKismi);
        editTextBel = findViewById(R.id.editTextBel);
        editTextBoy = findViewById(R.id.editTextBoy);
        editTextBoyun = findViewById(R.id.editTextBoyun);
        editTextKalca = findViewById(R.id.editTextKalca);
        radioGroup = findViewById(R.id.radioGroup);


        buttonHesaplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(radioButtonErkek.isChecked()) {

                            String gelenBoy = editTextBoy.getText().toString();
                            String gelenBel = editTextBel.getText().toString();
                            String gelenBoyun = editTextBoyun.getText().toString();

                            int boy = Integer.parseInt(gelenBoy);
                            int bel = Integer.parseInt(gelenBel);
                            int boyun = Integer.parseInt(gelenBoyun);

                            double yagOraniErkek = (495 / (1.0324 - 0.19077 * Math.log10(bel - boyun) + 0.15456 * Math.log10(boy)) - 450);
                            textViewSonucKismi.setText(String.valueOf("Yağ oranınız = %" + (int) yagOraniErkek + "."));
                        }

                else if(radioButtonKadin.isChecked()){
                    String gelenBoy = editTextBoy.getText().toString();
                    String gelenBel = editTextBel.getText().toString();
                    String gelenBoyun = editTextBoyun.getText().toString();
                    String geleKalca = editTextKalca.getText().toString();

                    int boy = Integer.parseInt(gelenBoy);
                    int bel = Integer.parseInt(gelenBel);
                    int boyun = Integer.parseInt(gelenBoyun);
                    int kalca = Integer.parseInt(geleKalca);

                    double yagOraniKadin = (-(495 / (1.29579 - 0.35004 * Math.log10(bel + kalca - boyun) + 0.22100 * Math.log10(boy)) - 450));

                    textViewSonucKismi.setText(String.valueOf("Yağ oranınız = %" + (int)yagOraniKadin + "."));
                }


            }
        });

    }
}