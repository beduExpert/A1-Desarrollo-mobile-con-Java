package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private ArrayList<Pokemon> crearPokemons()
    {
        ArrayList<Pokemon> listaPokemon = new ArrayList<>();
        listaPokemon.add(new Pokemon(1,"bulbasaur",0.30, 0.5, "Es el pokemon plantita", 15, 50));
        listaPokemon.add(new Pokemon(2,"ivysaur",0.35, 4.5, "Es el pokemon plantita", 15, 150));
        listaPokemon.add(new Pokemon(3,"venasaur",0.40, 1.5, "Es el prokemon plantita", 15, 250));
        listaPokemon.add(new Pokemon(4,"charmander",0.38, 2.5, "Es el prokemon de fuego", 6, 50));
        listaPokemon.add(new Pokemon(5,"charmeleon",1.30, 4.5, "Es el prokemon de fuego", 6, 150));
        listaPokemon.add(new Pokemon(5,"charizard",1.60, 10.5, "Es el prokemon de fuego", 6, 250));
        return listaPokemon;
    }
}
