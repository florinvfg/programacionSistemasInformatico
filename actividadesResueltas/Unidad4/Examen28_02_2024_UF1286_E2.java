/*Una empresa que se dedica a la venta de Aceite de Oliva   necesita una aplicación en java para gestionar las facturas.
 En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
Realizar un menú, con la siguiente estructura:

1->Facturar
2->Salir
 En facturar, solicitar el código que pueden ser (01 de 1 litro, 02 de 3 litros y 03 de 5 litros)
Según el formato, los precios son:
1 litro -> 9,99€
3 litros -> 29,99€
5 litros-> 49,95€ */

import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class Examen28_02_2024_UF1286_E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double Aceite_1l = 9.99;
        final double Aceite_3l = 29.99;
        final double Aceite_5l = 49.95;
        int cantidad=0;
        double cuenta = 0;
        double totalLitros = 0;
        int codigoArticulo = 0;
        double precioUnitario;
        String detallePedido = "";
        int opcion;
        do {
            System.out.println("\n\t  Venta de Aceite : ");
            System.out.println("\n\t1.  Aceite 1l = 9.99 euros");
            System.out.println("\t2.  Aceite 3l = 29.99 euros");
            System.out.println("\t3.  Aceite 5l = 49.95 euros");
            System.out.println("\t4. Salir");
            System.out.println("\n\t Elige una opcion ➦");
            opcion = sc.nextByte();

            switch (opcion) {
                case 1 -> {
                    System.out.print("¿Cuántas unidades desea?: ");
                    cantidad  = sc.nextInt();
                    cuenta += cantidad * Aceite_1l;
                    totalLitros += cantidad * 1;


                }
                case 2 -> {
                    System.out.print("¿Cuántas unidades desea? ➢  ");
                    cantidad = sc.nextInt();
                    cuenta += cantidad * Aceite_3l;
                    totalLitros += cantidad * 3;

                }
                case 3 -> {
                    System.out.print("¿Cuántas unidades desea? ➢  ");
                    cantidad = sc.nextInt();
                    cuenta += cantidad * Aceite_5l;
                    totalLitros += cantidad * 5;

                }
                case 4 -> System.out.println("Generando su cuenta ➢");

                default -> {
                    System.err.println("Opcion no valida");
                }
            }

        } while (opcion != 4); // Repetir hasta que el usuario elija salir usando 4
        // Calcular el IVA
        // Mostrar el total del pedido
        System.out.println("\nHa comprado  ➢ " + totalLitros + " litros de aceite.");
        System.out.println("\n Total del pedido: " + detallePedido );
        System.out.println(" vale " + cuenta + " Euros");
        System.out.println("✵✵✵ Gracias por su visita ✵✵✵✵✵");
    }
}








