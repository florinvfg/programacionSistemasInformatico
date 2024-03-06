/*vamos a realizar la cesta de la compra
* cada vez que compramos,variamos de productos y de cantidad
* creamos un array que crecera a medida que insertamos productos,para ello
* utilizaremos un pequenio menu,y para la ejecucion funciones de busqueda y de isersion*/

import java.util.*;
public class IncertarOrdenadaFunciones {
    static Scanner sn=new Scanner(System.in);
    static String cesta[] = new String[0];
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        /*List<Producto> cesta = new ArrayList<>(); // Crear una lista para almacenar los productos de la cesta

        int opcion;
        do {
            mostrarMenu(); // Mostrar el menú de opciones
            opcion = scanner.nextInt(); // Leer la opción ingresada por el usuario

            switch (opcion) {
                case 1:
                    agregarProducto(cesta, scanner); // Agregar un producto a la cesta
                    break;
                case 2:
                    mostrarCesta(cesta); // Mostrar los productos en la cesta
                    break;
                case 3:
                    buscarProducto(cesta, scanner); // Buscar un producto en la cesta
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicación..."); // Salir del programa
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo."); // Opción inválida
            }
        } while (opcion != 4); // Continuar ejecutando hasta que se elija la opción de salida

        scanner.close(); // Cerrar el scanner al finalizar
    }

    // Método para mostrar el menú de opciones
    public static void mostrarMenu() {
        System.out.println("\n=== Menú ===");
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar cesta");
        System.out.println("3. Buscar producto");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    // Método para agregar un producto a la cesta
    public static void agregarProducto(List<Producto> cesta, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la cantidad del producto: ");
        int cantidad = scanner.nextInt();
        cesta.add(new Producto(nombre, cantidad)); // Agregar el producto a la cesta
        System.out.println("Producto agregado a la cesta.");
    }

    // Método para mostrar los productos en la cesta
    public static void mostrarCesta(List<Producto> cesta) {
        System.out.println("\n=== Productos en la cesta ===");
        for (Producto producto : cesta) {
            System.out.println(producto);
        }
    }

    // Método para buscar un producto en la cesta
    public static void buscarProducto(List<Producto> cesta, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombre = scanner.next();
        boolean encontrado = false;
        for (Producto producto : cesta) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado en la cesta: " + producto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado en la cesta.");
        }
    }
}

// Clase Producto para representar un producto con nombre y cantidad
class Producto {
    private String nombre;
    private int cantidad;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Cantidad: " + cantidad;*/




        /*DIFERENTE*/

        menu();

    }



        public static void menu () {
            mostrar("----CESTA DE LA COMPRA ----");
            mostrar("1. Insertar");
            mostrar("2. Mostrar Cesta");
            mostrar("3. Eliminar Producto");
            mostrar("4. Salir");
            mostrarSinLn("Indica su opcion-> ");
            int opcion = sn.nextInt();

            switch (opcion) {
                case 1 -> {
                    cesta = insertar(cesta);
                    menu();
                }
                case 2 -> {
                    mostrar(Arrays.toString(cesta));
                    menu();
                }
                case 3 ->{
                    cesta=eliminar(cesta);
                    menu();
                }
                case 4 ->{
                    System.out.println("Saliendo del programa...");
                    boolean salir = true;
                    break;

                }
            }
        }

        public static String[] insertar (String cesta[]){
            //pregunto el producto a insertar
            mostrarSinLn("Indica el nombre del producto->");
            String produtoNuevo = sn.next();sn.nextLine();
            //Lo buscamos, si esta, enviamos un mensaje sino, lo insertamos....
            boolean existe = buscarProducto(cesta, produtoNuevo);
            // lo insertas
            if (existe) {
                mostrar("El producto que indicas ya existe");
            }else {
                cesta=Arrays.copyOf(cesta,cesta.length+1);
                cesta[cesta.length-1]=produtoNuevo;//en el ultimo indice inserta el nuevo valor

                System.out.println(Arrays.toString(cesta));
            }
            //lo devolvemos a la funcion menu.
                return cesta;
        }
        /************/
        public static boolean buscarProducto (String cesta[],String productoNuevo){
            boolean existe = false; //creamos un booleanos que controle si existe
            int indice = 0;
            while (indice < cesta.length && !cesta[indice].equals(productoNuevo)) {
                indice++;
            }
            if (indice < cesta.length)
                existe = true;
            return existe;
        }
        /****************/
        private static String[]eliminar(String cesta[]) {
            mostrarSinLn("Indica el producto que quieres eliminar ->");
            String productoEliminar = sn.next();
            sn.nextLine();
            int indice = 0;
            for (int i = 0; i < cesta.length; i++) {
                if (cesta[i].equals(productoEliminar)) {
                    indice = i;
                }
            }
            if (indice > cesta.length) {
                mostrar("El producto que quieres borrar no existe en la Cesta");
            }

        boolean existe=buscarProducto(cesta,productoEliminar);
        if(!existe)

    {
        mostrar("El producto que quieres borar no existe");
    } else {
                cesta[indice]=cesta[cesta.length-1];
                cesta=Arrays.copyOf(cesta,cesta.length-1);
            }


            return cesta;
        }

        public static void mostrar (String texto){
            System.out.println("\t" + texto);
        }

        public static void mostrarSinLn (String texto){
            System.out.print("\t" + texto);


        }


    }
