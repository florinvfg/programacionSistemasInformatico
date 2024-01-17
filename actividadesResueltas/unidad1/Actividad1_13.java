package unidad1;
import java.util.*;
/*Escribir un programa que solicite las notas del primer, segundo y tercer Trimiestre
(notas enteras que solicitaran al usuario).El programa debe mostrar la nota media del
curso como se utilizan en el boletin de calificaciones (solo la parte entera) y como se usa
en el expendiente academico (con decimales).
* */
public class Actividad1_13 {
    public static void main(String[] args) {
        //Pediremos tres notas enteras y calcularemos la media con y sin decimales
        int nota1, nota2, nota3;//variables para las notas
        int mediaBoletin;//la media usa decimales
        double mediaExpediente;//la media usa decimales
        Scanner sc = new Scanner(System.in);
        //leemos las notas
        System.out.println("Nota primer trimestre: ");
        nota1 = sc.nextInt();
        System.out.println("Nota segundo trimestre: ");
        nota2 = sc.nextInt();
        System.out.println("Nota tercer trimestre: ");
        nota3 = sc.nextInt();
        //calculamos la media con decimales
        mediaExpediente = (nota1 + nota2 + nota3) / 3.0; // el 3.0 fuerza una division real
        mediaBoletin = (int)  mediaExpediente; /* convertimos un valor double en un valor int,trucando
        la parte decimal.Por tanto, hay perdida de informacion*/
        System.out.println("Boletin de calificaciones: " + mediaBoletin);
        System.out.println("Expediente academico:" + mediaExpediente);












    }

}
