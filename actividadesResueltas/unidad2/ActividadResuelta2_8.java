package unidad2;
import java.util.*;
/*Pedir los coeficientes de una ecuacion de segundo grado y nostrar sus soluciones
* reales.Si no existen,habra que indicarlo.Hay que tener en cuenta que las soluciones de una
* ecuacion de segundo grado,ax² + bx + c = 0 son

 */

public class ActividadResuelta2_8 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, d;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduzca un coeficiente : ");
        a = sc.nextDouble();

        System.out.print("Introduzca segundo coeficiente : ");
        b = sc.nextDouble();

        System.out.print("Introduzca tercer coeficiente : ");
        c = sc.nextDouble();

        d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("No existe solución real.");
        } else {
            if (a == 0) {
                System.out.println("No es una ecuación de segundo grado.");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Solución 1: " + x1);
                System.out.println("Solución 2: " + x2);
            }
        }




    }
}
