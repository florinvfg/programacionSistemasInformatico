/*Desarollar el juego << la camara secreta >>,que consiste en abrir una camara mediante su combinacion
* secreta,que esta formando por una combinacion de digitos del una a cinco.El jugador especificara cual
* es la longitud de la combinacion;a mayor longitud,mayor sera la dificultad del juego.
* La aplicacion genera,de forma aleatoria,una combinacion secreta que el usuario tendra que acertar.En cada
* intento se muestra como pista,para cada digito de la combinacion  introducido por el jugador,si es mayor,
* menor o yfual que el corespondiente en la combinacion secreta.*/
import java.util.*;
public class ActividadResuelta5_11 {
    public static void main(String[] args) {

        /*E juego consiste en acertar la combinacion secreta,que se genera de forma aleatoria*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Longitud de la combinacion secreta: ");
        int longitud = sc.nextInt();
        int combSecreta[] = new int[longitud];//combinacion secreta
        int combJugador[] = new int[longitud];//combinacion del jugador
//generamos aleatoriamente la combinacion secreta:
        generaCombinacion(combSecreta);
        //esto es trampa:mostrarla combinacion secreta para facilitar
        System.out.println(Arrays.toString(combSecreta));
        System.out.println("Escriba una combinacion");
        leeTabla(combJugador);
        while (!Arrays.equals(combSecreta, combJugador)) {//no sean iguales
            muestraPistas(combSecreta, combJugador);//mostramos las pistas
            System.out.println("escriba una combinacion ");
            leeTabla(combJugador);//volvemos a pedir otra combinacion

        }
        //salir del while significa que hemos acertado la combinacion secreta
        System.out.println("!La camara esta abierta! ");


    }

    //esta funcion inicializa los valores de la tabla t con valores aleatorios
    //la constante Max determina el valor maximo que se asigna a un elemento
    //estado comprendido en el rango 1..Max
    static void generaCombinacion(int t[]) {
        final int Max = 5;//rango 1...Max
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * Max + 1);//numero aleatorio de 1 a Max
            //t referencia a la tabla combSecreta del programa principal.
            //por este motivo asignar un valor a t[i] es lo mismo que hacerlo a combSecreta[i]

        }
    }

    //recorre t y asigna  cada elemento un valor leido desde el teclado
    static void leeTabla(int t[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {//recorremos para leer
            t[i] = sc.nextInt();

        }
    }

    /*Recorre las dos tablas, secret y jug. e idica para cada elemento de la combinacion
     * introducida por el usuario si es mayor, menor o igual que el equivalente
     * en la combinacion secreta*/
    static void muestraPistas(int secret[], int jug[]) {
        System.out.println("Pistas");
        for (int i = 0; i < jug.length; i++) {//recoremos ambas tablas
            System.out.println(jug[i]);
            if (secret[i] > jug[i]) {//comparamos el i-esimo elemento de ambas
                System.out.println("mayor");

            } else if (secret[i] < jug[i]) {
                System.out.println("menor");
            } else {
                System.out.println("igual");
            }
        }
    }
}
