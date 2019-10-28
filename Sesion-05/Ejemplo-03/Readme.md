`Desarrollo Mobile con Java` > `Sesión 05`

## ¡Todos los Pokemon en una lista!

### OBJETIVO 
 - Agregar todos los objetos a una lista. 

#### DESARROLLO
* Para acceder a alguno de ellos, puedes usar el índice.
1. Accede al pokemon.
2. El pokemon que obtienes con “get” debes guardarlo en una variable.

```java
//El pokemon elegido será el del índice 2
Pokemon elegido = todosLosPokemon.get(2);

Log.d(“…”,”El nombre es: “+elegido.nombre);
//Esto regresará “El nombre es: venasaur”
```

* ¿Para acceder a TODOS?
1. Puedes acceder a todos ellos con un ciclo *for.  

```java
//ciclo de pokemons…
for(int pkmnActual = 0; pkmnActual < todosLosPokemon.size(); pkmnActual++)
{
   Pokemon elegido = todosLosPokemon.get(pkmnActual);
   Log.d(“…”,”El nombre es: “+elegido.nombre);
   //Esto irá imprimiendo todos los nombres, uno a uno
}
```

* ¿Para modificar o editar uno?
1. Obtén el pokemon.
2. ¡Modifícalo!

Por ejemplo:

```java
Pokemon elegido = todosLosPokemon.get(3)
elegido.Nombre = “charmander”;
```

* ¿Para borrarlo de la lista?
1. Usa el método “remove(indice)”
```java
todosLosPokemon.remove(3)
```
**Cuidado**
Todos los pokemon se recorren en la lista!
