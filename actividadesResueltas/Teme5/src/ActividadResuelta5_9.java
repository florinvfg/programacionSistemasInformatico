/*Diseñar una aplicacion para gestionar un campeonato de programacion,donde se introduce
* la puntuacion (enteros) obtenidos por 5 programadores, conforme van a terminar su prueba.
* La aplicacion debe mostrar las puntuaciones ordenadas de los 5 participantes.En ocaciones,
* cuando finalizan los 5 participantes anteriores,se suman al campeonato programadores de
* exhibicion,cuyo puntos se incluyen con el resto.la forma de especificar que no intervienenmas
*  programadores de exibicion es introducir como puntuacion un -1. La aplicacion debe mostrar,
* finalmente,los puntos ordenados de todos los participantes. */

import java.util.*;

public class ActividadResuelta5_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> puntuaciones = new ArrayList<>();//Se crea una lista llamada puntuaciones que almacenará las puntuaciones de los participantes. Se especifica que esta lista contendrá objetos de tipo Integer.
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

        sc.close();


    }
}
