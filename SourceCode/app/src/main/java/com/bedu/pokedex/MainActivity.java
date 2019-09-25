package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tu app se ha creado, pero todavia no es visible para el usuario
        //Este es el punto de partida de todas las Actividades, y donde idoneamente
        //inicializas tu App. 
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        //Tu app ha iniciado, haz algo en un principio.
    }

    @Override
    protected void onPause()
    {
        //tu app está a punto de entrar en pausa! haz algo antes de que se pause.
        super.onPause();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        //tu app acaba de continuar su operación normal
    }

    @Override
    protected void onStop()
    {
        //Haz algo antes de que tu app se detenga...
        super.onStop();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        //Tu app ha reiniciado, hay algo que debas hacer como cargar archivos?
    }

    @Override
    protected void onDestroy()
    {
        //App a punto de destruirse! guarda lo que puedas!
        super.onDestroy();
    }

}
