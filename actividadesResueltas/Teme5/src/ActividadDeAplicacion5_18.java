/*Escribe un programa que solicite los elementos de una matriz de tamaño
4x4. La aplica-ción debe decidir si la matriz introducida corresponde a una
 matriz mágica, que es aquella donde la suma de los elementos de cualquier
 fila o de cualquier columna valen lo mismo.*/
import java.util.*;
public class ActividadDeAplicacion5_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los elementos de la matriz al usuario
        int[][] matriz = new int[4][4];
                mostrar("Introduce los elementos de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mostrar("Elemento en la fila " + (i + 1) + " columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificar si es una matriz mágica
        boolean esMagica = esMatrizMagica(matriz);

        // Mostrar el resultado
        if (esMagica) {
            mostrar("La matriz introducida es una matriz mágica.");
        } else {
            mostrar("La matriz introducida no es una matriz mágica.");
        }

        scanner.close();
    }

    public static boolean esMatrizMagica(int[][] matriz) {
        // Calcular la suma de la primera fila para comparar
        int sumaFila = 0;
        for (int j = 0; j < 4; j++) {
            sumaFila += matriz[0][j];
        }

        // Verificar si la suma de todas las filas es igual a la suma de la primera fila
        for (int i = 1; i < 4; i++) {
            int sumaFilaActual = 0;
            for (int j = 0; j < 4; j++) {
                sumaFilaActual += matriz[i][j];
            }
            if (sumaFilaActual != sumaFila) {
                return false;
            }
        }

        // Verificar si la suma de todas las columnas es igual a la suma de la primera fila
        for (int j = 0; j < 4; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaFila) {
                return false;
            }
        }

        return true;
    }

    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto);
    }
}