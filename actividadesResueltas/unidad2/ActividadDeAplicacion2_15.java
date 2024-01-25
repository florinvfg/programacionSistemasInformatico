package unidad2;
import java.util.*;
/*Escribe una aplicacion que solicite por consola dos numeros reales que coresponden a la base y la
* altura de un triangulo.Deber mostrarse su area, comprobando que lo numeros introducidus por el usuario
* no son negativos, algo que no tendria sentido*/

public class ActividadDeAplicacion2_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double base, altura, area;

        System.out.print("Introduce la base: ");
        base = sc.nextDouble();

        System.out.print("Introduce la altura: ");
        altura = sc.nextDouble();

        if (base < 0 || altura < 0){
            System.err.println(" La Base o la Altura no pueden ser < 0  !!!!");
        } else {
            area = (base * altura) / 2;
            System.out.println("El área del triángulo es " + area);
        }








    }
}
