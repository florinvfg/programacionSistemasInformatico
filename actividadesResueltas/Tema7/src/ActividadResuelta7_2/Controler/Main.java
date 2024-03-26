package ActividadResuelta7_2.Controler;

import ActividadResuelta7_2.Clases.CuentaCorriente;

import java.util.Scanner;

public class Main {
    public static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {
       menu();


    }
    public static void menu() {
        int opcion = 0;
        CuentaCorriente nuevoCliente = new CuentaCorriente();
        do {


            mostrar("******** Banco PSI *******");
            mostrar("1.Crear Cliente sin saldo");
            mostrar("2.Crear Cliente con saldo");
            mostrar("3.Engresar");
            mostrar("4.Ingresar");
            mostrar("5.Mostrar");
            mostrar("6.Salir");
            mostrar("Indique su opcion");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1 -> {
                    mostrar("indique el nombre del cliente");
                    String nombreT = sn.next();sn.nextLine();
                    sn.nextLine();
                    mostrar("indique el DNI del cliente");
                    String dniT = sn.next();
                    sn.nextLine();
                    if (!nombreT.equals("") || !dniT.equals("")) {
                        nuevoCliente.nombreCliente = nombreT;
                        nuevoCliente.dni = dniT;
                        nuevoCliente.saldo=0;

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
                    if (!nombreT.equals("") || !dniT.equals("")) {
                        nuevoCliente.nombreCliente = nombreT;
                        nuevoCliente.dni = dniT;
                        nuevoCliente.saldo=saldo;

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
                case 5 -> {
                    if (nuevoCliente.nombreCliente != null) {
                        nuevoCliente.mostrarInfo();
                    } else {
                        mostrar("no existe cliente");
                    }
                }




            case 6 -> mostrar("Saliendo");
            default -> mostrar("opcion no valida");

        }

    }while (opcion!=5) ;
        }

    public static void mostrar(String texto){
        System.out.println("\t" + texto);
    }
}
