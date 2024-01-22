package unidad2;
import java.util.*;
/* Escribe una aplicacion que pida al usuario dos numeros enteros y muestre verdad  si ambos son
* distintos entre si o alguno de ellos es 0 ;y falso en caso contrario
* A!=B  o A==0 0 B==0*/
public class ActividadPropuesta2_3 {
    public static void main(String[] args) {
        //declaramos el Scanner
        Scanner sn = new Scanner(System.in);
        //Declaramos las variables para almacenar numeros y comparar
        int a, b;
        System.out.println("Indique el valor de a");
        a= sn.nextInt();
        System.out.println("Indique el valor de b");
        b= sn.nextInt();
        if (a!=b || a==0 || b==0 ){
            System.out.println("Si cumple la condicion");
        }else {
            System.out.println("Esto no cumple la condicion");
        }



    }
}
