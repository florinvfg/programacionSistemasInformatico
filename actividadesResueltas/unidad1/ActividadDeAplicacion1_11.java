package unidad1;
import java.util.*;
/*Un economista te ha encargado un programa para realixar calculos con IVA.
* La aplicacion debe solicitar la base imponible y el IVA que debe aplicar.
* Muestra en pantalla el importe corespondiente al IVA y al total*/
public class ActividadDeAplicacion1_11 {
    public static void main(String[] args) {
        int iva;
        double baseImponible, importeIva, importeTotal;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Introduzca base imponible: ");
        baseImponible = sc.nextDouble();

        System.out.print("Introduzca IVA: ");
        iva = sc.nextInt();

        importeIva = (baseImponible * iva) / 100;
        System.out.println("El importe del IVA es de " + importeIva + " €");

        importeTotal = baseImponible + importeIva;
        System.out.println("El importe total es de " + importeTotal + " €");




    }
}
