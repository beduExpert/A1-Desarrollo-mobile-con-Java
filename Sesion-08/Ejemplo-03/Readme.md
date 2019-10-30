`Desarrollo Mobile con Java` > `[Sesión 08]`
## Buscando direcciones con Google Maps 

### OBJETIVO 
 - Aprender a buscar direcciones con Google Maps.

#### DESARROLLO

1. Crea tu Actividad. 
Crea una actividad que tenga un EditText para escribir una dirección.
Agrega un botón para disparar el intent (recuerda: Los intents son reactivos).

2. Crea el intent.
Esta es la estructura del intent para acceder a Maps:

```java
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
```
3. Verifica.
Puedes revisar que las direcciones que pusiste pueden hallarse. Igualmente, puedes abrir la geolocalización con otras apps como Uber.
