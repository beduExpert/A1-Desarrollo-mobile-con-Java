package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","La actividad se va a crear, y un pokemon va a surgir de ella.");
        Pokemon pikachu = new Pokemon(25,"Pikachu", 0.25,0.5,"Es un detective",5, 50);
        pikachu.atacar("Trueno");
        pikachu.recibirDano(5);
        Log.d("MainActivity","La actividad se acaba de crear y está lista!");
    }
}
