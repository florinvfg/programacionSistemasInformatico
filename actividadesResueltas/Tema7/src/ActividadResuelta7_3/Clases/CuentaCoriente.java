package ActividadResuelta7_3.Clases;

public class CuentaCoriente {
    /* Marcamos la clase con public:para que sea visible desde clase externas donde es
    posible usarla mediante importacion.
    */

    public String dni; //sin modificador,visibilidad por defecto.Solo visible por clases vecinas
    public String nombre; //visibilidad total
    private double saldo; //invisible para cualquier clase (vecina o externa)

    CuentaCoriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar";
    }

    public CuentaCoriente(String dni, String nombre) { // constructor
        this.dni = dni; // pasado DNI como parametro
        this.nombre = nombre; //nombre como parametro
        saldo = 0; //saignamos el saldo por defecto
    }

    boolean egreso(double cant) { //sacar dinero de la cuenta

        boolean operacionPosible = false;
        if (saldo >= cant) { //si disponemos de saldo suficiente
            saldo -= cant;
            operacionPosible = true;
        } else { // no hay saldo disponible
            System.out.println(" Fondos insuficientes ");
            operacionPosible = false;
        }
        return (operacionPosible);
    }

    void ingreso(double cant) { //ingresar dinero
        saldo += cant;
    }

    public void mostrarInformacion() { //mostrar el estado de la cuenta corriente
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Dni: " + dni);
        System.out.println(" Saldo: " + saldo + " euros ");
    }
}
