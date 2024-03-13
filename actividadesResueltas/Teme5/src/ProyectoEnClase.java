
/*
"Participa en nuestra encuesta sobre los canales de streaming más populares.
 Ayúdanos a descubrir cuáles son los favoritos entre nuestra comunidad.

 ¡Tu opinión cuenta!"*/
import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class ProyectoEnClase {
    static Scanner sn = new Scanner(System.in);
    // Declaración del Scanner para almacenar las respuestas de los usuarios y contadores para cada plataforma
    static boolean[][] respuesta = new boolean[8][5]; // Suponiendo un máximo de 8 encuestados y 5 opciones de plataforma
    static int contadorNet = 0, contadorHBO = 0, contadorMovis = 0, contadorPrime = 0, contadorDisney = 0;

    // Método principal para iniciar la encuesta
    public static void main(String[] args) {
        datos(); // Llamada al método para recopilar datos de los usuarios
    }

    // Método para solicitar datos de los usuarios
    public static void datos() {
        byte opcion;
        // Bucle para iterar sobre los usuarios
        for (int i = 0; i < respuesta.length; i++) {
            // Solicitar al usuario su número favorito
            texto("Usuario "+(i+1));
            texto("Indique cuál de las siguientes es tu plataforma favorita ➢ ");
            texto("1. Netflix");
            texto("2. HBO Max");
            texto("3. Movistar+ Lite");
            texto("4. Prime Video");
            texto("5. Disney Plus");
            opcion = sn.nextByte(); // Leer la opción del usuario

            // Procesar la opción del usuario y actualizar la matriz respuesta y los contadores
            switch (opcion) {
                case 1:
                    respuesta[i][0] = true;
                    contadorNet++;
                    texto("La opción más elegida del usuario es Netflix");
                    break;
                case 2:
                    respuesta[i][1] = true;
                    contadorHBO++;
                    texto("La opción más elegida del usuario es HBO Max");
                    break;
                case 3:
                    respuesta[i][2] = true;
                    contadorMovis++;
                    texto("La opción más elegida del usuario es Movistar+ Lite");
                    break;
                case 4:
                    respuesta[i][3] = true;
                    contadorPrime++;
                    texto("La opción más elegida del usuario es Prime Video");
                    break;
                case 5:
                    respuesta[i][4] = true;
                    contadorDisney++;
                    texto("La opción más elegida del usuario es Disney Plus");
                    break;
                default:
                    System.err.println("Opción no válida. Por favor, elija una opción del 1 al 5.");
                    i--; // Decrementar el índice para permitir al usuario ingresar una opción válida
                    break;
            }
        }

        // Imprimir la tabla de respuestas de los usuarios
        System.out.println("\n✯✯✯ Demostración de la tabla de respuestas ✯✯✯\n");
        System.out.println("Netflix | HBO Max | Movistar | Prime | Disney");
        for (int i = 0; i < respuesta.length; i++) {
            for (int j = 0; j < respuesta[i].length; j++) {
                System.out.print(respuesta[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // Mostrar el podio de las plataformas más elegidas
        System.out.println("\n✯✯✯ Podio de Plataformas Streaming ✯✯✯\n");
        mostrarPodio();
    }

    // Método para imprimir texto en la consola
    public static void texto(String texto) {
        System.out.println(texto);
    }

    // Método para mostrar el podio de las plataformas más elegidas
    public static void mostrarPodio() {
        // Arreglos para almacenar los contadores y nombres de las plataformas
        int[] contadores = {contadorNet, contadorHBO, contadorMovis, contadorPrime, contadorDisney};
        String[] plataformas = {"Netflix", "HBO Max", "Movistar+ Lite", "Prime Video", "Disney Plus"};

        // Variables para almacenar los índices de las tres plataformas más elegidas
        int max1 = 0, max2 = 0, max3 = 0;

        // Encontrar el primer lugar
        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] > contadores[max1]) {
                max1 = i;
            }
        }
        // Imprimir el primer lugar
        System.out.println("🥇 1er lugar: " + plataformas[max1] + "  ➣ " + contadores[max1] + " veces");
        contadores[max1] = 0; // Reiniciar el contador para evitar repeticiones

        // Encontrar el segundo lugar
        for (int j = 0; j < contadores.length; j++) {
            if (contadores[j] > contadores[max2]) {
                max2 = j;
            }
        }
        // Imprimir el segundo lugar
        System.out.println("🥈 2do lugar: " + plataformas[max2] + "  ➣ " + contadores[max2] + " veces");
        contadores[max2] = 0; // Reiniciar el contador para evitar repeticiones

        // Encontrar el tercer lugar
        for (int k = 0; k < contadores.length; k++) {
            if (contadores[k] > contadores[max3]) {
                max3 = k;
            }
        }
        // Imprimir el tercer lugar
        System.out.println("🥉 3er lugar: "+plataformas[max3]+ "  ➣ "+contadores[max3] + " veces");
        contadores[max3]=0;





    }

}





        System.out.println("🥇 1er lugar: "+plataformas[max1]+ "  ➣ "+contadores[max1] + " veces");
        contadores[max1]=0;

        for (int j = 0; j < contadores.length; j++) {
            if (contadores[max2]<contadores[j]){
                max2=j;
            }
        }

        System.out.println("🥈 2do lugar: "+plataformas[max2]+ "  ➣ "+contadores[max2] + " veces");
        contadores[max2]=0;

        for (int k = 0; k < contadores.length; k++) {
            if (contadores[max3]<contadores[k]){
                max3=k;
            }
        }
        System.out.println("🥉 3er lugar: "+plataformas[max3]+ "  ➣ "+contadores[max3] + " veces");
        contadores[max3]=0;





    }

}