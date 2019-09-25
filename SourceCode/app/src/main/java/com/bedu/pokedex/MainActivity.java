package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAEnviar = findViewById(R.id.btnBusca);
        final EditText direccion = findViewById(R.id.txtDireccion);
        btnAEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String direccionABuscar = direccion.getText().toString();
                direccionABuscar.replace(' ','+');
                Intent mapsIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q="+direccionABuscar));
                startActivity(mapsIntent);
            }
        });
    }
}
