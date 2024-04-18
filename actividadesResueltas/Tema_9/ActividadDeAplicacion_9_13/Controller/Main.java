package ActividadDeAplicacion_9_13.Controller;

import ActividadDeAplicacion_9_13.Modelo.ComparadorEdad;
import ActividadDeAplicacion_9_13.Modelo.ComparadorNombre;
import ActividadDeAplicacion_9_13.Modelo.Futbolista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Diseñar la clase Futbolista con los siguientes atributos: dni, nombre, edad y número de goles.
 * Implementar:
 * Un constructor y los métodos toString() y equals() (este último basado en el DNI).
 * La interfaz Comparable con un criterio de ordenación basado también en el DNI.
 * Un comparador para hacer ordenaciones basadas en el nombre y otro basado en la edad.
 * Crear una tabla con 5 futbolistas y mostrarlos ordenados por DNI, por nombre y por edad.
 */

// Clase Main
public class Main {
    public static void main(String[] args) {
        // Definición de constantes para colores de texto en la consola
        final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
        final String YELLOW = "\033[0;33m"; // Color amarillo
        final String BLUE = "\033[0;34m"; // Color azul

/**
 * Crear tabla con 5 futbolistas
  */

        List<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(new Futbolista("12345678A", "Juan", 25, 10));
        futbolistas.add(new Futbolista("98765432B", "Pedro", 30, 15));
        futbolistas.add(new Futbolista("56789012C", "María", 22, 8));
        futbolistas.add(new Futbolista("34567890D", "Ana", 27, 12));
        futbolistas.add(new Futbolista("90123456E", "Luis", 28, 18));
        System.out.println(YELLOW+"\n\tListado:"+RESET);

/**
 * Mostrar futbolistas ordenados por DNI
 */
        System.out.println(BLUE+"Ordenados por DNI:"+RESET);
        Collections.sort(futbolistas);
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }
/**
 * Mostrar futbolistas ordenados por nombre
 */
        System.out.println(BLUE+"\nOrdenados por nombre:"+RESET);
        Collections.sort(futbolistas, new ComparadorNombre());
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }
/**
 * Mostrar futbolistas ordenados por edad
 */

        System.out.println(BLUE+"\nOrdenados por edad:"+RESET);
        Collections.sort(futbolistas, new ComparadorEdad());
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }
    }
}
