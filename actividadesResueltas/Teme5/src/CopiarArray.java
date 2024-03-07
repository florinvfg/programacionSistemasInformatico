/*"Este programa genera un array de 5 elementos llenos de números aleatorios entre 1 y 100. Luego, muestra el contenido del array.
 Posteriormente, copia este array a otro usando Arrays.copyOf() y lo muestra. Finalmente, utiliza Arrays.copyOfRange() para copiar
 un subconjunto del primer array y lo muestra."*/
import java.util.*;
import java.util.Arrays;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class CopiarArray {
    public static void main(String[] args) {
        int arrayUno[] = new int[5];
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = (int) (Math.random() * 100 + 1);

        }
        mostrar(Arrays.toString(arrayUno));
        //si necesitas copiar un Array
        int arrayDos[] = new int[5];
        //copyOf construlle y devuelve una copia del original al destino con la longitud indicada en el metodo
        arrayDos = Arrays.copyOf(arrayUno, arrayUno.length);
        mostrar(Arrays.toString(arrayDos));
        //copyOfRange
        //crea y devuelve una tabla donde se copian los elementos indicados en el ranga
        //indice desde,donde comienza
        //hasta donde termina sin incluir este elemento
        int array3[]=Arrays.copyOfRange(arrayUno, 2, 4);
        mostrar(Arrays.toString(array3));
        //Copiar con un metodo de la clase System
        int array4[]=new int[5];
        System.arraycopy(arrayUno, 0, array4, 0, arrayUno.length);
        mostrar(Arrays.toString(array4));


    }
        public static void mostrar (String texto){
            System.out.println("\t" + texto);
        }
    }

