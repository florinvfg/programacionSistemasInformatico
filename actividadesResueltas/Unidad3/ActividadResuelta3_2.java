package Unidad3;
import java.util.*;
/* Implementar una aplicacion para calcular datos estadisticos de las edades
* de los alumnos de un centro educativo.Se introduciran datos hasta que uno de
* ellos sea negativo,y se mostrara: la suma de todas las edades introducidas
* la media, el numero de alumnos y cuantos son mayores de edad*/
public class ActividadResuelta3_2 {
    /*Desconcemos cuantas edades se van a utilizar como datos, el bucle while se
    * ejecutara mientras la edad introducida no sea negativa.En cada interacccion
    *  acumularemos la eda, incrementaremos un contador para llevar la cuenta de las
    * edades introducidasy si el alumno es mayor de edad, incrementaremos el contador
    * de alumnos mayores de edad.cuando salgamos del bucle mostraremos los datos y calcula
    * remos la media.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaEdades = 0, contadorAlumnos = 0, contadorMayores = 0;
        double media;//media de las edades
        System.out.println("Introduzca edad: ");
        int edad = sc.nextInt();
        while ( edad >= 0) {//leemos la edad
            sumaEdades += edad;//acumulamos la edad
            contadorAlumnos++;//incrementamos
            if (edad>=18){
                contadorMayores++;
            }
            System.out.println("Introduzca edad: ");
            edad = sc.nextInt();//volver a leer

        }
        media= (double)  sumaEdades/contadorAlumnos;
        System.out.println("Suma de todas las edades: " + sumaEdades);
        System.out.println("Media: " + media);
        System.out.println("Numero total de alumnos: " + contadorAlumnos);
        System.out.println("Mayores de edad: " + contadorMayores);;

    }
}