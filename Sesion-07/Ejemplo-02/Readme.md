 ``Desarrollo Mobile con Java``> ``[Sesión 07]``  
## Estructura del Intent 

### OBJETIVO 
 - Identificar y comprender la estructura del Intent.

#### DESARROLLO

* Dentro de un listener.

Origen.this
Destino.class


 ```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGoToPokedex = findViewById(R.id.btn_goToPokeDex);
        btnGoToPokedex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSaltarAPokedex = new Intent(MainActivity.this, PokedexActivity.class);
                startActivity(intentSaltarAPokedex);
            }
        });

    }
}
 
 ```
 Y después de creado, puede ser usado con “startActivity(...)”
