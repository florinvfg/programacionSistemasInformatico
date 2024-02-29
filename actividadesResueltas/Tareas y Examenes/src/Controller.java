import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        //tipos de datos ->Las declaraciones de las variables tiene que ser llamadas con su tipode dato.Ej.int total
        int total=0;//se puede iniciar en el momento de declaracion o luego dentro de la ejecucuion
        String nombreUsuario;
        String poblacion;
        int habitantes;
        /*Luego tenemos las declaraciones de la clase Scanner que nos permite ller  la informacion
        * que solicitamos, siempre relacionado con el tipo de dato que se va a escribir*/

        //Declaracion
        Scanner sn=new Scanner(System.in);
        //Solicita el nombre, la poblacion y el numero de habitantes y acumulado hasta que sean las 5 capitales de provincia de CLM
        //Sumar el total de habitantes de las 5 capitales


        //bucles
        //utilizamos un bucle desde 1 a 5 y  lee los datos
        for(int i=1; i<=5; i++){

            System.out.println("Indica la Provincia -> ");
            poblacion=sn.nextLine();
            System.out.println("indica el numero de habitantes ");
            habitantes=sn.nextInt(); sn.nextLine();
            System.out.println("Indica tu nombre -> ");
            nombreUsuario=sn.nextLine();

            //condicional -> si el numero de habitantes es menor de 20000, indicar que hay un error y restar 1 para que vuelva a solicitar la informacion
            if (habitantes<20000){    // Verifica si el número de habitantes es menor de 20000

                i--;// Se decrementa el contador i para repetir la solicitud de datos.
                System.out.println("Los habitantes de " + poblacion + " son mas de " + habitantes + " Vuelve a insertar los datos ");

            }else{
                // Si el número de habitantes es mayor o igual a 20000, se suma al total.

                total+=habitantes;
            }
            // Se suma nuevamente al total por cada iteración del bucle.
            total+=habitantes;

        }
        System.out.println("El numero de habitantes de las 5 Provincias de CLM es " + total);





    }
}
