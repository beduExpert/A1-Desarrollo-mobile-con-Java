package com.bedu.pokedex;

import android.util.Log;

import java.util.Calendar;

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
        numero = numeroPkmn;
        nombre = nombrePkmn;
        altura = alturaPkmn;
        peso = pesoPkmn;
        tipo = tipoPkmn;
        HP = HPPkmn;

        //Esta es la manera con la cual puedes usar Calendar para alterar la descripción:
        int horaDelDia = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(horaDelDia >= 7 && horaDelDia < 20)
            descripcion = descripcionPkmn+ " - Este Pokemon está despierto";
        else
            descripcion = descripcionPkmn+ " - Este Pokemon está dormido";

    }

    //Este es el método (función) de atacar:
    int atacar (String nombreAtaque)
    {
        Log.d("PokeDex",nombre+ "Ha utilizado "+nombreAtaque);
        return 10;
    }

    //Este es el método de recibir daño:
    void recibirDano(int cantidadDano)
    {
        HP = HP - cantidadDano;
        if(HP <= 0)
        {
            HP = 0;
            Log.d("PokeDex",nombre+" se desmayó!");
        }
    }
}