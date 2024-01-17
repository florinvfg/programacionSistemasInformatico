package unidad1;
import java.util.*;
/* Escribe un programa que tome como entrada un numero entero e indique que cantidad
* hay que sumarle para que el resultado sea multiplo de 7.Un ejemplo:
* -A 2 hay que sumarle 5 para que el resultado (2+5=7)sea multiplo de 7
* -A 13 hay que sumarle 1 para que el resultado (13 + 1 = 14) sea multiplo de 7
* Si proporcionas el numero 2 o 13 la salida de la aplicacion debe ser 5 o 1,respectivamente.
* PISTA: El operador modulo puede ser muy util para solucionar esta actividad.*/

public class ActividadDeAplicacion1_12 {
    public static void main(String[] args) {
        //prox= 7 - num % 7
        int numero, suma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero:");
        numero = sc.nextInt();
        suma = numero % 7;
        suma =7-suma;
        System.out.println("Suma " + suma + " a " + numero + " para que sea un multiplo de 7 ");







    }
}
