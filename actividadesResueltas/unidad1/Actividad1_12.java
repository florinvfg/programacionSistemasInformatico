package unidad1;
import java.util.*;
/*Escribir un programa que pida un numero al usuario y muestre su valor absoluto*/
public class Actividad1_12 {
    public static void main(String[] args) {
       /*Dado un numero,para calcular su valor absoluto solo tenemos que saber si es negativo
       * en cuyo caso es necesario multiplicarlo por -1,con lo que se consigue el mismo valor
       * pero con signo positivo*/
Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un numero (positivo o negativo) : ");
        int n = sc.nextInt();
        int valorAbsoluto = n < 0 ? -1 * n : n;
        System.out.println("El valor absoluto de " + n + " es " + valorAbsoluto);








    }
}
