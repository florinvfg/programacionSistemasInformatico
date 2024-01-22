package unidad1;
import java.util.*;
/* Solicita al usuario un numero real y calcula su raiz cuadrada.Implementa el programa utilizando el
* nombre cualificado de las clases,en lugar de utilizar ninguna importacion*/
public class ActividadDeAplicacion1_20 {

    public static void main(String[] args) {
        double numero;

        System.out.println("Indica un numero real ");
        Scanner sn = new Scanner(System.in);
      numero = Math.sqrt(sn.nextDouble()); //La función Math.sqrt() retorna la raíz cuadrada de un número
        System.out.println("raiz cuadrada de: " + numero + "  ☺" );






    }
}
