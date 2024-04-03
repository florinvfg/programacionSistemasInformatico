package ActividadResuelta7_12_Irina.Controler;

import ActividadResuelta7_12_Irina.Clases.Lista;

/**
 * Añadir a la clase Lista el método estático: Lista concatena(Lista l1, Lista l2)
 * que construye y devuelve una lista que contiene, en el mismo orden, una copia
 * de todos los elementos de l1 y l2.
 * */
public class Main {
    public static void main(String[] args) {
//prueba del método estático concatena() de Lista
        Lista l1=new Lista();
        l1.insertarUltimo(4);l1.insertarUltimo(6);l1.insertarUltimo(10);
        l1.insertarUltimo(45);l1.insertarUltimo(74);l1.insertarUltimo(11);

        Lista l2=new Lista();
        l2.insertarUltimo(45);l1.insertarUltimo(25);l1.insertarUltimo(18);
        l2.insertarUltimo(14);l1.insertarUltimo(16);l1.insertarUltimo(19);

    //creamos una tercera lista
        Lista concatenada=new Lista();
        concatenada=concatenada.concatenarLista(l1,l2);
        concatenada.mostrarElementos();


    }
}
