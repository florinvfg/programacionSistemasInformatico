/*Repetir la Actividad resuelta 4.4 con una version que calcule el maximo de tres numeros*/
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
/*Vamos a sobrecargar la funcion para que tenga tres parametros:maximo(a,b,c).Para implementar la funcion
podemos escribir el algoritmo desde cero o basarnos en la funcion maximo() de la Act.resuelta 4.4.
En este caso vamos reutilizar el codico existente* */
import java.util.*;
public class ActividadResuelta4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        int b = sc.nextInt();
        System.out.println("Ingrese el tercer número:");
        int c = sc.nextInt();

        int maximo=maximo(a, b, c);
        System.out.println("El numero mayor es ➦ " + maximo);
        
    }

    // Método para encontrar el máximo de tres números
    static int maximo(int a, int b, int c) {
        // Utilizamos el método maximo de dos números dos veces para encontrar el máximo de los tres
        return maximo(maximo(a, b), c);
    }

    // Método para encontrar el máximo de dos números
    static int maximo(int a, int b) {
        // Si a es mayor o igual que b, retornamos a, de lo contrario, retornamos b
        if (a >= b) {
            return a;
        } else {
            return b;
        }


//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]


    }
}
