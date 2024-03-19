
/**
* Explicacion de metodos
 * [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 *
* */

import java.util.*;
public class CadenasDeCaracteres {

    public static void main(String[] args) {
        System.out.println("Hello world!");
String frase="En un lugar de la mancha";
String frase2="En un lugar de madrid";
/*CharAt ->Devuelve el caracter del indice especificado*/
char letra=frase2.charAt(0);
mostrar(""+letra);
/**
 * CompareTo
 * compara dos cadenas entre si,como resultado un entero,donde:
 * 0->son iguales
 * <0 la cadena es mayor
 * >0 la cadena es menor*/
int resultado=frase.compareTo(frase);
mostrar("El resultado de la comparacion -> "+resultado);
String nombre1="Jose  ";
String nombre2="Jose";
mostrar("El nombre1 y el nombre2 son da como resultado al comparar ->"+nombre1.compareTo(nombre2));
/**
 * Concast -> une la cadena especificada al final de nuestra cadena*/
String nombreCompleto=nombre1.concat("Ruiz");
mostrar("Nombre completo -> " +nombreCompleto);
/**
 * contentEguals() devuelve verdadero (true) si y solo si la secuencia de caracteres es igual a la cadena
 * informada*/
boolean resultadoB=frase.contentEquals(frase2);
mostrar("Booleano de resultado -> " +resultado);

/**
 * copyValueOf (char[]) devuelve una cadena que representa la secuencia de caracteres en el Array informado
 * */
    char arrayChar[]={'H','o','l','a',' ','M','u','n','d','o'};
    String letraV="";
    mostrar(""+letraV.copyValueOf(arrayChar));
    String cadena=letraV.copyValueOf(arrayChar);
    mostrar(cadena);
    /**
     * podemos indicar el indice de cual se quiere extraer el array para
     * convertirlo en una cadena
     * */
    mostrar(""+letraV.copyValueOf(arrayChar,5,5));
    /**
     * endsWitw(String sufijo) chequea si la cadena termina
     * con el sufijo especificado
     * */
resultadoB=frase.endsWith("mancha");
mostrar("La frase 1 termina con mancha-> "+resultadoB);
/**
 * startWith
 * chequea si la cadena comienza con el sufijo especificado
 * */
resultadoB=frase2.startsWith("Hola");
mostrar("La frase 1 comienza con Hola-> "+resultadoB);
/**
 * se puede especificar el indice inicial para utilizar
 * el startsWith
 * */
resultadoB=frase2.startsWith("un",3);
mostrar("La frase 2 comienza con un en el indice 3 -> "+resultadoB);
/**
 * compara dos cadenas
 * */
if (frase2.equals(frase))
    mostrar("Las cadenas son iguales");
else
    mostrar("Las cadenas son diferentes");
/**
 * comparar dos cadenas ignorando las mayusculas y minusculas
 * */
String nombre3="jose";
mostrar("El nombre 1 -> " +nombre1 + "es igual al nombre3 " + nombre3 +"-> "+nombre1.equalsIgnoreCase(nombre3));

/**
 * has Code -> codificacion para hacer contraseñas y encriptar
 *
 * devuelve un codigo has de una cadena
 * */
mostrar("HashCode de la frase \"En un lugar de la mancha\"" +frase.hashCode());
/**
 * indexOf(int ch)
 * devuelve el indice dentro de la cadena de la primera coincidencia del
 * caracter especificado
 * */
mostrar("" + frase2.indexOf('a'));//la primera que encuentre
mostrar("" +frase2.indexOf('m', 5));//la primera que encuentre apartir del  indice especificado
/**
 * indexOf
 * puede devolver el indice dentro de la cadena de la primera
 * coincidencia de la subcadena especificada
 * */
mostrar("" +frase2.indexOf("lugar"));//En un lugar de madrid->resultado = 0
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

