
/**/

import java.util.*;
public class MaquinaExpendedora {
    // Definir las tablas de productos, precios y stock
    static String[][] golosinas = {
            {"KitKat", "Chicles de Fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa Haribo", "Chettos", "Twix"},
            {"Galletas OREO", "M&M's", "Patatas Fritas", "Chicles de Menta"},
            {"Milkybar", "KitKat Blanco", "Galleta Oreo Fresa", "Huesitos"}
    };

    static double[][] precios = {
            {1.5, 1.0, 0.8, 0.7},
            {1.8, 1.2, 1.0, 1.5},
            {1.4, 1.3, 1.1, 0.9},
            {1.6, 1.7, 1.2, 1.3}
    };

    static int[][] stock = {
            {10, 10, 10, 10},
            {10, 10, 10, 10},
            {10, 10, 10, 10},
            {10, 10, 10, 10}
    };

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        iniciarMaquina();
        realizarCompra();

    }

    // Función para inicializar la máquina y mostrar los productos disponibles
    public static void iniciarMaquina() {
        System.out.println("¡Bienvenido a la Máquina Expendedora!");
        System.out.println("Estos son los productos disponibles:");
        for (int i = 0; i < golosinas.length; i++) {
            for (int j = 0; j < golosinas[i].length; j++) {
                System.out.println((i + 1) + "." + (j + 1) + ". " + golosinas[i][j] + " - Precio: €" + precios[i][j] + " - Stock: " + stock[i][j]);
            }
        }
    }

    // Función para realizar una compra
    public static void realizarCompra() {
        System.out.println("\nPor favor, seleccione el producto que desea comprar (fila columna):");
        int fila = scanner.nextInt() - 1;
        int columna = scanner.nextInt() - 1;

        // Verificar si el producto seleccionado está disponible
        if (fila >= 0 && fila < golosinas.length && columna >= 0 && columna < golosinas[fila].length) {
            if (stock[fila][columna] > 0) {
                double precioProducto = precios[fila][columna];
                System.out.println("Ha seleccionado: " + golosinas[fila][columna]);
                System.out.println("El precio es: €" + precioProducto);

                // Proceso de pago
                System.out.println("Por favor, ingrese la cantidad de dinero:");
                double dineroIngresado = scanner.nextDouble();

                if (dineroIngresado >= precioProducto) {
                    double cambio = dineroIngresado - precioProducto;
                    System.out.println("Gracias por su compra. Aquí tiene su cambio: €" + cambio);
                    stock[fila][columna]--;
                } else {
                    System.out.println("El dinero ingresado es insuficiente. La compra ha sido cancelada.");
                }
            } else {
                System.out.println("El producto seleccionado no está disponible en este momento.");
            }
        } else {
            System.out.println("La opción seleccionada no es válida.");
        }
    }
}