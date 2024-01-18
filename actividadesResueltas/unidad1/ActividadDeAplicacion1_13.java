package unidad1;
import java.util.*;
/* Modifica la Actividad de Aplicacion 1.12 para que,indicando dos numeros n y m,diga
* que cantidad hay que sumarle a n para que sea multiplo de m.*/
public class ActividadDeAplicacion1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, calculo;
        System.out.print("Introduzca el primer número entero: ");
        n = sc.nextInt();

        System.out.print("Introduzca el segundo número entero: ");
        m = sc.nextInt();
        calculo = n % m;
        System.out.println("Hay que sumar " + calculo + " a " + n + " para que sea múltiplo de " + m);


        }
  }
