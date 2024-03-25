
/**
 * @param Enunciado:
 * Modificar la Actividad resuelta 6.14 para que el programa indique al jugador 2
 * cuántas le-tras coinciden (son iguales y están en la misma posición) entre el
 * texto introducido por él y el original.*/

import java.util.*;
public class ActividaResuelta6_15 {

    public static void main(String[] args) {
        String original = null; //texto original que introduce el jugador 1
        String intento; //intento de acertar la palabra original
/**código idéntico a la Actividad Resuelta 6.14 solo se modifica el
 * bucle do-while
 */
        do {
            System.out.print("\n\tJugador 1. Introduzca una palabra: ");
            original = new Scanner(System.in).next();
        } while
        (original.isEmpty());
        String anagrama = creaAnagrama(original);
        System.out.println("A qué palabra correspondo el anagrama: " + anagrama);
        do {
            System.out.println("Jugador 2. ¿Cuál es el original? ");
            intento = new Scanner(System.in).next();
            System.out.println("Letras correctas: " + letrasCorrectas(original, intento));
        } while (!original.equals(intento)); //mientras no acierte el texto original
        System.out.println("Muy bien..."); //si salimos del bucle es que ha acertado

    }

    //Comprueba cuántas letras coinciden (son iguales y ocupan la misma posición)
    // entre las dos cadenas pasadas como parámetros.
    static int letrasCorrectas(String a, String b) {
        int longitudMinima = Math.min(a.length(), b.length());
        //usamos la longitud mínima de ambas cadenas para evitar extraer caracteres de más
        int contadorLetrasCorrectas = 0;
        for (int i = 0; i < longitudMinima; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                contadorLetrasCorrectas++;
            }
        }
        return contadorLetrasCorrectas;
    }

    static String creaAnagrama(String original) {  //implementación en la Actividad Resuelta 6.

        char anagrama[] = original.toCharArray(); //una tabla es más cómoda para modificar
        // realizamos un intercambio al azar por cada carácter que forma el texto
        for (int numCambios = 0; numCambios < anagrama.length; numCambios++) {
            int i = (int) (Math.random() * anagrama.length); //índice al azar
            int j = (int) (Math.random() * anagrama.length); //índice al azar
            char aux = anagrama[i]; //intercambiamos anagrama[i] y anagrama[j]
            anagrama[i] = anagrama[j];
            anagrama[j] = aux;

        }
        return String.valueOf(anagrama);//devolvemos un String a partir la tabla
    }
}
