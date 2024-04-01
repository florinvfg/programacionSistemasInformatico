package ActividadResuelta7_7Irina.Controler;

import ActividadResuelta7_7Irina.Clases.Texto;

public class Main {
    public static void main(String[] args) {

        Texto t=new Texto(6);
        t.addFinal('e');
        System.out.println(t.toString());
        String cadena="Era";
        t.addCadenaFinal(cadena);
        System.out.println(t.toString());
        t.addPrincipio('a');
        System.out.println(t.toString());
        System.out.println("La cadena tiene  " +t.contarVocales()+"vocales");



    }
}
