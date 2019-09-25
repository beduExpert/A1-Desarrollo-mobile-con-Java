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

        Button btnAEnviar = findViewById(R.id.btnEnviame);
        final EditText txtAEnviar = findViewById(R.id.mensajeTxt);
        final EditText txtCorreo = findViewById(R.id.correoTxt);
        btnAEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mensajeAEnviar = txtAEnviar.getText().toString();
                String direccionCorreo = txtCorreo.getText().toString();
                String UrlCoreo = "mailto:"+direccionCorreo+"?"+
                        "body="+ Uri.encode(mensajeAEnviar);
                Intent intentACorreo = new Intent(Intent.ACTION_SENDTO);
                intentACorreo.setData(Uri.parse(UrlCoreo));
                startActivity(intentACorreo);
            }
        });
    }
}
