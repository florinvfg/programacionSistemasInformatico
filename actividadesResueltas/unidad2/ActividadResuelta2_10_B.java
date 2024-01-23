package unidad2;
import java.util.*;
/*Pedir una nota entera de 0 a 10 y monstrarla de la siguiente forma:
 * insuficiente (de 0 a 4)
 * suficiente (5)
 * bien (6)
 * notable (7 y 8 )
 * sobresaliente (9 y 10)*/

public class ActividadResuelta2_10_B {
    /*Vamos a resolver el ejercicio utilizando una estructura switch en lugar de if·s anidados*/
    public static void main(String[] args) {
        int nota;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una nota: ");
        nota = sc.nextInt();

        switch (nota){
            case 0, 1, 2, 3, 4 ->
                    System.out.println("Insuficiente");
            case 5 ->
                    System.out.println("Suficiente");
            case 6 ->
                    System.out.println("Bien");
            case 7, 8 ->
                    System.out.println("Notable");
            case 9, 10 ->
                    System.out.println("Sobresaliente");
            default ->
                    System.out.println("Error: nota no válida");
        }
    }
}



