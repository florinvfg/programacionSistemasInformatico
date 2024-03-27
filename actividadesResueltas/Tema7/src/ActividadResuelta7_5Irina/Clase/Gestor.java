package ActividadResuelta7_5Irina.Clase;

public class Gestor {
    public String nombreGestor;
    private String telefono;
    double operacionMax ;

    /**
     * Metodo constructor
     * @param nombreGestor
     * @param telefono
     * @param operacionMax
     */
    public Gestor(String nombreGestor, String telefono, double operacionMax) {
        this.nombreGestor = nombreGestor;
        this.telefono = telefono;
        this.operacionMax = operacionMax;
    }

    /**
     *
     * @param nombreGestor
     * @param telefono
     */
    public Gestor(String nombreGestor, String telefono) {
        this.nombreGestor = nombreGestor;
        this.telefono = telefono;
        this.operacionMax=10000;
    }

    /**
     *
     * @return
     */
    public String getNombreGestor() {
        return nombreGestor;
    }

    public void setNombreGestor(String nombreGestor) {
        this.nombreGestor = nombreGestor;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public Gestor() {
    }

    public double getOperacionMax() {
        return operacionMax;
    }

    public void setOperacionMax(double operacionMax) {
        this.operacionMax = operacionMax;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Gestor ->" +
                "\nNombre='" + nombreGestor + '\'' +
                "\n Telefono='" + telefono + '\'' +
                "\nOperacion Maxima-> " + operacionMax ;
    }
}
