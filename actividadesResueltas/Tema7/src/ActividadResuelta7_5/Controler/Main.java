package ActividadResuelta7_5.Controler;

import ActividadResuelta7_5.CuentaCorriente.CuentaCorriente;

/**
   *
Existen gestores que administran a las cuentas bancarias y atienden a sus propietarios.
Cada cuenta,en caso de tenerio,cuenta con un unicogestor.Diseñar la clase <Gestor>de
la que interesa guardar su nombre,telefono y el importe maximo autorizado con el que
pueden operar.Con respete a los gestores,existen la siguientes restricciones:
-un gestor tendra siempre un nombre y un telefono
-si no se asigna,el importe maximo autorizado por operacion sera de 10000 euros
-un gestor una vez asignado,no podra cambiar su numero de telefono.Y todo el mundo podra consultarlo.
El nombre sera publico y el importe maximo solo sera visible por clases vecinas.
Modificar la clase CuentaCorriente para que pueda disponer de un obgeto <Gestor>.Escribir
los metodos necesarios.*/
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class Main {
      public static void main(String[] args) throws Exception {
          CuentaCorriente c1, c2, c3;
          // creamos dos gestores
          CuentaCorriente.Gestor g1 = new CuentaCorriente.Gestor("Antonio Gonzales", "666555444");
          CuentaCorriente.Gestor g2 = new CuentaCorriente.Gestor("Bea Rodriguez", "978543210", 12000.0);
          // creamos varias cuentas
          c1 = new CuentaCorriente("12345678-A", "Pepita", g1); //administrada por g1
          c2 = new CuentaCorriente("98765432-Z", "Ana", g1); //otra cuenta de g1
          c3 = new CuentaCorriente("11222333-B", "Sancho"); // sin gestor
          c1.mostrarInformacion();
          c2.mostrarInformacion();
          c3.mostrarInformacion();
          c1.setGestor(g2); //cambiamos de gestor
          c1.mostrarInformacion();





      }

}
