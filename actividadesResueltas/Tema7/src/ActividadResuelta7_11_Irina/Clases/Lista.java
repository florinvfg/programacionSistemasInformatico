package ActividadResuelta7_11_Irina.Clases;

import java.util.Arrays;

public class Lista {
    Integer[]elemento;
    public Lista(){
        elemento=new Integer[0];
    }
    //insertar al principio de la lista..crecer en 1 el array
    public void insertarPrincipio(Integer nuevo){
        //aumentar la tabla
        elemento= Arrays.copyOf(elemento,elemento.length+1);
        System.arraycopy(elemento,0,elemento,1,elemento.length-1);
        //insertar elemento
        elemento[0]=nuevo;
    }
    //insertar en el ultimo sitio de la tabla
    public void insertarUltimo(Integer nuevo){
        elemento=Arrays.copyOf(elemento,elemento.length+1);
        elemento[elemento.length-1]=nuevo;

    }
    //obtener el numero de elementos insertados
    public void mostrarElementos(){
        System.out.println("Numero de elemntos-> " +elemento.length);
        System.out.println("Todos los elementos-> " +Arrays.deepToString(elemento));

    }
    //isertar un elemento pero nos indican el indice donde insertarlo
    public void isertarConIndice(int indice,Integer nuevo){
        elemento=Arrays.copyOf(elemento,elemento.length+1);
        System.arraycopy(elemento,indice,elemento,indice+1,elemento.length-indice-1);
       //[1,2,3,4,5,6,7]->4,10->[1,2,3,4,5] 10 [6,7]
        elemento[indice]=nuevo;

    }

}
