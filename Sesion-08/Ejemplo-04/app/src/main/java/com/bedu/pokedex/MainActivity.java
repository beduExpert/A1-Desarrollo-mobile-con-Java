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

        Button btnAEnviar = findViewById(R.id.btnLlamar);
        final EditText telefono = findViewById(R.id.txtTelefono);
        btnAEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String telefonoALlamar = telefono.getText().toString();
                Intent llamadaIntent = new Intent(Intent.ACTION_DIAL);
                llamadaIntent.setData(Uri.parse("tel:"+telefonoALlamar));
                startActivity(llamadaIntent);
            }
        });
    }
}
