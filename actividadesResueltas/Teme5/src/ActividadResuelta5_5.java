/*Escribir la funcion int[] rellenaPares(int longitud, int fin),que crea y devuelve una tabla ordenada
* de la longitud especificada, que se encuntra rellena con numeros pares aleatorios comprendidos en el
* rango desde 2 hasta fin(inclusive)*/

import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class ActividadResuelta5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la longitud de la tabla");

        int longitud=sc.nextInt(); // Longitud de la tabla
        System.out.println("Idica el numero final de los numeros aleatorios");

        int fin =sc.nextInt(); ; // Valor máximo (inclusive) de los números pares

        // Llamada a la función rellenaPares
        int[] tabla = rellenaPares(longitud, fin);

        // Mostrar la tabla resultante
        System.out.println("Tabla de números pares:");
        System.out.println(Arrays.toString(tabla));
    }

    public static int[] rellenaPares(int longitud, int fin) {
        int[] tabla = new int[longitud];
        Random rand = new Random();

        for (int i = 0; i < longitud; i++) {
            // Generar un número par aleatorio entre 2 y fin (inclusive)
            int numero = rand.nextInt((fin - 2) / 2 + 1) * 2 + 2;
            tabla[i] = numero;
        }

        Arrays.sort(tabla); // Ordenar la tabla
        return tabla;




    }
}
