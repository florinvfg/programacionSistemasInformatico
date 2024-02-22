
/* Título: Calculadora de precios de entradas de cine

Descripción:
En un cine local, se desea desarrollar un programa que
calcule el precio de las entradas para distintas películas,
teniendo en cuenta diferentes factores como la edad del espectador,
 el día de la semana y la existencia de descuentos por carnet
 joven o de señor.

Instrucciones:

El precio de las entradas varía según la película y la edad del espectador:
Para las películas "Ferrari", "Priscila" y "Peppa", el precio es de 6 euros
 para adultos y 4,5 euros para menores de edad.
Para las películas "Pobres Criaturas" y "La Piscina", el precio es de 6
 euros para mayores de 18 años y 4,5 euros para menores de edad.
Para la película "Cazadores de Demonios", el precio es de 6 euros para mayores
 de 18 años.
Los miércoles, todas las entradas tienen un precio único de 4,50 euros,
 independientemente de la película o la edad del espectador.
Además, se ofrece un descuento de 1,50 euros para personas con carnet
joven o de señor, aplicable a todas las películas excepto
"Cazadores de Demonios".
El programa debe permitir al usuario seleccionar una película, indicar
su edad y si posee carnet joven o de señor, y calcular el precio total a pagar.  */

import java.util.Scanner;
/*Consignas adicionales:

El programa debe validar las entradas del usuario y manejar casos donde se introduzcan opciones inválidas.
Se recomienda utilizar estructuras de control como if-else y switch-case para implementar la lógica de cálculo de precios.
 */
public class Examen2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            final double PRECIO_NINIO = 4.5;
            final double PRECIO_ADULTO = 6.0;
            final double CARNET_JOVEN_SENIOR = 4.50;
            double totalEntradas = 0;
            boolean miercoles = false;
            byte opcionMenu = 0;
            int cantidadPersonas = 0;
            int cantidadJovenesSeniors = 0;

            System.out.println("✯✯✯ Cines ✯✯✯");
            System.out.println("  Películas: ");
            System.out.println("\n\t1. Ferrari (Todo público)");
            System.out.println("\t2. Pobres Criaturas (Mayores de 18)");
            System.out.println("\t3. Priscila (Todo público)");
            System.out.println("\t4. La Piscina (Mayores de 18)");
            System.out.println("\t5. Cazadores de Demonios (Mayores de 18)");
            System.out.println("\t6. Peppa (Todo público)");
            System.out.println("\t7. Facturar y Salir");
            System.out.println("\n\t. ✯✯✯ Indica una opción ✯✯✯");
            opcionMenu = sc.nextByte();
           //Si la opción elegida es válida (entre 1 y 6), se pregunta al usuario si es miércoles y se actualiza la variable miercoles en consecuencia.
            if (opcionMenu >= 1 && opcionMenu <= 6) {
                System.out.println("¿Es miércoles?");
                System.out.println("\t1. Sí \n\t2. No");
                byte respuestaMiercoles = sc.nextByte();
                miercoles = (respuestaMiercoles == 1);
            }
            //Se solicita al usuario que ingrese la cantidad de personas que asisten y se almacena en la variable cantidadPersonas.
            System.out.println("¿Cuántas personas asisten?");
            cantidadPersonas = sc.nextInt();
            //Se solicita al usuario que ingrese la cantidad de personas con carnet joven o de señor y se almacena en la variable cantidadJovenesSeniors
            System.out.println("¿Cuántas personas tienen carnet joven o de señor?");
            cantidadJovenesSeniors = sc.nextInt();
            //Se inicia un bucle while para procesar las selecciones del usuario mientras la opción elegida esté entre 1 y 6.
            while (opcionMenu >= 1 && opcionMenu <= 6) {
                //Se inicializa la variable precioEntrada y pelicula para almacenar el precio de la entrada y el nombre de la película respectivamente.
                double precioEntrada = 0;
                String pelicula = "";
                //Se utiliza un switch-case para determinar el precio de la entrada según la película seleccionada y si es miércoles o no.
                switch (opcionMenu) {
                    case 1:
                    case 3:
                    case 6:
                        pelicula = "Ferrari";
                        precioEntrada = miercoles ? CARNET_JOVEN_SENIOR : PRECIO_ADULTO;
                        break;
                    case 2:
                        pelicula = "Pobres Criaturas";
                        if (cantidadPersonas > 0) {
                            System.err.println("No se permiten menores en esta película.");
                            break;
                        } else {
                            precioEntrada = miercoles ? CARNET_JOVEN_SENIOR : PRECIO_ADULTO;
                            break;
                        }
                    case 4:
                    case 5:
                        pelicula = "La Piscina";
                        precioEntrada = miercoles ? CARNET_JOVEN_SENIOR : PRECIO_ADULTO;
                        break;
                }
                if (!pelicula.isEmpty()) {
                    // Aplicar descuento por carnet joven o de señor
                    double descuento = cantidadJovenesSeniors * (PRECIO_ADULTO - CARNET_JOVEN_SENIOR);
                    double totalPelicula = (precioEntrada * cantidadPersonas) - descuento;
                    System.out.println("Ha seleccionado la película: " + pelicula);
                    System.out.println("El precio de la entrada es: " + precioEntrada + " euros por persona");
                    System.out.println("Total por " + cantidadPersonas + " personas: " + totalPelicula + " euros");
                    totalEntradas += totalPelicula;
                }


                System.out.println("\t7. Facturar y salir");
                System.out.println("\n\t. ✯✯✯ Indica una opción ✯✯✯");
                opcionMenu = sc.nextByte();
            }

            if (opcionMenu == 7) {
                System.out.println("\n✯✯✯ Factura ✯✯✯");
                System.out.println("Total a pagar: " + totalEntradas + " euros");
                System.out.println("✯✯✯ Gracias por su visita ✯✯✯");
            }

            sc.close();
        }
    }
