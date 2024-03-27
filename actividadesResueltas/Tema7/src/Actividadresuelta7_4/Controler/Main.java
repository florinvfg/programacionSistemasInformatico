package Actividadresuelta7_4.Controler;
/**
7.4
Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco.
Añadir un  atributo que almacene el nombre del banco (que es unico) en la clase
"CuentaCorriente".Diseniar un metodo que permita recuperar y modificar el nombre del
banco (al que pertenecen todas las cuentas)

*/

import Actividadresuelta7_4.Clases.CuentaCorriente;

public class Main {
    public static void main(String[] args) throws Exception {
        CuentaCorriente c1, c2;
        c1 = new CuentaCorriente ("12345677-A", "Pepe");
        c2 = new CuentaCorriente("999999999-E", "Ana");
        c1.mostrarInformacion();
        CuentaCorriente.setBanco("Banco Central");
        c1.mostrarInformacion();
        CuentaCorriente.setBanco("Caja de Ahoros de Castilla la Mancha");
        c1.mostrarInformacion();
        c2.mostrarInformacion();




    }

}
