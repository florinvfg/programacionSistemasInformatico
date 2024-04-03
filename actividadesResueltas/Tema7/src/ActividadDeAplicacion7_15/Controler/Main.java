package ActividadDeAplicacion7_15.Controler;

import ActividadDeAplicacion7_15.Clases.Calendario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Indica un dia:");
        int dia = sn.nextInt();
        System.out.println("Indica un mes:");
        int mes = sn.nextInt();
        System.out.println("Indica un año:");
        int año = sn.nextInt();


        Calendario fecha = new Calendario(dia, mes, año);
        fecha.mostrar();

        fecha.incrementarDia();
        fecha.mostrar();

        fecha.incrementarMes();
        fecha.mostrar();

        fecha.incrementarAño(2);
        fecha.mostrar();
    }
}
