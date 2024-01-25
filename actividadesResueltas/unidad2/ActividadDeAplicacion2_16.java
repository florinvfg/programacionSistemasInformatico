package unidad2;
import java.util.*;
/*Utiliza el operador ternario para calcular el valor absoluto de un numero que se solicita
* al usuario por teclado*/
public class ActividadDeAplicacion2_16 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double n1, n2;



        System.out.print("Introduzca un número: ");
        n1 = sc.nextDouble();

        if (n1 >= 0) {
            System.out.println("El valor absoluto de " + n1 + " es " + n1);
        } else {
            n2 = n1 * -1;
            System.out.println("El valor absoluto de " + n1 + " es " + n2);
        }
    }
}