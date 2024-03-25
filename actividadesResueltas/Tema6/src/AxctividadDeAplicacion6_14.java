/**
 * @param Enunciado:
 *Diseña una aplicación que se comporte como una pequeña agenda. Mediante un menú el usuario podrá elegir entre:
 * a)Añadir un nuevo contacto (nombre y teléfono).
 * b)Buscar el teléfono de un contacto a partir de su nombre.
 * c)Mostrar la información de todos los contactos ordenados alfabéticamente mediante el nombre */

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Contacto implements Comparable<Contacto> {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public int compareTo(Contacto otroContacto) {
        return this.nombre.compareTo(otroContacto.nombre);
    }
}

public class AxctividadDeAplicacion6_14 {
    private static ArrayList<Contacto> contactos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    añadirContacto();
                    break;
                case 2:
                    buscarTelefono();
                    break;
                case 3:
                    mostrarContactosOrdenados();
                    break;
                case 4:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    mostrar("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== Agenda ===");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Buscar teléfono");
        System.out.println("3. Mostrar contactos ordenados");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void añadirContacto() {
        mostrar("Nombre: ");
        String nombre = sc.nextLine();
        mostrar("Teléfono: ");
        String telefono = sc.nextLine();
        Contacto nuevoContacto = new Contacto(nombre, telefono);
        contactos.add(nuevoContacto);
        mostrar("Contacto añadido correctamente.");
    }

    private static void buscarTelefono() {
        mostrar("Introduce el nombre del contacto: ");
        String nombreBuscado = sc.nextLine();
        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                mostrar("Teléfono de " + nombreBuscado + ": " + contacto.getTelefono());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            mostrar("No se encontró ningún contacto con ese nombre.");
        }
    }

    private static void mostrarContactosOrdenados() {
        if (contactos.isEmpty()) {
            mostrar("No hay contactos para mostrar.");
            return;
        }
        Collections.sort(contactos);
        mostrar("\n=== Contactos ===");
        for (Contacto contacto : contactos) {
            mostrar("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono());
        }
    }

    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }
}
