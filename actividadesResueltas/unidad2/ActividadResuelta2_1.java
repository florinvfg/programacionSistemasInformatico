package unidad2;
import java.util.*;
/*Diseñar una aplicacion que solicite al usuario un numero
 * que es oar o inpar.
 * Analisis:Para ser par tenemos que calcular el modulo (%)al numero leido y cumple
 * que el resultado == 0es par si no impar*/
public class ActividadResuelta2_1 {
    //Insertamos el metodo principal
    public static void main(String[] args) {

        //Declaramos Scanner

        Scanner sc =new Scanner(System.in);
        int num;

        System.out.println("Indique un numero entero");
        num = sc.nextInt();
        if (num%2==0){ //si es num par
            System.out.println("El numero " + num + "  es par ");

        } else //es impar
            System.out.println("El numero " + num + " es inpar ");
        String nombre; //declaramos otra variable de tipo String para comprobar varias cosas
        System.out.print("Indica tu nombre");
        nombre= sc.next();
        if(nombre=="Maria")
            System.out.println("El nombre es real ☺ ");
        else
            System.out.println("Tu nombre no es real ");



    }
}
