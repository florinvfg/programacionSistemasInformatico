/**
 * @autor [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * @version 18/03/2024
 * @description:
 * Desarrolla un programa java para ser usado por los camareros de un restaurante, que sirva para tomar nota de los menús
que los clientes van a tomar.
Primero, realiza un menú, por ejemplo-> [1. Crear Orden | 2. Modificar Orden | 3. Salir]
Primer dato a introducir por el camarero es el número de comensales que tendrá que estar en el rango de 1-6, ya que no
 hay mesas de más de cinco comensales. El valor introducido debe asegurarse de que se encuentra en el rango definido.
Entonces el camarero tiene que introducir el menú seleccionado por cada cliente.
Tenemos tres menús: #1,#2 y #3. Puedes identificar cada menú por el número: menú 1, menú 2 o menú 3.
Una vez introducidos todos los datos, el programa imprimirá por pantalla los menús solicitados por cada comensal.
Tienes que emplear un array para registrar los menús que tomará cada comensal. Ten en cuenta que la dimensión de dicho
array tendrá que definirse en ejecución, ya que no sabemos a priori cuántos comensales vamos a tener.
Adicional, confirma la orden con los comensales y si existe alguna modificación, tener la posibilidad de cambiar la orden.*/


import java.util.*;
public class MF0964_3_UF1287_E3_18_03_24 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        /**
         *
         * Menú principal
         * */
                mostrarBienvenida();
                int opcion;
                int crearOrden=0;
                int modificarOrden=0;
                int numComensales=0;
                int[] menu = new int[numComensales];
                
                /** Bucle para manejar las opciones del menú
                 *
                 * */
                do {
                    mostrarMenu();
                    opcion = obtenerOpcion();

                    switch (opcion) {
                        case 1:
                            crearOrden();
                            break;
                        case 2:
                            modificarOrden();
                            break;
                        case 3:
                            mostrar("Gracias por visitarnos. ¡Hasta luego!");
                            break;
                        default:
                            mostrar("Opción no válida. Por favor, selecciona una opción válida.");
                    }
                } while (opcion != 3);
            }


    /**
     * Método para mostrar el mensaje de bienvenida
     */
    public static void mostrarBienvenida() {
                mostrar("\n\tBienvenido al restaurante:");
            }


    /**
     * @mostrarMenu
     *  Método para mostrar el menú principal
     * */
            public static void mostrarMenu() {
                mostrar("\n[1] Crear Orden");
                mostrar("[2] Modificar Orden");
                mostrar("[3] Salir");
                mostrar("Selecciona una opción: ");
            }


    /**
     * @obtenerOpcion
     * Método para obtener la opción seleccionada por el usuario
     *
     * */
           public static int obtenerOpcion() {
                return sc.nextInt();
            }


    /**
     * @crearOrden
     * Método para crear una nueva orden*/
            public static void crearOrden() {
                mostrar("Introduce el número de comensales (máximo 6): ");
                int numComensales = sc.nextInt();

                while (numComensales < 1 || numComensales > 6) {
                    mostrar("Número de comensales no válido. Inténtalo de nuevo.");
                    mostrar("Introduce el número de comensales (máximo 6): ");
                    numComensales = sc.nextInt();
                }

               /**
                *Array para almacenar los menús de cada comensal
                *  */
                int[] menu = new int[numComensales];

                /**
                 *  Menú de opciones
                 * */
                mostrar("\n           - MENÚ -");
                mostrar("[1] Patatas fritas con albóndigas");
                mostrar("[2] Salmón ahumado con patatas horneadas");
                mostrar("[3] Lentejas con chorizo");

                /**
                 * Capturar los menús de cada comensal
                 * */
                for (int i = 0; i < numComensales; i++) {
                    mostrar("Introduce el menú pedido por el comensal " + (i + 1) + " : ");
                    menu[i] = sc.nextInt();
                }

                /** Mostrar la orden
                 * */
                mostrar("\n            - ORDEN -");
                for (int i = 0; i < numComensales; i++) {
                    mostrar("Comensal " + (i + 1) + " va a tomar el menú ->" + menu[i]);
                }

                /** Confirmar la orden
                 * */
                mostrar("\n¿La orden es correcta? [1-Si] [2-No]: ");
                int confirmacion = sc.nextInt();

                /** Modificar la orden si es necesario
                 * */
                if (confirmacion == 2) {
                    int comensalModificar;
                    do {
                        mostrar("Indique qué comensal modificar (1-" + numComensales + "): ");
                        comensalModificar = sc.nextInt();
                    } while (comensalModificar < 1 || comensalModificar > numComensales);

                    mostrar("Introduce el menú pedido por el comensal " + comensalModificar + " : ");
                    menu[comensalModificar - 1] = sc.nextInt();

                    /** Mostrar la orden modificada
                     * */
                    mostrar("\n            - ORDEN -");
                    for (int i = 0; i < numComensales; i++) {
                        mostrar("Comensal " + (i + 1) + " va a tomar el menú ->" + menu[i]);
                    }
                }

                mostrar("\nGracias, en breve le traemos la comida.");

            }
/**
 * @modificarOrden
 *  Método para modificar una orden existente
 * */


           public static void modificarOrden() {
               /** Mostrar mensaje de solicitud de comensal a modificar
                * */
                mostrar("Indica el número del comensal que deseas modificar:");

                /** Leer el número del comensal
                 * */
                int numComensal = sc.nextInt();

                /** Verificar si el número de comensal es válido
                 * */
               int numComensales=0;
               if (numComensal < 1 || numComensal > numComensales) {
                    mostrar("Número de comensal inválido. Por favor, selecciona un número válido.");
                    return;
                }

                /** Mostrar menú de opciones
                 *
                 * */
                mostrar("Selecciona el nuevo menú para el comensal " + numComensal + ":");
                mostrar("[1] Patatas fritas con albóndigas");
                mostrar("[2] Salmón ahumado con patatas horneadas");
                mostrar("[3] Lentejas con chorizo");

                /** Leer el nuevo menú para el comensal seleccionado
                 * */
                int nuevoMenu = sc.nextInt();

                /** Verificar si el nuevo menú es válido
                 * */
                if (nuevoMenu < 1 || nuevoMenu > 3) {
                    mostrar("Menú inválido. Por favor, selecciona un menú válido.");
                    return;
                }



                /** Mostrar mensaje de confirmación
                 * */
                mostrar("Menú para el comensal " + numComensal + " modificado con éxito.");


            }
/**
 * @mostrarOrden
 *  Mostrar la orden actualizada
 * */
    private static void mostrarOrden() {

        mostrarOrden();
    }

    /**Método para mostrar un mensaje
     *
     * */
         public static void mostrar(String mensaje) {
                System.out.println(mensaje);
            }
        }
