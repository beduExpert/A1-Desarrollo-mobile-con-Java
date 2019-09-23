package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*
    En esta sesión trabajaremos con recursos.
    Si en la vista de proyecto cambias de "Android" a "Project", en la ruta "app->src-> main->res
    verás varias carpetas que antes no existían, entre ellas las carpetas "drawable" las cuales
    he puesto ahí.

    También ahí deberás poner en tu reto las imágenes. Como ejemplo, he colocado la imagen de
    "candado.png" en todas las carpetas, con su respectivo tamaño, sin embargo en el reto se encuentran
    las otras imágenes que deberás redimensionar.

    En este ejemplo también he creado nuevos colores dentro de colors.xml, y cadenas de caracteres
    dentro de strings.xml

    Buena suerte con el reto!
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
