package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DatosDeContactoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_de_contacto);

        String nombrePersona;
        int edadPersona;

        Bundle datosDeOtraActivity = getIntent().getExtras();
        if(datosDeOtraActivity != null)
        {
            nombrePersona = datosDeOtraActivity.getString("Nombre","desconocido");
            edadPersona = datosDeOtraActivity.getInt("Edad",-1);
            //Haz algo con los datos que has capturado.
        }
    }
}
