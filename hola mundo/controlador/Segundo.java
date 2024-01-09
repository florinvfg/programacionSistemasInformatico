package controlador;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Segundo {
    public static void main(String[] args) {
        //escribe tun nombre

        String nombre = ("Florin");
        System.out.println( "mi nombre es " + nombre.toUpperCase() );
        System.out.println( "mi nombre es " + nombre.toLowerCase() );
        LocalDate hoy=LocalDate.now(); // el ide automaticamente te importa la api que necesitas
        System.out.println(hoy);
        int a=5;
        int b=6;
        int c=a+b; //c=11
        System.out.println("El valor de c es " + c);
        c=c-a; //c=6 la variable puede cambiar de valor mientras se ejecuta el programa
        System.out.println("Ahora 'c' vale " +c);
        /*constantes se refiere al valor una vez declarado no cambia mientras se ejecuta el programa*/
        final int MayorEdad=18;
        LocalTime hora=LocalTime.now();
        System.out.println("La hora local de ahora es " + LocalTime.now());

        Double calculo=Math.pow(5,2);
        System.out.println("El resultado es " +calculo);
       // para calcular la raiz de un numero es Math.sqrt(numero que quieremos)
        double raizCuadrada=Math.sqrt(16);
        System.out.println( "La raiz cuadrada de 16 es " + raizCuadrada);
        System.out.print( "es una prueba");
        System.out.print(" es otra prueba");
        System.out.println("");//salto de linea
        System.out.print("");// no hay salto de linea

        /* Entrada de datos por consola con la Clase Scanner */
        Scanner entrada=new Scanner(System.in);//tipo System.in indica que captura los datos del teclado
       /* System.out.println("Indica tu nombre");
        String nombreUsuario= entrada.nextLine();//la siguente linea lo indica es que escriba el usuario se guarda en la variable
        System.out.println("El ususario se llama " + nombreUsuario);
        System.out.println("Indica tu edad ");
        short edad=entrada.nextShort();
        System.out.println("Su edad es " + edad);
        int nuevaEdad=edad+1;
        System.out.println("El año que viene tendras " + nuevaEdad + " años ");
        System.out.println("Indica el año de nacimiento ");
        short anioNac=entrada.nextShort();
        short edadCalculada= (short) (2024-anioNac);
        System.out.println("Tu edad calculada es " + edadCalculada + " años ");*/

        System.out.println("Indica el precio del articulo ");
        Double precio=entrada.nextDouble();




    }
}
