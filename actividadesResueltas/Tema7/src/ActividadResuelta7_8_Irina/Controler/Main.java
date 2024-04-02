package ActividadResuelta7_8_Irina.Controler;

import ActividadResuelta7_8_Irina.Clases.SintonizadorFM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion;
        Scanner entrada = new Scanner(System.in);
        SintonizadorFM sintonizadorFM = new SintonizadorFM();
        do {
            System.out.println("\n\t----Radio FM----");
            System.out.println(" 1. Subir");
            System.out.println(" 2. Bajar");
            System.out.println(" 3. Indicar Un Favorito");
            System.out.println(" 4. Apagar La Radio");
            System.out.println(" **** Indique su Opcion ****");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                    sintonizadorFM.up();
                    sintonizadorFM.display();
                }
                case 2 -> {
                    sintonizadorFM.down();
                    sintonizadorFM.display();
                }
                case 3 -> {
                    System.out.println("Indica la Frecuencia favorita");
                    sintonizadorFM.setFrecuencia(entrada.nextDouble());
                    sintonizadorFM.display();
                }
                case 4 -> System.out.println("****Apagado****");
                default -> System.err.println("Opcion no valida");
            }

        }while (opcion!=4);

    }

}


