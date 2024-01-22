package unidad2;
import java.util.*;
/*Pedir los coeficientes de una ecuacion de segundo grado y nostrar sus soluciones
* reales.Si no existen,habra que indicarlo.Hay que tener en cuenta que las soluciones de una
* ecuacion de segundo grado,ax² + bx + c = 0 son

 */

public class ActividadResuelta2_8 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, d; // x1, x2 y d soluciones y discriminante
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduzca un coeficiente : ");
        a = sc.nextDouble();

        System.out.print("Introduzca segundo coeficiente : ");
        b = sc.nextDouble();

        System.out.print("Introduzca tercer coeficiente : ");
        c = sc.nextDouble();
//calculamos el discriminante
        d = b * b - 4 * a * c;
        if (d < 0) {//como hay que calcular la raiz cuadrada de d, este no puede ser negativo
            System.out.println("No existe solución real.");
        } else {/* si a=0 se produce una division por cero.Y en este caso,ni siquiera seria
        una ecuacion de segundo grado*/
            if (a == 0) {
                System.out.println("No es una ecuación de segundo grado.");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);//sqrt() calcula la raiz cuadrada
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Solución 1: " + x1);
                System.out.println("Solución 2: " + x2);
            }
        }




    }
}
