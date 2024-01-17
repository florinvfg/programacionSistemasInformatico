package unidad1;
import java.util.*;
/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas
y peras.Por este motiva,es necesario diseñar una aplicacion que solicite las ventas
(en kilos) de cada semestre para cada fruta.La aplicacion monstrara el importe total sabiendo
que el precio del kilo de manzanas esta fijado en 2,35 euros y el kolo de peras en 1,95 euros.
* */
public class Actividad1_11 {
    public static void main(String[] args) {
        /* Los datos de ebtrada que necesitamos son:
        * - cantidad vendida en el semestre 1 (de peras y manzanas)
        * - cantidad vendida en el semestre 2 (idem)*/

        final double PRECIO_MANZANAS = 2.35; //valores constantes,no varian durante el programa
        final double PRECIO_PERAS = 1.95;
        //los identificadores de constantes los escribimos en mayusculas
        double vManzanas1Sem, vManzanas2Sem; //ventas (en kilos) por semestre
        double vPeras1Sem, vPeras2Sem; //igual para las peras
        double impTotal;//importe total
        Scanner sc = new Scanner(System.in);
        //pedimos los datos
        System.out.println("Ventas de manzanas (en kilos) del primer semestre: ");
        vManzanas1Sem= sc.nextDouble();
        System.out.println("Ventas de manzanas (en kilos) del segundo semestre; ");
        vManzanas2Sem = sc.nextDouble();
        System.out.println("Ventas de peras (en kilos) del primer semestre: ");
        vPeras1Sem= sc.nextDouble();
        System.out.println("Ventas de peras (en kilos) del segundo semestre: ");
        vPeras2Sem= sc.nextDouble();
        impTotal= (vManzanas1Sem + vManzanas2Sem) * PRECIO_MANZANAS;
        impTotal += (vPeras1Sem + vPeras2Sem) * PRECIO_PERAS;
        System.out.println("El importe total es de: " +impTotal + "euros");

    }
}
