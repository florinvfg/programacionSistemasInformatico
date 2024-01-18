package unidad1;
import java.util.*;
/* Un biologo esta realizando un estudio de distintas especies de invertebrados y necesita
* una aplicacion que le ayude a contabilizar el numero de patas que tienen en total todos
* los animales capturados durante una jornada de trabajo.Para ello,te ha solicitado que escribas
* una aplicacion a la que hay que proporcionar:
* -El numero de hormigas capturadas (6 patas)
* -El numero de arañas capturadas (8 patas)
* -Al numero de cochinillas capturadas (14 patas)
* La aplicacion debe mostrar el numero total de patas*/

public class ActividadDeAplicacion1_18 {
    public static void main(String[] args) {
        int hormigas, aranias, cochinillas, total;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de hormigas capturadas: ");
        hormigas = sc.nextInt();
        hormigas = hormigas * 6;

        System.out.print("Introduzca el numero de arañas capturadas: ");
        aranias = sc.nextInt();
        aranias = aranias * 8;

        System.out.print("Introduzca el numero de cochinillas capturadas: ");
        cochinillas = sc.nextInt();
        cochinillas = cochinillas *14;

        total= hormigas + aranias + cochinillas;

            System.out.println(" ☺ El numero total de patas es: " + total);









    }
}
