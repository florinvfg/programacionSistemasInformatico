package unidad2;
/* Pedir dos numeros enteros y decir si son iguales o no */

import java.util.Scanner;

public class Actividadresuelta2_2 {
    public static void main(String[] args) {

        /* Leemos dos numeros enteros,que tendremos que comparar para decidir si
        * son iguales o distintos*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Itrodusca primer numero: ");
        int primerNumero = sc.nextInt();
        System.out.println("Introdusca segundo numero: ");
        int segundoNumero = sc.nextInt();
        if (primerNumero == segundoNumero) {
            System.out.println("Los numeros son iguales ");
        } else {
            System.out.println("Los numeros son distintos ");

        }
    }
}
