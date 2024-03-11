/*Modifica la Actividad de aplicación 5.12 para que la función no modifique
 la tabla que se pasa como parámetro y, en su lugar, cree y devuelva una copia
  de la tabla donde se han desordenado los valores de los elemento*/
import java.util.*;
public class ActividadDeAplicacion5_13 {
    public static void main(String[] args) {
        int[] tabla = {1, 2, 3, 4, 5};
        System.out.println("Tabla original: " + Arrays.toString(tabla));
        int[] tablaDesordenada = desordenar(tabla);
        System.out.println("Tabla desordenada: " + Arrays.toString(tablaDesordenada));
    }

    public static int[] desordenar(int[] t) {
        // Creamos una copia de la tabla original
        int[] copia = Arrays.copyOf(t, t.length);
        Random random = new Random(); // Creamos un objeto Random para generar números aleatorios
        for (int i = 0; i < copia.length; i++) {
            // Generamos un índice aleatorio entre 0 y la longitud de la tabla
            int indiceAleatorio = random.nextInt(copia.length);
            // Intercambiamos el elemento en la posición actual con el elemento en el índice aleatorio
            int temp = copia[i];
            copia[i] = copia[indiceAleatorio];
            copia[indiceAleatorio] = temp;
        }
        // Devolvemos la copia desordenada de la tabla
        return copia;

    }
}
