package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ColoresActivity extends AppCompatActivity {

    /*
    La solución a este reto permite alternar entre los layouts azul y naranja.
    ¿Lograste cumplir este reto?
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);

        Button btnColores = findViewById(R.id.btn_cambiaColor);

        final LinearLayout layoutNaranja, layoutAzul;
        layoutAzul = findViewById(R.id.layoutAzul);
        layoutNaranja = findViewById(R.id.layoutNaranja);

        btnColores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(layoutAzul.getVisibility() == View.VISIBLE) {
                    layoutAzul.setVisibility(View.GONE);
                    layoutNaranja.setVisibility(View.VISIBLE);
                }
                else
                {
                    layoutAzul.setVisibility(View.VISIBLE);
                    layoutNaranja.setVisibility(View.GONE);
                }
            }
        });
    }
}
