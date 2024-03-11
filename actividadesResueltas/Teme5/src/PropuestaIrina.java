import java.util.Scanner;
import java.util.*;
public class PropuestaIrina {
    public static void main(String[] args) {
        // Llamada a la función para obtener los datos de los alumnos
        String[][] datosAlumnos = alumnosDatos();
        // Llamada a la función para mostrar los datos de los alumnos
        mostrarAlumnos(datosAlumnos);
    }

    // Función para obtener los datos de los alumnos
    public static String[][] alumnosDatos() {
        // Se crea una matriz de cadenas para almacenar los datos de los alumnos
        String alumnos[][] = new String[3][4];
        // Se crea un Scanner para leer la entrada del usuario
        Scanner sn = new Scanner(System.in);
        // Bucle para iterar sobre cada alumno y solicitar sus datos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                // Si la columna es 0, se solicita el nombre del alumno
                if (j == 0) {
                    System.out.println(" Indica el nombre del alumno " + (i + 1));
                    alumnos[i][j] = sn.next();
                    sn.nextLine();
                }
                // Si la columna es 1, se solicita el apellido del alumno
                if (j == 1) {
                    System.out.println(" Indica el apellido del alumno " + (i + 1));
                    alumnos[i][j] = sn.next();
                    sn.nextLine();
                }
                // Si la columna es 2, se solicita la profesión del alumno
                if (j == 2) {
                    System.out.println(" Indica la profesión del alumno " + (i + 1));
                    alumnos[i][j] = sn.next();
                    sn.nextLine();
                }
                // Si la columna es 3, se solicita el email del alumno
                if (j == 3) {
                    System.out.println(" Indica el email del alumno " + (i + 1));
                    alumnos[i][j] = sn.next();
                    sn.nextLine();
                }
            }
        }
        // Se devuelve la matriz con los datos de los alumnos
        return alumnos;
    }

    // Función para mostrar los datos de los alumnos en forma de tabla
    public static void mostrarAlumnos(String[][] alumnos) {
        // Encabezado de la tabla
        System.out.println("\nNombre\t\tApellido\t\tProfesión\t\tEmail");
        System.out.println("--------------------------------------------------------");
        // Bucle para recorrer la matriz de alumnos y mostrar los datos
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[i].length; j++) {
                // Se imprime cada elemento de la fila, separados por tabuladores
                System.out.print(alumnos[i][j] + "\t\t");
            }
            // Salto de línea después de imprimir los datos de un alumno
            System.out.println();
        }
    }
}