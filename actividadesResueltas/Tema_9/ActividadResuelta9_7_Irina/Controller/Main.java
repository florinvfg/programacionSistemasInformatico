package ActividadResuelta9_7_Irina.Controller;

import ActividadResuelta9_7_Irina.Modelo.Socio;

public class Main {
    public static void main(String[] args) {
        Socio s1 = new Socio(4, "Manuel", "23/03/2005");
        Socio s2 = new Socio(5, "Jose " , "15/02/2000");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1);
        System.out.println(s2);
    }
}