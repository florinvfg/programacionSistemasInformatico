/*Diseñar una funcion que recibe como parametros dos numeros enteros y devuelve el maximo de ambos*/
import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class ActividadResuelta4_4 {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca primer numero ☞");
        numero1 = sc.nextInt();
        System.out.println("Introduzca segundo numero ☞");
        numero2 = sc.nextInt();

        int maximo = encontrarMaximo(numero1, numero2);
        int minimo = encontrarMinimo(numero1, numero2);
        System.out.println("El máximo de " + numero1 + " y " + numero2 + " es: ➥ " + maximo);
        System.out.println("El minimo de " + numero1 + " y " + numero2 + " es: ➥ " + minimo);
    }

    public static int encontrarMaximo(int num1, int num2) {
        return Math.max(num1, num2);


    }

    public static int encontrarMinimo(int num1, int num2) {
        return Math.min(num1, num2);

    }
}