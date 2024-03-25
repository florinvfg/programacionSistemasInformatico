/**
 * Clase Persona
 * que se crea con sus atributos o caracteristicas(variables)
 * y sus metodos o comportamientos(funciones)
 * */
package Clases;

public class Persona {
    public String nombre;
    public byte edad=0;
   public double estatura=0;
    public double peso=0;
  public String dni=null;

  //metodos o comportamientos

    public void cumplirAño(){
        System.out.println("Feliz cumpeaños " +nombre);
        System.out.println("Tu edad ahora es " +(edad+1)+ "años");
    }
    public void saludar(){
        System.out.println("Hola mi nombre es " + nombre);
    }
    public void crecer(double incremento){
        estatura+=incremento;//reemplazamos el dato inicial de estatura
    }

}
