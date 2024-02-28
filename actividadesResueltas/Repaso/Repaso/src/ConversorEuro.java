
/* ✯ ⒸⓄⓃⓋⒺⓇⓉⓄⓇ ✯  */
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
import java.util.Scanner;

public class ConversorEuro {

    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {

       mostrar("Indica en euros el moto a convertir");
        double euros= sn.nextDouble();
        menu(euros);

    }
    public  static void menu(double euros){
        char opcion;
        do{

        mostrar(".....Conversor.....");
        mostrar("\ta➬ Libras £ ");
        mostrar("\tb➬ Yen Japones ¥ ");
        mostrar("\tc➬ Dolar EEUU $ ");
        mostrar("\td➬ Dolar Canada $ CAD ");
        mostrar("\tx➬ Salir");
       
        
        
         opcion = sn.next().charAt(0);
       switch (opcion){
           case  'a'->{
               System.out.println(euros+ "€ = " + euros*0.8562+ " GBP");
           }
           case  'b'->{
               mostrar(euros+"€ = " + euros*163.24 + " Yen Japones");

           }
           case  'c' ->{
               mostrar(euros+"€ = " + euros*1.0838 + " USA ");
           }
           case 'd' ->{
               mostrar(euros+"€ = " + euros*1.4711 + " CAD ");
           }
           case 'x' ->{
               mostrar("¿Estas seguro de salir, x ➥ confirmar");
               opcion=sn.next().charAt(0);
               if (opcion != 'x'){
                   menu(euros);
               }

           }
           default ->  mostrar(" ➬ Opcion no valida");
           
       }
        

        }while(opcion != 'x');}

    public static void mostrar(String texto){
        System.out.println("\t ➥ " + texto);
    }
    
    
    
    
}