package unidad2;
import java.util.*;
/*En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales.
* El numero de animales que alimentar (todos de la misma especie) es numAnimales, y sabemos que cada
* animal come una media de kilosPorAnimal.Diseña un programa que solicite al usuario los
* valores anteriores y determine si disponemos de alimento suficiente para cada animal.
* En caso negativo,ha de calcular cual es la racion que coresponde a cada una de los animales.
* NOTA: Evitar que la aplicacion realice divisiones por cero  */

public class ActividadDeAplicacion2_13 {
    public static void main(String[] args) {
        int numAnimales;
        double  totalComida, comidaDiaria, kilosPorAnimal;
       Scanner sc = new Scanner(System.in);
        System.out.println(" Indica los kilos que tienes almacenados ->");
        totalComida = sc.nextDouble();
        System.out.println(" Indica numero total de animales ->");
        numAnimales = sc.nextInt();
        System.out.println(" Indica cuantos kilos de gastas por cada animal al dia ->");
        kilosPorAnimal = sc.nextDouble();







/*  int numAnimales;
        double comidaDiaria, kilosPorAnimal, comidaFalta, racionAnimal;

        System.out.println("Ejercicio de la granja. ¿Disponemos de suficiente alimento?");

        System.out.print("Introduzca la cantidad de comida diaria comprada: ");
        comidaDiaria = sc.nextDouble();

        System.out.print("Introduzca la cantidad de animales: ");
        numAnimales = sc.nextInt();

        System.out.print("Introduzca (en kilos) la cantidad que come cada animal: ");
        kilosPorAnimal = sc.nextDouble();

        if (comidaDiaria <= 0 || numAnimales <= 0 || kilosPorAnimal <= 0) {
            System.out.println("Error. Introduzca un valor válido.");
        } else {
            if (comidaDiaria < numAnimales * kilosPorAnimal) {
                comidaFalta = numAnimales * kilosPorAnimal - comidaDiaria;
                System.out.println("No hay suficiente comida. Faltan " + comidaFalta + " kilos.");
                racionAnimal = kilosPorAnimal / numAnimales;
                System.out.println("La ración correspondiente es de " + racionAnimal + " kilos por cada animal.");
            } else {
                System.out.println("Hay suficiente comida.");*/




    }
}
