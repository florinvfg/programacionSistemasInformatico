package unidad1;
import java.util.*;
/* Solicita al usuaio tres distancias:
* - La primera,medida en milimetros.
* - La segunda,medida en centimetros.
* - La ultima,medida en metros
* Diseña un programa que muestre la suma de las tres longitudes introducidas (media*/

public class ActividadDeAplicacion1_17 {
    public static void main(String[] args) {
        double mm, cm, m, sumaLongitud;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce medida en milímetros: ");
        mm = sc.nextDouble();

        System.out.print("Introduce medida en centrímetros: ");
        cm = sc.nextDouble();

        System.out.print("Introduce medida en metros: ");
        m = sc.nextDouble();

        mm = mm / 10;
        m = m * 100;

        sumaLongitud = m + cm + mm;

        System.out.println(" ☺  La suma de las longitudes dan: " + sumaLongitud + " cm.");

    }
}
