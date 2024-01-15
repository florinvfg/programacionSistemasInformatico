package unidad1;
import java.util.Scanner;
/*Enunciado:
En una tienda,se requier calcular el procentaje de descuento de un producto,por lo que
debes solicitar el precio del producto y el procentaje a aplicar,y calcular el precio total*/
public class Tareea2 {
    public static void main(String[] args) {
 double precio;
        Scanner sc =new Scanner(System.in);
        System.out.println("Indica el precio del producto ");
        precio = sc.nextDouble();
        System.out.println("Indica el descuento ");
        double precioFinal =precio-(precio*(sc.nextDouble()/100));//operacion matematica
        System.out.println( precioFinal);

        /*
        estas lineas son igual que la linea 11 de forma mas detallada
        * Double descuento =sn.nextDouble();
        * Double montoDescuento =precio-descuento/100;
        * Double precioTotal=precio-montoDescuento;*/
    }
}
