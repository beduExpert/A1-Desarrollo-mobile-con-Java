`Desarrollo Mobile con Java` > `[Sesión 07]`

## Añadiendo extras a tu Intent

### OBJETIVO 
 - Añadir extras a los Intents. 

#### DESARROLLO

- Para añadirle datos, utiliza la función *putExtra()
El primer parámetro es el nombre de la variable (clave).
El segundo parámetro es el valor

```java
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSiguientePantalla = findViewById(R.id.btn_SiguientePantalla);
        btnSiguientePantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sigPantalla = new Intent(AgendaActivity.this, DatosDeContactoActivity.class);
                sigPantalla.putExtra("Nombre","Antonio Arista");
                sigPantalla.putExtra("Edad",32);
                startActivity(sigPantalla);
            }
        });
    }
}
```
