package Calendario.Controler;

import Calendario.Clases.Calendario;

import java.util.Scanner;
/**
 * @autor [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * Enunciado:
 *  Diseña la clase Calendario que representa una fecha concreta(año,mes y dia).
 *  * La clase debe disponer de los metodos:
 *  *      -Calendario(int año, int mes, int dia):
 *  * que crea un objeto con los datos pasados como parametro,siempre y cuando,la fecha
 *  * que representen sea correcta.
 *  *       -void incrementarDia():
 *  * que incrementa en un dia la fecha del calendario.
 *  *       -void incrementarMes():
 *  * que incrementa en un mes la fecha del calendari.
 *  *       -void incrementarAño(int cantidad):
 *  * que incrementa la fecha del calendario en el numero de años especificados.
 *  * ten en cuenta que el año 0 no existe.
 *  *        -void mostrar():
 *  * muestra la fecha por consola
 *  *         -boolean iguales(Calendario otraFecha):
 *  * que determina si la fecha invocante y la que  se pasa como parametro son iguales o distintas.
 *  * Por simplicidad,solo tendremos en concideracion que existen meses con distinto numero de dias,
 *  * pero no tendremos en cuenta los años bisiestos
 *  */

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Calendario fecha = null;

        boolean salir = false;
        while (!salir) {
            System.out.println("\n=== Menú ===");
            System.out.println("1. Ingresar fecha");
            System.out.println("2. Incrementar  día");
            System.out.println("3. Incrementar  mes");
            System.out.println("4. Incrementar  año");
            System.out.println("5. Mostrar fecha");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese el año:");
                    int año = scanner.nextInt();
                    System.out.println("Ingrese el mes:");
                    int mes = scanner.nextInt();
                    System.out.println("Ingrese el día:");
                    int dia = scanner.nextInt();
                    if (Calendario.fechaEsValida(año, mes, dia)) {
                        fecha = new Calendario(año, mes, dia);
                        System.out.println("\n¡Fecha ingresada correctamente!");
                    } else {
                        System.out.println("\nFecha inválida. Inténtelo de nuevo.");
                    }
                    break;
                case 2:
                    if (fecha != null) {
                        System.out.print("\nIngrese la cantidad de días a incrementar: ");
                        int cantidadDias = scanner.nextInt();
                        fecha.incrementarDia(cantidadDias);
                        System.out.println("\n¡Se incrementaron " + cantidadDias + " días!");
                    } else {
                        System.out.println("\nPrimero ingrese una fecha.");
                    }
                    break;
                case 3:
                    if (fecha != null) {
                        System.out.print("\nIngrese la cantidad de meses a incrementar: ");
                        int cantidadMeses = scanner.nextInt();
                        fecha.incrementarMes(cantidadMeses);
                        System.out.println("\n¡Se incrementaron " +cantidadMeses  + " meses!");
                    } else {
                        System.out.println("\nPrimero ingrese una fecha.");
                    }
                    break;
                case 4:
                    if (fecha != null) {
                        System.out.print("\nIngrese la cantidad de años a incrementar: ");
                        int cantidadAños = scanner.nextInt();
                        fecha.incrementarAño(cantidadAños);
                        System.out.println("\n¡Se incrementaron " + cantidadAños + " años!");
                    } else {
                        System.out.println("\nPrimero ingrese una fecha.");
                    }
                    break;
                case 5:
                    if (fecha != null) {
                        fecha.mostrar();
                    } else {
                        System.out.println("\nPrimero ingrese una fecha.");
                    }
                    break;
                case 6:
                    salir = true;
                    if (fecha != null) {
                        System.out.println("\nÚltima fecha:");
                        fecha.mostrar();
                    } else {
                        System.out.println("\nNo se ha ingresado ninguna fecha.");
                    }
                    System.out.println("\n¡Hasta luego!");
                    break;
            }
        }

        scanner.close();
    }
}
