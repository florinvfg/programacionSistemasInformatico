/*Escribe la función void desordenar(int t[]), que cambia de forma aleatoria los elementos
contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo*/
import java.util.*;
public class ActividadDeAplicacion5_12 {
    public static void main(String[] args) {
        int[] tabla = {1, 2, 3, 4, 5};
        System.out.println("Tabla original: " + Arrays.toString(tabla));
        desordenar(tabla);
        System.out.println("Tabla desordenada: " + Arrays.toString(tabla));
    }

    public static void desordenar(int[] t) {
        Random random = new Random(); // Creamos un objeto Random para generar números aleatorios
        for (int i = 0; i < t.length; i++) {
            // Generamos un índice aleatorio entre 0 y la longitud de la tabla
            int indiceAleatorio = random.nextInt(t.length);
            // Intercambiamos el elemento en la posición actual con el elemento en el índice aleatorio
            int temp = t[i];//Guardamos temporalmente el valor del elemento en la posición actual i en
            // una variable temporal llamada temp.
            t[i] = t[indiceAleatorio];// Reemplazamos el valor del elemento en la posición actual i
            // con el valor del elemento en el índice aleatorio
            t[indiceAleatorio] = temp;//Asignamos el valor guardado en la variable temporal temp al
            // elemento en el índice aleatorio indiceAleatorio,
            // completando así el intercambio de valores entre las posiciones i e indiceAleatorio.
        }
    }
}
/*En resumen, esta función desordenar recorre todos los elementos de la tabla t y para cada uno de ellos, intercambia su valor con el valor de
otro elemento seleccionado aleatoriamente en la tabla. Esto se hace para cada elemento, lo que resulta en una tabla desordenada donde los
 elementos se distribuyen aleatoriamente.*/

/* public static  int[] crearTabla() {
        mostrarSinLn("Indique el numero de elementos a insertar ->");
        // Leemos la longitud de la tabla ingresada por el usuario
        int longitud = sn.nextInt();
        // Creamos una tabla de enteros con la longitud proporcionada
        int tabla[] = new int[longitud];
        // Solicitamos al usuario que ingrese los elementos de la tabla
        for (int i = 0; i < tabla.length; i++) {
            mostrarSinLn("Indique el elemento " + (i + 1) + "->");
            tabla[i] = sn.nextInt();

        }
        Arrays.sort(tabla);
        return tabla;// Devolvemos la tabla creada
    }
    //metodo que desordena la tabla generada
    //mediante un bucle de recorrido por toda la tabla
    //valor1 / valor2=Random con dos valores multiplicado por la longitud de la tabla
    public static int[] desordenarT(int tabla[]){
    for(int i = 0; i < tabla.length; i++)
    int valor1=(int)Math.random()*tabla.length);
    int valor2=(int)Math.random()*tabla.length);
    int aux=tablav[alor1];
    tabla[valor1]=tabla[valor2];
    tabla[valor2]=aux;
    }
    return tabla;



    }*/