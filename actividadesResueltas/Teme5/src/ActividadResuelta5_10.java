
/*Escribir la funcion:int[] eliminarMayores(int t[], int valor) que crea y devuelve una copia
* de la tabla t donde se han eliminado todos los elementos que son mayores que valor.*/

import java.util.*;
public class ActividadResuelta5_10 {
    public static void main(String[] args) {
           /*static int[] sinMayores ( int t[], int valor){
                int copia[] = Arrays.copyOf(t, t.length);
                int i = 0;
                while (i < copia.length) {//copiamos el ultimo en copia[i] y decrementamos la longitud
                    //de copia 1.Elimina el ultimo.
                    copia = Arrays.copyOf(copia, copia.length - 1);

                }else{
                i++;//copia [i] se queda en la tabla, coprobaremos copia[i+1}
            }
           }

            return copia;
*/
/**********************************/
        //otra manera de hacerla

// Creamos una tabla original con algunos números
        int[] tablaOriginal = {5, 8, 12, 3, 10};
        // Definimos un valor límite para filtrar la tabla
        int valor = 8;
        // Llamamos a la función eliminarMayores para obtener una nueva tabla filtrada
        int[] tablaFiltrada = eliminarMayores(tablaOriginal, valor);
        // Imprimimos la tabla original
        System.out.println("Tabla original: " + Arrays.toString(tablaOriginal));
        // Imprimimos el valor límite
        System.out.println("Valor límite: " + valor);
        // Imprimimos la tabla filtrada
        System.out.println("Tabla filtrada: " + Arrays.toString(tablaFiltrada));
    }
    // Definimos la función eliminarMayores que toma una tabla y un valor como parámetros
    public static int[] eliminarMayores(int[] t, int valor) {
        int cantidadMenores = 0; // Contador para el tamaño de la nueva tabla
        // Contamos cuántos elementos son menores o iguales a valor
        for (int num : t) {
            if (num <= valor) {
                cantidadMenores++;// Incrementamos el contador si encontramos un elemento menor o igual al valor límite
            }
        }
        // Creamos una nueva tabla con el tamaño adecuado
        int[] nuevaTabla = new int[cantidadMenores];
        int index = 0;// Inicializamos un índice para la nueva tabla
        // Copiamos los elementos menores o iguales a valor a la nueva tabla
        for (int num : t) {
            if (num <= valor) {
                nuevaTabla[index] = num;// Asignamos el elemento a la nueva tabla
                index++;// Incrementamos el índice para la nueva tabla
            }
        }
        return nuevaTabla; // Devolvemos la nueva tabla filtrada

        }
    }



