`Desarrollo Mobile con Java` > `[Sesión 06]`

### OBJETIVO 
 - Identificar cómo se hace el vínculo de objetos de un XML con objetos de Android, por medio del método *findViewByID().

#### REQUISITOS 
1. Android Studio
2. Dispositivo Android o Emulador.
3. Cable USB en caso de usar Dispositivo. 

#### DESARROLLO
En este ejemplo vamos a vincular el archivo activity_no_me_presiones.xml con este código Java. 
- Con esta función unes el apuntador del archivo R.java a tu objeto en Java.
- La vinculación la hacemos en “onCreate” (cuando la actividad se crea).

En este ejemplo vamos a vincular el archivo activity_no_me_presiones.xml con este código:

```java
public class NoMePresionesActivity extends AppCompatActivity {

    /*
    Java. Dentro del XML hay dos objetos etiquetados: Un botón y un textview.
     */
    Button btn_NoMePresiones;
    TextView txt_Mensaje;

    ArrayList<String> mensajesGraciosos;
    int contadorDeMensajes;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_me_presiones);
```

En este punto, unimos el objeto btn_NoMePresiones y txt_Mensaje con el archivo XML:

```java
        btn_NoMePresiones = findViewById(R.id.NoMePresiones_Button);
        txt_Mensaje = findViewById(R.id.NoMePresiones_Text);
```

Aqui, cambiamos el texto:

```java
        txt_Mensaje.setText("Que día tan tranquilo!");
    }
}

```


Dentro del XML hay dos objetos etiquetados: Un botón y un textview. Dentro del método onCreate vamos a modificar manualmente el texto del TextView para que puedas observar que un objeto modificado en Java tiene repercusiones en la interfaz gráfica en tiempo real: Al final del día son el mismo objeto, y una vez vinculados, editar la estructura de uno hace que se refleje en la interfaz gráfica. 
