package Unidad3;
import java.util.*;
/*Escribe un programa que incremente la hora de un reloj.Se pediran por teclado la hora
* minutos y segundos, asi como cuantos segundos se desea incrementar la hora introducida
* La aplicacion mostrara la nueva hora. Por ejemplo, si las 13:59:51 se incrementan en 10
* segundos,resultan la 14:00:01*/

public class ActividadDeAplicacion3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora, minutos, segundos, increSegundos;

        System.out.print("Introduce una horas: ➡ ");
        hora = sc.nextInt();
        System.out.print("Introduce los minutos: ➡ ");
        minutos = sc.nextInt();
        System.out.print("Introduce los segundos: ➡ ");
        segundos = sc.nextInt();

        System.out.print("Cuantos segundos quieres incrementar ? ➡ ");
        increSegundos = sc.nextInt();
        // Verifica si la hora ingresada es válida.
        if (hora <= 23 && hora >= 0 && minutos <= 59 && minutos >= 0 && segundos <= 59 && segundos >= 0) {//Verifica si la hora ingresada es válida (en el rango adecuado).
            // Inicia un bucle para incrementar los segundos.
            for (int i = 1; i <= increSegundos; i++) {//Inicia un bucle for para incrementar los segundos según la cantidad especificada.
                segundos++;//Incrementa los segundos en 1 en cada iteración.
                // Verifica si los segundos llegan a 60.
                if (segundos == 60) {
                    segundos = 0;//Si los segundos llegan a 60, los reinicia a 0 y procede a incrementar los minutos.
                    minutos++;//Incrementa los minutos en 1.
                    // Verifica si los minutos llegan a 60.
                    if (minutos == 60) {
                        minutos = 0;
                        hora++;
                        // Verifica si la hora llega a 24.
                        if (hora == 24) {
                            hora = 0;//si la hora llega a 24, la reinicia a 0.
                        }
                    }
                }
            }
        System.out.println("Tu hora con el incremento indicado es: ⌚ " + hora + ":" + minutos + ":" + segundos + " ⌚ ");
    } else {

        System.out.println("Error. Introduzca una hora válida.");
    }
   }
}




