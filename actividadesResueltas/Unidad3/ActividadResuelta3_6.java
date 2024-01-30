package Unidad3;
import java.util.*;
/*Escribir una aplicacion para aprender a contar, que
 pedira un numero n y mostrara todos los numeros del 1 a n*/

public class ActividadResuelta3_6 {
    /*Sabemos con certeza el numero de interaciones del bucle: n,
    * por lo que utilizaremos un bucle for que recorrera todos los
    * numeros de 1 a n*/
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n =sc.nextInt();
        for (int i = 1; i<=n; i++){//i tomara los valores de 1 a n
            //la variable i es una variable del bloque de instruccione del for
            //es decir, solo se puede utilizar en dicho bloque (su ambito es el bloque)
            //utilizar la variable i fuera del bloque genera un erorr
            System.out.println(i);//mostramos i
        }







    }








}
