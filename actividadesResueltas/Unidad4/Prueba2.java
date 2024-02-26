/*El programa solicita al usuario que ingrese su nombre. Luego, muestra el nombre ingresado en la consola con un mensaje
personalizado indicando "tu nombre es" seguido del nombre proporcionado por el usuario.*/
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
import java.util.*;
public class Prueba2 {
    public static void main(String[] args) {
        String nombreUsuario=llamadaNombre();
        System.out.println("tu nombre es ➥ " + nombreUsuario);

    }
    public static String llamadaNombre(){
        String nombre="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Indica el nombre");
        nombre=sc.nextLine();
        return nombre.toUpperCase();//Cambia todo en mayusculas
    }
}
