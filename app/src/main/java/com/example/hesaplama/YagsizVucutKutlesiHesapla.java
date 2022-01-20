package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class YagsizVucutKutlesiHesapla extends AppCompatActivity {

    private Button hesaplama;
    private RadioButton radioButtonKadinn, radioButtonErkekk;
    private EditText kilo_girdisi, boy_girdisi;
    private TextView sonuc_yazdirma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yagsiz_vucut_kutlesi_hesapla);

        hesaplama = findViewById(R.id.hesaplama);
        radioButtonKadinn = findViewById(R.id.radioButtonKadinn);
        radioButtonErkekk = findViewById(R.id.radioButtonErkekk);
        kilo_girdisi = findViewById(R.id.kilo_girdisi);
        boy_girdisi = findViewById(R.id.boy_girdisi);
        sonuc_yazdirma = findViewById(R.id.sonuc_yazdirma);

        hesaplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(radioButtonErkekk.isChecked()){

                    //LBM (men) = 0.407 * weight [kg] + 0.267 * height [cm] - 19.2
                    String gelen_boy = boy_girdisi.getText().toString();
                    String gelen_kilo = kilo_girdisi.getText().toString();

                    int boy = Integer.parseInt(gelen_boy);
                    int kilo = Integer.parseInt(gelen_kilo);

                    double lbmmen = (0.407 * kilo + 0.267 * boy - 19.2);

                    sonuc_yazdirma.setText("Yağsız Kütleniz = " + (int)lbmmen + " kg'dır." );
                }
                else if(radioButtonKadinn.isChecked()){

                    //LBM (women) = 0.252 * weight [kg] + 0.473 * height [cm] - 48.3
                    String gelen_boy = boy_girdisi.getText().toString();
                    String gelen_kilo = kilo_girdisi.getText().toString();

                    int boy = Integer.parseInt(gelen_boy);
                    int kilo = Integer.parseInt(gelen_kilo);

                    double lbmwomen = (0.252 * kilo + 0.473 * kilo - 48.3);

                    sonuc_yazdirma.setText("Yağsız Kütleniz = " + (int)lbmwomen + " kg'dır." );

                }

            }
        });

    }
}