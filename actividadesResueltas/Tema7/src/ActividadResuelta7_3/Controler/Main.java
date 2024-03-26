package ActividadResuelta7_3.Controler;

import ActividadResuelta7_3.Clases.CuentaCoriente;
public class Main {
    public static void main(String[] args) throws Exception {
        CuentaCoriente c;
        c = new CuentaCoriente("12345678-A", "Pepe");
        //c.saldo = 2000; //produce un error,ya que el saldo no es visible desde fuera de la clase CuentaCoriente
        c.dni = "11111111-T"; //al ser Main una clase vecina,dni es visible en caso de acceder al dni desde una clase
        //externa produciria un error
        c.nombre = "Antonio"; //nombre es visible desde cualquier clase
        c.mostrarInformacion();
    }
}
