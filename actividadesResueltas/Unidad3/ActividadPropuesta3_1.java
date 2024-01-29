package Unidad3;
import java.util.*;
/*Diseña una aplicacion que muestre la edad maxima y minima de un grupo de alumnos.
* El usuario introducira las edades y terminara escribiendo un -1*/

/*INSTRUCCIONES
* solicitar edad
* leer edad
* 1 entrada asignar a la variable
* edadMaxima=edad;
* edadMinima=edad;
* mientras edad !=-1
* comparo edadMinima>edad
* edadMinima=edad;
* comparo edadMaxima<edad
* edadMaxima=edad */
public class ActividadPropuesta3_1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        byte edad, edadMinima, edadMaxima;
        System.out.println("indica la edad");
        edad = sn.nextByte();
        edadMaxima = edad;
        edadMinima = edad;
        while (edad != -1) {//se repitira mientras el usuario no escribe -1
            //condiciones if
            if (edadMinima > edad) {
                edadMinima = edad;
            }
            if (edadMaxima < edad) {
                edadMaxima = edad;

            }
            System.out.println("indica la edad");
            edad = sn.nextByte();

        }
            System.out.println("la edad minima es " + edadMinima);
            System.out.println("la edad maxima es " + edadMaxima);


        }
    }
