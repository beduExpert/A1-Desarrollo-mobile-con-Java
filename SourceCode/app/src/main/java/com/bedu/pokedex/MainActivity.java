package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /*
    En este reto sencillo vamos a hacer override a las funciones mas comunes de las
     actividades de Android para inspeccionar su comportamiento.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("PokeDex","Tu app acaba de crearse...");
    }

    @Override
    protected void onDestroy()
    {
        Log.d("PokeDex","Tu app está a punto de destruirse...");
        super.onDestroy();
    }

    @Override
    protected void onPause()
    {
        Log.d("PokeDex","Tu app está a punto de pausarse...");
        super.onPause();
    }


    @Override
    protected void onStop()
    {
        Log.d("PokeDex","Tu app está a punto de detenerse...");
        super.onStop();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("PokeDex","Tu app ha iniciado");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("PokeDex","Tu app se ha reiniciado");
    }
}
