/**
 * @Enunciado
 * Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales
 * (mayúsculas, minúsculas y acentuadas).
 * Por ejemplo, “Álvaro Pérez” se mostrará «lvr Prz
 * */

import  java.util.*;
public class ActividadResuelta6_6 {
    public static void main(String[] args) {
/** La idea es recorrer el nombre, carácter a carácter, comprobando si es una * vocal.
 * En el caso de que no sea una vocal concatenaremos el carácter al final de * una segunda cadena,
 * que llamaremos sinVocales. Para comprobar si un carácter * es una vocal crearemos la función:
 * esVocal() */
        Scanner sc = new Scanner(System.in);
        String nombre, sinVocales = "";
        char c;
       mostrar("\nEscriba su nombre completo: ");
        nombre = sc.nextLine();
        for (int i = 0; i < nombre.length(); i++) {
            c = nombre.charAt(i);
            if (!esVocal(c)) {
                sinVocales = sinVocales + c;
            }
        }
        mostrar("Tu nombre sin vocales es -> " + (sinVocales));

    }

    /** Método
     * para comprobar si un carácter es una vocal
     * */
    public static boolean esVocal(char c) {
        boolean result;
        String vocales = "aeiouáéíóúü";
        c = Character.toLowerCase(c);
        if (vocales.indexOf(c) == -1) {
            result = false;
        } else {
            result = true;
        }
        return result;

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