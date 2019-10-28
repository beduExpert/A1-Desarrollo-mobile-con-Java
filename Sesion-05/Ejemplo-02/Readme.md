`Desarrollo Mobile con Java` > `Sesión 05`

## Listas con ArrayList

### OBJETIVO 
 - Utilizar listas dinámicas en Java.

#### DESARROLLO

Una de la funcionalidad más importante en Java son las **listas dinámicas**.
Para utilizarlas:

```java
import java.util.ArrayList;
```

1. Primer paso: Crear una lista nueva.
```java
ArrayList<Pokemon> todosLosPokemon = new ArrayList<>();
```
* Puedes revisar que efectivamente está vacía.
Revisando cuántos datos tiene la lista:  

```java
int pkmnEnLaLista = todosLosPokemon.size(); 
```
2. Ya que tienes tu lista creada, hay que agregar un nuevo Pokemon.

```java
//primero hay que crear el pokemon que vamos a añadir…
Pokemon bulbasaur = new Pokemon(1,"Bulbasaur",0.4,6.0,"Bulbasaur es un… ...);

//Luego lo agregamos a la lista así:
todosLosPokemon.add(bulbasaur);
```

* Si el Pokemon no existe, hay que crearlo primero

--> Puedes agregar cuantos quieras…
- No hay límite para agregar Pokemon a la lista.  
- El límite es la memoria que tenga disponible tu teléfono

```java
todosLosPokemon.add(bulbasaur); todosLosPokemon.add(ivysaur);
todosLosPokemon.add(venasaur);
todosLosPokemon.add(charmander);
todosLosPokemon.add(charmeleon);
...
```




