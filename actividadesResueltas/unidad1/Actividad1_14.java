package unidad1;
import java.util.*;
import java.util.Locale;
/* Realizar un programa que pida como un numero decimal y lo muestre redondeando
* al entero mas proximo*/
/*CUANDO SE IMPORTAN MULTIPLES CLASES DE UN MISMO PAQUETE,EN LUGAR DE ESCRIBIR
* UN IMPORT POR CADA CLASE,EXISTE LA OPCION DE USAR: import java.util.*; QUE VA A
* IMPORTAR LAS CLASES NECESARIAS DE JAVA.UTIL */
public class Actividad1_14 {
    /*Redondear un numero decimal significa aproximarlo al entero mas cercano.
    * Para ello,lo que haremos sera sumar 0,5 y trucar (eliminar los decimales) el resultado.
    * Asi los numeros:
    * 2,3 se redondea a 2
    * 4.8 se redondea a 5*/
    public static void main(String[] args) {
        double n;//aqui guardamos el numero decimal introducido por el usuario
        int redondeo;//utilizamos esta variable para truncar los decimales
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);//en lugar de coma utiliza punto para los decimales
        System.out.println("Escriba un numero decimal (con punto): ");
        n = sc.nextDouble();
        //ahora redondearemos "n"
        redondeo = (int) (n + 0.5);//convertimos un real en un entero
        /* Esta es una conversion por estrechamiento,por lo tanto estamos
        * obligados a aplicar un cast (int) . En caso de no hacerlo el compilador
        * generara un error*/
        System.out.println(n + "redondeado es: " + redondeo);








    }
}
