package unidad1;
import java.util.Scanner;
public class Actividad1_3 {
    public static void main(String[] args) {

   int edad;//aqui guardamos la edad de ususario
   Scanner sc =new Scanner(System.in);
        System.out.println("Escriba su edad: ");
        edad = sc.nextInt();
        edad = edad + 1; //el año que viene tendra un año mas
        //la linea anterior se puede sustituir por: "edad++"
        //ahora mostraremos el valor de la variable "edad"
        System.out.println("El proximo año su edad sera: " + edad + " años ");

}
}