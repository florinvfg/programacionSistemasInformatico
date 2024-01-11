package unidad1;
import java.util.*;
/* Escribir un programa que
 pida un numero al usuario e indique mediante un literal booleano (true o false) si el numero es par*/
public class Actividad1_9 {

    public static void main(String[] args) {
        /*los numeros pares tienen la propiedad que al dividirlos
        * por dos la division es exacta,es decir,el resto
        * (modulo) de la division siempre es "0"*/
        int numero;
        System.out.println("Escriba un numero: ");
        //Es habitual crear y leer de un Scanner,hacindolo todo en la misma instruccion
        numero = new Scanner(System.in) .nextInt();
        boolean esPar = (numero % 2) == 0;//calcula el resto de dividir el numero entre 2 y
        // el resultado de esta operacion lo compara con 0
        System.out.println("Es par:" + esPar);

    }
}
