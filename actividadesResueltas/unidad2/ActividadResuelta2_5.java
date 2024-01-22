package unidad2;
import java.util.*;
/* pedir dos numeros y mostrarlos ordenados de forma creciente.
* para ordenar dos numeros hay que compararlos.Es posible hacer el programa
* usando if-else,pero en este caso vamos a hacerlo con el operador ternario*/

public class ActividadResuelta2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2; // los numeros que indica el usuario
        int mayor, menor; //contendran el mayor el menor de num1 y num2
        System.out.println("Introduzca un numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca segundo numero: ");
        num2 = sc.nextInt();
        mayor = num1>num2 ? num1 : num2; //si num1 es el mayor,entonces mayor0num1,si no =num2
        menor = num1<num2 ? num1 : num2;//si num1 es menor que num2,entonces menor=num1,si no =num1
        System.out.println(mayor + "," + menor);






    }
}
