/**
 * @param Enunciado
 * Diseñar una aplicación que pida al usuario que introduzca una frase
 * por teclado e indique cuántos espacios en blanco tien
 *
 * @param [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * 
 * */

import java.util.*;
public class ActividadResuelta6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int numEspaciosBlanco = 0;
        /**
         * contador del número de espacios en blanco
         * */
        char c;
       mostrar("\nEscriba una frase: ");
        frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {//recorremos del índice 0 a longitud -1
            c = frase.charAt(i); //vemos cual es el i-ésimo carácter
            if (Character.isSpaceChar(c)) { //es equivalente a: c == ''
                /**
                 * incrementamos
                 * */
                numEspaciosBlanco++;
            }
        }
        mostrar("Tiene -> " + numEspaciosBlanco + " espacio en blanco");


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

    public static void mostrarSinLn (String texto){
        System.out.print("\t" + texto);
    }

}
