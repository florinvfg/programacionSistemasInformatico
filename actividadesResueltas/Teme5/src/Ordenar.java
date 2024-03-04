import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {
        //ordenar un array, se modifica el array
        //se ordena de forma cresiente
        //los datos pueden ser primitivos(numericos)
        int[]numeros={5,8,7,1,3,9,15};
        //la funcion para ordenar array es :Arrays.sort(nombreDelArray)
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        //ordenar tipos primitivos(String)
        String nombres[]={"Maria","Ana","Beatriz","arancha"};
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));

    }
}
