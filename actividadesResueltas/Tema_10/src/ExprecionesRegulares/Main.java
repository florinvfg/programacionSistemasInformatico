package ExprecionesRegulares;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String [] validaciones= {"DNI",
            "UserName",
            "Pasword",
            "Email",
            "Matricula" ,
            "Telefono" ,
            "URL",
            "Solo Letras",
            "Codigo Postal",
            "Fecha (DD-MM-AAAA",
            "Ip",
            "Tarjeta de credito",
            "Cuenta Bancaria",
            "ISBN",
            "Solo Numeros"};

    public static void main(String[] args) {

        /**
         * Validaciones
         * DNI
         * Psword
         * UserName
         * Matricula
         * Telefono
         * URL
         * Solo Letras
         * Codigo Postal
         * Fecha (dd-MM-AAAA)
         * Ip
         * Email
         *
         */
       int opcion;
       do {
           opcion=-1;
/**
 * se declara un array de cadenas validaciones que contiene los nombres
 * de las validaciones que se pueden realizar.
 */
           mostrar("Menu de validaciones");
           mostrar("1.DNI");
           mostrar("2.UserName");
           mostrar("3.Password");
           mostrar("4.Email");
           mostrar("5.Matricula");
           mostrar("6.Telefono");
           mostrar("7.URL");
           mostrar("8.Solo Letras");
           mostrar("9.Codigo Postal");
           mostrar("10.Fecha");
           mostrar("11.IP");
           mostrar("12.Tarjetas de credito");
           mostrar("13.Cuenta bancaria");
           mostrar("14.ISBN");
           mostrar("15.Solo Numeros");
           mostrar("0.Salir");
           mostrarSln("Indique su opcion a validar -> ");

           //comprobamos que la opcion leida sea correcta,y se repita hasta que introduzca un numero
           do {
               /**
                * Se utiliza un bucle do-while anidado para validar la opción ingresada por
                * el usuario. Si la entrada no es un número válido, se muestra un mensaje de
                * error y se solicita una nueva entrada.
                */
               try {
                   opcion = sc.nextInt();
                   if (opcion < 0 || opcion > 15){
                       mostrarSln("Opcion no valida -> ");
                   }
               } catch (InputMismatchException e) {
                   mostrarSln("Solo ingresar numeros -> ");
                   sc.next();
               }
           } while (opcion < 0 || opcion > 15);
          //switch-case
           switch (opcion) {
               /**
                * Se utiliza una expresión de cambio switch-case para ejecutar la
                * validación correspondiente según la opción elegida por el usuario.
                * Si la opción es 0, se muestra un mensaje de salida del programa.
                */
               case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 ->{
               boolean resultado=ejecutarValidacion(textoValidar(opcion),opcion);
               mostrarMensaje(resultado,opcion);

               }
               case 0->mostrar("Saliendo de programa ! Buen Dia");

           }





       } while ( opcion != 0);//El bucle do-while principal continúa ejecutándose hasta que el usuario elige salir (opción 0).
    }

    /**
     * Metodo comun para la lectura del texto a validar
     */

    public static String textoValidar (int opcion){
        mostrarSln("Indique "+validaciones[opcion-1]+" -> ");
        String texto=new Scanner(System.in).nextLine();
        return texto;
    }

    /**
     * Este método solicita al usuario el texto a validar según la opción seleccionada
     * @param texto
     * @param opcion
     * @return
     */
    //Este método ejecuta la validación correspondiente según la opción seleccionada y devuelve
    // true si el texto cumple con la validación, o false si no.
    public static boolean ejecutarValidacion (String texto,int opcion){
        boolean exito=false;
        switch (opcion){
            case 1->{
               if (texto.matches("\\b\\d{8}[A-HJ-NP-TV-Za-hj-np-tv-z]\\b"));
               String letraDNI[]={"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
               int numeros=Integer.parseInt(texto.substring(0,8));
               int posicion=numeros%23;
               if (texto.substring(8,9).equalsIgnoreCase(letraDNI[posicion]));

               exito=true;
            }
            case 2->
                    exito=texto.matches("^[a-zA-Z0-9]{3,16}");//Username lo declaramos con longitud 8 y aceptamos solos letras y numeros
            case 3-> {
                exito = texto.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[.!@_%&$=\\*]).{8,16}$");//exprecion regular para pasword seguro
            }
            case 4->{
                exito=texto.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$");//para el email
            }
            case 5-> {
                char primerDigito = texto.substring(0, 1).charAt(0);
                if (Character.isDigit(primerDigito)) {
                    exito = texto.matches("^[0-9]{4}[A-Z]{3}$");
                }
            }

            case 6->{
                exito= texto.matches("^\\+?[0-9]{6,}$"); //Expresion Regulada para el numero de Telefono
            }
            case 7->
                    exito= texto.matches("^(http|https)://[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,3}(/\\S*)?$");
            case 8->{
                exito= texto.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ]+$");

            }
            case 9->{
                exito= texto.matches("^\\d{5}$");

            }
            case 10-> {
                DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                try {
                    LocalDate fecha = LocalDate.parse(texto, f);
                    if (texto.equals(fecha.format(f))) ;
                    exito = true;

                } catch (DateTimeParseException e) {
                    exito=false;

                }
            }
            case 11->{
                exito= texto.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");

            }
            case 12->{
                exito= texto.matches("^\\d{16}$");

            }
            case 13->{
                exito= texto.matches("^\\d{20}$");

            }
            case 14->{
                exito= texto.matches("^\\d{9}[0-9X]$");

            }
            case 15->{
                exito= texto.matches("^\\d+(\\.\\d+)?$");

            }
        }
        return exito;
    }
    public static void mostrarMensaje(boolean resultado,int opcion){
        if (resultado){
            mostrar(validaciones[opcion-1] +" es Correcto");
        }else {
            mostrar(validaciones[opcion-1] +" no es Correcto");
        }
    }

    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
    public static void mostrarSln(String texto){
        System.out.print("\t"+texto);
    }
}
