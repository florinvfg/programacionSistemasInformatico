/*"Este programa solicita al usuario que ingrese nombres y números de teléfono para tres personas diferentes. Luego, imprime
 una lista de nombres y números de teléfono en un formato tabular."*/

import java.util.Scanner;
import java.util.*;
public class NomreYTelefono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaración de una tabla de Strings con capacidad para 3 elementos para almacenar nombres
        String[] nombre = new String[3];
        // Declaración de una tabla de enteros con capacidad para 3 elementos para almacenar teléfonos
        int[] telefono = new int[3];
        // Bucle que recorre la tabla de nombres para solicitar al usuario que introduzca los nombres
        for (int i = 0; i < nombre.length; i++) {
            // Solicitar al usuario que indique el nombre, con el índice i + 1 para una numeración más amigable
            System.out.println("Indica le nombre " + (i + 1) + "");
            nombre[i] = sc.next(); // Leer el nombre ingresado por el usuario
            sc.nextLine();// Consumir el salto de línea restante después de leer el nombre
            // Solicitar al usuario que indique el teléfono, con el índice i + 1 para una numeración más amigable
            System.out.println("Indica el telefono " + (i + 1) + "");
            // Leer el teléfono ingresado por el usuario
            telefono[i] = sc.nextInt();
        }
// Bucle que recorre la tabla de nombres y teléfonos para imprimir la lista de teléfonos
        for (int i = 0; i < nombre.length; i++) {
            // Imprimir el encabezado de la lista de teléfonos
            System.out.println("Lista de telefonos ");
            System.out.println("Numbre\t Telefono");
            // Imprimir el nombre y el teléfono correspondiente en la misma línea
            System.out.println(nombre[i] + "\t" + telefono[i]);

        }
       /* System.out.println("Quieres buscar un nombre y te indique el numero ->");
        String nombreBuscar = sc.nextLine();
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Lista de telefonos ");
            System.out.println("Numbre\t Telefono");
            System.out.println(nombre[i] + "\t" + telefono[i]);

        }*/

        /*otra manera
        *
        *     Scanner sn=new Scanner(System.in);
        String[] nombre=new String[3];
        int[] telefono=new int[3];
        for (int i=0;i<nombre.length;i++){
            mostrarSinLn("Indica el Nombre Nº " + (i+1)+" ");
            nombre[i]=sn.next();sn.nextLine();
            mostrarSinLn("Indica el Teléfono Nº " + (i+1)+" ");
            telefono[i]=sn.nextInt();
        }
        /*Mostrar los Nombres y números insertados*/
       /* mostrarerr("-----------------------------");
        mostrar("Lista de teléfonos");
        mostrar("Nombre\tTeléfono");
        for (int i=0;i<nombre.length;i++) {
            mostrar(nombre[i]+ "\t"+telefono[i]);
            mostrar("-----------------------------");
        }
        mostrarSinLn("¿Quieres buscar un nombre y te indique el numero->");
        String nombreBuscar=sn.next();sn.nextLine();
        // envio el nombre  la funcion buscar nombre y recibo el indice donde esta ubicado, luego
        //muestro el número del indice recibido
        int indiceNumero=buscarTexto(nombre,nombreBuscar);
        if (indiceNumero<nombre.length){
            mostrar("**** E N C O N T R A D O ****");
            mostrar(nombre[indiceNumero] + "-> Teléfono-> " + telefono[indiceNumero]);
        }       else
            mostrar("No se encuentra "+ nombreBuscar + " en la tabla actual.");

        mostrar("¿Quieres cambiar algún número telefoónico? Dime de quien->");
        nombreBuscar=sn.next();sn.nextLine();
        indiceNumero=buscarTexto(nombre,nombreBuscar);
        if (indiceNumero<nombre.length) {
            mostrar("Indica el nuevo número de teléfono");
            telefono[indiceNumero]=sn.nextInt();
        }
    }

    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
    public static void mostrarSinLn(String texto){
        System.out.print("\t"+texto);
    }
    public static void mostrarerr(String texto){
        System.err.println("\t"+texto);
    }
    public static int buscarTexto(String texto[],String buscar){
        int indice=0;
        while (indice<texto.length && !texto[indice].equals(buscar)){
            indice++;
        }
        return indice;*/
    }
}