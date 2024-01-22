package unidad1;
import java.util.*;
/* la FILA (Federacion Internacional de Lanzamiento de Algoritmo) realiza una competicion donde
* cada participante escribe un algoritmo en un papel y lo lanza,ganando quien consiga lansarlo mas lejos.La peculiaridad
* del concurso es que la longitud del lanzamiento se mide en metros (con tanto decimales que deseas),pero
* para el raking solo se tiene en cuenta la longitud en cm.(sin decimales).Por ejemplo,para un lanzamiento de 12,3456m (que son 1234,56 cm)
* solo se contabilizaran 1234cm.
* Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera
* correspondiente en centimentros*/
public class ActividadDeAplicacion1_22 {
    public static void main(String[] args) {
        double m;
        int cm;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce la distancia en metros: ");
        m = sc.nextDouble();
        m = m * 100;

        cm = (int) m;

        System.out.println("La distancia del lanzamiento es de " + cm + " cm.");

    }
}
