package ActividadResuelta9_8.Controller;

import ActividadResuelta9_8.Modelo.Socio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Cambiar la implementación de la clase Socio para que su criterio de ordenación natural
 * sea por orden alfabético creciente de nombres.
 *
 * [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * */
public class Main {
    public static void main(String[] args) {
        // Definición de constantes para colores de texto en la consola
        final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
        final String YELLOW = "\033[0;33m"; // Color amarillo
        final String BLUE = "\033[0;34m"; // Color azul

        // Crear algunos objetos Socio
        Socio socio1 = new Socio(1, "Juan", "Pérez");
        Socio socio2 = new Socio(3, "Pedro", "González");
        Socio socio3 = new Socio(2, "María", "López");

        // Crear una lista de objetos Socio y añadir los objetos creados anteriormente
        List<Socio> listaSocios = new ArrayList<>();
        listaSocios.add(socio1);
        listaSocios.add(socio2);
        listaSocios.add(socio3);
        System.out.println(BLUE+"Lista original :"+RESET+listaSocios);

        // Ordenar la lista de objetos Socio por nombre
        Collections.sort(listaSocios);
        System.out.println(YELLOW+"\n\tLista de Socios ordenada por nombres :"+RESET);
        // Imprimir la lista de objetos Socio ordenada
        for (Socio s : listaSocios) {
            System.out.println(BLUE+(s)+RESET);
        }

    }
}
