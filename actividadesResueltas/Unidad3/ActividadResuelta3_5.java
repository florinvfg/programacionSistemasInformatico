package Unidad3;
import java.util.*;
/*Desarollar un juego que ayude a mejorar el calculo mental de la suma*/
public class ActividadResuelta3_5 {
    public static void main(String[] args) {
       /* System.out.println("Juego de la suma en bucle."
                + "\nMientras el resultado sea correcto el juego continúa."
                + "\nSuma los siguientes números generados aleatoriamente del 1 al 100.");

        Scanner sc = new Scanner(System.in);

        int n1, n2, result, contador = 0;

        do {
            n1 = (int) (Math.random() * 100 + 1);
            n2 = (int) (Math.random() * 100 + 1);
            System.out.print(n1 + " + " + n2 + " = ");
            result = sc.nextInt();
            contador ++;
        } while (result == n1 + n2);

        System.out.println("A conseguido realizar: " + (contador - 1) + " sumas consecutivas.");
*/

        // otra manera de hacer el exercicio

        //declaramos la variables
        int operando1, operando2,resultado=0;
        int numeroAcertadas =0, resultadoUser=0;
        byte operacion;
        char simbolo=' ';
        Scanner sn =new Scanner(System.in);

        do {
            operacion = (byte) (Math.random() * 3 + 1);
            operando1 = (int) Math.random() * 100 + 1;
            operando2 = (int) (Math.random() * 100 + 1);

            switch (operacion) {


            case 1 -> {
                simbolo = '+';
                resultado = operando1 + operando2;
            }
            case 2 -> {
                simbolo = '-';
                resultado = operando1 - operando2;
            }
            case 3 -> {
                simbolo = '*';
                resultado = operando1 * operando2;

            }
        }


                System.out.println(operando1 + " + " + operando2 + "-> ");

            resultadoUser=sn.nextInt();
            numeroAcertadas++;
            System.out.println("Acertadas " + numeroAcertadas);
        }while (resultado==resultadoUser);
        --numeroAcertadas;
        System.out.println("Numeros de operaciones asertadas " + numeroAcertadas + " :))");
    }
}
