package ActividadResuelta10_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner para leer la entrada del usuario desde la consola.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
       // leerEntero intenta leer un número entero desde la entrada estándar
        int numero = leerEntero(sc);

        System.out.println("El número ingresado es: " + numero);
    }

    /**
     * Si el usuario ingresa una cadena que no puede convertirse a un entero válido,
     * se captura la excepción NumberFormatException, se muestra un mensaje de error
     * y se solicita al usuario que ingrese nuevamente el número.
     * @param sc
     * @return
     */
    public static int leerEntero(Scanner sc) {
        while (true) {
            try {
                //El programa continuará solicitando al usuario que ingrese
                // un número entero válido hasta que lo haga correctamente.
                String input = sc.nextLine();
                int entero = Integer.parseInt(input);
                //Una vez que se ingresa un número entero válido, se devuelve ese
                // valor y el programa continúa su ejecución.
                return entero;
            } catch (NumberFormatException e) {
                System.out.println("Error: El valor ingresado no es un número entero válido. Por favor, inténtelo de nuevo:");
            }
        }
    }
}