/**
 * @autor [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 *Diseñar un algoritmo que lea del teclado una frase e indique, para cada letra que
 *   apare-ce en la frase, cuántas veces se repite. Se consideran iguales las letras
 *   mayúsculas y las minúsculas para realizar la cuenta. Un ejemplo sería:Frase:
 *   En un lugar de La Mancha.Resultado:a: 4 vecesc: 1 vezd: 1 veze: 2 vece
 *
 *  */

import java.util.*;
public class ActividadResuelta6_13Diferente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la frase
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Crear un mapa para almacenar las ocurrencias de cada letra
        Map<Character, Integer> contadorLetras = new HashMap<>();

        // Recorrer cada carácter de la frase
        for (char c : frase.toCharArray()) {
            // Convertir el carácter a minúscula para normalizar la comparación
            c = Character.toLowerCase(c);

            // Si el carácter es una letra del alfabeto
            if (Character.isLetter(c)) {
                // Obtener el valor actual del contador para la letra
                int contador = contadorLetras.getOrDefault(c, 0);

                // Incrementar el contador para la letra
                contadorLetras.put(c, contador + 1);
            }
        }

        // Mostrar el resultado
        System.out.println("Resultado:");
        for (Map.Entry<Character, Integer> entry : contadorLetras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " veces");
        }


    }
}
