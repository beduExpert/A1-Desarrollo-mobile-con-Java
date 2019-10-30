`Desarrollo Mobile con Java` > `[Sesión 08]`
## Envío de correos electrónicos desde tu App

### OBJETIVO 
 - Aprender a enviar correos a través de una app.  

#### DESARROLLO

1. Generar la actividad.
Si ya creaste la actividad del reto pasado, puedes modificarla un poco y sirve! 
Tu EditText de mensaje que sea multi-línea, para que el usuario pueda escribir cuanto quiera.

**ProTIP:** Añade también un EditText para colocar el mail de destino.

2. Crear el Intent
Esta es la estructura del intent para envío de correos:

```java
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
```
3. Revisa los datos.
-Cuando usas Uri.encode puedes llegar a perder datos.
-Uri.encode transforma strings a formato URL
