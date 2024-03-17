
/*"¡Bienvenido a la Máquina del Capricho! 

 Desde los clásicos KitKats hasta las tentadoras Galletas OREO, tu puedes satisfacer sus deseos con solo presionar un botón.
  Asegúrate de gestionar adecuadamente los pasos.
  
  ¡Que comience la dulce aventura!"*/

import java.util.Scanner;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class MaquinaExpendedora {
    // Definir las tablas de productos, precios y stock
    static String[][] golosinas = {
            {"KitKat", "Chicles de Fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa Haribo", "Chettos", "Twix"},
            {"Galletas OREO", "M&M's", "Patatas Fritas", "Chicles de Menta"},
            {"Milkybar", "KitKat Blanco", "Galleta Oreo Fresa", "Huesitos"}
    };
// Definir precios de las golosinas
    static double[][] precios = {
            {1.5, 1.0, 0.8, 0.7},
            {1.8, 1.2, 1.0, 1.5},
            {1.4, 1.3, 1.1, 0.9},
            {1.6, 1.7, 1.2, 1.3}
    };
// Definir stock inicial de las golosinas
    static int[][] stock = {
            {10, 10, 10, 10},
            {10, 10, 10, 10},
            {10, 10, 10, 10},
            {10, 10, 10, 10}
    };

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        iniciarMaquina();// Llamar a la función para iniciar la máquina
        realizarCompra();// Llamar a la función para realizar una compra

    }

    // Función para inicializar la máquina y mostrar los productos disponibles
    public static void iniciarMaquina() {
        System.out.println("\n¡¡Adelante y disfruta de tu Máquina de los Dulces!");
        System.out.println("\n\t ¡Haz tus elecciones y déjate llevar por la dulce aventura!:");
        for (int i = 0; i < golosinas.length; i++) {// Iterar sobre las filas de la tabla de golosinas
            for (int j = 0; j < golosinas[i].length; j++) {
               // Mostrar el nombre, precio y stock de cada producto 
                System.out.println((i + 1) + "." + (j + 1) + ". " + golosinas[i][j] + " - Precio: €" + precios[i][j] + " - Stock: " + stock[i][j]);
            }
        }
    }

    // Función para realizar una compra
    public static void realizarCompra() {
        System.out.println("\nPor favor, seleccione el producto que desea comprar (fila columna):");
        int fila = scanner.nextInt() - 1;// Obtener la fila seleccionada por el usuario
        int columna = scanner.nextInt() - 1;// Obtener la columna seleccionada por el usuario


        // Verificar si el producto seleccionado está disponible
        if (fila >= 0 && fila < golosinas.length && columna >= 0 && columna < golosinas[fila].length) {
            if (stock[fila][columna] > 0) {// Verificar si hay stock disponible para el producto seleccionado
                double precioProducto = precios[fila][columna];// Obtener el precio del producto seleccionado
                System.out.println("Ha seleccionado: " + golosinas[fila][columna]);// Mostrar el producto seleccionado
                System.out.println("El precio es: €" + precioProducto);// Mostrar el precio del producto

                // Proceso de pago
                System.out.println("Por favor, ingrese la cantidad de dinero:");
                double dineroIngresado = scanner.nextDouble();// Obtener la cantidad de dinero ingresada por el usuario

                if (dineroIngresado >= precioProducto) {// Verificar si el dinero ingresado es suficiente
                    double cambio = dineroIngresado - precioProducto;// Calcular el cambio
                    System.out.println("Gracias por su compra. Aquí tiene su cambio: €" + cambio);
                    stock[fila][columna]--;// Descontar una unidad del stock del producto comprado
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
//Este código contiene funciones para inicializar la máquina, mostrar los productos disponibles y realizar una compra. 
//Puedes construir sobre esto agregando más funcionalidades según las necesidades.
