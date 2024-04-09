package Herencia.Controller;

import Herencia.Clases.Alumno;

import java.time.LocalDate;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Alumno a1=new Alumno();
        a1.setNombre("Maria Perez");
        a1.setTelefono("");//si no se lo pasamos por parametro sera null
        a1.setDireccion("Calle tal,numero3");
        a1.setNacionalidad("Española");
        //LocalDate f =LocalDate.of(2010,05,13);
        a1.setFechaNacimiento(LocalDate.of(2010,05,13));
        a1.setCurso("3");
        a1.setAula("A13");
        a1.setComedor(true);
        a1.setNombreTutor("Manuel Perez");
        a1.setTelefonoTutor("647138051");
        a1.setDireccionTudor("Calle tal ,numero 3");

        System.out.println(a1.toString());
        Alumno a2=new Alumno();
        a2.setNombre("Juan Keef");
        Alumno a3=new Alumno();
        a3.setNombre("Fernando Arias");
        System.out.println(a2.toString());
        System.out.println(a3.toString());


    }
}
