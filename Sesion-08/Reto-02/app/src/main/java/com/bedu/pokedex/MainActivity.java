package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    /*
    En este reto, vamos a enviar un correo electrónico via intent.
    El reto consiste en tomar tres edittexts, acomodarlo en un correo, y enviar el mail por via intent.
     */

    EditText txtTitulo, txtCuerpo, txtFirma, txtCorreo;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Primero juntamos todos los datos.
        txtCorreo = findViewById(R.id.txtCorreo);
        txtTitulo = findViewById(R.id.txtTitulo);
        txtCuerpo = findViewById(R.id.txtCuerpo);
        txtFirma = findViewById(R.id.txtFirma);
        btnEnviar = findViewById(R.id.btnEnviarMensaje);

        //enviamos el listener.
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Unimos el mensaje.
                String correo = txtCorreo.getText().toString();
                String asunto = txtTitulo.getText().toString();
                String cuerpo = txtCuerpo.getText().toString() + " \n \n \t"+txtFirma.getText().toString();

                String urlCorreo = "mailto:"+correo+"?"+
                        "subject="+Uri.encode(asunto)+"&"+
                        "body="+Uri.encode(cuerpo);

                //Y creamos el intent para enviarlo por otra app.
                Intent intentACorreo = new Intent(Intent.ACTION_SENDTO);
                intentACorreo.setData(Uri.parse(urlCorreo));
                startActivity(intentACorreo);
            }
        });
    }
}
