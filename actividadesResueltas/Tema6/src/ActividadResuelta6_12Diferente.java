
/*** @param Enunciado:
 *Un anagrama es una palabra que resulta del cambio del orden de los
 *  caracteres de otra. Ejemplos de anagramas para la palabra roma son:
 *  amor,ramo o mora. Construir un progra-ma que solicite al usuario dos
 *  palabras e indique si son anagramas una de otra
 *  */

import java.util.*;
public class ActividadResuelta6_12Diferente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las dos palabras
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para simplificar la comparación
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para simplificar la comparación

        // Verificar si las palabras son anagramas
        boolean sonAnagramas = verificarAnagramas(palabra1, palabra2);

        // Mostrar el resultado
        if (sonAnagramas) {
            System.out.println("¡Las palabras '" + palabra1 + "' y '" + palabra2 + "' son anagramas!");
        } else {
            System.out.println("Las palabras '" + palabra1 + "' y '" + palabra2 + "' no son anagramas.");
        }
    }

    // Función para verificar si dos palabras son anagramas
    public static boolean verificarAnagramas(String palabra1, String palabra2) {
        // Convertir las palabras a arreglos de caracteres y ordenarlos
        char[] arregloPalabra1 = palabra1.toCharArray();
        char[] arregloPalabra2 = palabra2.toCharArray();
        Arrays.sort(arregloPalabra1);
        Arrays.sort(arregloPalabra2);

        // Verificar si los arreglos ordenados son iguales
        return Arrays.equals(arregloPalabra1, arregloPalabra2);


    }
}
