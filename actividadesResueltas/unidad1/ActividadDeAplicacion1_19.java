package unidad1;
import java.util.*;
/* Una empresa que gestiona un parque acuatico te solicita una aplicacion que les ayude a calcular
* el importe que hay que cobrar en taquilla por compra de una serie de entradas (cuyo numero sea introducido por usuario)
* Existen dos tipos de entrada:infantiles,que cuestan 15,50 euros y de adultos que cuestan 20 euros
* En el caso de que el importe total sea igual o superior a 100 euros,se aplicara automaticamente un bono descuento del 5% */

public class ActividadDeAplicacion1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double entradaNinio, entradaAdulto, precioTotalEntradas,precioConDescuento;
        System.out.println("Indique numero de entradas de niños vendidas ☺ ");
        entradaNinio = sc.nextDouble();
        entradaNinio = (entradaNinio * 15.50);
        System.out.println("Indique numero de entradas de adultos ☺ ");
        entradaAdulto = sc.nextDouble();
        entradaAdulto = (entradaAdulto * 20.00);
        precioTotalEntradas = entradaNinio + entradaAdulto;
        double totalDescuento;

        System.out.println("el numero total  es " + precioTotalEntradas);
        precioConDescuento = precioTotalEntradas - (precioTotalEntradas * 0.05);
        totalDescuento = precioTotalEntradas >= 100 ? precioConDescuento : precioTotalEntradas;

        System.out.println("El precio total de venta  es " + totalDescuento);


        //System.out.println("el precio total de las entradas con descuento es de pagar :" + precioConDescuento +" euros");

        //System.out.println(totalDescuento);
        //System.out.println("El  descuento es: " + (precioTotalEntradas - precioConDescuento) + " euros");






    }
}
