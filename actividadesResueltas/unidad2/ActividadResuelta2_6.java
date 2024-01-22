package unidad2;
import java.util.*;
/*Realizar de nuevo la actividad resuelta 2.3 considerando el caso de que los numeros
* introducidos sean iguales*/

public class ActividadResuelta2_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdusca un numero: ");
        int n1 = sc.nextInt();
        System.out.println("Introdusca segundo numero: ");
        int n2 = sc.nextInt();
        if (n1 == n2){
            System.out.println("Son iguales");

        }else{
            //si no son yguales podemos decidir cual es mayor
            if (n1 > n2){
                System.out.println(n1 + " es mayor que " + n2);
            }else{
                System.out.println(n2 + "es mayor que " + n1);
            }
        }




    }
}
