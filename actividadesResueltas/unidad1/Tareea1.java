package unidad1;
import java.util.Scanner;
/*Enunciado:
Solicita al usuario que ingrese dos numeros enteros y luego muestra la
esos dos numeros enteros con un mensaje "El resultado de  la suma de a+b es"
* */
public class Tareea1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingresa un numero entero ");
        a = sc.nextInt();
        System.out.println("Ingresa otro numero entero ");
        b = sc.nextInt();
        c=a+b;
        System.out.println("El resultado de la suma de los dos numeros es igual a " + c);
  /* codico optimizado
  * int cc; solo declaro la variable "c"
  *System.out.println("Ingresa un numero entero ");
        cc = sc.nextInt();
        System.out.println("Ingresa otro numero entero ");
         cc = sc.nextInt();
        cc=cc+nextInt();
        System.out.println("El resultado de la suma de los dos numeros es igual a " + cc); */
    }

}
