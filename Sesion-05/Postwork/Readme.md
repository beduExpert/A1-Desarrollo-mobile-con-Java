## Postwork

### OBJETIVO 
 - Reforzarás tu conocimiento sobre los conceptos básicos para aprender el lenguaje Java a profundidad. 

#### DESARROLLO
Utiliza lo aprendido durante el último reto de la sesión para agregarle a tu proyecto nuevos objetos con las diferentes funcionalidades. También, realiza las siguientes actividades, en caso de que apliquen en tu proyecto personal.  
1. Agrega “Logs” a tu código.  
2. Crea paquetes para tu proyecto.  
3. Agrega las funcionalidades extra de la librerías que vienen en la documentación oficial de Android:
   java.util.Calendar  
   java.lang.Math   
   java.util.Random   
   java.util.ArrayList     
4. Prepara tu PokeDex para la siguiente clase.  
*Tu código de MainActivity.java debe verse así:


 ```java  
 public class MainActivity extends AppCompatActivity {

    ArrayList<Pokemon> todosLosPokemon;
    int pokemonSeleccionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private ArrayList<Pokemon> crearPokemons()
    {
        ArrayList<Pokemon> listaPokemon = new ArrayList<>();
        listaPokemon.add(new Pokemon(1,"bulbasaur",0.30, 0.5, "Es el pokemon plantita", 15, 50));
        listaPokemon.add(new Pokemon(2,"ivysaur",0.35, 4.5, "Es el pokemon plantita", 15, 150));
        listaPokemon.add(new Pokemon(3,"venasaur",0.40, 1.5, "Es el prokemon plantita", 15, 250));
        listaPokemon.add(new Pokemon(4,"charmander",0.38, 2.5, "Es el prokemon de fuego", 6, 50));
        listaPokemon.add(new Pokemon(5,"charmeleon",1.30, 4.5, "Es el prokemon de fuego", 6, 150));
        listaPokemon.add(new Pokemon(5,"charizard",1.60, 10.5, "Es el prokemon de fuego", 6, 250));
        return listaPokemon;
    }
*(onCreate está plegado, pero puedes ignorarlo por esta vez.)*
´´´
