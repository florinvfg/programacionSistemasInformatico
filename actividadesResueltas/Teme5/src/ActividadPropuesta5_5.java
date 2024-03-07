
/*Escribe en una funcion el comportamiento de la insercion ordenada*/
import java.util.*;
public class ActividadPropuesta5_5 {
    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 10}; // Array de ejemplo ordenado
        int nuevoElemento = 5; // Nuevo elemento a insertar

        System.out.println("Array original: " + Arrays.toString(array));
        array = insertarOrdenado(array, nuevoElemento);
        System.out.println("Array después de la inserción ordenada: " + Arrays.toString(array));
    }

    // Función para insertar un nuevo elemento en un array ordenado
    public static int[] insertarOrdenado(int[] array, int nuevoElemento) {
        int[] nuevoArray = Arrays.copyOf(array, array.length + 1); // Creamos un nuevo array con espacio adicional

        int i = nuevoArray.length - 2; // Índice del último elemento antes del nuevo espacio
        while (i >= 0 && nuevoArray[i] > nuevoElemento) {
            nuevoArray[i + 1] = nuevoArray[i]; // Desplazamos los elementos mayores que el nuevo elemento hacia la derecha
            i--;
        }

        nuevoArray[i + 1] = nuevoElemento; // Insertamos el nuevo elemento en la posición correcta
        return nuevoArray; // Devolvemos el nuevo array con el elemento insertado
    }


    }

