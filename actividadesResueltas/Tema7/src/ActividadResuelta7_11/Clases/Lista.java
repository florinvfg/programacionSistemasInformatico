package ActividadResuelta7_11.Clases;

import java.util.Arrays;

/**
 * Las listas
 * son estructuras dinámicas de datos donde se pueden insertar o eliminar ele-mentos
 * de un determinado tipo sin limitación de espacio.Implementar la clase Lista correspondiente
 * a una lista de números de la clase Integer. Los números se guardarán en una tabla que se
 * redimensionará con las inserciones y eli-minaciones, aumentando o disminuyendo la capacidad
 * de la lista según el caso.Entre los métodos de la clase, se incluirán las siguientes tareas:
 * Un constructor que inicialice la tabla con un tamaño 0.
 * Obtener el número de elementos insertados en la lista.
 * Insertar un número al final de la lista.
 * Insertar un número al principio de la lista.
 * Insertar un número en un lugar de la lista cuyo índice, que es el de la tabla, se pasa como parámetro.
 * Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
 * Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
 * Obtener el elemento cuyo índice se pasa como parámetro.  Buscar un número en la lista,
 * devolviendo el índice del primer lugar donde se encuen-tre. Si no está, devolverá −1.
 * Mostrar los elementos de la lista por consola.
 * */

public class Lista {
    /**
     * Implementamos las listas con tablas de tipo Integer, que iremos
     * redimensionando según vaya haciendo falta. El índice de un elemento en la
     * lista coincide con el índice del lugar que ocupa en la tabla.
     **/
    Integer[] tabla;

    public Lista() {
        tabla = new Integer[0];

    }

    public void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    public void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    public void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length;//tamaño inicial tabla
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    //El primer parámetro es el índice del lugar donde queremos insertar  el valor del segundo parámetro
    public void insertar(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }   //Se elimina el elemento correspondiente a indice y se devuelve

    public Integer eliminar(int indice) {
        Integer eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    /* Al siguiente método le pasaremos un índice y nos devolverá el elemento
      correspondiente de la tabla sin modificarla. En el caso de que el índice no
           sea válido, devolverá null, con lo cual evitamos que el programa aborte.
            */
    Integer get(int indice) {
        Integer resultado = null;
        if (indice >= 0 && indice < tabla.length) {//índice válido
            resultado = tabla[indice];
        }
        return resultado;
    }

    public int buscar(Integer claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) {//no vale tabla[i]==claveBusqueda
                indice = i;
            }
        }
        return indice;
    }
    //El número de elementos de la lista es el número de elementos de la tabla
    public int numeroElementos() {
        return tabla.length;
    }
    //Muestra por consola el contenido de la lista
    public void mostrar() {
        System.out.println("Lista: " + Arrays.toString(tabla));
    }


}