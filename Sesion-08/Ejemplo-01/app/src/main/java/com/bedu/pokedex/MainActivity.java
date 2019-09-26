package com.bedu.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAEnviar = findViewById(R.id.btnEnviar);
        final EditText txtAEnviar = findViewById(R.id.txtAEnviar);
        btnAEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensajeAEnviar = txtAEnviar.getText().toString();
                Intent intentAOtraApp = new Intent(Intent.ACTION_SEND);
                intentAOtraApp.setType("text/plain");
                intentAOtraApp.putExtra(Intent.EXTRA_TEXT, mensajeAEnviar);
                Intent pantallaSelectora = Intent.createChooser(intentAOtraApp, "Envia este mensaje por...");
                startActivity(pantallaSelectora);
            }
        });
    }
}
