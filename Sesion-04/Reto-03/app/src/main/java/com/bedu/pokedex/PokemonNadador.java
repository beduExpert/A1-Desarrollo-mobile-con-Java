package com.bedu.pokedex;

import android.util.Log;

public class PokemonNadador extends Pokemon
{
    PokemonNadador(int numeroPkmn, String nombrePkmn, double alturaPkmn, double pesoPkmn, String descripcionPkmn, int tipoPkmn, int HPPkmn)
    {
        super(numeroPkmn, nombrePkmn, alturaPkmn, pesoPkmn, descripcionPkmn, tipoPkmn, HPPkmn);
    }

    void nadar()
    {
        Log.d("PokeDex",nombre+" ha nadado!");
    }
}
