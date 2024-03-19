
/**
 * @Autor [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * @Enunciado:
 * Introducir por teclado dos frases e indicar cual de ellas es mas corta,es decir,
 * la que contiene menos caracteres
 *
 * */
import java.util.*;
public class ActividadResuelta6_2 {
    public static void main(String[] args) {
        /**
         * Leeremos dos cadenas (String),y compararemos sus longitudes
         * Para obtener el tamaño utilizamos lenght().
         * */
      Scanner sc=new Scanner(System.in);
      /**
       * leemos las dos frases
       * */
      mostrar("Primera frase -> ");
      String frase1= sc.nextLine();
      mostrar("Segunda frase -> ");
      String frase2=sc.nextLine();
      /**
       * calculamos
       * la longitud de cada palabra
       * utilisamos el metodo lenght()
       * */
      int longFrase1=frase1.length();
      int longFrase2=frase2.length();
      /**
       * comparamos -> los tamaños
       * Comparamos las longitudes de las frases
       * y mostramos mensajes según el resultado
       * */
     if (longFrase1 == longFrase2){
         mostrar("Son identicas de longitud");
     }else if (longFrase1 < longFrase2){
         mostrar(frase1 + "Es mas corta que " + frase2);
     }else {
         mostrar(frase2 + "Es mas corta que " + frase1);
     }

    }
    /**
     * Metodos de salida de mensaje en consola con interlineado
     * @paran texto*/

    public static void mostrar (String texto){
        System.out.println("\t" + texto);
    }
    /**
     * Metodos de salida de mensaje en consola Sin interlineado
     * @param texto*/

    public static void mostrarSinLn (String texto){
        System.out.print("\t" + texto);
    }
}
