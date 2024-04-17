package ActividadResuelta9_5.Controller;

/*Actividividad resuelta 9.5


Implementar un programa en el que,usando una Cola anonima,se encolan
numeros enteros hasta que se introduce un valor negativo.Luego
se desencolan todos los valores mostrandolos por pantalla.
*/

import ActividadResuelta9_2.Clases.InterfaceCola;
import ActividadResuelta9_5.Modelo.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    InterfaceCola cola = new InterfaceCola(){
        Lista l = new Lista(); // aqui guardamos los numeros
        @Override
        public void encolar(Integer nuevo) {
            l.insertarFinal(nuevo);
        }
        @Override
        public Integer desencolar() {
            return l.eliminar(0);
        }

    };
    System.out.println( "\nIntroducir numero (negativo para salir):");
    Integer n = new Scanner(System.in).nextInt();
    while (n >= 0) {
        cola.encolar(n);
        System.out.println("iNTRODUCIR NUMERO: ");
        n = new Scanner(System.in).nextInt();
    }
    n = cola.desencolar();
    while (n != null) {
        System.out.println(n + " ");
        n = cola.desencolar();
    }
}

}
