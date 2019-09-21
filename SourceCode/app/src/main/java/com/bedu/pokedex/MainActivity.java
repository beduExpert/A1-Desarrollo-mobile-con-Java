package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Aqui vemos como se usa un constructor:
        //Nota que puse cada parámetro del constructor en una línea diferente para que sea mas legible
        
        Pokemon charmander = new Pokemon(
                1,
                "Charmander",
                30,
                2.0,
                "Su colita está en llamas",
                6,
                40);
    }
}
