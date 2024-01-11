/*Escribir una aplicacion que pida el año actual de nacimiento del usuario.Debe
calcular su edad,suponiendo que el año en curso el ususario ya ha cupliido años
*
* */


package unidad1;
import java.util.Scanner;

public class Actividad1_4 {

    public static void main(String[] args) {
        int aActual;
        int aANacimiento;
        int edad;
        Scanner sc = new Scanner(System.in);//leemos los datos
        System.out.println("Año de nacimiento: ");
        aANacimiento = sc.nextInt();
        System.out.println("Año actual: ");
        aActual = sc.nextInt();
        edad = aActual- aANacimiento; // calculamos la edad
        System.out.println("Su edad es: " + edad + "años. ");
 /* La edad puede calcularse como la diferencia entre el año actual y de nacimiento
 Esto puede contener un error,en el caso de que en la fecha actual aun no se haya celebrado
 el cumpleaños del año en curso.Supondremos que el cumpleaños del ususario ya ha tenido lugar
 este año
 * */


    }

}
