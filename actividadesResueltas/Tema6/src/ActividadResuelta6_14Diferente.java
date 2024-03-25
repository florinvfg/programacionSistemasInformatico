/**
 * @autor [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * @param Enunciado:
 *  *Implementar el juego del anagrama, que consiste en que un jugador escribe
 *  *  una palabra y la aplicación muestra un anagrama (cambio del orden de los
 *  *  caracteres) generado al azar. A continuación, otro jugador tiene que acertar
 *  *  cuál es el texto original. La aplicacion no debe permitir que el texto
 *  *  introducido por el jugador 1 sea la cadena vacía. Por ejemplo, si el jugador
 *  *  1 escribe «teclado», la aplicación muestra como pista un anagrama al azar,
 *  *  como por ejemplo: «etcloda» */
import java.util.*;
public class ActividadResuelta6_14Diferente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Solicitar al jugador 1 que escriba una palabra
        mostrar("\n\tJugador 1, por favor escribe una palabra: ");
        String palabraOriginal = sc.nextLine();

        // Verificar que la palabra ingresada no esté vacía
        if (palabraOriginal.isEmpty()) {
            mostrar("No has ingresado ninguna palabra. Fin del juego.");
            return;
        }

        // Generar un anagrama al azar de la palabra original
        String anagrama = generarAnagrama(palabraOriginal, random);

        // Mostrar el anagrama al jugador 2
        mostrar("Jugador 2, aquí tienes un anagrama: " + anagrama);

        // Solicitar al jugador 2 que adivine la palabra original
       mostrar("Intenta adivinar cuál es la palabra original: ");
        String intento = sc.nextLine();

        // Verificar si el intento del jugador 2 coincide con la palabra original
        if (intento.equalsIgnoreCase(palabraOriginal)) {
            mostrar("¡Felicidades! Has adivinado la palabra correctamente.");
        } else {
            mostrar("Lo siento, la palabra original era: " + palabraOriginal);
        }
    }

    // Función para generar un anagrama al azar de una palabra
    public static String generarAnagrama(String palabra, Random random) {
        // Convertir la palabra a un arreglo de caracteres
        char[] caracteres = palabra.toCharArray();

        // Mezclar los caracteres para generar el anagrama
        for (int i = 0; i < caracteres.length; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length);
            char temp = caracteres[i];
            caracteres[i] = caracteres[indiceAleatorio];
            caracteres[indiceAleatorio] = temp;
        }

        // Devolver el anagrama como una cadena de caracteres
        return new String(caracteres);

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
