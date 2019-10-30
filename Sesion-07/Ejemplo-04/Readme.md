`Desarrollo Mobile con Java` > `[Sesión 07]`

## Extrayendo datos con los Bundles

### OBJETIVO 
 - Identificar el proceso para extraer datos con los Bundle.

#### DESARROLLO

```java
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  ```
  
  *El bundle no sabe el tipo de dato. Es responsabilidad tuya el decirle que tipo de dato es el que esperas. Si el tipo de dato no coincide tu sistema puede fallar.
     
 ```java
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
```

*El bundle puede no tener datos por cualquier razón. Es tu responsabilidad como programador el preparar tu actividad por si no hay datos.
