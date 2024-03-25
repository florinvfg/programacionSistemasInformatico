/**
 * @param Enunciado:
 *Un anagrama es una palabra que resulta del cambio del orden de los
 *  caracteres de otra. Ejemplos de anagramas para la palabra roma son:
 *  amor,ramo o mora. Construir un progra-ma que solicite al usuario dos
 *  palabras e indique si son anagramas una de otra
 *  */

import java.util.*;
public class ActividadResuelta6_12 {
    /**
     * El algoritmo que comprueba si cada letra de la palabra 1 se encuentra en la
     * palabra 2, y lo que es más importante, comprobar que cada letra, tanto de la
     * palabra 1 como de la 2 solo se utilizan una vez. Esto último puede ser algo
     * más laborioso de escribir.  Vamos a buscar una propiedad de los anagramas que
     * nos facilite el trabajo.   Para que dos palabras sean anagramas tienen que
     * tener la misma longitud y las  mismas letras el mismo número de veces.
     * Lo que haremos es ordenar las letras  de cada palabra y comprobar si son iguales:
     * Un ejemplo: (sin vocales acentuadas) * "esponja" -> ordenamos las letras:
     * "aejnops" -> son iguales * "japones" -> ordenamos las letras: "aejnops" -> son iguales
     */
    public static void main(String[] args) {
        String palabra1, palabra2;
        System.out.println("Escriba una palabra: ");
        palabra1 = new Scanner(System.in).next(); //solo lee una palabra
        palabra1 = palabra1.toLowerCase(); //convertimos a minúsculas
        System.out.println("Escriba otra: ");
        palabra2 = new Scanner(System.in).nextLine();
        palabra2 = palabra2.toLowerCase(); //convertimos a minúsculas
        if (palabra1.length() != palabra2.length()) {//si son de distintos tamaño
            System.out.println("No son anagramas"); //no pueden ser anagramas

        } else {
            char p1[] = palabra1.toCharArray(); //es más fácil ordenar una tabla
            char p2[] = palabra2.toCharArray(); //convertimos las palabras a tablas
            Arrays.sort(p1); //ordenamos ambas tablas
            Arrays.sort(p2);
            if (Arrays.equals(p1, p2)) {//si las tablas son iguales: tienen las mismas letras
                System.out.println("Son anagramas"); //son anagrama

            } else {
                System.out.println("No son anagramas");
            }


        }
    }
}