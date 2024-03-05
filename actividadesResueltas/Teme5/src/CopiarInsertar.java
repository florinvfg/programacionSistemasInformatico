import java.util.*;
public class CopiarInsertar {
    public static void main(String[] args) {
        int[] numeros=new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int) (Math.random()*100+1);

        }
        mostrar("Array antes de creser.Longitud -> " +numeros.length);
        mostrar(Arrays.toString(numeros));
        numeros=Arrays.copyOf(numeros, numeros.length+1);
        mostrar("Array despues de creser.Longitud ->" + numeros.length);
        numeros[numeros.length-1]=8;
        mostrar(Arrays.toString(numeros));
    }public static void mostrar(String texto){
        System.out.println("\t" + texto);
    }
    public static void mostrarSinLn(String texto){
        System.out.println("\t" + texto);
    }
}
