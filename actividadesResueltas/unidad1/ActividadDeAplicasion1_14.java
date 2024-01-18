package unidad1;
import java.util.*;
/* Crea un programa que oida la base y la altura de un triangulo y muestra su area.
*                base*altura
* Area triangulo= -----------
*                     2
* */

public class ActividadDeAplicasion1_14 {
    public static void main(String[] args) {
        double base, altura, areaTriangulo;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("  Introduzca la base del triángulo  ☺ →  ");
        base = sc.nextDouble();

        System.out.print("  Introduzca la altura del triángulo ☺ →  ");
        altura = sc.nextDouble();

        areaTriangulo = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + areaTriangulo + "   ☺ " );
    }
}
