/**
 * Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es de-cir, que la frase sea igual
 * leyendo de izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los espacios. Un ejemplo de frase
 * palíndroma es: «Dábale arroz a la zo-rra el abad».Las vocales con tilde hacen que los algoritmos consideren una
 * frase palíndroma como si no lo fuese. Por esto, supondremos que el usuario introduce la frase sin tildes.
 * */
import java.util.*;
public class ActividadResuelta6_10 {
   /**
    * La frase "Dabale arroz a la zorra el abad"
    * es palíndroma si no tenemos encuentra* los
    * espacios en blanco. Por lo tanto, lo primero
    * que tenemos que hacer, es eliminarlos.
    * A continuación, vamos a construir la frase invertida.
    * Si ambas, original e invertida, coinciden es porque
    * la frase original es palíndroma.
    * Nota:
    * escribiremos las frases sin vocales acentuadas. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, sinEspacios, invertida;
        mostrar("Introduzca una frase:");
        frase = sc.nextLine();
        frase = frase.toLowerCase();//trabajamos con letras en minusculas
        sinEspacios = eliminaEspacios(frase);//devuelve una cadena sin espacios
        invertida = alRevers(sinEspacios);
        if (sinEspacios.equals(invertida)) {
            mostrar("La frase es palindroma");
        } else {
            mostrar("La frase no es palindroma");
        }
    }
/** La función construye y devuelve una cadena idéntica
 *  a la pasada, con la diferencia que se han eliminado
 *  todos los espacios en blanco
 *  */
    static String eliminaEspacios(String cadena) {
        String sin = "";
        for (int i = 0; i < cadena.length(); i++) {
            /**
             * miramos el caracter en la i-esima posicion
             * */
            char c = cadena.charAt(i);
            if (!Character.isWhitespace(c)) {
                /**
                 * construimos la cadena sin con c
                 * (que no es un blanco
                 * */
                sin = sin + c;
            }
        }
        return sin;

    }

    static String alRevers(String original) {
        String nueva = "";
        for (int i = 0; i < original.length(); i++) {
            nueva = original.charAt(i) + nueva;
        }
        return nueva;
    }

    /**
     * Metodos de salida de mensaje en consola con interlineado
     *
     * @param texto
     */

    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    /**
     * Metodos de salida de mensaje en consola Sin interlineado
     *
     * @param texto
     */

    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto);

    }
}