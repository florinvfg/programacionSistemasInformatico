/**
 * @param Enunciado:
 * Realiza el juego del ahorcado. Las reglas del juego son:
 * a)El jugador A teclea una palabra, sin que el jugador B la vea.
 * b)Ahora se le muestra tantos guiones como letras tenga la palabra secreta. Por ejem-plo, para «hola» será «_ _ _ _».
 * c)El jugador B intentará acertar, letra a letra, la palabra secreta.
 * d)Cada acierto muestra la letra en su lugar y las letras no acertadas seguirán ocultas como guiones.
 * Siguiendo con el ejemplo anterior, y suponiendo que se ha introduci-do: la ‘o’, la ‘j’ y la ‘a’, se mostrará: «_ o _ a».
 * e)El jugador B solo tiene 7 intentos.
 * f)La partida terminará al acertar todas las letras que forman la palabra secreta (gana el jugador B)
 * o cuando se agoten todos los intentos (gana el jugador A)
 * */
import java.util.*;
public class ActividadDeAplicacion6_12 {
    /**
     * En resumen, este código implementa el juego del ahorcado, donde un jugador ingresa una palabra secreta,
     * se muestra la palabra enmascarada al otro jugador, quien intenta adivinarla letra por letra.
     * El juego continúa hasta que el jugador adivina correctamente la palabra o se quedan sin intentos.
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paso 1: Jugador A ingresa la palabra secreta
        mostrar("\nJugador A, ingresa la palabra secreta: ");
        String palabraSecreta = sc.nextLine().toLowerCase();

        // Paso 2: Se muestra la palabra enmascarada
        /**
         *  Se crea un arreglo de caracteres para representar la palabra enmascarada
         *  */
        char[] palabraEnmascarada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraEnmascarada.length; i++) {
            palabraEnmascarada[i] = '_';// Se itera sobre el arreglo de caracteres para inicializarlo con guiones bajos
        }
        mostrar("Palabra enmascarada: " + String.valueOf(palabraEnmascarada));

        // Paso 3: Jugador B intenta adivinar la palabra
        /**
         * Se inicializa el número de intentos del jugador B
         * */
        int intentos = 7;// Se inicia un bucle while que continuará mientras haya intentos disponibles
        while (intentos > 0) {
            mostrar("Jugador B, ingresa una letra: ");
            char letra = sc.next().toLowerCase().charAt(0);

            boolean acierto = false; // Se inicializa una variable para registrar si hubo un acierto al adivinar la letra
            /**
             *  Se itera sobre la palabra secreta para comprobar si la letra ingresada coincide con alguna de ellas
             *  */
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {// Si la letra coincide, se actualiza la palabra enmascarada con la letra acertada
                    palabraEnmascarada[i] = letra;
                    acierto = true;
                }
            }
            /**
             *   Si no hubo acierto, se decrementa el número de intentos y se muestra un mensaje
             */
            if (!acierto) {
                intentos--;
                mostrar("Letra incorrecta. Intentos restantes: " + intentos);
            } else {
                mostrar("¡Acierto!");
            }
            /**
             * Se muestra la palabra enmascarada actualizada después del intento
             * */
            mostrar("Palabra enmascarada: " + String.valueOf(palabraEnmascarada));
            /**
             *  Si la palabra enmascarada es igual a la palabra secreta,
             *  el jugador B ha adivinado la palabra y gana el juego
             *  */
            if (String.valueOf(palabraEnmascarada).equals(palabraSecreta)) {
                mostrar("¡Felicidades! Has adivinado la palabra secreta.");
                return;
            }
        }
/** Si se agotan los intentos y el bucle while termina,
 *  se muestra un mensaje indicando que se acabaron los
 *  intentos y se revela la palabra secreta
 *  */
        mostrar("Se acabaron los intentos. La palabra secreta era: " + palabraSecreta);

    }
    /**
     * Metodos de salida de mensaje en consola con interlineado
     * @param texto*/

    public static void mostrar (String texto){
        System.out.println("\t" + texto);
    }
    /**
     * Metodos de salida de mensaje en consola Sin interlineado
     * @param texto*/

    public static void mostrarSinLn (String texto) {
        System.out.print("\t" + texto);

    }
}
