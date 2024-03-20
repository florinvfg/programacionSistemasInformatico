/**
 * @param Enunciado:
 *Se dispone de la siguiente relación de letras:
 * conjunto 1:e i k m p q r s t u v
 * conjunto 2:p v i u m t e r k q s
 * Con ella es posible codificar un texto, convirtiendo cada letra del conjunto 1
 * en su correspondiente del conjunto 2. El resto de las letras no se modifican.
 * Los conjuntos se utili-zan tanto para codificar mayúsculas como minúsculas,
 * mostrando siempre la codificación en minúsculas.Un ejemplo: la palabra «PaquiTo>>
 * se codifica como «matqvko». Realizar un programa que codifique un texto.
 *Para ello implementar la siguiente función:
 * char codifica(char conjunto1[],char conjunto2[], char c)
 * que devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan.
 *  */
import java.util.*;
public class ActividadResuelta6_11 {
    /**
     * En primer lugar vamos a convertir el texto introducido a minúsculas,
     * para que los  alfabetos conjunto 1 y 2 sirvan para las letras mayúsculas y minúsculas.
     * El procedimiento a seguir será recorrer y codificar el texto introducido,
     * carácter a carácter. La codificación se almacenará en una tabla, que nos
     * permite asignar valores (caracteres) a cada uno de sus elementos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char codificado[]; //tabla que contendrá la codificación del texto introducido
          String texto;
          mostrar("\nIntroduzca un texto a codificar: ");
          texto = sc.nextLine();
        /**
         * convertimos el texto a minúscula, para poder
         * codificar las mayúsculas y las minúsculas
         * con el mismo conjunto.
         * */
          texto = texto.toLowerCase();

        codificado = new char[texto.length()];//creamos una tabla de igual tamaño que texto
        /**
         * recorremos el texto a codificar
         codificamos el i-ésimo carácter del texto
         */
        for (int i = 0; i < texto.length(); i++) {
            codificado[i] = codifica(conjunto1, conjunto2, texto.charAt(i));

        }
        texto = String.valueOf(codificado); //convertimos la tabla con la codificación en una cadena
           mostrar("El texto codificado es -> " +(texto));

    }
    /**
     *Esta función codifica el carácter c según los alfabetos conjunto 1 y 2.
     * Buscamos el carácter c en conjunto1. Si se encuentra en la posición pos,
     * se devuelve el carácter equivalente en el segundo conjunto: conjunto2[pos].
     * En caso de no encontrar c en conjunto 1 se devuelve c sin codificar
     * */

    static char codifica(char conjunto1[], char conjunto2[], char c) {
        final String conj1 = String.valueOf(conjunto1); //conj1 es un String con los elementos de
        // la tabla conjunto1. Facilita la búsqueda.
        char codificado; //carácter codificado correspondiente a c
        /**
         *  buscamos c en el conjunto 1.
         *  Al ser conj1 una  cadena.
         *  indexOf()
          busca por nosotros. En otro caso, tendríamos que  buscar mediante un bucle un elemento en una tabla
         */
         int pos = conj1.indexOf(c);
        if (pos == -1) {
            //si no hemos encontrado c en conj1
            codificado = c; //no podemos codificar, devolveremos c
        }else {
            codificado = conjunto2[pos]; //pos marca la posición de c en conjunto1 entonces elegimos el correspondiente en conjunto2
            }
        return codificado;
    }
/**
 *[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 *  */
        public static void mostrar (String texto){
            System.out.println("\t" + texto);
        }

        public static void mostrarSinLn (String texto){
            System.out.print("\t" + texto);
        }
    }


