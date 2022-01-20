package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class YagsizKitleIndeksi extends AppCompatActivity {

    private Button button;
    private EditText editTextTextPersonName, editTextTextPersonName2, editTextTextPersonName3;
    private TextView textView29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yagsiz_kitle_indeksi);

        button = findViewById(R.id.button);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        textView29 = findViewById(R.id.textView29);
        //editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //FFMI = fat free mass [kg]/ (height [m])²
                //fat free mass = weight [kg] * (1 - (body fat [%]/ 100))

                String gelenKilo = editTextTextPersonName.getText().toString();
                String gelenBoy = editTextTextPersonName2.getText().toString();
                String gelenYagOrani = editTextTextPersonName3.getText().toString();
                //String gelenFFM = editTextTextPersonName4.getText().toString();

                int kilo = Integer.parseInt(gelenKilo);
                double boy = Double.parseDouble(gelenBoy);
                int yagOrani = Integer.parseInt(gelenYagOrani);
                //int ffm = Integer.parseInt(gelenFFM);


                double ffm = (kilo * ((100 - yagOrani) * 0.01));
                double ffmi = (ffm / (boy * boy));


                textView29.setText(String.valueOf("FFMI = " + (int)ffmi +" kg/m2'dir.\n"+
                                   "Fat Free Mass = " + ffm + " kg'dir.\n" +
                                   "FFMI ARALIĞI = \n" +
                                   "18'in altında \t Ortalamanın altında\n"+
                                   "18 - 20 -> \t Ortalama\n"+
                                   "20 - 22 -> \t Ortalamanın üstü\n"+
                                   "22 - 23 -> \t Harika\n"+
                                   "23 - 26 -> \t Üst\n"+
                                   "26 - 28 -> \t Steroid kullanımı şüphesi\n"+
                                   "28'den fazla -> \t Steroid kullanımı muhtemel"));

            }
        });

    }
}