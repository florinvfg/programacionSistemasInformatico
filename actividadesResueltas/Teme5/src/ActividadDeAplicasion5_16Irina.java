/*En un juego de rol el mapa puede implementarse como una matriz donde las
 filas y las columnas representan lugares (lugar 0, lugar 1, lugar 2, etc.)
 que estarán conectados. Si desde el lugar X podemos ir hacia el lugar Y,
 entonces la matriz en la posición [x][y] val-drá cierto; en caso contrario,
  valdrá falso. Escribe una función que, dada una matriz que representa el mapa
  y dos lugares, indique si es posible viajar desde el primer lugar al se-gundo
  (directamente o pasando por lugares intermedios)*///   *** [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G] ***
import java.util.*;
public class ActividadDeAplicasion5_16Irina {
    static Scanner sn = new Scanner(System.in);
    static  int puntos = 0;// Se inicializa una variable para almacenar los puntos obtenidos

    public static void main(String[] args) {
        int next=0;
        do {
            mostrar("\n  ¿ Queres jugar ?   ");
            mostrar("\n   1 ➤ Si | 2 ➤ No");
             next = sn.nextInt();
            if (next == 1)
                partida();
        } while (next!=2);
    }
        //mapa debe ser booleano
        public static void partida () {
            // Se define el mapa del juego como una matriz booleana que representa las conexiones entre lugares
            boolean mapa[][] = {
                    {true, false, true, true, false},
                    {false, true, false, true, true},
                    {true, false, true, false, true},
                    {false, true, true, false, true},
                    {true, false, true, true, true},
            };
            // Bucle para mostrar las coordenadas del mapa
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[i].length; j++) {
                    mostrarSinLn("y=" + i + "x" + j);// Se muestra la coordenada y posición en el mapa

                }
                mostrar("");
            }
            int x = 0;
            int y = 0;
            // Bucle do-while para solicitar al usuario las coordenadas de inicio en el mapa
            do {
                mostrar("Indique la posicion y de la tabla [0 - 4] ➤ ");
                y = sn.nextInt();
                mostrar("Indique la posicion x de la tabla [0 - 4] ➤ ");
                x = sn.nextInt();

            } while (y > 4 || y < 0 || x > 4 || x < 0);
            //creamos un contador,donde mostremos las posiciones que tiene que recorrer en el
            //array para llegar al destino

            int contador = 0; // Variable para contar las casillas recorridas en el mapa

            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[i].length; j++) {
                    contador++;
                    if (i == y && j == x) { // Si se encuentra la posición ingresada por el usuario
                        mostrar("El resultado es ➤ " + mapa[i][j]);
                        mostrar("Ha recorrido  ➤ " + contador + "  casillas");

                        if (mapa[i][j]) {
                            puntos++;
                        }
                        mostrar("Puntos ➤ " + puntos);
                        break;
                    }
                }

            }
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
        }
            public static void mostrar (String texto){
                System.out.println("\t" + texto);
            }

            public static void mostrarSinLn (String texto){
                System.out.print("\t" + texto);
            }
        }

