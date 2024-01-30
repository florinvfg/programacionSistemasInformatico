package Unidad3;
import java.util.*;
/*Implementar una aplicacion que pida al usuario un numero comprendido entre 1 y 10.
* Hay que mostrar la tabla de multiplicar de dicho numero,asegurandose de que el numero
* introducido se encuentra en el rango establecido*/
public class Actividadresuelta3_9 {
    public static void main(String[] args) {
        /*Las tablas de multiplicar nos traen recuerdos de nuestros tiempos de escolares,cuando intentabamos
        * aprenderlas (recitandolas una y otra vez)*/

        Scanner sc=new Scanner(System.in);
        int num;
        //nos aseguramos de que el numero esta entre 1 y 10
        do {
            System.out.println("Indica un numero de 1 a 10 -> ");
            num= sc.nextInt();

        }while (!(1<=num && num <=10));
        System.out.println("\n\nTabla del " + num);
        for (int i=1; i<=10; i++){
            System.out.println(num + "X" + i + " = " +num * i);
        }


        // Otra forma
        /* Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Introduce un número del 1 al 10: ");
            n = sc.nextInt();
        } while (n < 1 || n > 10);
        System.out.println("\nTabla del " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }*/
    }
}
