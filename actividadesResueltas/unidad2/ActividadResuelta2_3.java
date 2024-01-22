package unidad2;
import java.util.*;
/*Solicitar dos numeos distintos y mostrar cual es el MAYOR*/
public class ActividadResuelta2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdusca un numero: ");
        int n1 = sc.nextInt();
        System.out.println("Introdusca segundo numero: ");
        int n2 = sc.nextInt();
        /*En el caso donde ambos numeros son iguales no se completa e imprimiria
        * en pantalla que n2 es mayor que n1*/
        if (n1 > n2){
            System.out.println(n1 + " es mayor que " + n2);

        }else {
            System.out.println(n2 + " es mayor que " + n1);

        }
    }
}
