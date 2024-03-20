
/** @Enunciado:
 *Diseñar el juego «Acierta la contraseña». La mecánica del juego es la siguiente:
 *  el primer jugador introduce la contraseña; a continuación, el segundo jugador
 *  debe teclear palabras hasta que la acierte. Realizar dos versiones; en la primera
 *  se facilita el juego indicando si la palabra introducida es mayor o menor
 *  alfabéticamente que la contraseña. En la se-gunda, el programa mostrará la longitud
 *  de la contraseña y una cadena con los caracteres acertados en sus lugares respectivos
 *  y asteriscos en los no acertados
 *  */


import java.util.*;

public class ActividadResuelta6_3LibroA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passwd, palabra;
        System.out.print("\nJugador 1. Introduzca la contraseña: ");
        passwd = sc.nextLine(); //leemos la contraseña
         do {
             System.out.print("Jugador 2. Palabra: ");
        palabra = sc.nextLine();
        int comparacion = passwd.compareTo(palabra);
        //comparamos alfabéticamente
             if (comparacion == 0) {
                 System.out.println("¡Acertaste!");
                 //son iguales
                 } else if (comparacion < 0) {
                 System.out.println("La contraseña es menor que: " + palabra);
             } else {
                 System.out.println("La contraseña es mayor que: " + palabra);
             }
         } while (!passwd.equals(palabra));




    }

}
