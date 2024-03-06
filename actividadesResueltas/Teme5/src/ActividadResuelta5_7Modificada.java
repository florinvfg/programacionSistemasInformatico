
import java.util.*;
public class ActividadResuelta5_7Modificada {
    public static void main(String[] args) {

        int tabla[]=crearArray();//para crear un array de enteros y almacena el resultado en la variable tabla.
        mostrar(Arrays.toString(tabla));// para imprimir el array como una cadena de texto.
        buscarDuplicados(tabla);//para encontrar los elementos duplicados en el array tabla.
    }
    public static int[] crearArray(){//Declara una función que devuelve un array de enteros.
        Scanner sn=new Scanner(System.in);
        mostrarSinLn("Indique la longitud de la tabla->");
        int longitud= sn.nextInt();
        int tabla[]=new int[longitud];//: Crea un nuevo array de enteros con la longitud especificada por el usuario.
        for (int i = 0; i < longitud; i++) {
            tabla[i]=(int)(Math.random()*20+1);
        }
        return  tabla;
    }
    public static void buscarDuplicados(int tabla[]){
        int duplicados[]=new int[0];//Crea un nuevo array para almacenar los números duplicados, inicialmente vacío.
        for (int i = 0; i < tabla.length; i++) {
            if(!buscar(duplicados,tabla[i])){//Verifica si el número actual no está en el array de duplicados utilizando la función buscar().
                duplicados= Arrays.copyOf(duplicados,duplicados.length+1);//Aumenta la longitud del array de duplicados en uno.
                duplicados[duplicados.length-1]=tabla[i];//Agrega el número duplicado al final del array de duplicados.
            }
        }
        mostrar(Arrays.toString(duplicados));
    }
    public static boolean buscar(int tabla[],int numero){//Declara una función que busca un número en un array y devuelve
        // verdadero si lo encuentra, falso en caso contrario.
        boolean existe=false;//Inicializa una variable booleana que indica si el número existe en el array.
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i]==numero)
                existe=true;//Comprueba si el número actual es igual al número buscado y establece existe a verdadero si se encuentra.
        }
        return existe;
    }


    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto);


    }
}
