package Colecciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Try {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int opcion = 0;
        do {


            mostrar("CRUD DE SOCIOS");
            mostrar("**************");
            mostrar("1. Alta de Socio");
            mostrar("2. Listar Socios ordenado por Id");
            mostrar("3. Actualizar Socio por Id");
            mostrar("4. Eliminar Socio por Id");
            mostrar("5. Buscar Socio por Id");
            mostrar("6. Salir");
try {
    mostrar("Idique su opcion");
    opcion = sn.nextInt();
}catch (InputMismatchException e){
    mostrar("Solo se aceptan opciones de 1 a 5");
    sn.next();
}



        } while (opcion!= 5);
    }
    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
}
