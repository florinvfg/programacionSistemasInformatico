/*Definir una funcion que tome como parametros dos tablas,la primera con los 6 numeros
* de una apuesta de la primitiva,y la segunda (ordenada)con los 6 numeros de la combinacion ganadora.
* La funcion devuelvera el numero de aciertos*/
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]

import java.util.*;
public class ActividadResuelta5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Para la apuesta, indica 6 números:");
        int[] apuesta = new int[6]; // Inicializar la tabla con 6 elementos
        for (int i = 0; i < 6; i++) {
            apuesta[i] = sc.nextInt(); // Leer cada número de la apuesta
        }

        int[] combinacionGanadora = {5, 10, 15, 20, 25, 30}; // Tabla con los números de la combinación ganadora

        int aciertos = contarAciertos(apuesta, combinacionGanadora);
        System.out.println("Números de aciertados -> " + aciertos);
        System.out.println("La combinacion ganadora es -> 5,15,10,20,25,30");
        sc.close(); // Cerrar el Scanner al finalizar
    }

    public static int contarAciertos(int[] apuesta, int[] combinacionGanadora) {
        int aciertos = 0;
        for (int numeroApuesta : apuesta) {
            if (Arrays.binarySearch(combinacionGanadora, numeroApuesta) >= 0) {
                aciertos++;
            }
        }
        return aciertos;
        }
    }

/* public static int[] generarCombinacionGanadora() {
        Random rand = new Random();
        int[] combinacionGanadora = new int[6];
        for (int i = 0; i < 6; i++) {
            // Generar un número aleatorio entre 1 y 49 (ambos inclusive)
            combinacionGanadora[i] = rand.nextInt(49) + 1;
        }
        return combinacionGanadora;*/





