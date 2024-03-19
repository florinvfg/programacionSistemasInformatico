/**
 * @Autor:[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * @Enunciado:
 *Diseñar el juego «Acierta la contraseña». La mecánica del juego es la siguiente:
 *  el primer jugador introduce la contraseña; a continuación, el segundo jugador
 *  debe teclear palabras hasta que la acierte. Realizar dos versiones; en la primera
 *  se facilita el juego indicando si la palabra introducida es mayor o menor
 *  alfabéticamente que la contraseña. En la se-gunda, el programa mostrará la longitud
 *  de la contraseña y una cadena con los caracteres acertados en sus lugares respectivos
 *  y asteriscos en los no acertados */

import java.util.*;
public class ActividadResuelta6_3 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                /** Pedir al primer jugador
                 *  que introduzca la contraseña
                 * */
                mostrar("Jugador 1, por favor introduce la contraseña en letras : ");
                String contraseña = sc.nextLine();

                /** Limpiar la consola
                 * */
                clearConsole();

                /** Iniciar el juego
                 * */
                mostrar("¡Bienvenido al juego Acierta la Contraseña!");
               mostrar("El segundo jugador debe adivinar la contraseña.");

                /** Primera versión:
                 *  indicar si la palabra introducida es mayor o menor
                 *  alfabéticamente que la contraseña
                 *  */
                jugarPrimeraVersion(contraseña,sc);

                // Limpiar la consola
                clearConsole();

                /** Segunda versión:
                 *  mostrar la longitud de la contraseña y una cadena con los caracteres acertados
                 *  en sus lugares respectivos y asteriscos en los no acertados
                 *  */
                jugarSegundaVersion(contraseña, sc);
            }

            /** Función
             *  para jugar la primera versión del juego
             *  */
            public static void jugarPrimeraVersion(String contraseña, Scanner scanner) {
                String intento;
                do {
                    mostrar("Jugador 2, introduce una palabra: ");
                    intento = scanner.nextLine();
                    if (intento.compareTo(contraseña) < 0) {
                       mostrar("La palabra introducida es menor alfabéticamente que la contraseña.");
                    } else if (intento.compareTo(contraseña) > 0) {
                       mostrar("La palabra introducida es mayor alfabéticamente que la contraseña.");
                    }
                } while (!intento.equals(contraseña));
                mostrar("¡Felicidades! Has acertado la contraseña.");
            }

            /** Función
             *  para jugar la segunda versión del juego
             *  */
            public static void jugarSegundaVersion(String contraseña, Scanner scanner) {
                StringBuilder resultado = new StringBuilder("*".repeat(contraseña.length()));
                String intento;
                do {
                    mostrar("Jugador 2, introduce una palabra: ");
                    intento = scanner.nextLine();
                    if (intento.equals(contraseña)) {
                       mostrar("¡Felicidades! Has acertado la contraseña.");
                        return;
                    } else {
                        for (int i = 0; i < contraseña.length() && i < intento.length(); i++) {
                            if (contraseña.charAt(i) == intento.charAt(i)) {
                                resultado.setCharAt(i, contraseña.charAt(i));
                            } else {
                                resultado.setCharAt(i, '*');
                            }
                        }
                        mostrar("Resultado parcial: " + resultado);
                    }
                } while (!intento.equals(contraseña));
            }

            // Función para limpiar la consola
            public static void clearConsole() {
                mostrar("\033[H\033[2J");
                System.out.flush();
            }
    public static void mostrar (String texto){
        System.out.println("\t" + texto);
    }
    /**
     * Metodos de salida de mensaje en consola Sin interlineado
     * @param texto*/

    public static void mostrarSinLn (String texto){
        System.out.print("\t" + texto);
    }
        }


