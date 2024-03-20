

import java.util.*;
public class ActividadResuelta6_5Diferente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /** Pedir al usuario
         *  que introduzca una cadena
         *  */
        System.out.print("\nIntroduce una cadena de caracteres: ");
        String cadena = sc.nextLine();

        // Invertir la cadena
        String cadenaInvertida = invertirCadena(cadena);

        /** Mostrar
         * la cadena invertida
         * */
        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }

    /**Función
     *  para invertir una cadena de caracteres
     *  */
    public static String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        return cadenaInvertida.toString();

    }
}
