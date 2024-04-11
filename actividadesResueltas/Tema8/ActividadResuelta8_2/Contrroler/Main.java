package ActividadResuelta8_2.Contrroler;

import ActividadResuelta8_2.Clases.HoraExacta;

import java.util.Scanner;

/*  Resuelta 8.2

A partir de la clase Hora implementar una clase HoraExacta,que incluye en la hora los segundos.Ademas de los metodos heredados de Hora,dispondra de:
-HoaExacta(hora, minutos, segundo),que construye un objeto con los datos pasados como parametros.
-setSegundo(valor),que asigna,si esta comprendido entre 0 y 59,el valor indicado a los segundos.
-inc(),que incrementa la hora en un segundo.
 * 
 */





public class Main {
    public static void main(String[] args)  {
        HoraExacta r = new HoraExacta (11, 15, 23); //hora de descanso!
        System.out.println(r);
        for (int i = 1; i <= 61; i++) {
            r.inc();
        }
        System.out.println(r);
        System.out.println("Escriba los segundos: ");
        int segundos = new Scanner(System.in).nextInt();
        if (r.setSegundos(segundos)) {
            System.out.println(r);
        } else {
            System.out.println("No es posible cambiar los segundos.");
        }

    }
}