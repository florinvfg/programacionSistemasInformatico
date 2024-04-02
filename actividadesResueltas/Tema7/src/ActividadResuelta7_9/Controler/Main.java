package ActividadResuelta7_9.Controler; /**
 * 7.9
 * Modelar una casa con muchas bombillas,de forma que cada bombilla se puede encender o apagar individualmente.Pa ello,hacer una clase Bombilla
 * con una variable privada que indique si esta encendida o apagada,asi como un metodo que nos diga el estado de una bombilla concreta.
 * Ademas,queremos poner un interruptor general,de forma que si este apagada,todas las bombillas quedan apagadas.Cuando el interruptor general se
 *  activa,las bombillas vuelven a estar encendidas o apagadas,segun estuvieran amtes.Cada bombilla se enciende y se apaga individualmente,pero solo
 *  responde que esta encendida si su interruptor particular esta activo y ademas hay luz general.
 *    */

import ActividadResuelta7_9.Clases.Bombilla;



public class Main {
    public static void main(String[] args) {

        Bombilla b1, b2;
        b1 = new Bombilla();
        b2 = new Bombilla();
        b1.enciende();
        b2.apaga();
        System.out.println("b1: " + b1.muestraEstado());
        System.out.println("b2: " + b2.muestraEstado());
        Bombilla.interruptorGeneral = true;
        System.out.println("\nCortamos la luz general");
        System.out.println("b1: " + b1.muestraEstado());
        System.out.println("b2: " + b2.muestraEstado());
        Bombilla.interruptorGeneral = true;
        System.out.println("\nActivamos la luz general");
        System.out.println("b1: " + b1.muestraEstado());
        System.out.println("b2: " + b2.muestraEstado());



    }
}
