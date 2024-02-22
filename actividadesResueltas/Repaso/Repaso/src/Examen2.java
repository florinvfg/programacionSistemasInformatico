
/*  pelicula  mayores->6 euros , menores->4,5 euros
* miercoles->4,50 euros
* cartelera-> pelicula-> mayores 18 , menores, todo publico,
*  carnet joven/senor->4,50 euros
*
* peliculas
* ferrari->todo publico
* pobres criaturas-> mayores 18
* priscila-> todo publico
* la piscina-> mayores 18
* peppa->todo publico
* casadores de demonios->mayores 18
*  */

import java.util.Scanner;

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

            if (opcionMenu >= 1 && opcionMenu <= 6) {
                System.out.println("¿Es miércoles?");
                System.out.println("\t1. Sí \n\t2. No");
                byte respuestaMiercoles = sc.nextByte();
                miercoles = (respuestaMiercoles == 1);
            }

            System.out.println("¿Cuántas personas asisten?");
            cantidadPersonas = sc.nextInt();

            System.out.println("¿Cuántas personas tienen carnet joven o de señor?");
            cantidadJovenesSeniors = sc.nextInt();

            while (opcionMenu >= 1 && opcionMenu <= 6) {
                double precioEntrada = 0;
                String pelicula = "";
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
