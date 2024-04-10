package ActividadResuelta8_1Irina.Controller;

import ActividadResuelta8_1Irina.Clases.Hora;

public class Main {

    public static void main(String[] args) {

        Hora h1=new Hora(50,100);
        System.out.println(h1.toString());
        h1.setMinutos(40);
        h1.setHora(13);
        System.out.println(h1.toString());
        h1.incrementar();
        System.out.println(h1.toString());
        h1.setHora(1);
        h1.setMinutos(5);
        System.out.println(h1.toString());
    }
}
