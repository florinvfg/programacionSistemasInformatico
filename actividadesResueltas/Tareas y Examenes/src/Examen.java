import java.util.*;
/*Crear un programa que permita a traves de un menu (tortilla,croquetas, jamon y queso,bebidas)
* Indicar lo que el cliente solicita y mostrar el total de su pedido,tomando en cuenta los precios:
* tortilla 2 Euros
* croquetas 8 euros
* jamon y queso 15 euros
* */
public class Examen {
    public static void main(String[] args) {
      // Definir los precios de los productos
        final double PRECIO_TORTILLA = 2.0;
        final double PRECIO_CROQUETAS = 8.0;
        final double PRECIO_JAMON_Y_QUESO = 15.0;
        final double PRECIO_BEBIDA = 2.0;

        // Variables para almacenar la cantidad de cada producto seleccionado
        int cantidadTortilla = 0;
        int cantidadCroquetas = 0;
        int cantidadJamonQueso = 0;
        int cantidadBebidas = 0;

        // Variable para almacenar el total del pedido
        double totalPedido = 0.0;

        // Objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú
        System.out.println(" ✵✵✵✵✵✵ Bienvenido ✵✵✵✵✵✵ ");
        System.out.println(" ✵✵✵        MENU       ✵✵✵✵");
        System.out.println("1✵ Tortilla - 2 Euros");
        System.out.println("2✵ Croquetas - 8 Euros");
        System.out.println("3✵ Jamón y Queso - 15 Euros");
        System.out.println("4✵ Bebidas - 2 Euros");
        System.out.println("\n\t5✵ Salir");


        // Bucle para que el usuario haga su selección
        boolean salir = false;
        while (!salir) {
            System.out.print("Seleccione una opción del menú: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántas raciones de tortillas desea?: ");
                    cantidadTortilla = scanner.nextInt();
                    totalPedido += cantidadTortilla * PRECIO_TORTILLA;
                    break;
                case 2:
                    System.out.print("¿Cuántas raciones de croquetas desea?: ");
                    cantidadCroquetas = scanner.nextInt();
                    totalPedido += cantidadCroquetas * PRECIO_CROQUETAS;
                    break;
                case 3:
                    System.out.print("¿Cuántas raciones de jamón y queso desea?: ");
                    cantidadJamonQueso = scanner.nextInt();
                    totalPedido += cantidadJamonQueso * PRECIO_JAMON_Y_QUESO;
                    break;
                case 4:
                    System.out.print("¿Cuántas bebidas desea?: ");
                    cantidadBebidas = scanner.nextInt();
                    totalPedido += cantidadBebidas * PRECIO_BEBIDA;
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.err.println("Por favor, seleccione una opción válida.");
            }
        }

        // Mostrar el total del pedido
        System.out.println("\nTotal del pedido: " + totalPedido + " Euros");
        System.out.println("✵✵✵ Gracias por su visita ✵✵✵✵✵");

        // Cerrar el Scanner
        scanner.close();


        //otro tipo de hacerlo


        //declaracion de variables
      /*  Scanner sn = new Scanner(System.in);
        int cuenta = 0;
        int cantidad;
        String detallePedido = "";
        byte opcion = 0;
        final double IVA = 0.21; // Porcentaje de IVA
        //crear bucle con el menu
        do {
            System.out.println("...Menu Cafeteria....");
            System.out.println("\t1. Tortilla");
            System.out.println("\t2. Croquetas");
            System.out.println("\t3. Jamon y Queso");
            System.out.println("\t4. Bebidas");
            System.out.println("\t5. Salir");
            System.out.println("\n\t. Indica una opcion");
            opcion = sn.nextByte();
            switch (opcion) {
                case 1 -> {
                    System.out.print("¿Cuántas tortillas desea?: ");
                    cantidad = sn.nextInt();
                    cuenta += 2 * cantidad;
                    detallePedido += "\t" + cantidad + " Tortilla(s)\n";
                }
                case 2 -> {
                    System.out.print("¿Cuántas croquetas desea?: ");
                    cantidad = sn.nextInt();
                    cuenta += 8 * cantidad;
                    detallePedido += "\t" + cantidad + " Croqueta(s)\n";
                }
                case 3 -> {
                    System.out.print("¿Cuántos platos de Jamón y Queso desea?: ");
                    cantidad = sn.nextInt();
                    cuenta += 15 * cantidad;
                    detallePedido += "\t" + cantidad + " Jamón y Queso\n";
                }
                case 4 -> {
                    System.out.print("¿Cuántas bebidas desea?: ");
                    cantidad = sn.nextInt();
                    cuenta += 3 * cantidad;
                    detallePedido += "\t" + cantidad + " Bebida(s)\n";
                }
                case 5 -> System.out.println("Generando su cuenta");

                default -> {
                    System.err.println("Opcion no valida");
                }
            }

        } while (opcion != 5); // Repetir hasta que el usuario elija salir usando 5
        // Calcular el IVA
        double totalConIVA = cuenta * (1 + IVA);

        System.out.println("\n\n ✵✵✵✵ Factura ✵✵✵✵✵ ");
        System.out.println("\tPedido: \n" + detallePedido);
        System.out.println("\tImporte a pagar (sin IVA): " + cuenta + " € ");
        System.out.println("\tIVA (" + (IVA * 100) + "%): " + (totalConIVA - cuenta) + " € ");
        System.out.println("\tImporte total a pagar (con IVA): " + totalConIVA + " € ");
        System.out.println("    ✵✵✵✵✵✵✵✵✵✵✵✵✵✵✵✵");*/
    }
}




