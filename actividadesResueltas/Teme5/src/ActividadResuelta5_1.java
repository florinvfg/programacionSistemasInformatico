/*creea una tabla de longitud 10 que se inicializara con numeros aleatorios entre 1 y 100
* mostrar la suma de todos los numeros que se guarden en la tabla*/
import java.util.*;
public class ActividadResuelta5_1 {
    public static void main(String[] args) {
        //crear el array de numeros
        int []numeros =new int[10];
        int suma=0;
        for (int i=0; i<numeros.length; i++){
            numeros[i]=(int) (Math.random()*100+1);
            suma+=numeros[i];
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("La suma de todos los elementos = " + suma);
        //salida interesante -> con foreach
        /*foreach es una construcción del lenguaje
        // en algunos lenguajes de programación, como Java, que permite recorrer una
        // colección de elementos de manera más simple y legible que utilizando un bucle for estándar.
        // En Java, también se le conoce como el bucle "enhanced for" o "for-each".*/
for (int elemento:numeros){//esta es La sintaxis general de un bucle foreach en Java
    System.out.println(elemento + "+");
}
        System.out.println("=" + suma);


String[]id=new String[5];
//inicializar con un valor predeterminado un array
        Arrays.fill(id,"nombre");
        System.out.println(Arrays.toString(id));
        double[] puntuacion=new double[10];
        //incializar todos los valores en 0
        Arrays.fill(puntuacion,0);
        System.out.println(Arrays.toString(puntuacion));
        //inicializar los indices comprendidos de 0 a 5 con valor de 55
        Arrays.fill(puntuacion,0, 5, 55);
        System.out.println(Arrays.toString(puntuacion));

    }
}