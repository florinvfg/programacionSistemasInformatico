package unidad1;
import java.util.*;
/* Diseña una aplicacion que solicite al ususario que introduzca una cantidad de segundos.
* La aplicacion debe monstrar cuantas horas, minutos y segundos hay en el numero
* de segundos introducidos por usuario*/

public class ActividadDeAplicacion1_16 {
    public static void main(String[] args) {
        int n, s, m, h;

        Scanner sc = new Scanner(System.in);
        System.out.println("֍֍֍֍֍֍֍֍֍֍");
        System.out.print(" ☺ Introduce los segundos: ");
        n = sc.nextInt();

        s = n % 60;
       // System.out.println("hay " + s + " segundos " );

        m = n / 60;
        m= m % 60;
        //System.out.println("hay " + m + " minutos ");

        h = n / 3600;
        //System.out.println( "hay "+ h + " horas ");
        System.out.println("֍֍֍֍֍֍֍֍֍֍");

        System.out.println( " En: " + n + " segundos son " + h + " horas, " + m + " minutos, y " + s + " segundos.");
        System.out.println(   h + ":" + m + ":" + s + "  ☺ ");



    }
}
