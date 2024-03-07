/*Crea una funcion que realice el borrado de un elemento de una tabla ordenada*/
import java.util.*;
public class ActividadPropuesta5_6 {
    public static void main(String[] args) {
        int[] tabla = {3, 5, 8, 10, 12}; // Tabla ordenada de ejemplo
        int elementoBorrar = 8; // Elemento a borrar

        // Mostramos la tabla original
        System.out.println("Tabla original: " + Arrays.toString(tabla));

        // Realizamos el borrado del elemento y mostramos la tabla actualizada
        tabla = eliminarElemento(tabla, elementoBorrar);
        System.out.println("Tabla después de borrar el elemento " + elementoBorrar + ": " + Arrays.toString(tabla));
    }

    // Función para eliminar un elemento de una tabla ordenada
    public static int[] eliminarElemento(int[] tabla, int elemento) {
        int indice = Arrays.binarySearch(tabla, elemento); // Buscamos el índice del elemento a borrar
        if (indice >= 0) { // Si el elemento existe en la tabla
            // Creamos una nueva tabla con un tamaño menor
            int[] nuevaTabla = new int[tabla.length - 1];
            // Copiamos los elementos anteriores al elemento a borrar
            System.arraycopy(tabla, 0, nuevaTabla, 0, indice);
            // Copiamos los elementos posteriores al elemento a borrar
            System.arraycopy(tabla, indice + 1, nuevaTabla, indice, tabla.length - indice - 1);
            return nuevaTabla; // Devolvemos la nueva tabla sin el elemento borrado
        } else {
            // Si el elemento no existe, devolvemos la tabla original sin cambios
            return tabla;
        }
    }


    }

