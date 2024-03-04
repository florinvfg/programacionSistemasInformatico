/*creea tres tablas de cinco elementos:La primera de enteros,
la segunda de double y la tercera de booleanos.muestra las
referencias en las que se encuentra cada una de las tablas anteriores*/

import java.util.Arrays;

public class ActividadPropuesta5_1 {
    public static void main(String[] args) {
       int[] numero = new int[5];// Se crea un array llamado numero de tipo entero con capacidad para 5 elementos.
       //Se asignan valores a cada elemento del array numero.
        numero[0] = 1;
        numero[1] = 2;
        numero[2] = 3;
        numero[3] = 4;
        numero[4] = 5;
        System.out.println(Arrays.toString(numero));// para convertir el array en una cadena legible.


        // Crear la segunda tabla de doubles
        double[] tablaDoubles = new double[5];//
        //Se asignan valores a cada elemento del array tablaDoubles.
        tablaDoubles[0] = 10.5;
        tablaDoubles[1] = 20.3;
        tablaDoubles[2] = 15.8;
        tablaDoubles[3] = 7.2;
        tablaDoubles[4] = 12.9;
        System.out.println("Valores de la tabla de doubles:");
        for (int i = 0; i < tablaDoubles.length; i++) {
            System.out.println("Elemento " + i + ": " + tablaDoubles[i]);//Se imprime el contenido del
            // array tablaDoubles utilizando un bucle for para recorrer todos los elementos del array y mostrar su índice y valor.
        }

            // Crear la tercera tabla de booleanos
            boolean[] tablaBooleanos = new boolean[5];
        //Se asignan valores a cada elemento del array tablaBooleanos.
            tablaBooleanos[0] = true;
            tablaBooleanos[1] = false;
            tablaBooleanos[2] = true;
            tablaBooleanos[3] = false;
            tablaBooleanos[4] = true;
            System.out.println("Valores de la tabla de booleanos:");
            for (int j = 0; j < tablaBooleanos.length; j++) {
                System.out.println("Elemento " + j + ": " + tablaBooleanos[j]);//Se imprime el contenido del array
                // tablaBooleanos utilizando un bucle for para recorrer todos los elementos del array y mostrar su índice y valor.

                // Mostrar las referencias de las tablas
       /* System.out.println("Referencias de las tablas:");
        System.out.println("Tabla de enteros: " + tablaEnteros);
        System.out.println("Tabla de doubles: " + tablaDoubles);
        System.out.println("Tabla de booleanos: " + tablaBooleanos);*/
            }



        }
    }
