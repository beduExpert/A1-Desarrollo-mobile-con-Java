package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        double aleatorio = rand.nextDouble();
        Log.d("Ejemplo", "El valor aleatorio que generas es: "+aleatorio);

        double minimo = 5;
        double maximo = 105;
        aleatorio = minimo + (maximo - minimo) * rand.nextDouble();
        Log.d("Ejemplo", "El valor aleatorio entre "+minimo+" y "+maximo+" es: "+aleatorio);

    }
}
