package ExplicasionTema7.Controlador;

import ExplicasionTema7.Clases.Persona;

public class Main {
    public static void main(String[] args){

        Persona p=new Persona();//es un objeto de tipo persona
       p.nombre="Fran";
       p.edad=32;
       p.peso=65;
       p.estatura=1.78;
       p.dni="065214876";


        System.out.println("nombre-> " + p.nombre
        +"\nEdad " +p.edad
        +"\nPeso " +p.peso
        +"\nEstatura " +p.estatura
        +"\nDNI " +p.dni);

        Persona x=new Persona();
        x.nombre="Isabel";
        x.edad=35;
        x.peso=65;
        x.estatura=1.65;
        x.dni="068521458";
//debia ser una funcion
        System.out.println("\nnombre-> " + x.nombre
                +"\nEdad " +x.edad
                +"\nPeso " +x.peso
                +"\nEstatura " +x.estatura
                +"\nDNI " +x.dni);

x.cumplirAño();
p.crecer(-0.05);
        System.out.println(p.nombre + "ahora mides " +p.estatura);
        x.saludar();
    }
}