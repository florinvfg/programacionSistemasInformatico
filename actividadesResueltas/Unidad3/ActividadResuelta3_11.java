package Unidad3;
import java.util.*;
/*Pedir un numero y calcular su factorial.Por ejemplo,el factorial de 5 se denota 5!
* y  es igual a 5x4x3x2x1=120*/

public class ActividadResuelta3_11 {
    /*El factorial de n se define como el producto de todos los enteros
    * entre 1 y n.   Por ejemplo:
    * el factorial de 10 es : 10*9*8*7*6*5*4*3*2*1= 3628800*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*podriamos declarar factorial de tipo long,el tamaño de este tipo permite
        * calcular hasta el factorial de 25.Mejor utilizamos un double*/
  double factorial;
  int numero;
        System.out.println("Dime un numero: -> ");
        numero= sc.nextInt();
        factorial=1;//es importante iniciarlo a 1, ya que multiplicara
        for ( int i=numero; i>0; i--){
            factorial=factorial * i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);



    }

}
