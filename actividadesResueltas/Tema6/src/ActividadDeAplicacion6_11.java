/**
 * @param Enunciado:
 *Escribe un programa descodificador que muestre un texto codificado con el
 *  programa realizado en la Actividad resuelta 6.11 cual tiene este enunciado:
 *
 * Se dispone de la siguiente relación de letras:
 *  * conjunto 1:e i k m p q r s t u v
 *  * conjunto 2:p v i u m t e r k q s
 *  * Con ella es posible codificar un texto, convirtiendo cada letra del conjunto 1
 *  * en su correspondiente del conjunto 2. El resto de las letras no se modifican.
 *  * Los conjuntos se utili-zan tanto para codificar mayúsculas como minúsculas,
 *  * mostrando siempre la codificación en minúsculas.Un ejemplo: la palabra «PaquiTo>>
 *  * se codifica como «matqvko». Realizar un programa que codifique un texto.
 *  *Para ello implementar la siguiente función:
 *  * char codifica(char conjunto1[],char conjunto2[], char c)
 *  * que devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan.
 *  */
import java.util.*;
public class ActividadDeAplicacion6_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir los conjuntos 1 y 2
        char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        // Solicitar al usuario que ingrese el texto a codificar
        System.out.print("\n\tIngrese el texto a codificar: ");
        String textoOriginal = scanner.nextLine();

        // Codificar el texto e imprimir el resultado
        String textoCodificado = codificarTexto(conjunto1, conjunto2, textoOriginal);
        System.out.println("Texto codificado: " + textoCodificado);

        // Descodificar el texto codificado e imprimir el texto original
        String textoDescodificado = descodificarTexto(conjunto1, conjunto2, textoCodificado);
        System.out.println("Texto descodificado: " + textoDescodificado);
    }

    // Función para codificar un texto según los conjuntos 1 y 2
    public static String codificarTexto(char[] conjunto1, char[] conjunto2, String texto) {
        StringBuilder textoCodificado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            textoCodificado.append(codifica(conjunto1, conjunto2, Character.toLowerCase(c)));
        }
        return textoCodificado.toString();
    }

    // Función para codificar un carácter según los conjuntos 1 y 2
    public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
        int index = -1;
        for (int i = 0; i < conjunto1.length; i++) {
            if (conjunto1[i] == c) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            return conjunto2[index];
        }
        return c;
    }

    // Función para descodificar un texto según los conjuntos 1 y 2
    public static String descodificarTexto(char[] conjunto1, char[] conjunto2, String textoCodificado) {
        StringBuilder textoDescodificado = new StringBuilder();
        for (int i = 0; i < textoCodificado.length(); i++) {
            char c = textoCodificado.charAt(i);
            textoDescodificado.append(descodifica(conjunto1, conjunto2, c));
        }
        return textoDescodificado.toString();
    }

    // Función para descodificar un carácter según los conjuntos 1 y 2
    public static char descodifica(char[] conjunto1, char[] conjunto2, char c) {
        int index = -1;
        for (int i = 0; i < conjunto2.length; i++) {
            if (conjunto2[i] == c) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            return conjunto1[index];
        }
        return c;

    }
}
