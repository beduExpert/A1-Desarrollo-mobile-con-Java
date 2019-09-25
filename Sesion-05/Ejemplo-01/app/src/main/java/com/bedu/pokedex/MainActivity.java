package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Este es un ejemplo de como trabaja el objeto Calendar de Android:
        int anio = Calendar.getInstance().get(Calendar.YEAR);
        Log.d("Ejemplo", "El año actual es: "+anio);
        int mes = Calendar.getInstance().get(Calendar.MONTH)+1;
        Log.d("Ejemplo", "El mes actual es: "+mes);
        int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        Log.d("Ejemplo", "El dia actual es:"+dia);
    }
}
