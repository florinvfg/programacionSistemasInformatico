/*Crea una funcion que,mediante un booleano,indique si el caracter que se pasa como parametro de entrada
corresponde con una vocal*/
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
import java.util.*;
public class ActividadResuelta4_5 {
    //programa principal para probar la funcion
    public static void main(String[] args) {
      /* //La funcion tendra en cuenta las vocales minusculas y mayusculas.
        // No consideraremos las vocales acentuadas (â, é....) o con dieresis
        System.out.println("La i es una vocal " + esVocal ('i'));
        System.out.println("La E es una vocal " + esVocal ('E'));
        System.out.println("La f es una vocal " + esVocal ('f'));
    }
    //comparamos los parametros de entrada c, con cada posible valor de una vocal
    //por simplicidad,obviamos las vocales acentuadas y con dieresis
   static boolean esVocal (char c){
        //Esta es una declaración condicional que verifica si el carácter c es una vocal minúscula (a, e, i, o, u) o
        // una vocal mayúscula (A, E, I, O, U). Si c es una vocal, el bloque de código dentro del if se ejecuta.
        boolean resultado;//true si es vocal y false en caso contrario
       if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
           c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
           resultado=true;
       } else {
           resultado=false;
       }
       return resultado;*/



        //otra manera de hacerlo


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        char caracter = sc.next().charAt(0);
        sc.close();

        boolean esVocal = esVocal(caracter);
//if (esVocal) {...} else {...}: Esta estructura condicional verifica si el valor almacenado en la variable esVocal es true o false.
// Si es true, significa que el carácter ingresado es una vocal, por lo que se imprime un mensaje indicando que es una vocal.
// Si es false, significa que el carácter ingresado no es una vocal, por lo que se imprime un mensaje indicando que no es una vocal.
        if (esVocal) {
            System.out.println("El carácter '" + caracter + "' es una vocal.");
        } else {
            System.out.println("El carácter '" + caracter + "' no es una vocal.");
        }
    }

    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
   }
}





