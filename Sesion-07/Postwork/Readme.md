## Postwork 

### OBJETIVO 
 - Desarrollarás múltiples actividades con Java y XML. 

#### DESARROLLO
Ahora con lo aprendido en la sesión 7 deberás de ser capaz de construir tu App y saltar de una a otra actividad. Ten cuidado cuando construyas los Intents, ya que si cualquier actividad puede saltar a otra es posible que el usuario llene la pila de actividades sin darse cuenta. Lo idóneo es que tu App trabaje en forma de árbol: Si un usuario quiere regresar. También las actividades podrán compartir datos de una pantalla a otra, por medio de Bundles y Extras, por lo que si tu proyecto comparte datos.  
**gunos Tips al crear tu App multi-actividad:**
1. La App debe tener una actividad inicial, esta se declara en el manifiesto de tu app, puedes leer sobre ello aquí:  ttps://stackoverflow.com/questions/3631982/change-applications-starting-activity 
2. Las actividades deben de tener nombres descriptivos, relacionados a su función. Los objetos que estén incrustados en tu XML y en tu Java deben también ser descriptivos.  
3. Recuerda que una actividad debe hacer una sola cosa, y hacerla lo mejor posible: una actividad todopoderosa va a llenar la memoria de los dispositivos, y probablemente no sea utilizable para el usuario.  
4. Cada actividad debe ser capaz de invocar a otras actividades, sin embargo debe de ser en forma de árbol. Si tú construyes tu App sin orden, es posible que una actividad pueda invocar a otras sin control.


