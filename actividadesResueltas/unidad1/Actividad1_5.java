package unidad1;
import java.util.Scanner;
/*
* El tipo "short" permite almacenar valores comprendidos entre -32768 y 32767.
* Escribir un programa que compruebe que el rango de valores de un tipo se comporta de forma ciclica,es decir,el valor siguiente
* al maximo es el valor minimo*/
public class Actividad1_5 {
    public static void main(String[] args) {
//veremos como Java evita que una operacion provoque un debordamiento.
        short num;
        num = 32767; //valor maximo dentro del rango de short
        System.out.println("Valor maximo para el tipo short: " + num);
        num ++;//incrementamos en 1.Para evitar salirse de rango la variable num
        //tomara el valor minimo para el tipo short
        System.out.println("Valor minimo para el tipo short:" + num);


    }
}
