package Unidad3;
import java.util.*;
/*Realiza un programa que convierta un numero decimal en su representacion binaria.
* Hay que tener en cuenta que desconocemos cuantas cifras tiene el numero que
* introduce el usuario*/

public class ActividadDeAplicacion3_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;
        String binario = "";

        System.out.print("Dime un número decimal mayor de 0: ");
        n1 = sc.nextInt();
        n2 = n1;
             // Comienza la verificación del número ingresado.
        if (n1 > 0) {
            // Inicia un bucle while para convertir el número decimal a binario.
            while (n2 > 0) {
                // Verifica si el residuo de la división por 2 es 0.
                if (n2 % 2 == 0) {
                    binario = "0" + binario;// Agrega "0" al principio de la cadena binaria.
                } else {
                    binario = "1" + binario; // Agrega "1" al principio de la cadena binaria.
                }
                n2 /= 2;// Divide n2 por 2 para continuar con la conversión.
            }
            // Imprime el resultado de la conversión binaria.
            System.out.println("La conversión de " + n1 + " a binario es = " + binario);

        } else {
            // Si el número no es mayor que 0, muestra un mensaje de error.
            System.err.println("Error. Número no válido.");
        }



    }
}
