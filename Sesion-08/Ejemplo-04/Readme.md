`Desarrollo Mobile con Java` > `[Sesión 08]`

## Ejecución de llamadas telefónicas 

### OBJETIVO 
 - Aprender a hacer llamadas telefónicas. 

#### DESARROLLO
1. Crea la actividad.  
De igual manera que antes, crea la actividad.
**ProTIP:** cambia el inputType para que acepte solamente datos numéricos.  

2. Crea el intent.  
Esta es la estructura del Intent para hacer llamadas.  

```java
   @Override
            public void onClick(View view) {
                String telefonoALlamar = telefono.getText().toString();
                Intent llamadaIntent = new Intent(Intent.ACTION_DIAL);
                llamadaIntent.setData(Uri.parse("tel:"+telefonoALlamar));
                startActivity(llamadaIntent);
            }
 ```           
            
*La llamada quedará lista para el usuario, pero no generarás la llamada tu mismo.
Prefijo tel: maneja llamadas (Skype puede manejarlas también!)

3. ¡Prueba!  
Android no permite que hagas la llamada directamente sin tener acceso al teléfono. Puedes marcar, sin embargo el usuario debe hacer la llamada. 
