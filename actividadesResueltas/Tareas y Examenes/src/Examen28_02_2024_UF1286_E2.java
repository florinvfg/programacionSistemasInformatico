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
// Este programa permite a los usuarios realizar pedidos de aceite en diferentes cantidades,
// calculando el costo total y el total de litros comprados.
//// Utiliza un bucle para seleccionar entre opciones de compra y muestra el total del pedido al finalizar.
public class Examen28_02_2024_UF1286_E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Se declaran constantes para los precios de diferentes cantidades de aceite.
        final double Aceite_1l = 9.99;
        final double Aceite_3l = 29.99;
        final double Aceite_5l = 49.95;
       // Se declaran variables para almacenar la cantidad de aceite, el total a pagar, el total de litros, el código
        // del artículo, el precio unitario, los detalles del pedido y la opción seleccionada por el usuario.
        int cantidad=0;
        double cuenta = 0;
        double totalLitros = 0;
        String detallePedido = "";
        int opcion;
        do {//Inicia un bucle do-while que se ejecuta al menos una vez y continúa ejecutándose mientras la condición especificada sea true.
            System.out.println("\n\t  Venta de Aceite : ");//Imprime un mensaje para mostrar el inicio del proceso de venta de aceite.
            //Se muestran las opciones de compra de aceite junto con sus precios.
            System.out.println("\n\t1.  Aceite 1l = 9.99 euros");
            System.out.println("\t2.  Aceite 3l = 29.99 euros");
            System.out.println("\t3.  Aceite 5l = 49.95 euros");
            System.out.println("\t4. Salir");
            System.out.println("\n\t Elige una opcion ➦");
            opcion = sc.nextByte();//Lee la opción ingresada por el usuario.

            switch (opcion) {//Comienza un bloque switch para manejar diferentes opciones ingresadas por el usuario.
                case 1 -> {// Si el usuario elige la opción 1 (aceite de 1 litro), se ejecuta el siguiente bloque de código.
                    System.out.print("¿Cuántas unidades desea?: ");
                    cantidad  = sc.nextInt();
                    cuenta += cantidad * Aceite_1l;
                    totalLitros += cantidad * 1;


                }//Los casos 2 y 3 siguen un proceso similar para las opciones de aceite de 3 y 5 litros, respectivamente.

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

                default -> {//: En caso de que el usuario ingrese una opción no válida, se imprime un mensaje de error.
                    System.err.println("Opcion no valida");
                }
            }

        } while (opcion != 4); // Repetir hasta que el usuario elija salir usando 4

        System.out.println("\nHa comprado  ➢ " + totalLitros + " litros de aceite.");
        System.out.println("\n Total del pedido: " + detallePedido );
        System.out.println(" vale " + cuenta + " Euros");//Se imprime el total de litros comprados y el total a pagar.
        System.out.println("✵✵✵ Gracias por su visita ✵✵✵✵✵");//Se imprime un mensaje de agradecimiento por la visita.
    }
}








