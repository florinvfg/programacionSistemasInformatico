package Unidad3;
import java.util.*;
/*Dadas 6 notas, mostrar cuantos alumnos están "
  aprobados, condicionados y suspensos.*/
public class ActividadResuelta3_13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int aprobados = 0, suspensos = 0, condicionados = 0, nota;//contadores
        boolean error = false;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Nota (0 al 10) del alumno número " + i + ": ");
            nota = sc.nextInt();
            if (nota == 4) {//comprobaremos en que caso nos encontramos
                condicionados++;
            } else if (nota >= 5 && nota <= 10) {
                aprobados++;
            } else if (nota < 4 && nota >= 0) {//este if es redundante, al ser el unico caso posible
                suspensos++;
            } else if (nota < 0 || nota > 10) {
                error = true;
                break;
            }
        }
        if (error == true) {
            System.err.println(" Nota no válida.");
        } else {
            System.out.println("Alumnos aprobados: " + aprobados);
            System.out.println("Alumnos suspensos: " + suspensos);
            System.out.println("Condicionados " + condicionados);
        }




    }
}
