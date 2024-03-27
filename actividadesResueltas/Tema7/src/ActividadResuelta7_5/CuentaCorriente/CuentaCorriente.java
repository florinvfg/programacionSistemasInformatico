package ActividadResuelta7_5.CuentaCorriente;
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class CuentaCorriente {

    private String dni;
    private String nombre;
    private double saldo;
    Gestor gestor;// que administra la cuenta
    //.....resto de la implementacion

    CuentaCorriente (double saldo) {
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar";
    }

    /**
     *
     * @param dni
     * @param nombre
     */
    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.saldo = saldo;
        String nobre = null;
        this.nombre = nobre;
    }
    // que administra la cuenta

    /**
     *
     * @param dni
     * @param nombre
     * @param gestor
     */
    public CuentaCorriente(String dni, String nombre, Gestor gestor) {// sobrecarga
        this(dni, nombre);
        this.gestor = gestor;

    }
    //permite asignar un nuevo objeto Gestor a la cuenta
    public void setGestor(Gestor gestor){
        this.gestor = gestor;
    }
    public void mostrarInformacion(){
        /**
         * muestra el estado de la cuenta,incluido el gestor
         No podemos usar directamente "gestor.mostrarInformacion()"
         ya que puede que el gestor sea null.Al intentar acceder
         a los miembros de un objeto nulo se produce una exepcion
         */
        if (gestor == null) { //si la cuenta no esta administrada por un gestor
            System.out.println(" Cuenta sin gestor ");
        } else {
            System.out.println(" Informacion del gestor ");
        }gestor.mostrarInformacion(); // no es posible mostrar directamente sus
        System.out.println(" Informacion denla cuenta ");
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Dni: " + dni);
        System.out.println(" Saldo: " + saldo);                           //atributos,ya que algunos no son visible
    }

    public static class Gestor {

        public String nombre;
        private String tlf; // numero con el que no se opera: es usual usar String
        double importeMax; // visibilidad por defecto

        /**
         *
         * @param nombre
         * @param tlf
         * @param importMax
         */

        public Gestor(String nombre, String tlf, double importMax) {
            this.nombre = nombre;
            this.tlf = tlf;
            this.importeMax = importeMax;
        }

        /**
         *
         * @param nombre
         * @param tlf
         */

        public Gestor(String nombre, String tlf) {
            this.nombre = nombre;
            this.tlf = tlf;
            this.importeMax = 10000.0; //asignamos  el importe maximo por defecto

        }

        String getTlf() { // al ser tlf privado permite consultar el telefono de un gestor
            return tlf;
        }

        public void mostrarInformacion() {
            System.out.println(" Nombre: " + nombre);
            System.out.println(" Telefono: " + tlf);
            System.out.println(" Importe maximo: " + importeMax + " euros ");
        }
    }
}
