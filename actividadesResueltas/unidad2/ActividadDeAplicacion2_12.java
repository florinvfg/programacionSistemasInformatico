package unidad2;
import java.util.*;
/*El DNI consta en un entero de 8 digidos seguido de una letra que se obtiene a partir del numero
* de la siguiente forma : letra =numero DNI modulo 22. Basandote en esta informacion, elige la letra
* a partir de la numeracion de la suguiente tabla :
* 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
* T R W A G M Y F P D  X  B  N  J  Z  S  Q  V  H  L  C  K  E
* Y DISEÑA UNA APLICASION EN LA QUE UN NUMERO DE 8 DIGIDOS ESTA DENTRO DEL RANGO DEL TIPO "INT"*/

public class ActividadDeAplicacion2_12 {
    public static void main(String[] args) {
       /* int dni, resto;
        String letra = null;
        Scanner sc = new Scanner(System.in);

        System.out.println(" ******************* ");

        System.out.print("Introduzca los 8 dígitos del DNI: ");
        dni = sc.nextInt();

        resto = dni % 23;// Calcula el resto de dividir el DNI entre 23 y lo guarda en la variable resto.
        switch (resto) {//Utiliza una estructura switch para asignar la letra correspondiente según el valor del resto.
            case 0 ->
                    letra = "T";
            case 1 ->
                    letra = "R";
            case 2 ->
                    letra = "W";
            case 3 ->
                    letra = "A";
            case 4 ->
                    letra = "G";
            case 5 ->
                    letra = "M";
            case 6 ->
                    letra = "Y";
            case 7 ->
                    letra = "F";
            case 8 ->
                    letra = "P";
            case 9 ->
                    letra = "D";
            case 10 ->
                    letra = "X";
            case 11 ->
                    letra = "B";
            case 12 ->
                    letra = "N";
            case 13 ->
                    letra = "J";
            case 14 ->
                    letra = "Z";
            case 15 ->
                    letra = "S";
            case 16 ->
                    letra = "Q";
            case 17 ->
                    letra = "V";
            case 18 ->
                    letra = "H";
            case 19 ->
                    letra = "L";
            case 20 ->
                    letra = "C";
            case 21 ->
                    letra = "K";
            case 22 ->
                    letra = "E";
        }
        if (letra != null && dni >= 0 && dni <= 99999999) {/*Verifica si la letra no es nula y el DNI
        está en el rango correcto.*/
        //    System.out.println("El " + dni + " tiene la letra " + letra);
       // } else {
          //  System.err.println("    * El número no es correcto ! *");


        //Segunda forma de hacer

        Scanner sn =new Scanner(System.in);
        int numeroDni, calculo;
       String letra;
        System.out.println("Indique tu numero de DNI sin la letra ");
        numeroDni= sn.nextInt();
        calculo=numeroDni%23;//0 a 22
        switch (calculo) {
            case 0 -> letra = "T";
            case 1 -> letra = "R";
            case 2 -> letra = "W";
            case 3 -> letra = "A";
            case 4 -> letra = "G";
            case 5 -> letra = "M";
            case 6 -> letra = "Y";
            case 7 -> letra = "F";
            case 8 -> letra = "P";
            case 9 -> letra = "D";
            case 10 -> letra = "X";
            case 11 -> letra = "B";
            case 12 -> letra = "N";
            case 13 -> letra = "J";
            case 14 -> letra = "Z";
            case 15 -> letra = "S";
            case 16 -> letra = "Q";
            case 17 -> letra = "V";
            case 18 -> letra = "H";
            case 19 -> letra = "L";
            case 20 -> letra = "C";
            case 21 -> letra = "K";
            case 22 -> letra = "E";

        }
        System.out.println("La letra del DNI con numero " + numeroDni + " es" + letra );




      }
    }


