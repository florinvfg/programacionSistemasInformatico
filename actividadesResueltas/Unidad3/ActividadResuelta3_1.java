package Unidad3;
import java.util.*;
/*Diseñar un programa que muestre,para cada numero introducido por teclado,si es par,si es
* positivo y su cuadrado.El proceso se repetira hasta que el numero introducido sea 0 */
public class ActividadResuelta3_1 {
    public static void main(String[] args) {
/*Como no tenemos certeza de cuantos numeros se introduciran por teclado,por eso
* el bucle while se ejecutara mientras que el numero introducido no sea 0.
* El bloque de instrucciones del bucle stara formado por las sentencias que muestran
* si el numero es par, positivo y su cuadrado*/
    Scanner sc= new Scanner(System.in);
    boolean esPar, esPositivo;//indicadores  pera el informe
        System.out.println("Introduzca numero: ");
        int num= sc.nextInt();//se lee el numero
        if (num == 0){
            System.out.println(" El numero introducido cierra el programa Adios :) ");
        }
        while (num !=0) {//repetimos mientras el numero leido no sea 0
            //si divido un numero entre 2 y obtengo como resto 0,significa que es par
            //el operador % (resto dee modulo)calcula el resto.Asi sabemos la paridad
            esPar = num % 2 == 0 ? true : false;//si el resto es 0 sera par
            esPositivo = num >= 0 ? true : false;//consideramos el 0 positivo
            System.out.println("Es par?: " + esPar + "\nEs positivo?: " + esPositivo);
            System.out.println("Cuadrado: " + num * num);
            System.out.println("Introduzaca otro numero: ");
            num = sc.nextInt();//volvemos a leer num


        }

    }
}
