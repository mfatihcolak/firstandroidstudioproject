package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class gunlukProtein extends AppCompatActivity {

    private EditText editTextKiloAlani;
    private TextView textView5;
    private Button hesaplaButonu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunluk_protein);

        hesaplaButonu = findViewById(R.id.hesaplaButonu);
        editTextKiloAlani = findViewById(R.id.editTextKiloAlani);
        textView5 = findViewById(R.id.textView5);


        hesaplaButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gelenkilo = editTextKiloAlani.getText().toString();
                int kilo = Integer.parseInt(gelenkilo);
                double protein = (kilo * 2.25);
                textView5.setText(String.valueOf("Günlük almanız gereken ortalama protein miktarı = " + (int)protein  + " gr'dır."));
            }
        });

    }
}