/*Implementar la funcion:int[] sinRepetidos(int t[]),que construye y devuelve una
* tabla de la longitud apropiada,con los elementos de t,donde se han eliminado los
* datos repetidos*/
import java.util.*;
public class ActividadResuelta5_7 {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 2, 5, 6, 1, 3, 7}; // Tabla con elementos repetidos

        int[] sinRepetidos = sinRepetidos(t);
        System.out.println("Tabla sin elementos repetidos: " + Arrays.toString(sinRepetidos));
    }

    public static int[] sinRepetidos(int t[]) {
        // Convertir el array en una lista para facilitar la eliminación de elementos repetidos
        List<Integer> lista = new ArrayList<>();
        for (int elemento : t) {
            if (!lista.contains(elemento)) {
                lista.add(elemento);
            }
        }

        // Convertir la lista resultante en un array
        int[] resultado = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            resultado[i] = lista.get(i);
        }

        return resultado;

        /*Vamos a crear una tabla con longitud inicial de 0,a la que llamaremos
        * tempora1.Recorremos la tabla t comprobando que sus elementos no se
        * encuntra en la tabla tempora1 (aprovecharemos el metodo buscar() creado
        * en la actividad propuesta 5.1).Si el elemento no esta en tempora1,lo insertaremos*/
/*static int[] sinRepetidos(int[] t){
    int tempora1[]=new int[0];//creamos con longitud 0

            for (int elemento : t){
                if (buscar(tempora1, elemento) == -1){
                    //algoritmo de insercion
                    tempora1=Arrays.copyOf(tempora1, tempora1.length +1);
                    tempora1[tempora1.length -1] = elemento;
                }
            }
        }*/
    }
}





