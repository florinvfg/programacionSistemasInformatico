package ActividadResuelta7_11_Irina.Controler;

import ActividadResuelta7_11_Irina.Clases.Lista;

public class Main {
    public static void main(String[] args) {
        Lista numeros=new Lista();
        numeros.insertarPrincipio(50);
        numeros.insertarPrincipio(60);
        numeros.insertarUltimo(100);
        numeros.mostrarElementos();
        numeros.insertarPrincipio(40);
        numeros.mostrarElementos();
       Lista listado=new Lista();
        listado.insertarPrincipio(1);
        listado.insertarUltimo(2);
        listado.insertarUltimo(3);
        listado.insertarUltimo(4);
        listado.insertarUltimo(5);
        listado.insertarUltimo(6);
        listado.insertarUltimo(7);
        listado.isertarConIndice(4,10);
        listado.mostrarElementos();


    }
}
