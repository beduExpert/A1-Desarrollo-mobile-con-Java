package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class NoMePresionesActivity extends AppCompatActivity {

    /*
    En este ejemplo vamos a trabajar con un Listener añadido al botón btn_NoMePresiones
    El cual lo llevaremos a cabo dentro de onCreate.
     */
    Button btn_NoMePresiones;
    TextView txt_Mensaje;

    ArrayList<String> mensajesGraciosos;
    int contadorDeMensajes;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_me_presiones);

        //En este punto, unimos el objeto btn_NoMePresiones y txt_Mensaje con el archivo XML:
        btn_NoMePresiones = findViewById(R.id.NoMePresiones_Button);
        txt_Mensaje = findViewById(R.id.NoMePresiones_Text);

        //Aqui, cambiamos el texto:
        txt_Mensaje.setText("Que día tan tranquilo!");

        mensajesGraciosos = new ArrayList<>();
        agregarMensajesGraciosos();
        contadorDeMensajes = 0;

        //En este ejemplo podemos ver como funciona un Listener:
        //Aqui está el listener.
        btn_NoMePresiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Esto solo se ejecutará cuando se presione el botón.
                txt_Mensaje.setText("Ouch... :c");
            }
        });
    }

    private void agregarMensajesGraciosos()
    {
        mensajesGraciosos.add("Hey...");
        mensajesGraciosos.add("Oye");
        mensajesGraciosos.add("Basta!");
        mensajesGraciosos.add("¿No tienes nada mejor que hacer?");
        mensajesGraciosos.add("Hey, mira! una notificación!");
        mensajesGraciosos.add("...");
        mensajesGraciosos.add("Deja de presionar mi botón");
        mensajesGraciosos.add("Detente!");
        mensajesGraciosos.add("Quizás si dejo de hacerte caso dejarás de presionarlo...");
        mensajesGraciosos.add("...");
        mensajesGraciosos.add("...");
        mensajesGraciosos.add("...");
        mensajesGraciosos.add("Oh, ¿sigues aquí?");
    }
}