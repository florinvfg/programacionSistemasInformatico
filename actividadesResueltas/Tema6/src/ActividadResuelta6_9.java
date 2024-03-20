/**
 *Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras introducidas
 * con espacios en blanco. Terminar de leer la frase cuando algu-na de las palabras introducidas sea la cadena «fin»
 * escrita con cualquier combinación de mayúsculas y minúsculas. La cadena «fin» no aparecerá en la frase final
 * */
import java.util.*;
public class ActividadResuelta6_9 {
    /**
     *  Vamos a leer una serie de palabras que iremos concatenando.
     *  Hay que comprobar * cada palabra leída por si coincide con
     *  alguna combinación de mayúsculas/ minúsculas de la
     *  cadena "fin"
     *  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "", palabra; //frase debe inicializarse con la cadena vacia
      /**
       * //ya que vamos a concatenarle otra cadena.
       * leemos la primera palabra fuera del bucle
       * por si es "fin"
       * */
       mostrar("Escriba una palabra:");
        palabra = sc.next();
        /**
         * concatenamos la palabra al final de la
         frase, con un espacio en blanco. La primera vez, frase está
         inicializada con la cadena vacía. Si no, produciría un error
         */
        while (!palabra.toLowerCase().equals("fin")) {
            frase = frase + " " + palabra;
            mostrar("Escriba una palabra");
            palabra = sc.next();
        }
        /**
         Sea cual sea la combinación de mayúsculas/minúsculas de palabra,
         la convertimos a minúscula para compararla con "fin".
         Se podría convertir a mayúsculas y comparar con "FIN" */
        mostrar("Tus palabras son -> " + (frase));
    }
    /**
     * Metodos de salida de mensaje en consola con interlineado
     * @param texto*/

    public static void mostrar (String texto){
        System.out.println("\t" + texto);
    }
    /**
     * Metodos de salida de mensaje en consola Sin interlineado
     * @param texto*/

    public static void mostrarSinLn (String texto) {
        System.out.print("\t" + texto);

    }

}
