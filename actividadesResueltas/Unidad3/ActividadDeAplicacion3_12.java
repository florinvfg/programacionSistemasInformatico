package Unidad3;
import java.util.*;
/*Modifica la Actividad de aplicacion 3.11 para que el usuario pueda
introducir un numero en binario y el programa muestre su conversion en decimal*/

public class ActividadDeAplicacion3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        int n1, n2, expon = 0, d = 0;

        System.out.print("Introduzca un número binario mayor de 0: ");
        n1 = sc.nextInt();
        n2 = n1;

        while (n2 != 0) {
            d = d + (n2 % 2) * (int)Math.pow(2,expon);
            n2 = n2 / 10;
            expon++;
        }
        System.out.println("La conversión de " + n1 + " a decimal es = " + d);
         */

        int binario1, binario2, decimal = 0, base = 1;

        System.out.print("Introduzca un número binario mayor de 0: ➣ ");
        binario1 = sc.nextInt();

        binario2 = binario1;

        if (binario1 > 0) {// Comienza la verificación del número binario.

            while (binario2 != 0) {  // Inicia un bucle while para convertir el número binario a decimal.
                int unidBinaria = binario2 % 2;// Obtiene la unidad binaria actual.
                binario2 /= 10; // Elimina la última cifra binaria.
                decimal += base * unidBinaria;// Agrega la cifra al resultado decimal.
                base = base * 2;// Incrementa la base binaria.
            }
            System.out.println("La conversión de " + binario1 + " a decimal es = " + decimal);

        } else {
            //Si el número binario no es válido (menor o igual a 0), entra en la parte else de la estructura condicional.
            System.err.println(" Número no válido.");
        }


    }
}
