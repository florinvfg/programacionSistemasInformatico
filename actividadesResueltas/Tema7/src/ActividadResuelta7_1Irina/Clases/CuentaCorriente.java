package ActividadResuelta7_1Irina.Clases;

public class CuentaCorriente {
    public String nombreCliente;
    public String dni;
    double saldo;


    /**
     * Metodo constructor
     * @param nombreCliente
     * @param dni
     * */
    public CuentaCorriente(String nombreCliente,String dni){
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
            this.saldo=importe;
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

    public CuentaCorriente() {
    }

    public void mostrarInfo(){
        System.out.println("nombre de cliente-> " + this.nombreCliente+
        "\nDNI->" +this.dni+
                "\nSaldo actual-> " + this.saldo);
    }

}
