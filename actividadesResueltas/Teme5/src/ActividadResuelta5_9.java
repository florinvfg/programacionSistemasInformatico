/*Diseñar una aplicacion para gestionar un campeonato de programacion,donde se introduce
* la puntuacion (enteros) obtenidos por 5 programadores, conforme van a terminar su prueba.
* La aplicacion debe mostrar las puntuaciones ordenadas de los 5 participantes.En ocaciones,
* cuando finalizan los 5 participantes anteriores,se suman al campeonato programadores de
* exhibicion,cuyo puntos se incluyen con el resto.la forma de especificar que no intervienenmas
*  programadores de exibicion es introducir como puntuacion un -1. La aplicacion debe mostrar,
* finalmente,los puntos ordenados de todos los participantes. */

import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]

public class ActividadResuelta5_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*List<Integer> puntuaciones = new ArrayList<>();//Se crea una lista llamada puntuaciones que almacenará las puntuaciones de los participantes. Se especifica que esta lista contendrá objetos de tipo Integer.
        System.out.println("Introduce las puntuaciones de los 5 programadores:");
        for (int i = 0; i < 5; i++) {// Se inicia un bucle for que se ejecutará 5 veces, una vez por cada programador.
            int puntuacion = sc.nextInt();//Se lee la próxima puntuación ingresada por el usuario utilizando el objeto Scanner y se almacena en la variable puntuacion.

            puntuaciones.add(puntuacion);//Se agrega la puntuación a la lista puntuaciones.

        }

        int puntuacion = 0;//Se declara una variable puntuacion y se inicializa en 0.
        while (puntuacion != -1) {//Se inicia un bucle while que continuará ejecutándose mientras la variable puntuacion no sea igual a -1.
            System.out.println("Introduce la puntuación del próximo programador de exhibición (o -1 para finalizar):");
            puntuacion = sc.nextInt();//Se lee la próxima puntuación ingresada por el usuario y se almacena en la variable puntuacion.
            if (puntuacion != -1) {//Se verifica si la puntuación ingresada es diferente de -1.
                puntuaciones.add(puntuacion);//Si la puntuación no es -1, se agrega a la lista puntuaciones.
            }
        }

        Collections.sort(puntuaciones);//e ordenan las puntuaciones en orden ascendente utilizando el método estático sort() de la clase Collections.
        System.out.println("Puntuaciones ordenadas de todos los participantes:");
        for (int punt : puntuaciones) {//Se inicia un bucle for-each que recorre cada puntuación en la lista puntuaciones.
            System.out.print(punt + " ");
        }

        sc.close();/*

         */
int[] puntuaciones = new int[5]; // Se declara un array para almacenar las puntuaciones de los programadores
        System.out.println("Introduce las puntuaciones de los 5 programadores:");
        for (int i = 0; i < 5; i++) { // Se inicia un bucle for que se ejecutará 5 veces, una vez por cada programador.
            puntuaciones[i] = sc.nextInt(); // Se lee la próxima puntuación ingresada por el usuario y se almacena en el array.
        }

        int capacidad = 5; // Capacidad inicial del array
        int contador = 0; // Contador de elementos en el array
        int puntuacion = 0; // Variable para almacenar la puntuación ingresada por el usuario

        while (puntuacion != -1) { // Se inicia un bucle while que continuará ejecutándose mientras la variable puntuacion no sea igual a -1.
            System.out.println("Introduce la puntuación del próximo programador de exhibición (o -1 para finalizar):");
            puntuacion = sc.nextInt(); // Se lee la próxima puntuación ingresada por el usuario.

            if (puntuacion != -1) { // Se verifica si la puntuación ingresada es diferente de -1.
                if (contador == capacidad) { // Si el array está lleno, se duplica su tamaño
                    capacidad *= 2;
                    puntuaciones = Arrays.copyOf(puntuaciones, capacidad); // Se copia el array a uno nuevo con el doble de capacidad
                }
                puntuaciones[contador++] = puntuacion; // Se añade la nueva puntuación al array y se incrementa el contador
            }
        }

        Arrays.sort(puntuaciones, 0, contador); // Se ordenan las puntuaciones en orden ascendente hasta el contador (solo los elementos ingresados)

        System.out.println("Puntuaciones ordenadas de todos los participantes:");
        for (int i = 0; i < contador; i++) { // Se itera sobre los elementos del array hasta el contador
            System.out.print(puntuaciones[i] + " "); // Se imprime cada puntuación
        }

        sc.close(); // Se cierra el scanner

    }
}
