package ActividadResuelta7_4Irina.Controler;

import ActividadResuelta7_4Irina.Clases.CuentaCorriente;

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
        mostrar("5.Cambiar de banco");
        mostrar("6.Mostrar");
        mostrar("7.Salir");
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
                    nuevoCliente.setDni(dniT);
                    nuevoCliente.setSaldo(0);

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
                    nuevoCliente.setDni(dniT);
                    nuevoCliente.setSaldo(saldo);

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

