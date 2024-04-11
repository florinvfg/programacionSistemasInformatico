package ActividadResuelta8_3.Contrroler;

/*  Resuelta 8.3

Añadir la clase HoraExacta un metodo que compare si dos horas(la invocante y o otra pasada como parametro
 de entrada al metodo)son iguales o son distintas.
*/

import ActividadResuelta8_3.Clases.HoraExacta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definición de constantes para colores de texto en la consola
        final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
        final String YELLOW = "\033[0;33m"; // Color amarillo
        final String BLUE = "\033[0;34m"; // Color azul

        // Creación de un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);
        String HoraExacta = String.valueOf(0);
        // Solicitud de entrada al usuario para la primera hora
        System.out.println(YELLOW+"\n\tIngrese la primera hora, minutos y segundos:"+RESET);
        System.out.print("Hora: ");
        int hora1 = scanner.nextInt();
        System.out.print("Minutos: ");
        int minuto1 = scanner.nextInt();
        System.out.print("Segundos: ");
        int segundo1 = scanner.nextInt();
        HoraExacta a = new HoraExacta(hora1, minuto1, segundo1);

        // Solicitud de entrada al usuario para la segunda hora
        System.out.println(YELLOW+"\n\tIngrese la segunda hora, minutos y segundos:"+RESET);
        System.out.print("Hora: ");
        int hora2 = scanner.nextInt();
        System.out.print("Minutos: ");
        int minuto2 = scanner.nextInt();
        System.out.print("Segundos: ");
        int segundo2 = scanner.nextInt();
        HoraExacta b = new HoraExacta(hora2, minuto2, segundo2);

        // Creación de una tercera hora con valores predeterminados
        HoraExacta c = new HoraExacta(10, 20, 30);

        System.out.println(BLUE+"Hora predeterminada " +RESET+ c);

        // Comprobación de igualdad entre a y b, e impresión del resultado
        System.out.println(BLUE+"\n¿Son iguales la primera y la segunda hora?: "+RESET + a.equals(b));

        // Comprobación de igualdad entre a y c, e impresión del resultado
        System.out.println(BLUE+"¿Son iguales la primera hora y la hora predeterminada?: "+RESET + a.equals(c));

        // Cierre del objeto Scanner para liberar recursos
        scanner.close();
    }
}
