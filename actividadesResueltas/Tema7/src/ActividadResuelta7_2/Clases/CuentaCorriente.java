package ActividadResuelta7_2.Clases;

public class CuentaCorriente {
    public String nombreCliente;
    public String dni;
   public double saldo;


    /**
     * Metodo constructor
     * @param nombreCliente
     * @param dni
     * */
    public CuentaCorriente(String nombreCliente, String dni){
        this.nombreCliente=nombreCliente;
        this.dni=dni;
        this.saldo=0;
    }

    /**
     *
     * @param importe
     * @return operacionPosible
     */
    public boolean egreso(double importe){
        boolean operacionPosible;
        if (this.saldo>=importe){
            this.saldo-=importe;
            operacionPosible=true;
        }else {
            System.err.println("operacion no es posible...no tiene saldo");
            operacionPosible=false;
        }
        return operacionPosible;
    }

    /**
     * metodo para ingresar dinero a la cuenta corriente y sumarlo a saldo
     * @param ingreso
     */
    public void ingresar(double ingreso){
        this.saldo+=ingreso;
    }
/**
 * CONSTRUCTOR VACIO
 * */
    public CuentaCorriente() {
    }

    /**
     *
     * @param nombreCliente
     * @param dni
     * @param saldo
     */
    public CuentaCorriente(String nombreCliente, String dni, double saldo) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.saldo = saldo;
    }

    public void mostrarInfo(){
        System.out.println("nombre de cliente-> " + this.nombreCliente+
        "\nDNI->" +this.dni+
                "\nSaldo actual-> " + this.saldo);
    }

}
