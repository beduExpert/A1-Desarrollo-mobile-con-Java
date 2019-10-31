## Sesion 04 - Reto 03

### OBJETIVO 
 - Aprenderemos acerca de Métodos.

#### REQUISITOS 
1. Android Studio
2. Nociones básicas de programación.

#### DESARROLLO
1. Crear el método **recibirDano** con las siguiente propiedades.
    - **Recibe:** La cantidad de daño (int)
    - **Retorna:** Nada (void)
    - **Que hace:** Al valor HP le reduce la cantidad de daño que le digas.

    **Si el HP es menor a 0, debe ponerlo en 0 y decir**
    ```java
    nombre + " se desmayó "
	```
<details>
<summary>Código previo</summary>
<br>
A continuación se muestra el código, para resolver el ejercicio visto anteriormente.
<br><br>

 ```java
package com.bedu.pokedex;
public class Pokemon
{
    int numero;
    String nombre;
    double altura;
    double peso;
    String descripcion;
    int tipo;   
    int HP;

   int atacar(String nombreAtaque)
   {
    ...
   }

   void recibirDano (int cantidadDeDano)
   {
     ...
   }

}
```

</details>

<details>
<summary>Resultado</summary>
<br>
A continuación se muestra el código, para resolver el ejercicio visto anteriormente.
<br><br>

 ```java
void recibirDano(int cantidadDano)
{
    HP = HP – cantidadDano;
    if(HP <= 0)
    {
         HP = 0;
       Log.d(”PokeDex”, nombre+” se desmayó!”);
    }
}
```

</details>

