package unidad2;
import java.util.*;
/*Idear un programa que solicite al usuario un numero comprendido entre 1 y 7, corespondiente
* a un dia de la semana.Se debe mostrar el nombre del dia de la semana al que corresponde.
* por ejemplo, el numero 1 corresponde a "Lunes" y el 6 a "Sabado"*/
public class ActividadResuelta2_11 {
    public static void main(String[] args) {
        int dia;

        Scanner sc = new Scanner(System.in);
        System.out.print(" © Introduzca un número de 1 a 7 ©©©©©©©: ");
        dia = sc.nextInt();

        switch (dia) {
            case 1 ->
                    System.out.println("Lunes ©©©©");
            case 2 ->
                    System.out.println("Martes ©©©©");
            case 3 ->
                    System.out.println("Miércoles ©©©©");
            case 4 ->
                    System.out.println("Jueves ©©©©");
            case 5 ->
                    System.out.println("Viernes ©©©©");
            case 6 ->
                    System.out.println("Sábado ©©©©");
            case 7 ->
                    System.out.println("Domingo©©©© ");
            default ->
                    System.out.println("Error. Introduzca del 1 al 7");
        }
    }

}
