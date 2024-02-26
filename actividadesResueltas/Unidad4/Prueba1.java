/*nombre, apellido, años*/
/*En la tranquila tarde, Juan programa un diálogo interactivo. Solicita nombre, apellido y edad al usuario,
 calcula la edad futura y muestra los datos. Así nace una conexión entre lo real y lo virtual.*/
import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre, apellido;
        byte edad;
        System.out.println("Dime el nobre");
        nombre= sc.nextLine();
        System.out.println("Dime el apellido");
        apellido= sc.nextLine();
        System.out.println("Dime la edad");
        edad =sc.nextByte();
        incrementoEdad(nombre,apellido,edad);
        
    }

    public static void incrementoEdad(String nombre, String epellido, byte edad ) {
        edad+=10;
        System.out.println(nombre + " " + epellido + " tendras dentro de 10 años ➢ " +edad + " años");

    }

}
