package ActividadResuelta7_13_Irina.Controler;

import ActividadResuelta7_13_Irina.Clases.Pila;

public class Main {
    public static void main(String[] args) {

        Pila p = new Pila();

        for (int i = 0; i < 10; i++) {
            p.apilar(i);
        }
        p.mostrar();

        p.desapilar();p.mostrar();
        p.desapilar();p.mostrar();

    }
}
