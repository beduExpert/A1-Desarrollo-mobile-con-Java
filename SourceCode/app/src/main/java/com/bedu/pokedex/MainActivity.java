package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*
    Esta es la solucion al reto 1
    Lograste llegar a este resultado?
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Aqui coloca a tus pokemon!
        Pokemon pikachu = new Pokemon();
        pikachu.numero = 25;
        pikachu.nombre = "Pikachu";
        pikachu.altura = 0.30;
        pikachu.peso = 2.5;
        pikachu.descripcion = "Guarda electricidad en sus mejillas :)";
        pikachu.tipo = 3;  //3 = eléctrico.


    }
}
