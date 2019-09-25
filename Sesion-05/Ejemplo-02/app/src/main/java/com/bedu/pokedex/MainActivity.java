package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import static java.lang.Math.cos;
import static java.lang.Math.floor;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        double resultado;

        resultado = pow(5,2);
        Log.d("Ejemplo","el resultado de 5 elevado al cuadrado es:"+resultado);

        resultado = floor(5.2);
        Log.d("Ejemplo","el resultado de 5.2 redondedo hacia abajo es:"+resultado);

        resultado = sin(45);
        Log.d("Ejemplo","el seno de 45 es:"+resultado);

        resultado = cos(45);
        Log.d("Ejemplo","el coseno de 45 es:"+resultado);
    }
}
