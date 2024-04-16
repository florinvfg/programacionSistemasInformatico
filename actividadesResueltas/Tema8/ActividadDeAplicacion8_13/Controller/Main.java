package ActividadDeAplicacion8_13.Controller;

import ActividadDeAplicacion8_13.Clases.CajaCarton;
import ActividadDeAplicacion8_13.Clases.Unidad;
import java.util.*;
/**
 * [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * */

/**
 * /*  8.13
 * La empresa de mensajeria BiciExpress,que reparte en bicicleta,para disminuir el peso que transportan sus empleados solo
 * utiliza cajas de carton.El volumen de estas se calcula como 80% del volumen real,con el fin de evitar que se deformen y se rompan.
 * Otra caracteristicas de las cajas de carton es que sus medidas siempre estan en centimetros.Por ultimo,la empresa,para controlar
 * costes,necesita saber cual es la superficie total de carton utilizado para construir todas las cajas.
 * Escribe la clase CajaCarton heredando de la clase Caja.
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definición de constantes para colores de texto en la consola
        final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
        final String YELLOW = "\033[0;33m"; // Color amarillo
        final String BLUE = "\033[0;34m"; // Color azul

        System.out.println(BLUE+"\nIngrese las dimensiones de la Caja 1 (ancho, alto, fondo) en centímetros:"+RESET);
        int anchoCaja1 = scanner.nextInt();
        int altoCaja1 = scanner.nextInt();
        int fondoCaja1 = scanner.nextInt();

        CajaCarton caja1 = new CajaCarton(anchoCaja1, altoCaja1, fondoCaja1, Unidad.CM);

        System.out.println(BLUE+"\nIngrese las dimensiones de la Caja 2 (ancho, alto, fondo) en metros:"+RESET);
        int anchoCaja2 = scanner.nextInt();
        int altoCaja2 = scanner.nextInt();
        int fondoCaja2 = scanner.nextInt();

        CajaCarton caja2 = new CajaCarton(anchoCaja2, altoCaja2, fondoCaja2, Unidad.M);

        // Mostrar información de las cajas
        System.out.println("Caja 1: " + caja1);
        System.out.println("Volumen de caja 1: " + caja1.getVolumen());

        caja2.setEtiqueta("Caja frágil");
        System.out.println("Caja 2: " + caja2);
        System.out.println("Volumen de caja 2: " + caja2.getVolumen());

        System.out.println("El consumo de cartón es " + (caja1.getSuperficieTotal() + caja2.getSuperficieTotal()) + " cm cuadrados");

        scanner.close();
    }
}