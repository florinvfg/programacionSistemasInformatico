package Unidad3;
/*Mejor ejemplo de bucles anidados es la tabla de multiplicar*/
public class BuclesAnidados {
    public static void main(String[] args) {
        System.out.println("  TABLA DE MULTIPLICAR   ");
        for (byte i=1; i<=10; i++){
            /*Inicia un bucle for externo que va desde i=1 hasta i<=10, incrementando i en cada iteración.
             Este bucle controla las tablas de multiplicar del 1 al 10.
             */
            System.out.println("  TABLA DEL " + i );
            for (byte y=1; y<=10; y++){
                /*Inicia un bucle for interno que va desde y=1 hasta y<=10, incrementando y en cada iteración.
                 Este bucle controla los multiplicadores de 1 al 10 dentro de cada tabla de multiplicar.*/
                System.out.println(i + "x" + y + " = " + (i*y) );
            }
        }
/*En resumen, el código utiliza dos bucles for anidados para generar y mostrar las tablas de multiplicar del 1 al 10.
El bucle externo controla la tabla actual y el bucle interno controla los multiplicadores dentro de esa tabla.
Cada multiplicación se imprime en la consola como parte de la tabla de multiplicar correspondiente.*/


    }
}
