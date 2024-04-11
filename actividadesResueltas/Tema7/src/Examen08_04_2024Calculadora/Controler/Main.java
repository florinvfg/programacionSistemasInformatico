package Examen08_04_2024Calculadora.Controler;

import Examen08_04_2024Calculadora.Clases.Calculadora;

import java.util.Scanner;

/**
 * Utilizando el paradigma de Programación Orientado a Objeto, realizar una aplicación donde simule una Calculadora  que calcule:
 * 1. Suma
 * 2. Resta
 * 3. Multiplicar
 * 4. Dividir
 * 5. Resto
 * 6. Exponencial*
 * Para llevar a cabo la actividad, el usuario debe seleccionar en un Menú la operación a Realizar y luego, la aplicación
 * solicitar los datos necesarios para realizar la operación. Finalmente, mostrar el resultado.
 *     [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 */




public class Main {
    public static void main(String[] args) {
        // Definición de constantes para colores de texto en la consola
        final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
        final String YELLOW = "\033[0;33m"; // Color amarillo
        final String BLUE = "\033[0;34m"; // Color azul

        Scanner scanner = new Scanner(System.in);
        // Creaamos un objeto Calculadora para realizar operaciones matemáticas
        Calculadora calculadora = new Calculadora();

        // Variable para controlar el bucle de ejecución del programa
        boolean salir = false;

        // Bucle principal del programa
        while (!salir) {
            // Menú de la calculadora
            System.out.println("\n\t\uD83D\uDCBB La Calculadora \uD83D\uDCBB");
            System.out.println(BLUE+"\nNuestra Calculadora tiene las siguentes operaciones:" +RESET);
            System.out.println("\t1. Suma");
            System.out.println("\t2. Resta");
            System.out.println("\t3. Multiplicación");
            System.out.println("\t4. División");
            System.out.println("\t5. Resto");
            System.out.println("\t6. Exponencial");
            System.out.println("\t7. Salir");
            System.out.print(YELLOW+"Selecciona la operación deseada \uD83E\uDD14 ➣ " +RESET);
            int opcion = scanner.nextInt();

            // Switch para manejar las diferentes opciones del menú
            switch (opcion) {

                case 1://suma
                    System.out.print("Ingrese el primer número ➣ ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número ➣ ");
                    double num2 = scanner.nextDouble();
                    System.out.println("El resultado de la suma es ➣ " +YELLOW+ calculadora.suma(num1, num2)+RESET);
                    break;

                case 2: //resta
                    System.out.print("Ingrese el primer número ➣ ");
                    double num3 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número ➣ ");
                    double num4 = scanner.nextDouble();
                    System.out.println("El resultado de la resta es ➣ " +YELLOW+ calculadora.resta(num3, num4)+RESET);
                    break;

                case 3: //multiplicar
                    System.out.print("Ingrese el primer número ➣ ");
                    double num5 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número ➣ ");
                    double num6 = scanner.nextDouble();
                    System.out.println("El resultado de la multiplicación es ➣ " +YELLOW+ calculadora.multiplicacion(num5, num6)+RESET);
                    break;
                case 4:   //dividir

                    System.out.print("Ingrese el dividendo ➣ ");
                    double dividendo = scanner.nextDouble();
                    System.out.print("Ingrese el divisor ➣ ");
                    double divisor = scanner.nextDouble();
                    try {
                        System.out.println("\uD83E\uDD13 El resultado de la división es ➣ " +YELLOW+ calculadora.division(dividendo, divisor)+RESET);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:  //resto de una división (similar a la suma)
                    System.out.print("Ingrese el dividendo ➣ ");
                    int dividendo2 = scanner.nextInt();
                    System.out.print("Ingrese el divisor ➣ ");
                    int divisor2 = scanner.nextInt();
                    try {
                        System.out.println("\uD83E\uDD13 El resto de la división es ➣ "+YELLOW + calculadora.resto(dividendo2, divisor2)+RESET);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6:  //potencia (similar a la suma)
                    System.out.print("Ingrese la base ➣ ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese el exponente ➣ ");
                    double exponente = scanner.nextDouble();
                    System.out.println("El resultado de la exponencial es ➣ " +YELLOW+ calculadora.exponencial(base, exponente)+RESET);
                    break;

                case 7:   //salir del programa
                    System.out.println("\nOperaciones realizadas:");
                   // System.out.println(calculadora.getOperacionesRealizadas());
                    System.out.println("Total de operaciones realizadas: " + calculadora.getContadorOperaciones());
                    System.out.println("\n\t\uD83D\uDE09 Gracias por utilizar la calculadora \uD83D\uDE09\n");
                    System.out.println(BLUE+"¡ ADIOS !"+RESET);
                    salir = true;
                    break;
                default:  // // Opción por defecto en caso de selección inválida
                    System.err.println("Opción no válida. \uD83D\uDE33 Por favor seleccione una opción válida.");
                    break;
            }
        }
        scanner.close();
    }
}



