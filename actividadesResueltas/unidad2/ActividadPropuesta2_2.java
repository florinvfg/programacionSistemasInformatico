package unidad2;
import java.util.*;
/*Solicita por teclado un numero de tipo int al usuario y escribe un
* programa que muestre true o false,depiendiendo de si el numero es positivo*/
public class ActividadPropuesta2_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Indique un numero entero entero negativo o positivo");
        num= entrada.nextInt();
        if (num<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es positivo");
        }





    }
}
