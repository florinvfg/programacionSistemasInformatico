
/**
 * Existen gestores que administran las cuentas bancarias y atienden a sus
 * propietarios.Cada cuenta, en caso de tenerlo, cuenta con un único gestor.
 * Diseñar la clase Gestor de la que interesa guardar su nombre, teléfono y
 * el importe máximo autorizado con el que pue-den operar. Con respecto a los
 * gestores, existen las siguientes restricciones:  Un gestor tendrá siempre
 * un nombre y un teléfono.  Si no se asigna, el importe máximo autorizado por
 * operación será de 10 000 euros.  Un gestor, una vez asignado, no podrá cambiar
 * su número de teléfono. Y todo el mundo podrá consultarlo.El nombre será
 * público y el importe máximo solo será visible por clases vecinas.Modificar la
 * clase CuentaCorriente para que pueda disponer de un objeto Gestor.
 * Es-cribir los métodos necesario
 */

package ActividadResuelta7_5Irina.Controler;

import ActividadResuelta7_5Irina.Clase.*;


import java.util.Scanner;

public class Main {



        public static Scanner sn=new Scanner(System.in);
        public static void main(String[] args) {
            menu();


        }



        public static void menu() {
            int opcion = 0;
            CuentaCorriente nuevoCliente = new CuentaCorriente();
            Gestor elGestor = new Gestor();
            do {


                mostrar("******** Banco PSI *******");
                mostrar("1.Crear Cliente sin saldo");
                mostrar("2.Crear Cliente con saldo");
                mostrar("3.Engresar");
                mostrar("4.Ingresar");
                mostrar("5.Cambiar de banco");
                mostrar("6.Mostrar");
                mostrar("7.Salir");
                mostrar("Indique su opcion");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1 -> {
                        mostrar("indique el nombre del cliente");
                        String nombreT = sn.next();sn.nextLine();
                        mostrar("indique el DNI del cliente");
                        String dniT = sn.next();sn.nextLine();
                        mostrar("nombre del gestor");
                        String nombreG=sn.next();sn.nextLine();
                        mostrar("Indique el telefono de gestor");
                        String telefonoG= sn.next();sn.nextLine();
                        telefonoG = sn.next();sn.nextLine();
                        sn.nextLine();
                        if (!nombreT.equals("") || !dniT.equals("")) {
                            nuevoCliente.nombreCliente = nombreT;
                            nuevoCliente.setDni(dniT);
                            nuevoCliente.setSaldo(0);
                            elGestor.setNombreGestor(nombreG);
                            elGestor.setTelefono(telefonoG);
                            nuevoCliente.setElGestorCta(elGestor);

                        } else {
                            mostrar("no se puede crear cliente sin sus datos.Comience de nuevo");

                        }
                    }
                    case 2 ->{
                        mostrar("indique el nombre del cliente con saldo");
                        String nombreT = sn.next();sn.nextLine();
                        sn.nextLine();
                        mostrar("indique el DNI del cliente");
                        String dniT = sn.next();
                        mostrar("indique el saldo inicial");
                        double saldo=sn.nextDouble();
                        mostrar("nombre del gestor");
                        String nombreG=sn.next();sn.nextLine();
                        mostrar("Indique el telefono de gestor");
                        String telefonoG= sn.next();sn.nextLine();

                        if (!nombreT.equals("") || !dniT.equals("")) {
                            nuevoCliente.nombreCliente = nombreT;
                            nuevoCliente.setDni(dniT);
                            nuevoCliente.setSaldo(saldo);
                            elGestor.setNombreGestor(nombreG);
                            elGestor.setTelefono(telefonoG);
                            nuevoCliente.setElGestorCta(elGestor);


                        } else {
                            mostrar("no se puede crear cliente sin sus datos.Comience de nuevo");

                        }

                    }
                    case 3 -> {
                        if (nuevoCliente.nombreCliente != null) {
                            mostrar("indique el monto a egresar");
                            double importe = sn.nextDouble();
                            if (nuevoCliente.egreso(importe)) {
                                mostrar("ingresando saldo......");
                            } else {
                                mostrar("no existe cliente");
                            }
                        }
                    }
                    case 4 -> {
                        if (nuevoCliente.nombreCliente != null) {
                            mostrar("indique el importe a ingresar");
                            double ingreso = sn.nextDouble();
                            nuevoCliente.ingresar(ingreso);
                            mostrar("ingresando saldo......");
                        } else {
                            mostrar("no existe cliente");
                        }
                    }
                    case 5 ->{
                        mostrar("Indica el nombre del banco");
                        String nombreBtemp= sn.next(); sn.nextLine();
                        CuentaCorriente.setNombreBanco(nombreBtemp);

                    }
                    case 6 -> {
                        if (nuevoCliente.nombreCliente != null) {
                            nuevoCliente.mostrarInfo();
                        } else {
                            mostrar("no existe cliente");
                        }
                    }




                    case 7-> mostrar("Saliendo");
                    default -> mostrar("opcion no valida");

                }

            }while (opcion!=7) ;
        }



    public static void mostrar(String texto){
            System.out.println("\t" + texto);
        }
    }


