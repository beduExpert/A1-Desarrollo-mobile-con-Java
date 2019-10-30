 agrega el programa que se desarrollara con backticks> [agrega la sesion con backticks]  
## Tu actividad con diferentes estados 

### OBJETIVO 
 - Identificar los diferentes estados que tiene una actividad. 

#### DESARROLLO
- El ejemplo más simple de los estados: *OnCreate()

```java
 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tu app se ha creado, pero todavia no es visible para el usuario
        //Este es el punto de partida de todas las Actividades, y donde idoneamente
        //inicializas tu App. 
    }
```
La etiqueta @Override significa: voy a sobreescribir el método onCreate original.
super.onCreate(savedInstanceState) significa: **Crea la App como originalmente lo harías.**

**onCreate & onStart**

- onCreate: Es la función principal que usamos, cuando tu App se crea en RAM, se pasa a *onCreate().
- onStart: Esta función se llama cuando tu App se vuelve visible.

```java
    @Override
    protected void onStart()
    {
        super.onStart();
        //Tu app ha iniciado, haz algo en un principio.
    }
```

**onPause & onResume**

- onPause: Se manda a llamar cuando tu aplicación debe detenerse por una llamada, notificación, o mensaje emergente.  

```java
    @Override
    protected void onPause()
    {
        //tu app está a punto de entrar en pausa! haz algo antes de que se pause.
        super.onPause();
    }
```
- onResume: se manda llamar cuando el usuario regresa a tu App. 

```java
    @Override
    protected void onResume()
    {
        super.onResume();
        //tu app acaba de continuar su operación normal
    }
```

**onStop & onRestart¨**

- onStop: La app pasa a segundo plano porque abriste otra App.   

```java
    @Override
    protected void onStop()
    {
        //Haz algo antes de que tu app se detenga...
        super.onStop();
    }
```

- onRestart: La app se volvió a abrir relativamente pronto.

```java
    @Override
    protected void onRestart()
    {
        super.onRestart();
        //Tu app ha reiniciado, hay algo que debas hacer como cargar archivos?
    }
```

*Nota: Una App en onStop podría cerrarse en cualquier momento si el dispositivo se queda sin RAM. 


**onStop & onDestroy**

- onStop: La app se detiene.
- onDestroy: Si tu app la cierras, o bien, si el sistema necesita memoria, tu App entra en este proceso. 

```java
    @Override
    protected void onDestroy()
    {
        //App a punto de destruirse! guarda lo que puedas!
        super.onDestroy();
    }

}
```
En este punto ya no es reversible, y va a iniciar de nuevo.
