package com.bedu.pokedex;

import android.util.Log;

/**
 * Este es un ejemplo de una clase heredada: PokemonVolador
 * Pueres revisar como se implementa en MainActivity.java
 */
public class PokemonVolador extends Pokemon
{
    PokemonVolador(int numeroPkmn,String nombrePkmn, double alturaPkmn, double pesoPkmn, String descripcionPkmn, int tipoPkmn, int HPpkmn)
    {
        super(numeroPkmn, nombrePkmn, alturaPkmn, pesoPkmn, descripcionPkmn, tipoPkmn, HPpkmn);
    }

    public void volar()
    {
        Log.d("PokeDex",nombre + " ha volado!");
    }

}
