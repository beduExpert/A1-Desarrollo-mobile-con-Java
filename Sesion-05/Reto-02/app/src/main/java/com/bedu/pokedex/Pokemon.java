package com.bedu.pokedex;

import android.util.Log;

/**
 * Pokemon.java :D
 */
public class Pokemon {
    //Aqui escribiremos el programa que va a controlar a todos los Pokemon.
    //Primero todos los datos sobre un pokemon.

    int numero;             //Numero (valor entero)
    String nombre;          //Nombre (Cadena de caracteres)
    double altura;          //Altura (valor de punto flotante)
    double peso;            //Peso (valor de punto flotante)
    String descripcion;     //Descripción (cadena de caracteres)
    int tipo;               //Tipo del pokemon (valor entero).

    int HP;                 //Este es el HP, lo cabo de agregar para este ejemplo.

    //Este es el constructor:
    public Pokemon(int numeroPkmn, String nombrePkmn, double alturaPkmn, double pesoPkmn, String descripcionPkmn, int tipoPkmn, int HPPkmn)
    {
        //Aqui agregamos un log:
        Log.d("PokeDex", "El Pokemon "+nombrePkmn+" va a ser creado...");
        numero = numeroPkmn;
        nombre = nombrePkmn;
        altura = alturaPkmn;
        peso = pesoPkmn;
        descripcion = descripcionPkmn;
        tipo = tipoPkmn;
        HP = HPPkmn;
        Log.d("PokeDex", "El Pokemon "+nombrePkmn+" ha sido creado...");
    }

    //Este es el método (función) de atacar:
    int atacar (String nombreAtaque)
    {
        Log.d("PokeDex",nombre+ "Ha utilizado "+nombreAtaque);
        Log.d("PokeDex", "El Pokemon "+nombre+" ha usado un ataque");
        return 10;
    }
    /*
    Este es el resulttado del reto 02:
    Lograste llegar al mismo resultado?
     */
    void recibirDano(int cantidadDano)
    {
        Log.d("PokeDex", "El Pokemon "+nombre+" ha recibido daño");
        HP = HP - cantidadDano;
        if(HP <= 0)
        {
            HP = 0;
            Log.d("PokeDex",nombre+" se desmayó!");
        }
    }
}
