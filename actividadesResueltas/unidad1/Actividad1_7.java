package unidad1;
import java.util.*;

/* Diseñar una aplicacion que calcule la longitud y el area de una circumferencia.
* Para ello,el usuario debe introducir el radio (que puede contener decimales)*/
//recordamos:
// Longitud=2π+radio
// Area = π+radio a cuadrado
public class Actividad1_7 {
/*
* para calcular la longitud y el area utilizaremos el valor de "pi" que nos brinda Math.
* y usaremos el metodo de la API que eleva una base a un exponente para el cuadrada*/
    public static void main(String[] args) {
        double radio;//el radio puede contener decimales
        double area, longitud;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //usaremos decimales con "."
        //pedimos datos
        System.out.println("Escriba el radio: ");
        radio = sc.nextInt();
        longitud = 2 * Math.PI + radio;//la clase Math pertenece al paquete "java.lang"que se importa por defecto
        area = Math.PI * Math.pow(radio, 2);//Math.pow(base,exponente)eleva la base
        //al exponente utilizado.Math.pow(radio, 2)eleva el radio a 2 (al cuadrado)
        System.out.println("La longitud de la circumstancia es: " + longitud);
        System.out.println("El area del circulo es: " + area);





    }
}
