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
    }
}