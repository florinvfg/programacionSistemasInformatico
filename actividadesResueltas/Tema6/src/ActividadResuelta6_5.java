/**
 * Diseñar una función a la que se le pase una cadena de caracteres
 * y la devuelva invertida. Un ejemplo, la cadena «Hola mundo»
 * quedaría <<odnum aloH>>*/
import java.util.*;
import java.util.Scanner;

public class ActividadResuelta6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String antes, despues;
        mostrar("\nEscriba una cadena: ");
        antes = sc.nextLine();
        despues = alReves(antes); // Utilizamos la función
        mostrar("Tu texto -> " + antes+ ": ahora es -> " +despues); // Mostramos el resultado
    }

    // Método para invertir una cadena
    public static String alReves(String original) {
        String nueva = "";
        for (int i = 0; i < original.length(); i++) {
            nueva = original.charAt(i) + nueva; // Concatenamos el carácter antes de 'nueva'
        }
        return nueva;
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