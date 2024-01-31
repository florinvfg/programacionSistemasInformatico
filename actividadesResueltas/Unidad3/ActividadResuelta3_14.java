package Unidad3;
import java.util.*;
/*Aplicación que muestra las tablas del 1 al 10.*/
public class ActividadResuelta3_14 {
    /*Ya tenemos un algoritmo (en el ejercicio anterior) para realizar la tabla de multiplicar de un numero dado.
    * La idea es aprovecharlo, y ejecutar el codico repetida de veces para mostrar las tablas de multiplicar de 1 al 10*/
    public static void main(String[] args) {



        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("\nTabla del " + tabla);
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " x " + i + " = " + tabla * i);
            }
        } System.out.print("\n");


    }
}
