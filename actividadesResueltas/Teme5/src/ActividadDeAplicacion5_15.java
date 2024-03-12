

/*Debes desarrollar una aplicación que ayude a gestionar las notas de
 un centro educativo. Los alumnos se organizan en grupos compuestos por
 5 personas. Leer las notas (núme-ros enteros) del primer, segundo y tercer
  trimestre de un grupo. Debes mostrar al final la nota media del grupo en
   cada trimestre y la media del alumno que se encuentra en una posición dada
   (que el usuario introduce por teclado).*/

import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]

       /* Scanner scanner = new Scanner(System.in);

        // Definir la cantidad de alumnos en el grupo
        final int numAlumnos = 5;
        // Definir la cantidad de trimestres
        final int numTrimestres = 3;

        // Crear una matriz para almacenar las notas de los alumnos
        int[][] notas = new int[numAlumnos][numTrimestres];

        // Leer las notas de los alumnos
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < numTrimestres; j++) {
                System.out.print("Trimestre " + (j + 1) + ": ");
                notas[i][j] = scanner.nextInt();
            }
        }

        // Calcular la media del grupo en cada trimestre
        double[] mediasTrimestres = calcularMediasTrimestres(notas);

        // Mostrar la media del grupo en cada trimestre
        System.out.println("\nMedia del grupo en cada trimestre:");
        for (int i = 0; i < numTrimestres; i++) {
            System.out.println("Trimestre " + (i + 1) + ": " + mediasTrimestres[i]);
        }

        // Leer la posición del alumno para calcular su media
        System.out.print("\nIngrese la posición del alumno (1-" + numAlumnos + "): ");
        int posicionAlumno = scanner.nextInt();

        // Calcular la media del alumno en todas las asignaturas
        double mediaAlumno = calcularMediaAlumno(notas, posicionAlumno - 1);

        // Mostrar la media del alumno
        System.out.println("Media del alumno " + posicionAlumno + ": " + mediaAlumno);

        scanner.close();
    }

    // Función para calcular la media del grupo en cada trimestre
    public static double[] calcularMediasTrimestres(int[][] notas) {
        int numAlumnos = notas.length;
        int numTrimestres = notas[0].length;
        double[] mediasTrimestres = new double[numTrimestres];
        for (int j = 0; j < numTrimestres; j++) {
            int suma = 0;
            for (int i = 0; i < numAlumnos; i++) {
                suma += notas[i][j];
            }
            mediasTrimestres[j] = (double) suma / numAlumnos;
        }
        return mediasTrimestres;
    }

    // Función para calcular la media del alumno en todas las asignaturas
    public static double calcularMediaAlumno(int[][] notas, int posicionAlumno) {
        int numTrimestres = notas[0].length;
        int suma = 0;
        for (int j = 0; j < numTrimestres; j++) {
            suma += notas[posicionAlumno][j];
        }
        return (double) suma / numTrimestres;*/


        //otra manera
        public class ActividadDeAplicacion5_15 {
            static Scanner sn = new Scanner(System.in);

            public static void main(String[] args) {
                altaNotas();
                int[][] notas = altaNotas();
                calcularMediaAlumno(notas);
            }

            public static int[][] altaNotas() {
                int notas[][] = new int[3][5];

                //solicitamos los trimestres
                for (int trimestre = 0; trimestre < 3; trimestre++) {
                    mostrar("Notas del trimestre " + (trimestre + 1) + "->");
                    leerNotas(notas, trimestre);

                }
                return notas;

            }

            //metodo para leer las notas


            private static void leerNotas(int[][] notas, int trimestre) {
                for (int i = 0; i < notas[trimestre].length; i++) {
                    mostrar("Alumno (" + (i + 1) + ")");
                    notas[trimestre][i] = sn.nextInt();
                }


                mostrar(Arrays.deepToString(notas));

                int media[] = new int[3];
                for (int alum = 0; alum < 5; alum++) {
                    for (int trim = 0; trim < 3; trim++) {
                        media[trim] += notas[trim][alum];
                    }
                }
                mostrar("La media del Primer trimeste = " + (media[0]/5));
                mostrar("La media del Segundo trimeste = " + (media[1]/5));
                mostrar("La media del Tercero trimeste = " + (media[2]/5));

            }

            public static void calcularMediaAlumno(int[][] notas) {
                mostrar("Indique número de un alumno:");
                int numAlumno = sn.nextInt();
                double suma = 0;

                // Sumamos las notas del alumno en todos los trimestres
                for (int trimestre = 0; trimestre < 3; trimestre++) {
                    suma += notas[trimestre][numAlumno - 1]; // Restamos 1 porque el índice del alumno comienza en 1
                }

                double media = suma / 3; // Dividimos por 3, que es el número de trimestres
                mostrar("La media del Alumno " + numAlumno + " es ➢ " + media);
            }
                public static void mostrar (String texto){
                    System.out.println("\t" + texto);
                }

                public static void mostrarSinLn (String texto){
                    System.out.print("\t" + texto);


                }
            }

