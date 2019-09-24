package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DatosDeContactoActivity extends AppCompatActivity {

    /*
    En este reto vamos a cargar los datos de la otra actividad, y
    vamos a cargarlos en esta actividad.
     */
    //Necesitaremos variables para guardar los datos.
    String nombre, telefono, genero;
    int edad;

    //Y textViews para mostrarlos.
    TextView txtNombre, txtEdad, txtTelefono, txtGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_de_contacto);

        txtNombre = findViewById(R.id.txtNombre);
        txtEdad = findViewById(R.id.txtEdad);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtGenero = findViewById(R.id.txtGenero);

        //Primero sacamos los datos del bundle:
        Bundle datosDeOtraActivity = getIntent().getExtras();

        if(datosDeOtraActivity != null)
        {
            nombre = datosDeOtraActivity.getString("Nombre","Desconocido");
            edad = datosDeOtraActivity.getInt("Edad",-1);
            telefono = datosDeOtraActivity.getString("Telefono","Desconocido");
            genero = datosDeOtraActivity.getString("Genero","Desconocido");
        }
        else
        {
            nombre = "Desconocido";
            edad = -1;
            telefono = "Desconocido";
            genero = "Desconocido";
        }
        //Con estos datos, vamos a ponerlos en textviews.
        txtNombre.setText(nombre);
        txtEdad.setText(edad+" años");
        txtTelefono.setText(telefono);
        txtGenero.setText(genero);
    }
}
