package ActividadResuelta9_2_Y_9_3Irina.Controller;


import ActividadResuelta9_2_Y_9_3Irina.Clases.Lista;

import java.util.Scanner;
/*Actividividad resuelta 9.2

Utilizando la lista anterior,escribir un programa en el que se encolen numereos entereros introducidos por teclado,hasta que se introduzca uno negativo.
a continuacion,desencolarlos todos a medidas que se mostra por pantalla.
*/

/*Actividividad resuelta 9.3
Definir la interfaz Pila para numeros enteros.
*/

/**
 *[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 */
public class Main {
    public static void main(String[] args) {
        // Definición de constantes para colores de texto en la consola
        final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
        final String YELLOW = "\033[0;33m"; // Color amarillo
        final String BLUE = "\033[0;34m"; // Color azul

        Lista c = new Lista();
        c.encolar(1);//utilizamos la interace cola implementada en Lista
        c.encolar(2);
        c.encolar(3);
        c.encolar(4);
        c.encolar(5);
        c.encolar(6);
        c.encolar(7);
        System.out.println(BLUE + "Tu lista es -> " + RESET + YELLOW + c + RESET);
        c.desencolar();
        System.out.println("Quitar primer  numero -> la listase quedan :" + BLUE + c.numeroElementos() + RESET + " numeros");  //la clase Lista
        System.out.println(BLUE + "Tu nueva lista es ;" + RESET + YELLOW + c + RESET);



        Lista c1 = new Lista();
        System.out.println(BLUE+"\nLista para APILAR"+RESET);
        System.out.println("Introducir numero: ");
        Integer n = new Scanner(System.in).nextInt();

        while (n >= 0) {

            c1.apilar(n);
            System.out.println(c1);
            n = new Scanner(System.in).nextInt();

        }
        System.out.println(BLUE+"Tu lista DESAPILADA es : "+RESET);
        n = c1.desapilar();
        while (n != null) {

            System.out.println(n + ": ");
            n = c1.desapilar();
        }
    }
}