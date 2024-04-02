package ActividadResuelta7_8.Controler;
/**Definir una clase que permita controlar un sintonizador digital de emisoras FM; concretamente,se desea
dotar al controlador de una interfaz wue permita subir (up) o bajar (down) la frecuensia (en saltos de 0,5 MHz)
y mostrar la frecuencia para manejar oscila entre los 80 MHz y los 108 MHz y que al inicio el controlador
sintonice la frecuencia indicada en el constructor o 80 MHz por defecto.Si durante una operacion de subida
o bajada se sobrepasa uno de los dos limites,la frecuencia sintonizada debe pasar a ser la del extremo contrario.
Exribir un pequenio programa principaal para probar su funcionamiento.




*/

import ActividadResuelta7_8.Clases.SintonizadorFM;



public class Main {
    public static void main(String[] args) {
        SintonizadorFM a, b;
        a = new SintonizadorFM(107);
        a.up(); a.up(); a.up(); a.up();
        a.display();
        b = new SintonizadorFM(80.5);
        b.down(); b.down(); b.down(); b.down();
        b.display();
        a = new SintonizadorFM(200);
        a.display();


    }
}
