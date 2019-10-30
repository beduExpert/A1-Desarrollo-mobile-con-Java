`Desarrollo Mobile con Java` > `[Sesión 08]`
## Envío de mensajes via redes sociales desde tu App. 

### OBJETIVO 
 - Identificar cómo crear una actividad, botón y mensaje.

#### DESARROLLO

1. Crear tu actividad, botón y mensaje.
Recuerda que todo intent debe ser reactivo: debe ser lanzado cuando el usuario realiza una acción.
Para este ejemplo, se realizará un EditText y un botón, para generar el texto. 

2. Generar el intent necesario.

```java
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
```
3. Revisar qué apps aceptan tus datos.
Es importante probar el resultado cuando envías intents a otras Apps. Puede que ciertas Apps no reciban los datos que envías si no tiene el formato adecuado.

4. Probar la recepción.
Revisa que los datos lleguen completos a la App de destino.
