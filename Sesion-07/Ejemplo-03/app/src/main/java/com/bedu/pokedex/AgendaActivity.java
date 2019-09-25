package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSiguientePantalla = findViewById(R.id.btn_SiguientePantalla);
        btnSiguientePantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sigPantalla = new Intent(AgendaActivity.this, DatosDeContactoActivity.class);
                sigPantalla.putExtra("Nombre","Antonio Arista");
                sigPantalla.putExtra("Edad",32);
                startActivity(sigPantalla);
            }
        });
    }
}
