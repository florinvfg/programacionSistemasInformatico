package ActividadResuelta9_1.Controler;

/*Actividad resuelta 9.1
Definir la interfaz Cola para numeros enteros,e implementarla en la clase Lista,
definida en la actividad resuelta 7.11.

Nosotros,en esta implementacion,decidimos que la cabaza de la cola coincida con el
principio de la lista y el final de la cola con el final de la lista,pero se puede
hacer al contrario*/



import ActividadResuelta9_1.Clases.Lista;

public class Main {
    // Definición de constantes para colores de texto en la consola
    static final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
    static final String YELLOW = "\033[0;33m"; // Color amarillo
    static final String BLUE = "\033[0;34m"; // Color azul

    // Prueba de los métodos de la clase Lista
    public static void main(String[] args) throws Exception {
        Lista listaNombres = new Lista();
        listaNombres.encolar("\uD83E\uDD20Juan");
        listaNombres.encolar("\uD83D\uDE4EMaría");
        listaNombres.insertarFinal("\uD83E\uDD20Pedro");
        System.out.print("Tu lista es -> ");listaNombres.mostrar();
        listaNombres.insertarPrincipio("\uD83D\uDE4EAna");
        listaNombres.insertarPrincipio("\uD83E\uDD20Carlos");
        listaNombres.insertarPrincipio("\uD83D\uDE4ESofía");
        System.out.print("Tu nueva lista con tres nombres implementados al principio es -> ");listaNombres.mostrar();
        listaNombres.insertar(2, "Luisa\uD83D\uDE4E");
        System.out.print("Lista con nombre implementado en la segunda posicion -> ");listaNombres.mostrar();

        listaNombres.eliminar(6);
        System.out.print("Lista con nombre eliminado en la sexta posicion -> ");listaNombres.mostrar();
        System.out.println("Buscamos a Maria en la nueva lista :");
        System.out.println(BLUE+"Índice de 'María'\uD83D\uDE4E: "+RESET + listaNombres.buscar("María"));
        listaNombres.mostrar();
        System.out.println(BLUE+"Desencolar el primer nombre : "+RESET + listaNombres.desencolar());
        listaNombres.mostrar();
    }
}
