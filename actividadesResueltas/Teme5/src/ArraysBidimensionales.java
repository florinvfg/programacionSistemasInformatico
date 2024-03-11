
import java.util.*;
public class ArraysBidimensionales {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(solicitarNum()));


    }
    public static int [][] solicitarNum(){
        Scanner sc= new Scanner(System.in);
        int numeros[][]=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingrese el numero de la fila " + i + " y la columna");
                numeros[i][j]=sc.nextInt();
            }

        }
return numeros;
    }

}
