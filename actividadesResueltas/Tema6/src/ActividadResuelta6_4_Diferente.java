/**
 * @param Autor [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * @param Enunciado
 *  * Diseñar una aplicación que pida al usuario que introduzca una frase
 *  * por teclado e indique cuántos espacios en blanco tiene
 *  */

import java.util.*;
public class ActividadResuelta6_4_Diferente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca una frase
        mostrar("Por favor, introduce una frase: ");
        String frase = sc.nextLine();

        // Contar los espacios en blanco en la frase
        int espaciosBlanco = contarEspaciosBlanco(frase);

        // Mostrar el resultado al usuario
        mostrar("La frase tiene " + espaciosBlanco + " espacios en blanco.");
    }

    // Función para contar los espacios en blanco en una frase
    public static int contarEspaciosBlanco(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Metodos de salida de mensaje en consola con interlineado
     *
     * @param texto
     */

    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    /**
     * Metodos de salida de mensaje en consola Sin interlineado
     *
     * @param texto
     */

    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto);
    }
}