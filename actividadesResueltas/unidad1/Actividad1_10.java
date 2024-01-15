package unidad1;
import java.util.*;

/*Diseñar un algoritmo que nos indique si podemos salir a la calle.Existen aspectos que influiran
en esta decision:si esta lloviendo y hemos terminado nuestras tareas.Solo podremos
salir a la calle si no esta lloviendo y hemos finalizado nuestras tareas.
Existe una opccion en la que,indistintamente de lo anterior,podremos salir en la
calle:el hecho de que tengamos que ir a la biblioteca (para realizar algun trabajo,agregar un libro...)
Solicitar al usuario (mediante de un booleano) si llueve,si ha finalizado la tareas y si necesita ir
a la biblioteca.El algoritmo debe mostrar mediante un booleano (true o false) si es posible que se
lo ortogue permiso para ir a la calle
* */
public class Actividad1_10 {
    public static void main(String[] args) {
        //Tras solicitar la informacion requierida usaremos operadores logicos para coseguir
        //saber si es posible salir a la calle.
        boolean llueve, finalizadoTareas, irBiblioteca;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Esta lloviendo? (true/false) ");
        llueve = sc.nextBoolean();
        System.out.println("¿Has finalizado tus tareas? (true/false) ");
        finalizadoTareas =sc.nextBoolean();
        System.out.println("¿Tienes que salir a la biblioteca? (true/false) ");
        irBiblioteca =sc.nextBoolean();
        boolean salir = !llueve && finalizadoTareas || irBiblioteca;
        System.out.println("Puedes salir: " + salir);



    }
}
