package Colecciones;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class Main {
    public static void main(String[] args) {
//Se declara una nueva instancia de ArrayList llamada colors que almacenará elementos de tipo String.
// La lista se inicializa como vacía.
        ArrayList<String> colors=new ArrayList<>();
        //Se agregan los elementos "Red,Blue y Green" a la lista colors.
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
       // Se imprime en la consola el contenido actual de la lista colors.
        System.out.println("ArrayList: "+colors);
        //Se elimina el elemento en la posición 1 de la lista colors (que es "Blue") y se asigna a la variable color.
        String color= colors.remove(1);
        // Se imprime en la consola el contenido actualizado de la lista colors después de eliminar el elemento.
        System.out.println("ArrayList: "+colors);
        //Se imprime en la consola el elemento que se eliminó anteriormente ("Blue").
        System.out.println("Removed Element: "+colors);
        //Se reemplaza el elemento en la posición 1 de la lista colors con "Yellow".
        colors.set(1, "Yellow");
        //Se imprime en la consola el contenido actualizado de la lista colors después de modificar un elemento.
        System.out.println("Modified ArrayList: "+colors);
        //para saber la longitud de una ArrayList se utiliza "size"
        System.out.println("La longitud de ArrayListe es:"+colors.size());//Se imprime en la consola la longitud actual de la lista colors utilizando el método size().

        // Se declara una nueva instancia de ArrayList llamada clothes que almacenará elementos de tipo String.
        // La lista se inicializa como vacía.
        ArrayList<String> clothes=new ArrayList<>();
clothes.add("jacket");
clothes.add("shirt");
clothes.add("pullover");
//Se imprime en la consola el contenido actual de la lista clothes.
        System.out.println("ArrayList: "+clothes);
      //  Se obtiene el elemento en la posición 2 de la lista clothes (que es "pullover") y
        //  se asigna a la variable str.
        String str =clothes.get(2);
        //Se imprime en la consola el elemento que se encuentra en la posición 2 de la lista clothes.
        System.out.println("Element at index 2: "+str);

        ArrayList<Integer> ages=new ArrayList<Integer>();
        ages.add(25);
        ages.add(30);
        ages.add(40);
        ages.add(50);
        Collections.sort(ages);//se utiliza la clase Collections
       for (int i:ages){
           System.out.println(i);
       }


    }
}
/**


 * System.out.println("ArrayList: " + colors);:
 * String color = colors.remove(1);:
 * System.out.println("ArrayList: " + colors);:
 * System.out.println("Removed Element: " + color);:
 * colors.set(1, "Yellow");:
 * System.out.println("Modified ArrayList: " + colors);:
 * System.out.println("La longitud de ArrayList es: " + colors.size());:
 * ArrayList<String> clothes = new ArrayList<>();:
 * clothes.add("jacket");: Se agrega el elemento "jacket" a la lista clothes.
 * clothes.add("shirt");: Se agrega el elemento "shirt" a la lista clothes.
 * clothes.add("pullover");: Se agrega el elemento "pullover" a la lista clothes.
 * System.out.println("ArrayList: " + clothes);:
 * String str = clothes.get(2);:
 * System.out.println("Element at index 2: " + str);:
 */