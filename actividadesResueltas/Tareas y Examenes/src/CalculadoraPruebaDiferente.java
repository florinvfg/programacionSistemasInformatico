/*La CALCULADORA DIFERENTE */
import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]

public class CalculadoraPruebaDiferente {
    static double resultado;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        System.out.println("------------------");
        System.out.println("Calculadora en Java");
        System.out.println(" 1. Sumar");
        System.out.println(" 2. Restar");
        System.out.println(" 3. Multiplicar");
        System.out.println(" 4. Dividir");
        System.out.println(" 5. Raiz Cuadrada");
        System.out.println(" 6. Exponencial");
        System.out.println(" 7. Salir");
        System.out.println("\n\t**** IDICA TU OPCION*****");
        int opcion = entrada.nextInt();
        System.out.println("\nAs elegido " + opcion);
        operaciones(opcion);
        if(opcion == 7) {
            System.out.println("Saliendo de la calculadora...");
            return; // Salir del método main y finalizar el programa
        }
    }

    static void operaciones(int opcion) {
        int numero1 = 0, numero2 = 0, base = 0, exponente = 0;
        if (opcion >= 1 && opcion <= 4) {
            System.out.println("Ingrese el valor numero1 -> ");
            numero1 = entrada.nextInt();
            System.out.println("Ingrese el valor numero2 -> ");
            numero2 = entrada.nextInt();
        }
        switch (opcion) {
            case 1 -> resultado = numero1 + numero2;
            case 2 -> resultado = numero1 - numero2;
            case 3 -> resultado = numero1 * numero2;
            case 4 -> resultado = numero1 / numero2;
            case 5 -> {
                System.out.println("Indique el numero a calcular la Raiz Cuadrada -> ");
                base = entrada.nextInt();
                resultado = Math.sqrt(base);
            }
            case 6 -> {
                System.out.println("Indique la base ->");
                base = entrada.nextInt();
                System.out.println("Indique el exponente -> ");
                exponente = entrada.nextInt();
                resultado = Math.pow(base, exponente);
            }
            default -> {
                System.err.println("Opcion no valida");
                menu();
            }
        }
        System.out.println("El resultado es " + resultado);
        System.out.println("****¡Gracias por usar la calculadora!*****");
    }
    }

