

/*Modifica la Actividad de aplicación 5.12 para que la función
 no modifique la tabla que se pasa como parámetro y, en su lugar,
  cree y devuelva una copia de la tabla donde se han desordenado
  los valores de los elementos
  Una vez terminada la entrada de datos, muestra la siguiente información:
    Todos los sueldos introducidos ordenados de forma decreciente.
     El sueldo máximo y mínimo.  La media de los sueldos*/

import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class ActividadDeAplicacion5_14 {
    public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de sueldos: ");
        int cantidadSueldos = scanner.nextInt();

        double[] sueldos = new double[cantidadSueldos=5];
        for (int i = 0; i < cantidadSueldos; i++) {
            System.out.print("Ingrese el sueldo " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
        }

        // Copia desordenada de los sueldos
        double[] sueldosDesordenados = desordenar(sueldos);

        // Mostrar sueldos ordenados de forma decreciente
        Arrays.sort(sueldos);
        System.out.println("\tSueldos introducidos ordenados de forma decreciente:");
        for (int i = sueldos.length - 1; i >= 0; i--) {
            System.out.println(sueldos[i]);
        }

        // Calcular y mostrar el sueldo máximo y mínimo
        double sueldoMaximo = sueldosDesordenados[0];
        double sueldoMinimo = sueldosDesordenados[0];
        double sumaSueldos = 0;
        for (double sueldo : sueldosDesordenados) {
            sumaSueldos += sueldo;
            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
            if (sueldo < sueldoMinimo) {
                sueldoMinimo = sueldo;
            }
        }
        double mediaSueldos = sumaSueldos / sueldosDesordenados.length;
        System.out.println("Sueldo máximo: " + sueldoMaximo);
        System.out.println("Sueldo mínimo: " + sueldoMinimo);
        System.out.println("Media de los sueldos: " + mediaSueldos);

        scanner.close();
    }

    public static double[] desordenar(double[] t) {
        // Creamos una copia de la tabla original
        double[] copia = Arrays.copyOf(t, t.length);
        Random random = new Random(); // Creamos un objeto Random para generar números aleatorios
        for (int i = 0; i < copia.length; i++) {
            // Generamos un índice aleatorio entre 0 y la longitud de la tabla
            int indiceAleatorio = random.nextInt(copia.length);
            // Intercambiamos el elemento en la posición actual con el elemento en el índice aleatorio
            double temp = copia[i];
            copia[i] = copia[indiceAleatorio];
            copia[indiceAleatorio] = temp;
        }
        // Devolvemos la copia desordenada de la tabla
        return copia;
*/
//otra manera de hacerlo


        //metodos de mostrar en pantalla

     double sueldos[] = altaSueldos();

      //llamamos al metodo mostrar decreciente
        mostrarDecreciente(sueldos);

        mostrarMaxMin(sueldos);

        mediaSueldos(sueldos);

    }


//metodo de insertar los sueldos
public static double[] altaSueldos() {
    double sueldos[] = new double[0];
    double sueldoAux=0;
    Scanner sn = new Scanner(System.in);
    //el bucle while que hasta que no se escriba -1 no salga de bucle
    do {
        mostrarSinLn("Indique el sueldo");
        sueldoAux= sn.nextDouble();
        sueldos=Arrays.copyOf(sueldos, sueldos.length +1);
        sueldos[sueldos.length-1] = sueldoAux;

    }
    while (sueldoAux!=-1);

    Arrays.sort(sueldos);
    return sueldos;

}
//metodo para mostrar decreciente
public static void mostrarDecreciente(double sueldos[]) {
    for (int i = 0; i < sueldos.length; i++) {
        mostrarSinLn("" + sueldos[i] + "");

    }
}
//metodo para indicar max y min de una tabla ordenada
public static void mostrarMaxMin(double sueldos[]) {
    mostrar(" \nSueldo mayor -> " +(sueldos[sueldos.length-1]));
    mostrar("Sueldo menor -> "+sueldos[0]);
}
//metodo para calcular la media
    public static void mediaSueldos(double sueldos[]){
    double suma=0;
        for (int i = 0; i < sueldos.length; i++) {
            suma+=sueldos[i];

        }
        double media=suma/sueldos.length;
        mostrar("La media de los sueldos es -> " +media);
    }

public static void mostrar (String texto){
    System.out.println("\t" + texto);
}

public static void mostrarSinLn (String texto){
    System.out.print("\t" + texto);
}

}