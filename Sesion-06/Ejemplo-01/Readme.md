## Sesión 06 - Ejemplo 01

### OBJETIVO 
 - En este ejemplo veremos como se hace el vínculo de objetos de un XML con objetos de Android, por medio del método findViewByID().

#### REQUISITOS 
1. Android Studio
2. Dispositivo Android o Emulador.
3. Cable USB en caso de usar Dispositivo. 

#### DESARROLLO
En este ejemplo vamos a vincular el archivo activity_no_me_presiones.xml con este código Java. Dentro del XML hay dos objetos etiquetados: Un botón y un textview. Dentro del método onCreate vamos a modificar manualmente el texto del TextView para que puedas observar que un objeto modificado en Java tiene repercusiones en la interfaz gráfica en tiempo real: Al final del día son el mismo objeto, y una vez vinculados, editar la estructura de uno hace que se refleje en la interfaz gráfica. 
