/*Escribir una aplicacion que solicite al usuario cuantos numeros desea introducir
* A continuacion, introducir por teclado esa cantidad de numeros enteros, y por ultimo, mostrar
* en orden inverso al introducido*/

import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]

public class ActividadResuelta5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Cuantos numeros desea introducir: ");
        /*int cuantosNumeros = sc.nextInt();

        int t[] = new int[cuantosNumeros];

        for (int i = 0; i < t.length; i++) {
            System.out.println("Introduzca un numero: ");
            t[i] = sc.nextInt();
        }
        System.out.println("Los numeros en orden inverso som: ");
        for (int i = t.length - 1; i >= 0; i--) {
            System.out.println(t[i]);

        }*/


        //diferente

        int longitud = sc.nextInt();
        int numeros[] = new int[longitud];
        for (int i = 0; i <longitud; i++) {
            mostrar("Indique el numero");
            numeros[i] = sc.nextInt();
        }
        mostrar("Muestra de forma inversa los numeros insertados");
        mostrar("................................");

        for (int i = numeros.length - 1; i >= 0; i--){
        mostrar("->" + numeros[i]);
       }
}




        public static void mostrar (String texto){
            System.out.println("\t" + texto);
        }
        public static void mostrarSinLn (String texto){
            System.out.println("\t" + texto);
        }


    }

