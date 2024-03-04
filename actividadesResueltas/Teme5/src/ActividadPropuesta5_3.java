/*Introduce por teclado un numero n; a continuacion solicita al usuario que teclee n numeros
* Realiza la media de los numeros positivos, la media de los negativos y cuenta el numero de ceros introducidos*/
import java.util.*;
public class ActividadPropuesta5_3 {
    public static void main(String[] args) {
        //solicitar cuantos numeros a insertar
        Scanner sc = new Scanner(System.in);
        mostrar("Indica el numero de elementos a insertar ➫ ");
int longitud=sc.nextInt();
int numeros[]=new int[longitud];
int contadorCeros=0;
int contadorNegativos=0;
int contadorPositivos=0;
double mediaTotal=0;
double mediaNegativos=0;
double mediaPositivos=0;
for (int i=0; i<longitud; i++){
    mostrar("Indica el elemento num ➫ " + (i+1));
    numeros[i]= sc.nextInt();
    if (numeros[i]<0){
        mediaNegativos+=numeros[i];
        contadorNegativos++;

    } else if (numeros[i] > 0) {
        mediaPositivos+=numeros[i];
        contadorPositivos++;
    }else {
        contadorCeros++;
    }
}

mostrar("Negativos ➫ " + mediaNegativos);
mostrar("Positivos ➫ " + mediaPositivos);
mostrar("");

    }

        public static void mostrar(String texto){
            System.out.println(texto);



    }
}
/*otra manera de hacerlo




        // Pedir al usuario que ingrese el número de elementos
        System.out.print("Introduce el número de elementos: ");
        int n = sc.nextInt();

        // Variables para almacenar la suma de números positivos, negativos y el contador de ceros
        int sumaPositivos = 0, sumaNegativos = 0;
        int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;

        // Pedir al usuario que ingrese los números
        System.out.println("Introduce los números:");

        for (int i = 0; i < n; i++) {
            int numero = sc.nextInt();

            if (numero > 0) {
                sumaPositivos += numero;
                contadorPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        // Calcular las medias
        double mediaPositivos = contadorPositivos > 0 ? (double) sumaPositivos / contadorPositivos : 0;
        double mediaNegativos = contadorNegativos > 0 ? (double) sumaNegativos / contadorNegativos : 0;

        // Mostrar resultados
        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros introducidos: " + contadorCeros);

        sc.close();
    }
}
*/