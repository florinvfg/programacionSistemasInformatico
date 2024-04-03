package Controler;

import Clases.Calendario;
/**
 * Diseña la clase Calendario que representa una fecha concreta(año,mes y dia).
 * La clase debe disponer de los metodos:
 *      -Calendario(int año, int mes, int dia):
 * que crea un objeto con los datos pasados como parametro,siempre y cuando,la fecha
 * que representen sea correcta.
 *       -void incrementarDia():
 * que incrementa en un dia la fecha del calendario.
 *       -void incrementarMes():
 * que incrementa en un mes la fecha del calendari.
 *       -void incrementarAño(int cantidad):
 * que incrementa la fecha del calendario en el numero de años especificados.
 * ten en cuenta que el año 0 no existe.
 *        -void mostrar():
 * muestra la fecha por consola
 *         -boolean iguales(Calendario otraFecha):
 * que determina si la fecha invocante y la que  se pasa como parametro son iguales o distintas.
 * Por simplicidad,solo tendremos en concideracion que existen meses con distinto numero de dias,
 * pero no tendremos en cuenta los años bisiestos
 * */

import java.util.Scanner;

import static Clases.Calendario.fechaEsValida;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día:");
        int dia = scanner.nextInt();


        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año:");
        int año = scanner.nextInt();

        if (fechaEsValida(año, mes, dia)) {
            Calendario fechaUsuario = new Calendario(año, mes, dia);
            System.out.println("\nTu fecha es : ");
            fechaUsuario.mostrar();
            System.out.println("\nIncrementar un dia,seria:");
            fechaUsuario.incrementarDia();
            fechaUsuario.mostrar();
            System.out.println("\nIncrementar un mes,seria:");
            fechaUsuario.incrementarMes();
            fechaUsuario.mostrar();
            System.out.println("\nIncrementar dos años,seria:");
            fechaUsuario.incrementarAño(2);
            fechaUsuario.mostrar();


            Calendario fechaIncrementada = new Calendario(año, mes, dia);


            boolean sonIguales = fechaUsuario.iguales(fechaIncrementada);
            System.out.println("\n¿Las dos fechas son iguales? = " + sonIguales);
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
    }

}

