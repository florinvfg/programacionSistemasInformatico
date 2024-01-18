package unidad1;
import javax.naming.PartialResultException;
import java.util.*;
/* Una empresa que gestiona un parque acuatico te solicita una aplicacion que les ayude a calcular
 * el importe que hay que cobrar en taquilla por compra de una serie de entradas (cuyo numero sea introducido por usuario)
 * Existen dos tipos de entrada:infantiles,que cuestan 15,50 euros y de adultos que cuestan 20 euros
 * En el caso de que el importe total sea igual o superior a 100 euros,se aplicara automaticamente un bono descuento del 5% */

public class ActividadDeAplicacion1_19_B {
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

        //System.out.println("el precio total  es " + precioTotalEntradas);
        precioConDescuento = precioTotalEntradas - (precioTotalEntradas * 0.05);
        totalDescuento = precioTotalEntradas >= 100 ? precioConDescuento : precioTotalEntradas;
        boolean x = precioTotalEntradas >=100 ? true : false;
        String msn = x==true ? "El precio TOTAL " + precioTotalEntradas + "- el precio con descuento es: " : "EL PRECIO TOTAL ES: ";
        System.out.println(msn   + totalDescuento);


        //System.out.println("el precio total de las entradas con descuento es de pagar :" + precioConDescuento +" euros");

        //System.out.println(totalDescuento);
        //System.out.println("El  descuento es: " + (precioTotalEntradas - precioConDescuento) + " euros");






    }
}
