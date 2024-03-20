/**[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * @param Enunciado:
 * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre co-mienzan sus frases con
 * «Javalín, javalón», para después hacer una pausa más o menos larga (la pausa se representa mediante espacios
 * en blanco o tabuladores) y a continua-ción expresan el mensaje. Existe un dialecto que no comienza sus frases
 * con la muletilla anterior, pero siempre las terminan con un silencio, más o menos prolongado y la coleti-lla
 * «javalén, len, len». Se pide diseñar un traductor que, en primer lugar, nos diga si la fra-se introducida está
 * escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre solo el
 * mensaje sin muletillas.
 * */
import java.util.*;
public class ActividadResuelta6_8 {
 /**
  *  Para ver si la frase está escrita en javalandés, miramos si empieza o termina por* el prefijo o el sufijo
  * de sus dialectos. Para ello, usamos los métodos startsWith() * y endsWith() de la clase String. Para extraer
  * el mensaje, utilizamos dos versiones* sobrecargadas de substring()
  * */
    public static void main(String[] args) {
        final String prefijo = "Javalin,javalon";//constantes con el comienzo y la terminacion en javalandes
        final String sufijo = "javalen, len, len";
        Scanner sc = new Scanner(System.in);
      mostrar("escriba una frase: ");
        String entrada = sc.nextLine();//texto de entrada al traductor
        boolean idiomaJavalandia = false;//suponemos que entrada no esta en javalandes

       //Vamos a comprobar si el texto de entrada empieza o termina con alguna muletilla

        if (entrada.startsWith(prefijo)) {//si la frase comienza con prefijo
            idiomaJavalandia = true;//el idioma es javalandés
            entrada = entrada.substring(prefijo.length());//mostramos el prefijo

      //nos quedamos con los carácteres de entrada a partir del siguiente al prefijo

        } else if (entrada.endsWith(sufijo)) {//si la entrada es con sufijo
            idiomaJavalandia = true;//es javalandes
            entrada = entrada.substring(0, entrada.length() - sufijo.length());

            //quitamos el sufijo. Nos interesa desde el primer carácter de la entrada (0)
            // hasta el caracter antes del sufijo
        }
        if (idiomaJavalandia) {
            entrada = entrada.strip();//quitamos los espacios antes y despues
            System.out.println(entrada);//mostramos

        } else {

            mostrar("No esta escrito en el idioma de Javalandia");
        }
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
