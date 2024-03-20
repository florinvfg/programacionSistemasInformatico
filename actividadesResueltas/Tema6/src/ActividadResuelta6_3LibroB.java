/** @Enunciado:
 *Diseñar el juego «Acierta la contraseña». La mecánica del juego es la siguiente:
 *  el primer jugador introduce la contraseña; a continuación, el segundo jugador
 *  debe teclear palabras hasta que la acierte. Realizar dos versiones; en la primera
 *  se facilita el juego indicando si la palabra introducida es mayor o menor
 *  alfabéticamente que la contraseña. En la se-gunda, el programa mostrará la longitud
 *  de la contraseña y una cadena con los caracteres acertados en sus lugares respectivos
 *  y asteriscos en los no acertados
 * */

import java.util.*;
public class ActividadResuelta6_3LibroB {
    /**
     * Las cadenas no se pueden comparar utilizando el operador ==.
     * Para realizar comparacione de cadenas disponemos de equals() y otros metodos
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passwd, palabra;
        System.out.println("\nJugador 1. Itroduzca la contraseña: ");
        /**
         * leemos la contraseña
         * */
        passwd = sc.nextLine();
        System.out.println("La contraseña tiene " + passwd.length() + " caracteres");
        System.out.println("Jugador 2. Palabra: ");
     /**
      * leemos una palabra->primer intento
      * */
      palabra = sc.nextLine();
        while (!palabra.equals(passwd)) {
            /**
             * mientras no son iguales seguimos jugando
             * */
            String pista = "";
            /**
             * si palabra tiene una longitud menor
             * se produciria un error en tiempo de ejecucion
             * ¿Por que?
             * Que si:->*/
            for (int i = 0; i < passwd.length(); i++) {
                if (passwd.charAt(i) == palabra.charAt(i)) {//si son iguales
                   /**
                    * se añade el i-esimo caracter a la pista
                    * */
                    pista += passwd.charAt(i);
                } else {
                    pista += '*';//en otro caso,añadimos un *
                }
            }

            System.out.println(pista);
            System.out.println("Jugador 2. Introduzca palabra de nuevo: ");
            palabra = new Scanner(System.in).next();

            System.out.println("!Acertaste!");

        }

    }


}
