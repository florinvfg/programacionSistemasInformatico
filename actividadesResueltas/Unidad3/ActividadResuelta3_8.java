package Unidad3;
import java.util.*;
/*Pedir diez numeros enteros por teclado y mostrar la media*/
public class ActividadResuelta3_8 {
    public static void main(String[] args) {


      /*  Scanner sc = new Scanner(System.in);
        int n, total = 0;
        double media;

        for (int i = 1; i <= 10; i++){
            System.out.print("Escribe un número: ");
            n = sc.nextInt();
            total += n;
        }
        media = (double)total /10;
        System.out.println("La media es: " + media);
        */
        Scanner sc =new Scanner(System.in);
        int n;//cada numero introducido por usuario
        int suma = 0;//acumulara la suma de todos los numeros introducidos
        double media;//la media puede contener decimales, por eso sera double
        for (int i = 1; i<=10; i++){
            System.out.println("Esriba un numero: ");
            n= sc.nextInt();
            suma +=n;//es lo mismo que : suma = suma +n

        }
        media=suma/10.0;//calculamos la media
        System.out.println("La media es: " + media);//mostramos la media


    }

    }

