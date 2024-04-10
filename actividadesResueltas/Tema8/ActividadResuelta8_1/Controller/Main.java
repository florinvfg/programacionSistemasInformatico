package ActividadResuelta8_1.Controller;



import ActividadResuelta8_1.Clase.Hora;

import java.util.Scanner;

/*   resuelta 8.1

Diseñar una clase "Hora",que representa un instante de tiempo compuesto por la hora(de 0 a 23)y los minutos.Dispone de los metodos:
-Hora(hora, minuto),que construye un objeto con los datos pasados como parametros.
-voin inc[],que incrementa la hora en un minuto.
-boolean setMinutos(valor),que asigna un valor,si es valido,a los minutos.Devuelve true o false segun haya sido posible modificar los minutos o no.
-boolean setHora(valor),que asigna un valor,si esta comprendido entre 0 y 23,a la hora.Devuelve true o false segun haya sido posible cambiar la hora o no.
-String toString[],que devuelve un String con representacion de la hora.

 */






        public class Main {
            public static void main(String[] args) throws Exception {
                Hora r = new Hora(11, 30); // 11:30
                System.out.println(r); // 11:30
                for (int i = 0; i <= 61; i++) {  //incrementamos 61 minutos
                    r.inc(); // 11:31

                }
                System.out.println(r); //mostramos la hora
                System.out.println( "Escribe una hora: "); //pedir  la hora
                int hora = new Scanner(System.in).nextInt();
                boolean cambio = r.setHora(hora); //cambiamos la hora
                if (cambio) {
                    System.out.println(r);

                } else {
                    System.out.println( "La hora no se pudo cambiar ");
                }
            }
        }




