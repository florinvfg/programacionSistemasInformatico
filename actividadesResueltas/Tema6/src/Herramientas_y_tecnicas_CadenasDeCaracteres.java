

/**@Autor
 *
 * [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 *
 * */
import java.util.*;
public class Herramientas_y_tecnicas_CadenasDeCaracteres {
    public static void main(String[] args) {

/**
       herramientas y funcionalidades más importantes de la clase String en Java,
 junto con ejemplos para cada una:
 */

       /** Declaración y creación de objetos String:

        Se puede declarar una cadena de caracteres utilizando el tipo String
        y asignándole un valor entre comillas dobles.
        java
        Copy code*/
        String str1 = "Hola Mundo";
        String str2 = new String("Java es divertido");
       // Concatenación de cadenas:

       /** Se pueden concatenar cadenas utilizando el operador + o el método concat().
                java
        Copy code*/
        String saludo = "Hola";
        String nombre = "Mundo";
        String mensaje = saludo + " " + nombre;
// O usando el método concat()
        String mensajeConcat = saludo.concat(" ").concat(nombre);
       /** Longitud de una cadena:

        Se puede obtener la longitud de una cadena utilizando el método length().
                java
        Copy code*/
        String frase = "Java es genial";
        int longitud = frase.length(); // longitud será 13
      //  Acceso a caracteres individuales:

      /**  Se puede acceder a caracteres individuales de una cadena utilizando el método charAt().
                java
        Copy code*/
        String palabra = "Java";
        char primerCaracter = palabra.charAt(0); // primerCaracter será 'J'
      //  Extracción de subcadenas:

       /** Se pueden extraer subcadenas utilizando el método substring().
                java
        Copy code*/
        String texto = "Hoy es un buen día";
        String subcadena = texto.substring(4, 9); // subcadena será "es un"
       // Búsqueda de caracteres o subcadenas:

       /** Se pueden buscar caracteres o subcadenas dentro de una cadena utilizando
        * los métodos indexOf() o contains().
                java
        Copy code*/

        frase = "Java es un lenguaje de programación";
        int indice = frase.indexOf("lenguaje"); // indice será 9
        boolean contiene = frase.contains("Java"); // contiene será true
        //División de cadenas:

       /** Se puede dividir una cadena en partes más pequeñas utilizando el método split().
                java
        Copy code*/
        String datos = "Juan,Perez,30";
        String[] partes = datos.split(",");
// partes contendrá {"Juan", "Perez", "30"}
       // Conversión entre mayúsculas y minúsculas:

       /** Se pueden convertir cadenas entre mayúsculas y minúsculas utilizando los métodos
        * toUpperCase() y toLowerCase().
                java
        Copy code*/
        texto = "Hola Mundo";
        String mayusculas = texto.toUpperCase(); // mayusculas será "HOLA MUNDO"
        String minusculas = texto.toLowerCase(); // minusculas será "hola mundo"

/**
 * Estos son solo algunos ejemplos de las funcionalidades más comunes de la clase String en Java.
 * La clase ofrece una amplia gama de métodos para manipular y procesar cadenas de caracteres de
 * manera efectiva en diferentes contextos de programación.
 * */

/**
 * El método lastIndexOf() de la clase String en Java se utiliza para encontrar la última ocurrencia
 * de un carácter o una subcadena dentro de una cadena. Devuelve el índice de la última aparición del
 * carácter o subcadena especificados dentro de la cadena, o -1 si no se encuentra.
 *
 * Sintaxis:*/
       // int lastIndexOf(String str)
       // int lastIndexOf(String str, int fromIndex)

        /**
         *str: La subcadena que se va a buscar.
         * fromIndex: El índice a partir del cual se iniciará la búsqueda hacia atrás. Si no se proporciona, se inicia desde el final de la cadena.
         * Ejemplo de uso:
         * */
        frase = "La vida es bella y bella es la vida";
        int indice1 = frase.lastIndexOf('a'); // índice1 será 30
        int indice2 = frase.lastIndexOf("bella"); // índice2 será 27
        int indice3 = frase.lastIndexOf("bella", 20); // índice3 será 13
/**
 *
 * En este ejemplo:
 *
 * lastIndexOf('a') encuentra la última ocurrencia del carácter 'a' en la cadena frase, que está en el índice 30.
 * lastIndexOf("bella") encuentra la última ocurrencia de la subcadena "bella" en la cadena frase, que también está en el índice 27.
 * lastIndexOf("bella", 20) busca hacia atrás desde el índice 20 y encuentra la última ocurrencia de la subcadena "bella" antes de ese
 * índice, que está en el índice 13.
 * El método lastIndexOf() es útil cuando necesitas buscar la última aparición de un carácter o una subcadena en una cadena de texto.
 * Es especialmente útil en situaciones donde necesitas procesar datos de texto de manera eficiente y encontrar la posición de
 * elementos específicos en una cadena.*/

    }
}
