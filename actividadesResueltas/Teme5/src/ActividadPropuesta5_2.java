
/*Construye una tabla de 10 elementos del tipo que desees.
Declara diferentes variables de tabla que referenciaran la
 tabla creada.comprueba, imprimiendo por pantalla, que todas la
 variables contienen la misma referencia*/
import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class ActividadPropuesta5_2 {
    public static void main(String[] args) {

                // Crear una tabla de 10 elementos de tipo int
                int[] tabla = new int[10];

                // Inicializar la tabla con algunos valores
                for (int i = 0; i < tabla.length; i++) {
                    tabla[i] = i + 1;
                }

                // Declarar diferentes variables de tabla que referenciarán la tabla creada
                int[] variableTabla1 = tabla;
                int[] variableTabla2 = tabla;
                int[] variableTabla3 = tabla;

                // Comprobar que todas las variables contienen la misma referencia
                System.out.println("Referencia de tabla: " + tabla);
                System.out.println("Referencia de variableTabla1: " + variableTabla1);
                System.out.println("Referencia de variableTabla2: " + variableTabla2);
                System.out.println("Referencia de variableTabla3: " + variableTabla3);
            }
        }







