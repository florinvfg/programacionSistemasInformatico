import java.util.*;
public class Cinema {
    public static void main(String[] args) {
        //Declaración de variables
        Scanner sn=new Scanner(System.in);
        final double precioNino=4.5;
        double precioAdulto=6.0;// no lo hacemos final porque si es miercoles, lo actualizamos a 4.50
        double totalEntradas=0;
        byte miercoles=0;
        byte opcionMenu=0;
        String pelicua1="Ferrari";
        String peliculaSelecc="";
        /*Menu de opciones*/
        System.out.println("---------C I N E M A ---------");
        System.out.println("\t1."+pelicua1);
        System.out.println("\t2. Priscila");
        System.out.println("\t3. Peppa Ciname Party");
        System.out.println("\t4. Pobres Criaturas");
        System.out.println("\t5. La Piscina");
        System.out.println("\t6. Cazadores de demonios");
        System.out.println("\t7. Facturar y Salir");
        System.out.println("________________________________");
        System.out.println("\t¿Es miércoles?");
        System.out.println("\t1. Si \n\t2. No");
        System.out.print("\tRespuesta->");
        miercoles= sn.nextByte();
        if (miercoles==1){
            precioAdulto=4.50;
        }
        do {
            System.out.print("\tIndica la Película a ver->");
            opcionMenu = sn.nextByte();
            switch (opcionMenu){
                case 1,2,3->{
                    if (opcionMenu==1){
                        peliculaSelecc+="\n\t"+pelicua1;
                    }
                    System.out.print("\tNº de niños->");
                    totalEntradas+=sn.nextDouble()*precioNino;
                    System.out.print("\tNº de adultos->");
                    totalEntradas+= sn.nextDouble()*precioAdulto;
                }
                case 4,5,6->{
                    System.out.print("\tNº de adultos->");
                    totalEntradas+= sn.nextDouble()*precioAdulto;
                }
                case 7->{
                    System.out.println("\t....Imprimiendo sus entradas");
                }
                default -> System.out.println("Opcion no valida....");
            }
        }while (opcionMenu!=7);
        System.out.println("\t----------Entradas --------------");
        System.out.println("\tPelícula:"+peliculaSelecc);
        System.out.println("\tImporte a pagar->" + totalEntradas);
        System.out.println("\t----------------------------------");
    }
}


