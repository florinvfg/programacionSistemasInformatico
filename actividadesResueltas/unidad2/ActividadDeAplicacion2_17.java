package unidad2;
import java.util.*;
/*Realiza el << juego de la suma >> que consiste en que aparezcan dos numeros aleatorios (corendidos entre 1 y 99)
* que el usuario tiene que sumar.La aplicacion debe indicar si el resultado de la operacion es corecto o incorecto*/
public class ActividadDeAplicacion2_17 {
    /*Podemos generar numeros aleatorios en cuatro formas:
    * - rnd.nextInt(); Genera numero aleatorio de tipo INT
    * - rnd.nextLong(); Genera un numero aleatorio entero de tipo LONG
    * - rnd.nextFloat(); Genera un numero aleatorio de tipo FLOAT entre 0.0 y 1.0 siempre < 1.0
    * - rnd.nextDouble(); Genera un numero de tipo DOUBLE entre 0.0 y 1.0 aunque siempre < 1.0
    *
    * Para crear una secuencia de 10 números aleatorios enteros comprendidos entre 0 y 9 ambos incluídos escribimos

    	int x;
	for (int i = 0; i < 10; i++) {
        	x = (int)(rnd.nextDouble() * 10.0);
        	System.out.println(x);
    	}
(int) transforma un número decimal double en entero int eliminando la parte decimal.*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int rand1, rand2, suma, num;

        System.out.println("Vamos a sumar:");

        rand1 = (int)(Math.random() * 99 + 1);
        rand2 = (int)(Math.random() * 99 + 1);
        suma = rand1 + rand2;

        System.out.println("Número 1: " + rand1);
        System.out.println("Número 2: " + rand2);

        System.out.print("Introduce el resultado: ");
        num = sc.nextInt();

        if (suma == num){
            System.out.println("CORECTO");
        } else {
            System.err.println("INCORECTO");
        }*/

        // deferente

        Scanner sn = new Scanner(System.in);
        int num1=(int)(Math.random()*100+1);
        int num2=(int) (Math.random()*100+1);
        int resutado=num1+num2;
        System.out.println("Suma los dos numeros " +num1 + " + " +num2);
        int resulUser=sn.nextInt();
        if(resutado==resulUser){
            System.out.println("Corecto" + resutado);
        }else{
            System.err.println("Incorecto");
        }
    }

}




