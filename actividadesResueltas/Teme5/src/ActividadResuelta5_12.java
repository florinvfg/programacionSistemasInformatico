
/*Crea una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma:
* el elemento de la posicion[n][m] debe contener el valor 10xn+m.Despues se debe mostrar su contenido*/

import java.util.*;

public class ActividadResuelta5_12 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(operacion()));

    }

    public static int[][] operacion() {
        int num[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = 10 * i + j;

            }
        }
       mostrarTabla(num);
        return num;
    }

    //forma de recorrer un Array bidimensional con un forach
    public static void mostrarTabla(int[][] num) {


        for (int []fila : num) {
            for (int col : fila) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}

