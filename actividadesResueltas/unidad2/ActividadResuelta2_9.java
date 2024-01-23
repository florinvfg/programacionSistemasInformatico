package unidad2;
import java.util.*;
/* Escribir una aplicacion que indique cuantas cifras tiene un numero ent6ero introducido por teclado,que
 estara comprendido entre 0 y 99999.*/

public class ActividadResuelta2_9 {
    public static void main(String[] args) {
        /*Los numeros comprendidos entre 0 y 9,inclusives,tienen una cifra
        * Los numeros comprendidos entre 10 y 99,inclusives, tienen 2 cifras
        * Los numeros comprendidos entre 100 y 999, inclusives,tienen 3 cifras
        * Etc.*/
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero entre -99.999 y 99.999: ");
        n = sc.nextInt();

        if (n > -10 && n < 10) {
            System.out.println("Tiene 1 cifra. ϡ");
        } else if (n > -100 && n < 100) {
            System.out.println("Tiene 2 cifras. ϡϡ");
        } else if (n > -1000 && n < 1000) {
            System.out.println("Tiene 3 cifras. ϡϡϡ");
        } else if (n > -10000 && n < 10000) {
            System.out.println("Tiene 4 cifras. ϡϡϡϡ");
        } else if (n > -100000 && n < 100000) {
            System.out.println("Tiene 5 cifras. ϡϡϡϡϡ");
        } else if (n <= -100000) {
            System.out.println("Error. El número es inferior a -99.999");
        } else if (n >= 100000) {
            System.out.println("Error. El número es superior a 99.999");
        }
    }
}
