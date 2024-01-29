package Unidad3;
import  java.util.*;
/*Codificar el juego "el numero secreto",que consiste en acertar un numero entre 1 y 100
* (generando aleatoriamente). para ello se introduce por teclado una serie de
* numeros,para los que indica: mayor o menor,segun sea mayor o menor con respecto
* al numero secreto.El proceso terminar cuando el usuario acierta o cuando se rinde
* (intoduciendo un -1)*/
public class ActividadResuelta3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numSecreto = (int) (Math.random() * 100 +1);//numero aleatorio entre 1 y 100
        System.out.println("Introduzca un numero entre 1 y 100: ");
        int num = sc.nextInt();
        while (numSecreto != num && //mientras no acertamos (son distintos)
         num != -1) {//y no introduzcamos un -1
            if (numSecreto < num) {//el numero secreto es menor
                System.out.println("Menor");
            } else {//en otro caso, sera mayor
                System.out.println("Mayor");
            }
            System.out.println("Introduzca otro numero: ");
            num = sc.nextInt();
        }
        //salimos del bucle porque el jugador acierta el numero o se rinde
        if (numSecreto==num){
            System.out.println("Enhorabuena...");
        }else {
            System.out.println("Otra vez sera...");

        }

    }
}
