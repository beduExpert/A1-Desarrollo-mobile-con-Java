package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgendaActivity extends AppCompatActivity {

    /*
    En este reto vamos a enviar datos a una segunda actividad.
    Para ello, creamos cuatro botones con datos diferentes:
     */
    Button btnAntonio, btnJose, btnMartha, btnGuadalupe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        btnAntonio = findViewById(R.id.btnAntonioArista);
        btnJose = findViewById(R.id.btnJoseLuisPerez);
        btnMartha = findViewById(R.id.btnMarthaSanchez);
        btnGuadalupe = findViewById(R.id.btnGuadalupeRamos);

        //Ahora, por cada botón, vamos a crear un intent y agregar extras.
        btnAntonio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sigPantalla = new Intent(AgendaActivity.this, DatosDeContactoActivity.class);
                sigPantalla.putExtra("Nombre","Antonio Arista");
                sigPantalla.putExtra("Edad",32);
                sigPantalla.putExtra("Genero","Masculino");
                sigPantalla.putExtra("Telefono","5512345678");
                startActivity(sigPantalla);
            }
        });
        btnJose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sigPantalla = new Intent(AgendaActivity.this, DatosDeContactoActivity.class);
                sigPantalla.putExtra("Nombre","Jose Luis Perez");
                sigPantalla.putExtra("Edad",44);
                sigPantalla.putExtra("Genero","Masculino");
                sigPantalla.putExtra("Telefono","5512345678");
                startActivity(sigPantalla);
            }
        });
        btnGuadalupe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sigPantalla = new Intent(AgendaActivity.this, DatosDeContactoActivity.class);
                sigPantalla.putExtra("Nombre","Guadalupe Ramos");
                sigPantalla.putExtra("Edad",19);
                sigPantalla.putExtra("Genero","Femenino");
                sigPantalla.putExtra("Telefono","5512345678");
                startActivity(sigPantalla);
            }
        });
        btnMartha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sigPantalla = new Intent(AgendaActivity.this, DatosDeContactoActivity.class);
                sigPantalla.putExtra("Nombre","Martha Sanchez");
                sigPantalla.putExtra("Edad",63);
                sigPantalla.putExtra("Genero","Femenino");
                sigPantalla.putExtra("Telefono","5512345678");
                startActivity(sigPantalla);
            }
        });
    }
}
