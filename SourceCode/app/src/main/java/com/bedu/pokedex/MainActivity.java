package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    /*
    En este reto vamos a llamar via teléfono.
    Este código puede funcionar con Apps que puedan llamar como Skype.
     */

    Button btnCasa, btnTrabajo, btnRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Primero unimos los botones con el XML.
        btnCasa = findViewById(R.id.btnCasa);
        btnTrabajo = findViewById(R.id.btnTrabajo);
        btnRestaurante = findViewById(R.id.btnRestaurante);

        //enviamos el listener.
        btnCasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Escribe aquí el teléfono al que llamarás.
                String telefonoAllamar = "5512345678";
                Intent llamadaIntent = new Intent(Intent.ACTION_DIAL);
                llamadaIntent.setData(Uri.parse("tel:"+telefonoAllamar));
                startActivity(llamadaIntent);
            }
        });
        btnTrabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Escribe aquí el teléfono al que llamarás.
                String telefonoAllamar = "5519283764";
                Intent llamadaIntent = new Intent(Intent.ACTION_DIAL);
                llamadaIntent.setData(Uri.parse("tel:"+telefonoAllamar));
                startActivity(llamadaIntent);
            }
        });
        //enviamos el listener.
        btnRestaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Escribe aquí el teléfono al que llamarás.
                String telefonoAllamar = "5598765432";
                Intent llamadaIntent = new Intent(Intent.ACTION_DIAL);
                llamadaIntent.setData(Uri.parse("tel:"+telefonoAllamar));
                startActivity(llamadaIntent);
            }
        });
    }
}
