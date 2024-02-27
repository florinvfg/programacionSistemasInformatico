/*Escribir una funcion a la que se le pase
un numero entero y devuelva el numero de divisores primos que tiene*/
import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class ActividadResuelta4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo:  ➦ ");
        int numero = sc.nextInt();

        // Para calcular los divisores de un número, solo consideramos los números primos entre 1 y el número dado.
        // Un ejemplo: los divisores de 24 son: 1, 2 y 3.
        // Aunque 4 y 6 también son divisores de 24, no se consideran ya que no son primos.
        System.out.println("Divisores de " + numero + "  ➦ " + numDivisoresPrimos(numero));
    }

    // Método para verificar si un número es primo
    static boolean esPrimo(int num) {
        boolean primo = true; // Suponemos que el número es primo
        if (num < 2) {
            primo = false;
        } else {
            int i = 2; // Comenzamos desde 2 ya que es el primer número por el cual verificamos si es divisible
            while (i < num && primo) {
                if (num % i == 0) { // Si num es divisible por i, entonces no es primo
                    primo = false;
                }
                i++;
            }
        }
        return primo;
    }

    // Método para contar los divisores primos de un número
    static int numDivisoresPrimos(int num) {
        int cont = 0; // Contador de divisores
        for (int i = 2; i <= num; i++) {
            if (esPrimo(i) && num % i == 0) { // Si i es primo y divide a num, incrementamos el contador
                cont++;
            }
        }
        return cont;
    }
}