/*Diseñar la funcion eco() a la que se le pasa como parametro un numero n, y muestra
* por pantalla n veces el mensaje "Eco..."*/
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
import java.util.*;

/*Las soluciones iran acompaniadasde una funcion main que sirva de prueba.El prototipo de la funcion es:
* void eco(int n).*/

public class ActividadResuelta4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero ➔ ");
        int n = sc.nextInt();
        System.out.println("--Antes de llamar a la funcion--");
        eco (n);//invocamos a la funcion
        System.out.println("--Despues de llamar a la funcion--");
    }
    //La funcion lo unico que hace es mostrar un mensaje repetido mediante un bucle
    static void eco(int a) {//el parametro no tiene por que llamarse como en la llamada
        for (int i = 0; i < a; i++) {
            System.out.println("Eco...");
        }
    }
}
