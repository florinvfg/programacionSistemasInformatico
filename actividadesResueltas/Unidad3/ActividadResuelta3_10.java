package Unidad3;
import java.util.*;
/*Diseñar un programa que muestre la suma de los 10 primeros numeros
* impares*/
public class ActividadResuelta3_10 {
    /*El bucle for estara controlado por i (1...10)
    * El i-esimo numero impar se calcula: 2*i - 1*/
    public static void main(String[] args) {

        int suma = 0, impar;

        for (int i = 1; i <= 10; i ++) {
            impar = 2 * i - 1;
            suma += impar;
        }
        System.out.println("La suma de los 10 primeros impares es: " + suma);



    }
}
