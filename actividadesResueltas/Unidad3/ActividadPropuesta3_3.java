package Unidad3;
import java.util.*;
/*Implementa un programa que pida al usuario un numero positivo y lo muestre
* guarisimo a guarisimo.Por ejemplo: 123 debe mostrar primero el 3, a continuacion el 2
*  y por ultimo el 1*/
public class ActividadPropuesta3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Dame un número mayor a 0: ");
        n = sc.nextInt();

        if (n > 0) {/*Comienza una estructura condicional (if) para
        verificar si el número ingresado (n) es mayor que 0.*/
            for (int i = n; i > 0; i /= 10){/*Inicia un bucle for con
             la variable i inicializada en el valor de n. El bucle se
             ejecutará mientras i sea mayor que 0 y en cada iteración
             se divide i por 10.*/
                System.out.println(i % 10);
            }
        } else {/*Si el número ingresado (n) no es mayor que 0, entra
        en la parte else de la estructura condicional.*/
            System.err.println(" Introduzca un número MAYOR que 0.");
        }

    }
}
