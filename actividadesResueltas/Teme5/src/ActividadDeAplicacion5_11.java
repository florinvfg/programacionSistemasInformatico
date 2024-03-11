
/*Realiza la función: int[] buscarTodos(int t[], int clave), que crea y devuelve
 una tabla con todos los índices de los elementos donde se encuentra la clave de búsqueda.
  En el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía*/

import java.util.*;
public class ActividadDeAplicacion5_11 {
    static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
int tabla[]=crearTabla();
int resultado[]=buscarIndice(tabla);
mostrarSinLn("el resultado es:");
mostrarSinLn((Arrays.toString(resultado)));

    }

    public static  int[] crearTabla() {
        mostrarSinLn("Indique el numero de elementos a insertar ->");
        int longitud = sn.nextInt();
        int tabla[] = new int[longitud];
        for (int i = 0; i < tabla.length; i++) {
            mostrarSinLn("Indique el elemento " + (i + 1) + "->");
            tabla[i] = sn.nextInt();

        }
        return tabla;
    }

    //metodo que busca en la tabla de valor que solicita y guarda el resultado en otra tabla
    public static int[] buscarIndice(int tabla[]) {
        int aux[] = new int[0];
        mostrarSinLn("Indique el numero a buscar");
        int buscar = sn.nextInt();
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == buscar) {
              //aumento una posicion al array aux
                aux = Arrays.copyOf(aux, aux.length + 1);
               //inserto el elemento encontrado
                aux[aux.length-1]=tabla[i];
            }

        }
        return aux;
    }




    /***************************/
    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto);




        //otra manera


       /* int[] tabla = {5, 3, 7, 2, 8, 5, 6, 9, 5};
        int clave = 5;
        int[] indices = buscarTodos(tabla, clave);
        System.out.println("Clave: " + clave);
        System.out.println("Índices donde se encuentra la clave: " + Arrays.toString(indices));
    }

    public static int[] buscarTodos(int[] t, int clave) {
        List<Integer> indiceList = new ArrayList<>();
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                indiceList.add(i);
            }
        }
        // Convertir la lista de índices a un array de enteros
        int[] indices = new int[indiceList.size()];
        for (int i = 0; i < indiceList.size(); i++) {
            indices[i] = indiceList.get(i);
        }
        return indices;*/
    }

}
