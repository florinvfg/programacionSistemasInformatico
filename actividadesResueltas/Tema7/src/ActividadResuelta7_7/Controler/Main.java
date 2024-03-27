
/**
 * Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:
 * La cadena de caracteres tendrá una longitud máxima que se especifica en el constructor
 * Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la longitud
 * máxima, es decir, exista espacio disponible.  Igualmente, permite añadir una cadena, al
 * principio o al final del texto, siempre y cuando no se rebase el tamaño máximo establecido.
 * Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.  Cada objeto de
 * tipo Texto tiene que conocer la fecha en la que se creó, así como la fecha y hora de la última
 * modificación efectuada.  Deberá existir un método que muestre la información que gestiona
 * cada texto
 * */
package ActividadResuelta7_7.Controler;

import ActividadResuelta7_7.Clase.Texto;

public class Main {
    /**
     * Creamos un objeto texto
     * para probar su funcionamiento*/
    public static void main(String[] args) {
        Texto t = new Texto(5);
        t.addPrincipio("HO");
        t.addPrincipio(';');
        t.addFinal("Lá");
        t.addFinal('X'); // este carácter no cabe en el texto. No se añade.
        t.mostrar();
        System.out.println("Numero de vocales: " + t.numVocales);
    }
}