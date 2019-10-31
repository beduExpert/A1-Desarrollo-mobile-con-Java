`Desarrollo Mobile con Java` > `[Sesión 06]`

### OBJETIVO 
 - Mostrar como es que un archivo Java y un archivo XML interactúan juntos. 

#### REQUISITOS 
1. Android Studio.
2. Conocimiento de programación en Java
3. Conocimiento de programación en XML

#### DESARROLLO
En este ejemplo se muestra una pequeña actividad llamada "NoMePresiones", en la cual hay un botón y un TextView. Cada vez que el botón se presiona, el código del botón hace que el TextView modifique su texto. Con ello el texto va oscilando en un ArrayList de strings. Este ejemplo es para demostrar como un elemento modificado en Java también sufre cambios en el XML y con ello en la interfaz.


public class NoMePresionesActivity extends AppCompatActivity {

  
En este ejemplo vamos a trabajar con un Listener añadido al botón btn_NoMePresiones El cual lo llevaremos a cabo dentro de *onCreate.
```java     
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

        mensajesGraciosos = new ArrayList<>();
        agregarMensajesGraciosos();
        contadorDeMensajes = 0;
```
En este ejemplo podemos ver como funciona un Listener:
Aqui está el listener.

```java
        btn_NoMePresiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
```
Esto solo se ejecutará cuando se presione el botón.

```java
                txt_Mensaje.setText("Ouch... :c");
            }
        });
    }

    private void agregarMensajesGraciosos()
    {
        mensajesGraciosos.add("Hey...");
        mensajesGraciosos.add("Oye");
        mensajesGraciosos.add("Basta!");
        mensajesGraciosos.add("¿No tienes nada mejor que hacer?");
        mensajesGraciosos.add("Hey, mira! una notificación!");
        mensajesGraciosos.add("...");
        mensajesGraciosos.add("Deja de presionar mi botón");
        mensajesGraciosos.add("Detente!");
        mensajesGraciosos.add("Quizás si dejo de hacerte caso dejarás de presionarlo...");
        mensajesGraciosos.add("...");
        mensajesGraciosos.add("...");
        mensajesGraciosos.add("...");
        mensajesGraciosos.add("Oh, ¿sigues aquí?");
    }
}

```

El listener esperará a que presiones el botón. Cuando lo presiones, se llevará a cabo la acción dentro de él.
**setOnClickListener:** Solo pasará algo si haces click en el botón.  

**PROTip: Usa el “autocompletar”**
Comienza a escribir el onClickListener, y cuando veas esta opción, presiona alt + enter. Eso te ahorrará escribir todo lo que falta.  








