/*Diseñar una funcion con el siguente prototipo:
* boolean esPrimo (int n)
* que devuelvera true si n es primo y false en caso contrario*/
import java.util.*;
public class ActividadResuelta4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = sc.nextInt();
        sc.close();
//Estas líneas verifican si el número ingresado por el usuario es primo utilizando la función esPrimo. Si la función devuelve
// true, imprime un mensaje indicando que el número es primo. Si la función devuelve false, verifica si el número es par
// (numero % 2 == 0). Si es par, imprime un mensaje indicando que el número no es primo pero es par. Si no es par, imprime
// un mensaje indicando que el número no es primo ni par.
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            if (numero % 2 == 0) {
                System.out.println(numero + " no es un número primo, pero es par.");
            } else {
                System.out.println(numero + " no es un número primo, ni par.");
            }
        }
    }

    public static boolean esPrimo(int n) {//Esta línea declara un método llamado esPrimo que toma un parámetro de tipo int
        // llamado n y devuelve un valor booleano (true si n es un número primo, false si no lo es).

        if (n <= 1) {//Si el número n es menor o igual a 1, el método devuelve false, ya que 1 y los números negativos no son primos.
            return false;
        }
//Este bucle for verifica si n es divisible por algún número entre 2 y la raíz cuadrada de n.
// Si n es divisible por algún número en este rango, significa que no es primo y el método devuelve false.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
//Si no se encontró ningún divisor para n en el bucle for, el método devuelve true, indicando que n es primo.
        return true;
            }
        }

