package Unidad3;
import java.util.*;
/*Un centro de investigacion de la flora necesita una aplicacion que muestre cual es el arbol mas alto.
* Para ello se introducira por teclado la altura (en cm) de cada arbol (terminando la introduccion de
* datos cuando se utilice -1 como altura).Los arboles se identifican mediante etiquetas con numeros unicos
* correlativos,comenzando en 0.Diseña una aplicacion que resuelva el problema planteado*/
public class ActividadResuelta3_4 {
/*Introducimos la altura de cada arbol  dentro de un bucle y guardaremos la mayor e el
* numero de etiqueta del arbol al que le coresponde
* En la busqueda del maximo (o minimo) se nos plantea un problema:con que valor
* inicializamos el maximo.Hemos de inicializar el maximo con un valor menor o igual
* que todos los valores con los que trabajaremos.
* maximo es -2. Si inicializamos arbitrariamente maximo=0, como 0 es mayor que
* cualquier valor del conjunto, el algoritmo dira que el maximo es 0 (error).
* En este caso, al trabajar con alturas (positivas), podemos inicializar sin problema
* a 0 (es menor que cualquier positivo).Sin embargo,en el caso general,la mayor opcion
* es inicializar el maximo al primer valor leido*/
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int etiquetaArbolMasAlto, alturaArbolMasAlto, etiqueta = 0, altura;
        System.out.print("Altura del arbol (" + etiqueta + "): ");
        altura = sc.nextInt();

        alturaArbolMasAlto = altura;//el primer arbol sera, por ahora, el mas alto
        etiquetaArbolMasAlto = 0;//el arbol con etiqueta 0 es, por ahora,el mas alto

        while (altura != -1){
            if (altura > alturaArbolMasAlto){//hemos encontrado un arbol mas alto
                alturaArbolMasAlto = altura;
                etiquetaArbolMasAlto = etiqueta;
            }
            etiqueta++;//se incrementa la etiqueta para solicitar la altura del suguiente
            System.out.print("Altura del arbol (" + etiqueta +"): ");
            altura = sc.nextInt();
        }
        if (alturaArbolMasAlto == -1) {
            System.out.println("No hay ningun arbol");

        } else {
            System.out.println("El arbol mas alto mide: " + alturaArbolMasAlto);
            System.out.println("Etiqueta del albor: " +etiquetaArbolMasAlto);

        }

    }
}
