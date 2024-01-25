package unidad2;
import java.util.*;
/*Crea una aplicacion que solicite al usuario cuantos grados tiene un angulo y muestre el equivalente en radianes.
* Si el angulo introducido por el usuario no se encuentra en el rango de 0 a 360 grados,hay que transformarlo a dicho rango.
* Nota: El operador modulo puede ayudarnos a convertir un angulo a su equivalente en el
* rango comprendido de 0 a 360 grados*/
public class ActividadDeAplicacion2_19 {
    public static void main(String[] args) {
        //indicar los grados y calcular los radianes
        //radianes=grados*pi/180;
        //grados%=360;
        Scanner sn = new Scanner(System.in);
        double grados;
        System.out.println("Indica los grados del angulo");
        grados= sn.nextInt();
        grados%=360;
        double radianes= grados*Math.PI/180;
        System.out.print("Los radianes son ");//no hace salto de linea print
        System.err.printf("%.4f %n",radianes);






    }
}
/*     otra forma de hacerlo
   Scanner sc = new Scanner(System.in);

        double grados, grados1, result;

        System.out.println("Conversor de grados a radianes.");

        System.out.print("Introduce los grados: ");
        grados = sc.nextInt();

        if (grados > -360 && grados < 360) {
            result = (grados * Math.PI) / 180;
            System.out.println(grados + "º es igual a " + result + " radianes.");
        } else {
            grados1 = grados % 360;
            result = (grados1 * Math.PI) / 180;
            System.out.println(grados + "º es igual a " + grados1 + "º, que a su vez es igual a " + result + " radianes.");
        }
 */