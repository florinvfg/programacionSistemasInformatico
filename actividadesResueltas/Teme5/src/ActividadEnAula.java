/*Array en programacion*/

import java.util.*;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]

public class ActividadEnAula {
/*
El código permite ingresar y almacenar edades en un array, solicitando primero la
cantidad de edades a ingresar, luego las edades en sí. Finalmente, muestra el array
y recorre sus elementos.*/
    public static void main(String[] args) {
   //declaracion de array o tabla debe contener 3 elementos
   //tipo de datos
   //nombre variable
   //longitud
   int [] edad = new int[5]; //el array es de 5 elementos
   edad[0] = 23;
   edad[1] = 52;
   edad[2] = 18;
   edad[3] = 32;
   edad[4] = 45;//estas son los valores de la variable edad
        System.out.println();
        System.out.println(Arrays.toString(edad));

        //ejemplo
        //solicitar con excanner las edades
        //1 cuantas edades voy a insertar
        Scanner sc = new Scanner(System.in);
        mostrar("Indique el numero de edades a insertar");
        int longitud= sc.nextInt();//se guarda la longitud con que voy a crear el aray
        byte[] edades=new byte[longitud];//creamos el array con la longitud leida
        //necesitamos preguntar las edades para ello vamos a crear un bucle for sencillo para
        //que recorra las posiciones del array e inserte los valores
        for (int i=0; i<longitud; i++){
            mostrar("Indique la edad numero " + (i+1));
            edades[i]= sc.nextByte();
        }
        System.out.println("\nTu Array es : ");
        System.out.println(Arrays.toString(edades));
  //bucle foreach.....para recorrer tablas
        for (int ed:edades) {//se daclara una variable llamada elemento y que recorre el array
            System.out.println("edad insertada-> " +ed);


        }
        //metodos o funciones de la Api de java sobre los arrays
        //conoser la longitud
        mostrar("longitud del array edad -> " +edad.length);
        mostrar("longitud de array edades ->" +edades.length);
        for (int i=0;i<edad.length;i++){
            mostrar("la edad insertada en la posicion " +(i+1)+ "es -> " +edad[i]);
        }
        //referencias en los array, variables, etc.

        mostrar("********Referencia de memoria********************");
        System.out.println(edad);
        System.out.println(edades);
    }
    public static void  mostrar(String texto){
        System.out.println("\t" + texto);
    }
}
