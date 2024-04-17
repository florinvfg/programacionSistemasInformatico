package ActividadResuelta9_7.Controller;

/* 9.7
 * Implementar la interfaz Comparable en la clase Socio para que,por defecto,
 * se ordene segun los numeros de identificacion --id-- crecientes.
 */

import ActividadResuelta9_7.Medelo.Socio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos objetos Socio
        System.out.println("\nLista de Socios");
        Socio socio1 = new Socio(1, "Juan", "01-01-1980");
        Socio socio2 = new Socio(3, "Pedro", "01-01-1970");
        Socio socio3 = new Socio(2, "María", "01-01-1990");

        // Crear una lista de objetos Socio y añadir los objetos creados anteriormente
        List<Socio> listaSocios = new ArrayList<>();
        listaSocios.add(socio1);
        listaSocios.add(socio2);
        listaSocios.add(socio3);

        // Ordenar la lista de objetos Socio por id
        listaSocios.sort(Comparator.comparingInt(Socio::getId));

        // Imprimir la lista de objetos Socio ordenada
        for (Socio s : listaSocios) {
            System.out.println(s);
        }
    }
}
