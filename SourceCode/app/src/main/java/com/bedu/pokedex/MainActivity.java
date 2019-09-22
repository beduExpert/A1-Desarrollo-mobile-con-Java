package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Así se implementa un pokemon volador.
        PokemonVolador charizard = new PokemonVolador(3,"Charizard",100,3.0,"La descripción de Charizard va aquí",6,150);

        //Charizard puede atacar y recibir daño
        charizard.atacar("Llamarada");
        charizard.recibirDano(10);

        //Charizard ahora puede volar también
        charizard.volar();
    }
}
