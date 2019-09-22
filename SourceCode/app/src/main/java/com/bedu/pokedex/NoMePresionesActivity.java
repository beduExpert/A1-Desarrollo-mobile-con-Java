package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class NoMePresionesActivity extends AppCompatActivity {

    /*
    En este ejemplo vamos a vincular el archivo activity_no_me_presiones.xml con este código
    Java. Dentro del XML hay dos objetos etiquetados: Un botón y un textview.
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
    }
}
