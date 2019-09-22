package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    /*
    En este reto, vamos a enviar un mensaje via intent.
    El reto consiste en tomar tres edittexts, concatenar sus mensajes, y enviarlos por via intent.
     */

    EditText titulo, cuerpo, firma;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Primero juntamos todos los datos.
        titulo = findViewById(R.id.txtTitulo);
        cuerpo = findViewById(R.id.txtCuerpo);
        firma = findViewById(R.id.txtFirma);
        btnEnviar = findViewById(R.id.btnEnviarMensaje);

        //enviamos el listener.
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Unimos el mensaje.
                String mensajeAEnviar = titulo + " - \n"+cuerpo+ "\n\n\t"+firma;

                //Y creamos el intent para enviarlo por otra app.
                Intent intentAOtraApp = new Intent(Intent.ACTION_SEND);
                intentAOtraApp.setType("text/plain");
                intentAOtraApp.putExtra(Intent.EXTRA_TEXT,mensajeAEnviar);
                Intent pantallaSelectora = Intent.createChooser(intentAOtraApp,"Envía este genial mensaje por...");
                startActivity(pantallaSelectora);
            }
        });
    }
}
