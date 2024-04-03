package ActividadResuelta7_13.Controler;

import ActividadResuelta7_13.Clases.Pila;

/**
 * Una pila es una estructura dinámica de datos donde los elementos se insertan (se apilan)
 * y se retiran (se desapilan) siguiendo la norma de que el último que se apila será el
 * prime-ro en desapilarse, como ocurre con una pila de platos. Cuando vamos a retirar un plato
 * de una pila a nadie se le ocurre tirar de uno de los de abajo; retiramos (desapilamos) el que
 * está encima de todos, que fue el último en ser apilado. Se llama cima de la pila al último
 * elemento apilado (o al primer elemento para desapilar). Los métodos fundamentales de una pila
 * son apilar() y desapilar().Implementar la clase Pila para números Integer, donde se usa una
 * lista (un objeto de la clase Lista implementada en la Actividad resuelta 7.11) para guardar
 * los elementos apilados
 * */


public class Main {
    //programa principal para probar la clase Pila
    public static void main(String[] args) {
        Pila p = new Pila();
        System.out.println(p.desapilar());//muestra null, ya que p está vacía
        for (int i = 0; i < 10; i++) { //apilamos los números del 0 al 9
            p.apilar(i);
        }
        Integer num = p.desapilar(); //desapilamos
        while (num != null) { //mientras la pila no esté vacía
            System.out.print(num + " "); //mostramos el elemento desapilado
            num = p.desapilar(); //y volvemos a desapilar      }

        }
    }
}