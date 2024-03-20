/**
 * @param Autor [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * @Enunciado
 *Diseñar un programa que solicite al usuario una frase y una palabra.
 *  A continuación buscará cuántas veces aparece la palabra en la frase. */
import java.util.*;
public class ActividadResuelta6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        /**
         * variables contador y posición
         * */
        int veces = 0, pos;
        mostrar("\nIntroduzca una frase: ");
        /**
         * lee cualquier carácter
         * hasta pulsar Intro
         * */
        frase = sc.nextLine();
       mostrar("Introduzca una palabra: ");
        /**
         * solo lee una palabra:
         * sin espacios
         * */
       palabra = sc.next();
        /**
         * buscamos la primera ocurrencia
         * */
        pos = frase.indexOf(palabra);
        /**
         * mientras pos no sea -1,
         * no hemos encontrado la palabra
         * */
        while (pos != -1) {
            /**
             * si hemos encontrado una ocurrencia,
             * incrementamos veces*/
            veces++;
            pos = frase.indexOf(palabra, pos + 1);
            /**
             * volvemos a buscar a partir de la posición
             * siguiente a pos, por si encontramos otra
             * ocurrencia de palabra
             * */
        }
        /**
         * cuando salimos del bucle es que
         * ya no existe mas ocurrencias
         * */
        if (veces == 0) { //no hemos encontrado la palabra en la frase
            System.out.println("\"" + palabra + "\" no se encuentra en la frase");
        } else {
            mostrar("\"" + palabra + "\" está " + veces + " veces");

        }

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