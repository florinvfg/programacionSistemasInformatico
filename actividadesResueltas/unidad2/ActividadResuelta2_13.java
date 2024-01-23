package unidad2;
import java.util.*;
/*Escribir un programa que pida una hora de la siquiente forma:hora, minutos y segundos
* El programa debe mostrar que hora sera un segundo mas tarde.
* Por ejemplo:
* hora actual[10:41:59]-> hora actual + 1 segundo: [10:42:00]*/
public class ActividadResuelta2_13 {
    /*Suponemos que la hora introducida por el usuario es correcta.El algoritmo incrementa los segundos en 1.Esto
    * puede hacer que salgan del rango 0..59, en este caso, pondremos los segundos a 0 e incrementamos los minutos.
    * Igualmente tenemos que comprobar que los minutos no se salgan de rango.E igual para las horas*/
    public static void main(String[] args) {
        int hora, minutos, segundos;//horas, minutos y segundos

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hora: ");
        hora = sc.nextInt();

        System.out.print("Introduzca minutos: ");
        minutos = sc.nextInt();

        System.out.print("Introduzca segundos: ");
        segundos = sc.nextInt();

        segundos++;
        if (segundos > 59) {//si los segundos superan 59
            segundos = 0;//los reiniciamos a 0
            minutos++;//e incrementamos los minutos
            if (minutos > 59) {//si los minutos superan 59
                minutos = 0;//los reiniciamos
                hora++;//e incrementamos la hora
                if (hora > 23) {//si la hora supera 23
                    hora = 0;//reiniciamos la hora a 0
                }
            }
        }
        System.out.println("Hora mas un segundo: " + hora + ":" + minutos + ":" +segundos);
    }
}






