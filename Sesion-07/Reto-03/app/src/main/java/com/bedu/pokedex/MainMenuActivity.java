package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    //En la solución de este reto vamos a crear un menu principal,
    //para ello hemos creado tres botones.
    //Los tres botones son estos:
    Button btnAgenda, btnNoMePresiones, btnPokedex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        //Vinculemos los tres botones:
        btnAgenda = findViewById(R.id.mainMenu_btnAgenda);
        btnNoMePresiones = findViewById(R.id.mainMenu_btnNoMePresiones);
        btnPokedex = findViewById(R.id.mainMenu_btnPokeDex);

        //Ahora, hagamos los intents, como lo marcan los ejemplos en clase.
        btnAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent saltoAAgenda = new Intent(MainMenuActivity.this, AgendaActivity.class);
                startActivity(saltoAAgenda);
            }
        });
        btnNoMePresiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent saltoANoMePresiones = new Intent(MainMenuActivity.this, NoMePresionesActivity.class);
                startActivity(saltoANoMePresiones);
            }
        });
        btnPokedex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent saltoAPokedex = new Intent(MainMenuActivity.this, PokedexActivity.class);
                startActivity(saltoAPokedex);
            }
        });
    }
}
