package unidad2;
import java.util.*;
/*Implementar un programa que pida por teclado un numero decimal e indique si es un numero casi-cero,
* que son aquiellos,positivos o negativos,que se acercan  a 0 por menos de 1 unidada,
* aunque curiosamente el 0 no se considera un numero casi-cero.Ejemplo de numero casi-cero son: el 0,3
* o el -o,99 o el 0,123;algunos numeros que no se consideran casi-cero son: el 12,3, el 0 o el -1.
* */

public class ActividadResuelta2_4 {
    /*Un numero casi-cero es el que se encuentra en el intervalo (-1,  1),donde se excluye el -1, el 0 y 1.
    * para comprobar si un numero es casi-cero tendremos que utilizar una condicion con una exprecion logica*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);//esto es para utlilizar punto (.) con los decimales
        System.out.println("Introdusca un numero real positivo/negativo: ");
        double numero = sc.nextDouble();
        if (-1 < numero && numero < 1 && numero != 0 ){
            System.out.println("Es un CASI-CERO ");
        }else{
            System.out.println("No es un CASI-CERO ");
        }
    }
}
