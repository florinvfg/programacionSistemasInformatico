package ActividadDeAplicacion8_12Examen.Controller;

import ActividadDeAplicacion8_12Examen.Clases.Caja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definición de constantes para colores de texto en la consola
        final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
        final String YELLOW = "\033[0;33m"; // Color amarillo
        final String BLUE = "\033[0;34m"; // Color azul

        System.out.println(BLUE+"\n\t    Bienvenido a TodoTransporte"+RESET);
        // Crear una caja de dimensiones 1m x 1m x 1m
        Caja caja1 = new Caja(1, 1, 1, Caja.Unidad.M);
        System.out.println(YELLOW+"\n\tIngrese el nombre y la dirección del destinatario para la Caja 1:"+RESET);
        String etiquetaCaja1 = crearEtiqueta(scanner);
        caja1.setEtiqueta(etiquetaCaja1);

        // Crear una caja de dimensiones 50cm x 50cm x 50cm
        Caja caja2 = new Caja(50, 50, 50, Caja.Unidad.CM);
        System.out.println(YELLOW+"\n\tIngrese el nombre y la dirección del destinatario para la Caja 2:"+RESET);
        String etiquetaCaja2 = crearEtiqueta(scanner);
        caja2.setEtiqueta(etiquetaCaja2);

        // Mostrar información de las cajas
        System.out.println("\nCaja 1:");
        System.out.println("Volumen: " + caja1.getVolumen() + YELLOW+" m^3"+RESET);
        System.out.println(YELLOW+" " + caja1.toString()+RESET);

        System.out.println("\nCaja 2:");
        System.out.println("Volumen: " + caja2.getVolumen() + " m^3");
        System.out.println(YELLOW+" " + caja2.toString()+RESET);
        System.out.println(BLUE+"\n\t ! Gracias por trabajar con nosotros !" + RESET);
        scanner.close();
    }


    // Método para crear la etiqueta solicitando nombre y dirección del destinatario
    private static String crearEtiqueta(Scanner scanner) {
        System.out.print( "Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        return "Destinatario: " + nombre + ", Dirección: " + direccion;
    }
}
