
/*Implementa la función: int[] suma(int t[], int numElementos), que crea y devuel-ve una tabla con las sumas de los
numElementos elementos consecutivos de t. Veamos un ejemplo, sea t = [10, 1, 5, 8, 9, 2]. Si los elementos de t se
 agrupan de 3 en 3, se ha-rán las sumas:
 10 + 1 + 5. Igual a 16.
 1 + 5 + 8. Igual a 14.
 5 + 8 + 9. Igual a 22.
 8 + 9 + 2. Igual a 19.
 Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22, 19].*/

import java.util.*;
public class ActividadDeAplicacion5_17 {
    public static void main(String[] args) {


        int[] t = {10, 1, 5, 8, 9, 2};
        int numElementos = 3;
        int[] resultado = suma(t, numElementos);
       mostrar("Resultados de las sumas consecutivas: " + Arrays.toString(resultado));
    }

    public static int[] suma(int[] t, int numElementos) {
        // Calculamos la longitud de la tabla resultado
        int longitudResultado = t.length - numElementos + 1;
        // Creamos la tabla resultado
        int[] resultado = new int[longitudResultado];

        // Iteramos sobre la tabla t y realizamos las sumas consecutivas
        for (int i = 0; i < longitudResultado; i++) {
            int suma = 0;
            for (int j = i; j < i + numElementos; j++) {
                suma += t[j];
            }
            resultado[i] = suma;
        }
        return resultado;
    }

    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto);

    }
}