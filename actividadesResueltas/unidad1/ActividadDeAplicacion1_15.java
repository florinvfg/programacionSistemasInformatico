package unidad1;
import java.util.*;
/* Dado el siguente polinomo de segundo grado:
* y = ax + bx +c
* `crea un programa que pida los coeficiente a, b y c,
* asi como el valor de x,y calcula el valor correspondiente de y*/
public class ActividadDeAplicacion1_15 {
    public static void main(String[] args) {
        double a, b, c, x, y;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

       // System.out.println("Dado el siguiente polinomio \"y=ax2+bx+c\"");
        System.out.print("Introduzca valor de a: ");
        a = sc.nextDouble();

        System.out.print("Introduzca valor de b: ");
        b = sc.nextDouble();

        System.out.print("Introduzca valor de c: ");
        c = sc.nextDouble();

        System.out.print("Introduzca valor de x: ");
        x = sc.nextDouble();

        y = (a * (Math.pow(x, 2))) + (b * x) + c; // Math.pow sirve para elevar un numeroº.
        System.out.println("El resultado de y es: " + y + " ☺ ");





    }
}
