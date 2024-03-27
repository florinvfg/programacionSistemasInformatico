
package ActividaResuelta7_6.Controler;

/**
 * Escribir un programa que lea por teclado una hora cualquiera y un numero n que representa una
 cantidad en segundos.El programa mostrara la hora introducida y las n siguientes,que se
 diferencian en un segundo.Para ello hemos de diseñar previamente la clase HORA que dispone de
 los atributos hora,minuto y segundos.Los valores de los atributos se controlaran mediante metodos
 set/get.
 */
import ActividaResuelta7_6.Clase.Hora;

import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Hora h = new Hora();
        System.out.println("\n\tIngrese la hora: ");
        int valor = sc.nextInt();
        h.setHora (valor);
        System.out.println("\n\tIngrese el minuto: ");
        valor = sc.nextInt();
        h.setMinuto (valor);
        System.out.println("\n\tIngrese el segundo: ");
        valor = sc.nextInt();
        h.setSegundo(valor);
        System.out.println(" \n\tCuantos segundos quieres mostrar: ");
        int numSegundos = sc.nextInt();
        for (int i = 0; i < numSegundos; i++) {
            System.out.println("La hora introducida es: "+h.getHora()+ ":" +h.getMinuto()+ ":" +h.getSegundo());
            h.incrementaSegundo();

        }
    }
}


