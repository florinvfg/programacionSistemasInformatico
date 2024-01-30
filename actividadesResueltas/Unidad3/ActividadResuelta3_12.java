package Unidad3;
import java.util.*;
/*Pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso*/

public class ActividadResuelta3_12 {
    /*Utilizamos una bandera para controlar si entre los alumnos existe al menos uno
    * con una asignatura suspensa, decir que nota < 5. Una bandera es una variable,normalmente
    * booleana, que indica, mediante sus valores, alguna situacion o estado.En este caso:
    * suspenso=false, significa que no existe ninguna nota suspensa
    * suspenso = true,significa que existe, al menos,un alumno suspenso
    * Hay que tener cuidado cuando se activa una bandera, en no volver a desactivarla,
    * ya que entonces no refleja lo que intentamos evaluar, sino la ultima
    * situacion ocurrida.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean suspenso = false, error = false;

        int notas, aprobados=0, suspendidos=0;

        for (int i = 0; i < 5; i++){
            System.out.print("Introduzca nota de 0 a 10 ->");
            notas = sc.nextInt();
            if ( notas < 5) {
                suspenso = true;
                suspendidos++;// Incrementa el contador de suspendidos
            } else if ( notas < 0 || notas > 10){
                error = true;
                break;
            }else {
                aprobados++;// Incrementa el contador de aprobados
            }
        }
        if (error == true) {
            System.err.println(" Nota no válida.");
        } else if (suspenso)  {

            System.out.println("Hay alumnos suspensos.");
        } else {
            System.out.println("No hay alumnos suspensos.");


        }
        // Muestra la cantidad de aprobados y suspendidos
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspendidos: " + suspendidos);

    }
}
