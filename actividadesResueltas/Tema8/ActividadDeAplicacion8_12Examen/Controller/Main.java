package ActividadDeAplicacion8_12Examen.Controller;

import ActividadDeAplicacion8_12Examen.Clases.Caja;
import ActividadDeAplicacion8_12Examen.Clases.CajaCarton;

import java.util.Scanner;
/**
 * [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 *
 * Las empresas de transporte,para evitar daños en los paquetes,embalan todas sus mercancias en cajas con el tamaño adecuado.
 * Una caja se crea expresamente con un ancho,un alto y un fondo y,una vez creada,se mantiene inmutable.Cada caja lleva pegada
 * una etiqueta,de un maximo de 30 caracteres,con informacion util como el nombre del destinatario,direccion,etc.Implementa la
 *  clase Caja con los siguientes metodos:
 * -Caja(int ancho, int alto, int fondo, Unidad unidad);que construye una caja con las dimenciones especificadas,que pueden
 * encontrarse en "cm"(centimetros) o "m" (metros).
 * -double getVolumen(); que devuelve el volumen de la caja en metros cubicos.
 * -void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de la caja.
 * -String toString(); que devuelve una cadena con la representacion de la caja.*/

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definición de constantes para colores de texto en la consola
        final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
        final String YELLOW = "\033[0;33m"; // Color amarillo
        final String BLUE = "\033[0;34m"; // Color azul

        System.out.println(BLUE+"\n\t \uD83D\uDCE6   Bienvenido a TodoTransporte"+RESET);
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

        // Calcular el área total de cartón utilizado por las dos cajas
        double areaCartonTotal = CajaCarton.getMetrosCuadradosCartonTotal(caja1, caja2);
        System.out.println("\nÁrea total de cartón utilizado: "+YELLOW + areaCartonTotal + " metros cuadrados"+RESET);


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
