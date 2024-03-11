
/*Realiza la función: int[] buscarTodos(int t[], int clave), que crea y devuelve
 una tabla con todos los índices de los elementos donde se encuentra la clave de búsqueda.
  En el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía*/

import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class ActividadDeAplicacion5_11 {
    // Creamos un objeto Scanner como variable de clase para ser utilizado en los métodos
    static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        // Solicitamos al usuario que cree una tabla de elementos
int tabla[]=crearTabla();
// Llamamos al método buscarIndice para encontrar el valor solicitado en la tabla
int resultado[]=buscarIndice(tabla);
        // Mostramos el resultado encontrado
mostrarSinLn("el resultado es:");
mostrarSinLn((Arrays.toString(resultado)));

    }

    // Método para crear una tabla de elementos
    public static  int[] crearTabla() {
        mostrarSinLn("Indique el numero de elementos a insertar ->");
        // Leemos la longitud de la tabla ingresada por el usuario
        int longitud = sn.nextInt();
        // Creamos una tabla de enteros con la longitud proporcionada
        int tabla[] = new int[longitud];
        // Solicitamos al usuario que ingrese los elementos de la tabla
        for (int i = 0; i < tabla.length; i++) {
            mostrarSinLn("Indique el elemento " + (i + 1) + "->");
            tabla[i] = sn.nextInt();

        }
        return tabla;// Devolvemos la tabla creada
    }

    //metodo que busca en la tabla de valor que solicita y guarda el resultado en otra tabla
    public static int[] buscarIndice(int tabla[]) {
        int aux[] = new int[0]; // Creamos una tabla auxiliar para almacenar los resultados
        mostrarSinLn("Indique el numero a buscar");
        int buscar = sn.nextInt(); // Leemos el número a buscar ingresado por el usuario
        // Recorremos la tabla en busca del número
        for (int i = 0; i < tabla.length; i++) {
            // Si encontramos el número en la tabla
            if (tabla[i] == buscar) {
                // Aumentamos el tamaño de la tabla auxiliar en una posición
                aux = Arrays.copyOf(aux, aux.length + 1);
                // Insertamos el elemento encontrado en la última posición de la tabla auxiliar
                aux[aux.length-1]=tabla[i];
            }

        }
        return aux;// Devolvemos la tabla auxiliar con los resultados
    }




    // Método para mostrar un mensaje sin saltar línea
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
