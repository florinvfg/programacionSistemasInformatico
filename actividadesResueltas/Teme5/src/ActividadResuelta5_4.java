import java.util.Scanner;

/*Diseñar la funcion int maximo(int t[]) que devuelva el maximo valor contenido en tabla t*/
public class ActividadResuelta5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros desea introducir: ");
        int longitud = sc.nextInt();
        int numeros[] = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            mostrar("Indique el numero");
            numeros[i] = sc.nextInt();
        }
        mostrar("El maximo valor insertado es: " + maximo(numeros));
    }

    public static int maximo(int t[]) {
        int max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return max;
    }

    public static void mostrar(String mensaje) {
        System.out.println(mensaje);
    }
}
