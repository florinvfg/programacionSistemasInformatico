/*Escribe la funcion:int buscar(int t[], int clave),que busca de forma secuencial en la tabla
* t el valor clave.En caso de encontrarlo,devuelve en que posicion lo encuentra:y el caso
* contrario,devolvera -1*/


import java.util.Scanner;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]

public class ActividadPropueste5_4 {

        public static void main(String[] args) {
           /* Scanner sc = new Scanner(System.in);
            int[] tabla = {5, 10, 15, 20, 25, 30}; // Tabla de ejemplo
            System.out.println("Elige un numero de los siguietes numeros -> 5,10,15,20,25,30");
            int clave = sc.nextInt(); // Valor clave a buscar

            int posicion = buscar(tabla, clave);

            if (posicion != -1) {
                System.out.println("\nEl valor " + clave + " se encuentra en la posición " + posicion + " de la tabla.");
            } else {
                System.out.println("El valor " + clave + " no se encuentra en la tabla.");
            }
        }

        public static int buscar(int t[], int clave) {
            for (int i = 0; i < t.length; i++) {
                if (t[i] == clave) {
                    return i; // Devuelve la posición si se encuentra la clave
                }
            }
            return -1; // Devuelve -1 si no se encuentra la clave*/


            //otra manera de hacer


            int[] numerros = {5, 3, 7, 977, 3, 6, 8, 1, 4, 90, 44};
            System.out.println("Longitud de la tabla-> " + numerros.length);
            int indice = 0;
            int numeroBuscado = 977;
            while (indice < numerros.length && numerros[indice] != numeroBuscado) {
                indice++;
            }
            System.out.println("La posicion del numero buscado es -> " + indice);





        }
    }





