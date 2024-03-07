/*El <<Numero de suerte>> de una persona puede calcularse a partir de sus numeros favoritos.
* De entre estos, se seleccionan dos diferente al azar,que se eliminaran de la lista, pero
* en su lugar se añade la media aritmetica de los dos eliminados a la lista de numeros favoritos
* El proceso se repite hasta que solo se queda un numero,que resultara el numero de la suerte
* para esa persona.Para calcular bien el numero de la suerte es imprescindible que la lista de
* numeros se encuentre siempre ordenada.
* Escribe una aplicacion que solicite al usuario sus numeros favoritos y calcula su numero de la suerte*/
import java.util.*;
public class ActividadPropuesta5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario sus números favoritos y almacenarlos en un array
        int[] numerosFavoritos = solicitarNumerosFavoritos(scanner);

        // Ordenar el array de números favoritos
        Arrays.sort(numerosFavoritos);

        // Calcular el número de la suerte
        int numeroSuerte = calcularNumeroSuerte(numerosFavoritos);

        // Imprimir el número de la suerte
        System.out.println("Tu número de la suerte es: " + numeroSuerte);

        scanner.close();
    }

    // Función para solicitar al usuario sus números favoritos y almacenarlos en un array
    private static int[] solicitarNumerosFavoritos(Scanner scanner) {
        System.out.println("Introduce tus números favoritos (introduce -1 para finalizar):");
        int[] numerosFavoritos = new int[10]; // Capacidad inicial para 10 números favoritos
        int num;
        int index = 0;
        while ((num = scanner.nextInt()) != -1) {
            if (index == numerosFavoritos.length) {
                numerosFavoritos = Arrays.copyOf(numerosFavoritos, index * 2); // Duplicar la capacidad si es necesario
            }
            numerosFavoritos[index++] = num;
        }
        return Arrays.copyOf(numerosFavoritos, index); // Devolver un array del tamaño correcto
    }

    // Función para calcular el número de la suerte
    private static int calcularNumeroSuerte(int[] numerosFavoritos) {
        Random random = new Random();/*Random es una clase en Java que se utiliza para generar números pseudoaleatorios.
        Cuando creas una instancia de Random, puedes usar sus métodos para generar diferentes tipos de valores
        aleatorios, como enteros, números en coma flotante, booleanos, entre otros.*/

        while (numerosFavoritos.length > 1) {
            // Seleccionar dos números diferentes al azar de la lista
            int indice1 = random.nextInt(numerosFavoritos.length);
            int indice2;
            do {
                indice2 = random.nextInt(numerosFavoritos.length);
            } while (indice2 == indice1);

            // Calcular la media aritmética de los dos números seleccionados
            int num1 = numerosFavoritos[indice1];
            int num2 = numerosFavoritos[indice2];
            int media = (num1 + num2) / 2;

            // Eliminar los dos números seleccionados del array
            int[] nuevoArray = new int[numerosFavoritos.length - 2];
            int index = 0;
            for (int i = 0; i < numerosFavoritos.length; i++) {
                if (i != indice1 && i != indice2) {
                    nuevoArray[index++] = numerosFavoritos[i];
                }
            }
            numerosFavoritos = nuevoArray;

            // Insertar la media aritmética en el array
            numerosFavoritos = insertarOrdenado(numerosFavoritos, media);
        }
        return numerosFavoritos[0];
    }

    // Función para insertar un elemento en un array ordenado
    private static int[] insertarOrdenado(int[] array, int elemento) {
        int indice = Arrays.binarySearch(array, elemento);
        if (indice < 0) {
            indice = -indice - 1;
        }
        int[] nuevoArray = new int[array.length + 1];
        System.arraycopy(array, 0, nuevoArray, 0, indice);
        nuevoArray[indice] = elemento;
        System.arraycopy(array, indice, nuevoArray, indice + 1, array.length - indice);
        return nuevoArray;
    }
}
