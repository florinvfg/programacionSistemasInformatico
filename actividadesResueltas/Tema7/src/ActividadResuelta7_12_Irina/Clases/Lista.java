package ActividadResuelta7_12_Irina.Clases;

import java.util.Arrays;

public class Lista {
    Integer[] elemento;

    public Lista() {
        elemento = new Integer[0];
    }


    //insertar al principio de la lista..crecer en 1 el array

    /**
     * @param nuevo
     */
    public void insertarPrincipio(Integer nuevo) {
        //aumentar la tabla
        elemento = Arrays.copyOf(elemento, elemento.length + 1);
        System.arraycopy(elemento, 0, elemento, 1, elemento.length - 1);
        //insertar elemento
        elemento[0] = nuevo;
    }
    //insertar en el ultimo sitio de la tabla

    /**
     * @param nuevo
     */
    public void insertarUltimo(Integer nuevo) {
        elemento = Arrays.copyOf(elemento, elemento.length + 1);
        elemento[elemento.length - 1] = nuevo;

    }
    //obtener el numero de elementos insertados

    public void mostrarElementos() {
        System.out.println("Numero de elemntos-> " + elemento.length);
        System.out.println("Todos los elementos-> " + Arrays.deepToString(elemento));

    }
    //isertar un elemento pero nos indican el indice donde insertarlo

    /**
     * @param indice
     * @param nuevo
     */
    public void isertarConIndice(int indice, Integer nuevo) {
       //validamos que el indice pasado por parametro es menor que la lonjitud del array
        if (elemento.length > indice) {
            elemento = Arrays.copyOf(elemento, elemento.length + 1);
            System.arraycopy(elemento, indice, elemento, indice + 1, elemento.length - indice - 1);
            //[1,2,3,4,5,6,7]->4,10->[1,2,3,4,5] 10 [6,7]
            elemento[indice] = nuevo;

        } else {
            System.err.println("El indice indicado esta fuera de rango ! ");
        }

    }
    //inseertar otra lista dentro de la lista original

    /**
     *
     * @param nuevaLista
     */
    public void  insertarLista(Lista nuevaLista){
        //1.la longitud de la lista original
    int logOriginal=elemento.length;
    //2.hacer hueco
    elemento=Arrays.copyOf(elemento,elemento.length+nuevaLista.elemento.length);
   
    //nueva lista tiene 5 elementos
    //3.copiar la lista
    System.arraycopy(nuevaLista.elemento,0,elemento,logOriginal,nuevaLista.elemento.length);
    System.out.println(Arrays.toString(elemento));



   }

    /**
     *
     * @param indice
     */
   public void eliminarNum(int indice){
        if (elemento.length>indice && indice>=0){
            Integer numEliminar=null;//el dato tipo Wrapper se declara null

            numEliminar=elemento[indice];//eje:100 ->indice=2

            for (int i = indice+1; i <elemento.length; i++) {
                elemento[i-1]=elemento[i];

            }
            elemento=Arrays.copyOf(elemento,elemento.length-1);
            System.out.println("El numero ["+numEliminar+"]  sera eliminado de array");
            System.out.println(Arrays.toString(elemento));
            }

        }

        //buscar un numero que pase po parametro

    /**
     *
     * @param num
     */
    public void buscarNum(Integer num){
        int indice=-1;
        for (int i = 0; i < elemento.length && indice==-1; i++) {
            //para comparar el Integer==...sino equal->porque es un Array
            if (elemento[i].equals(num)){
                indice=i;
            }

        }

        if (indice!=-1){
            System.out.println("El numero buscado["+num+"] esta en la psicion " +indice);

        }else {
            System.out.println("El numero buscado ["+num+"] no ha sido encontrado");
        }
    }
//metodo para concatenar 2 arrays

    // 1. Para concadenar 2 listas vamos a crear una tercera

    /**
     *
     * @param l1
     * @param l2
     * @return
     */
    public Lista concatenarLista(Lista l1,Lista l2) {
        Lista nuevaLista = new Lista();
        //for each
        for (Integer e:l1.elemento) {
            nuevaLista.insertarUltimo(e);

        }


        for (Integer e:l2.elemento) {
            nuevaLista.insertarUltimo(e);

        }
        System.out.println("El resultado de concatenar la lista 1 con la lista 2" +Arrays.toString(elemento));
        Arrays.toString(nuevaLista.elemento);

return nuevaLista;

    }

}



