package unidad1;
/* Crear una aplicacion que calcula la media aritmetica de dos notas enteras
* Hay que tener en cuenta que la media puede contener decimales*/
import java.util.Scanner;
public class Actividad1_6 {
    public static void main(String[] args) {
     //pediremos dos notas enteras y calcularemos la media
     //como la media puede tener decimales utilizaremos una variable de tipo real
     int nota1, nota2;//variables enteras para las notas
     double media;//la media puede contener decimales y por eso usamos "double"
     Scanner sc = new Scanner(System.in);
     //leemos las notas
        System.out.println("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.println("Nota 2: ");
        nota2 = sc.nextInt();
        //calculamos la media
        media = (nota1 + nota2) / 2.0;
        //en la exprecion,el punto decimal de 2.0 hace que no sea una divizion entera
        //el numerador sufre una convercion automatica a real en doble precicion
        //y el resultado conserva la parte decimal
        System.out.println("La media es: " + media);
        

    }
}
