
/**
 *  @autor [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 *
 * Modificar la Actividad resuelta 6.14 para que el programa indique al jugador 2
 * cuántas le-tras coinciden (son iguales y están en la misma posición) entre el
 *  texto introducido por él y el original.
 *  */
import java.util.*;
public class ActividadResuelta6_15Diferente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Solicitar al jugador 1 que escriba una palabra
       mostrar("Jugador 1, por favor escribe una palabra: ");
        String palabraOriginal = sc.nextLine();

        // Verificar que la palabra ingresada no esté vacía
        if (palabraOriginal.isEmpty()) {
           mostrar("No has ingresado ninguna palabra. Fin del juego.");
            return;
        }

        /**
         *  Generar un anagrama al azar de la palabra original
         *  */
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
            // Calcular cuántas letras coinciden entre el intento y la palabra original
            int letrasCoincidentes = contarLetrasCoincidentes(palabraOriginal, intento);
           mostrar("Lo siento, la palabra original era: " + palabraOriginal);
            mostrar("Número de letras coincidentes: " + letrasCoincidentes);
        }
    }

    /**
     * Función para generar un anagrama al azar de una palabra
     * */
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
     * Función para contar cuántas letras coinciden entre dos palabras
     * */
    public static int contarLetrasCoincidentes(String palabraOriginal, String intento) {
        int coincidencias = 0;
        // Verificar la longitud de las palabras para evitar desbordamientos de índices
        int longitud = Math.min(palabraOriginal.length(), intento.length());
        // Comparar cada letra de ambas palabras
        for (int i = 0; i < longitud; i++) {
            if (palabraOriginal.charAt(i) == intento.charAt(i)) {
                coincidencias++;
            }
        }
        return coincidencias;

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
