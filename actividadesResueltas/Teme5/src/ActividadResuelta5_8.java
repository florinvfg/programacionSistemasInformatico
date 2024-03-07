/*Leer y almacenar n numeros enteros en una tabla, a partir de la que se constuiran otras dos tablas con los
* elementos con valores pares e impares de la primera, respectivamente.las tablaspares e impares deben
* mostrarse ordenadas.*/

import java.util.*;

//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class ActividadResuelta5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de elementos para la tabla:");
        int n = sc.nextInt();// Lee el número de elementos para la tabla desde el teclado
        int[] numeros = new int[n];// Crea una tabla para almacenar los números ingresados
        System.out.println("Ingrese los " + n + " números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int[] pares = obtenerPares(numeros);
        int[] impares = obtenerImpares(numeros);

        Arrays.sort(pares);
        Arrays.sort(impares);

        System.out.println("Elementos pares:");
        mostrarArray(pares);
        System.out.println("Elementos impares:");
        mostrarArray(impares);// Llama a la función para mostrar la tabla de números impares
    }

    public static int[] obtenerPares(int[] numeros) {
        List<Integer> paresList = new ArrayList<>();// Crea una lista para almacenar los números impares
        for (int numero : numeros) { // Recorre la tabla de números ingresados
            if (numero % 2 == 0) {// Verifica si el número es impar
                paresList.add(numero);// Agrega el número impar a la lista de números impares
            }
            }

        return paresList.stream().mapToInt(Integer::intValue).toArray(); // Convierte la lista en una tabla de números pares y la devuelve
    }

    public static int[] obtenerImpares(int[] numeros) {// Crea una lista para almacenar los números impares
        List<Integer> imparesList = new ArrayList<>();
        for (int numero : numeros) {// Recorre la tabla de números ingresados
            if (numero % 2 != 0) { // Verifica si el número es impar
                imparesList.add(numero);// Agrega el número impar a la lista de números impares
            }
        }
        return imparesList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void mostrarArray(int[] arr) {
        for (int num : arr) {// Recorre la tabla de números
            System.out.print(num + " "); // Imprime cada número seguido de un espacio en blanco
        }
        System.out.println(); // Imprime una nueva línea al final de la tabla







    }
}
