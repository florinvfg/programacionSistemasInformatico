package ActividadResuelta9_2.Clases;

import java.util.Arrays;

public class Lista implements InterfaceCola{

    public static int length;
    Integer[] tabla;

    public Lista() {
        tabla = new Integer[0];

    }

    void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length; // tamaño inicial tabla
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    /*
     * El primer parametro es el indice del lugar donde queremos insertar el valor
     * del segundo parametro
     */
    void insertar(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;

    }
    /* Se elimina el elemento ccorrespondiente a indice y se devuelve */

    Integer eliminar(int indice) {
        Integer eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length - 1; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;

    }

    /*
     * Al siguente metodo le pasaremos un indice y nos devuelvera el elemento
     * correspondiente de la tabla sin modificarla.En el caso de que el programa
     * aborte
     */

    int buscar(Integer claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {

            if (tabla[i].equals(claveBusqueda)) { // no vale tabla[i]==claveBusqueda
                indice = i;
            }
        }
        return indice;
    }

    /* El numero de elementos de la lista es el numero de elementos de la tabla */

    public int numeroElementos() {
        return tabla.length;
    }

    public void mostrar() {
        System.out.println("Lista: " + Arrays.toString(tabla));

    }

    public void encolar(Integer n) {
        insertarFinal(n); // encola al final de la lista
    }

    public Integer desencolar() {
        return eliminar(0); // desencola del principio

    }
}
