
/**
* Explicacion de metodos
 * [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 *
* */

import java.util.*;
public class CadenasDeCaracteres {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String frase = "En un lugar de la mancha";
        String frase2 = "En un lugar de madrid";
        /*CharAt ->Devuelve el caracter del indice especificado*/
        char letra = frase2.charAt(0);
        mostrar("" + letra);
/**
 * CompareTo
 * compara dos cadenas entre si,como resultado un entero,donde:
 * 0->son iguales
 * <0 la cadena es mayor
 * >0 la cadena es menor*/
        int resultado = frase.compareTo(frase);
        mostrar("El resultado de la comparacion -> " + resultado);
        String nombre1 = "Jose  ";
        String nombre2 = "Jose";
        mostrar("El nombre1 y el nombre2 son da como resultado al comparar ->" + nombre1.compareTo(nombre2));
/**
 * Concast -> une la cadena especificada al final de nuestra cadena*/
        String nombreCompleto = nombre1.concat("Ruiz");
        mostrar("Nombre completo -> " + nombreCompleto);
/**
 * contentEguals() devuelve verdadero (true) si y solo si la secuencia de caracteres es igual a la cadena
 * informada*/
        boolean resultadoB = frase.contentEquals(frase2);
        mostrar("Booleano de resultado -> " + resultado);

/**
 * copyValueOf (char[]) devuelve una cadena que representa la secuencia de caracteres en el Array informado
 * */
        char arrayChar[] = {'H', 'o', 'l', 'a', ' ', 'M', 'u', 'n', 'd', 'o' };
        String letraV = "";
        mostrar("" + letraV.copyValueOf(arrayChar));
        String cadena = letraV.copyValueOf(arrayChar);
        mostrar(cadena);
        /**
         * podemos indicar el indice de cual se quiere extraer el array para
         * convertirlo en una cadena
         * */
        mostrar("" + letraV.copyValueOf(arrayChar, 5, 5));
        /**
         * endsWitw(String sufijo) chequea si la cadena termina
         * con el sufijo especificado
         * */
        resultadoB = frase.endsWith("mancha");
        mostrar("La frase 1 termina con mancha-> " + resultadoB);
/**
 * startWith
 * chequea si la cadena comienza con el sufijo especificado
 * */
        resultadoB = frase2.startsWith("Hola");
        mostrar("La frase 1 comienza con Hola-> " + resultadoB);
/**
 * se puede especificar el indice inicial para utilizar
 * el startsWith
 * */
        resultadoB = frase2.startsWith("un", 3);
        mostrar("La frase 2 comienza con un en el indice 3 -> " + resultadoB);
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
        String nombre3 = "jose";
        mostrar("El nombre 1 -> " + nombre1 + "es igual al nombre3 " + nombre3 + "-> " + nombre1.equalsIgnoreCase(nombre3));

/**
 * has Code -> codificacion para hacer contraseñas y encriptar
 *
 * devuelve un codigo has de una cadena
 * */
        mostrar("HashCode de la frase \"En un lugar de la mancha\"" + frase.hashCode());
/**
 * indexOf(int ch)
 * devuelve el indice dentro de la cadena de la primera coincidencia del
 * caracter especificado
 * */
        mostrar("" + frase2.indexOf('a'));//la primera que encuentre
        mostrar("" + frase2.indexOf('m', 5));//la primera que encuentre apartir del  indice especificado
/**
 * indexOf
 * puede devolver el indice dentro de la cadena de la primera
 * coincidencia de la subcadena especificada
 * */
        mostrar("" + frase2.indexOf("lugar"));//En un lugar de madrid->resultado = 0
/**
 * le puede indicar el indice a partir de
 * cual buscas la cadena
 * */

        mostrar("indexOf indicando indice ->" + frase2.indexOf("lugar", 11));
//en un lugar de madrid -> por que no lo encuentra
        /**
         * lastIndexOf
         * devuelve el indice de la ultima coincidencia del caracter especificado
         * */
        mostrar("" + frase2 + "a->" + frase2.lastIndexOf('a'));
        /**
         * lastIndexOf
         * funciona igual que el indexOf,pero siempre devolviendo la ultima coincidencia
         * */
        /**
         * lenhht->
         * nos devuelve la longitud de una cadena,lo que es lo mismo el numero de caracteres incluyendo espacios
         * */
        int longitudF1 = frase.length();
        mostrar("La frase 1 tiene " + longitudF1 + "caracteres");
        /**
         * replace
         * permite reemplasar un caracter por otro en una cadena
         * */
        mostrar("" + frase2.replace("", "_"));
        //tambien podemos remplazar cadenas
        mostrar("" + frase2.replaceAll("madrid", "Tomelloso"));//expreciones regulares.nos visto

        /**
         * reeplazar la primera coindidencia
         * */
        String frase3 = "Esta es una frase de otra frase que tenemos en la clase";

        mostrar("" + frase3.replaceFirst("ase", "oto"));//cambiar primera
        mostrar("" + frase3.replaceAll("ase", "oto"));//cambiar todas

        /**
         * split->
         * devolver una array de una cadena dividida por un caracter indicado
         * */

        String arrayCadena[] = frase2.split("");
        mostrar(Arrays.deepToString(arrayCadena));
        String listaNombres = "Jose,Pedro,juan,manuel,Lucia,Susana,Ana,Belen";
        String arrayNombres[] = listaNombres.split(",");
        for (String elemento : arrayNombres
        ) {
            mostrar("." + elemento);
        }

        /**
         * subString (indice)
         * devuelve una nueva cadena a partir de otra
         * */
        nombreCompleto = "irina medina sierra";
        /**
         * toUpperCase
         * covierte el caracter o cadena en mayuscula
         * */
        String nombreMayuscula = nombreCompleto.substring(0, 1).toUpperCase() + nombreCompleto.substring(1);
        mostrar(nombreMayuscula);

        /**
         * ¿Como convertirias todo el nombre y apellidos la inicial en mayuscula con lo que hemos
         * visto hasta ahora
         * */
        String arrayMay[] = nombreCompleto.split(" ");
        String nombreConv = "";
        for (String nom : arrayMay) {
            nombreConv += nom.substring(0, 1).toUpperCase() + nom.substring(1) + " ";

        }
        mostrar(nombreConv);


        //hacer este ejemplo->escribe 3 numero de telefonos e indica si son validos en España->9265150052,456987741,325985233

      /*  String phone[] = {"9265150052", "456987741", "325985233"};

        for (String ph:phone) {

            if (ph.length() == 9) {
                if (ph.substring(0, 1) == "9" || ph.substring(0, 1) == "8" || ph.substring(0, 1) == "7" || ph.substring(0, 1) == "6") {

                    mostrar("El telefono " + ph + " es corecto");
                }

            } else {
                mostrar("El telefono " + ph + " no es correcto,porque no tiene la longitud correcta(9 digitos)");*/

        String phones[] = {"9265150052", "456987741", "325985233","647138051"};

        for (String phone : phones) {
            if (phone.length() == 9) {
                char firstDigit = phone.charAt(0); // Obtener el primer dígito del teléfono
                if (firstDigit == '9' || firstDigit == '8' || firstDigit == '7' || firstDigit == '6') {
                    mostrar("El teléfono " + phone + " es válido para España");
                } else {
                    mostrar("El teléfono " + phone + " no es válido para España");
                }
            } else {
                mostrar("El teléfono " + phone + " no es válido para España, debe tener 9 dígitos");
            }
        }
        /**
         * toCharArray->
         * convierte una cadena en un arrayde char
         * */

        char cadenaTochar[]=frase2.toCharArray();
        mostrar(""+Arrays.toString(cadenaTochar));
        //toLowerCase convierte una cadena en minuscula
        String nombre4="IRINA MEDINA SIERRA";
        mostrar("" + nombre4.toLowerCase());
        String nombreAcento="JOSE MARIA NUÑES";
        /**
         * trim->
         * elimina los espacios en blanco del principio y el final
         * */
        nombreAcento=""+nombreAcento+" ";
        mostrar(""+nombreAcento);
        mostrar(""+nombreAcento.trim());

        /**
         * valores positivos
         *
         * String.valueOf convierte un dato primitivo en una caden de caracteres
         * */
        String cad;
        cad=String.valueOf(560);//560
        cad=String.valueOf(57.85);//57.85
        cad=String.valueOf(true);//true


        /**Clase Character->char
         * a traves de metodos,identificar si es digito,
         * si es letra,si es un espacio en blanco,otro caracter
         * */
        letra=frase.charAt(2);
        mostrar("El indice dos de la frase \n "+frase+ "\n ¿Es un digito?" + Character.isDigit(letra));
        mostrar("El indice dos de la frase \n "+frase+ "\n ¿Es un espacio en blanco?" + Character.isWhitespace(letra));
        mostrar("El indice dos de la frase \n "+frase+ "\n ¿Es una letra?" + Character.isLetter(letra));
        mostrar("El indice dos de la frase \n "+frase+ "\n ¿Es una letra o digito?" + Character.isLetterOrDigit(letra));
        letra=frase.charAt(0);
        mostrar("El indice dos de la frase \n "+frase+ "\n ¿Es en Mayuscula?" + Character.isUpperCase(letra));
        mostrar("El indice dos de la frase \n "+frase+ "\n ¿Es en Minuscula?" + Character.isLowerCase(letra));
        
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

