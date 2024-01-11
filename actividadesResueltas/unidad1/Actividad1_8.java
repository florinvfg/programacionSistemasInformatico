package unidad1;
import java.util.*;
/* Realiza una aplicacion que solicite al usuario su edad y que le indique si es
* mayor de edad (mediante un literal booleano:true o false)*/

public class Actividad1_8 {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Escriba su edad: ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad >= 18;//ser mayor de edad implica que la edad sea mayor o igual a 18
        System.out.println("Mayor de edad: " +mayorEdad);

    }
}
