package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    /*
    En este reto vamos a buscar en google maps las direcciones que desees con un intent.
    Este código puede funcionar con otras apps que manejen mapas, como Uber.
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

                //Escribe aquí tu dirección.
                String direccion = "Paseo de la Reforma 299";
                direccion = direccion.replace(' ','+');
                Intent mapsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+direccion));
                startActivity(mapsIntent);
            }
        });
        btnTrabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Escribe aquí tu dirección.
                String direccion = "BEDU cerca de Alvaro Obregon";
                direccion = direccion.replace(' ','+');
                Intent mapsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+direccion));
                startActivity(mapsIntent);
            }
        });
        //enviamos el listener.
        btnRestaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Escribe aquí tu dirección.
                String direccion = "Restaurante YAMASAN";
                direccion = direccion.replace(' ','+');
                Intent mapsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+direccion));
                startActivity(mapsIntent);
            }
        });
    }
}
