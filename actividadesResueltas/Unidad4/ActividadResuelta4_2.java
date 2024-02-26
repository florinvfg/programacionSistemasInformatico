/*Escribir una funcion a la que se le pasen dos enteros y muestre todos
* los numeros comprendidos entre ellos*/
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
import java.util.*;


public class ActividadResuelta4_2 {
    public static void main(String[] args) {
        //Tenemos que saber si los numeros estan en orden creciente (3, 7)o decresiente (7, 3)
        //la funcion oredna los valores pasados y los utiliza como valores de un bucle for
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca primer numero");
        int a = sc.nextInt();
        System.out.println("Introduzca segundo numero");
        int b = sc.nextInt();
        mostrar(a, b);

    }


    static void mostrar(int a, int b) {
        int mayor = a > b ? a : b;//asignamos a mayor entre a y b
        int menor = a < b ? a : b;//y en menor el mas pequeño entre a y b
        for (int i = menor; i <= mayor; i++) {//siempre iremos del menor a mayor
            System.out.println(i);


        }


    }
}