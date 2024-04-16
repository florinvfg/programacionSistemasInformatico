package ActividadDeAplicacion8_13.Clases;

public class Caja {
    protected int ancho;
    protected int alto;
    protected int fondo;
    protected Unidad unidad;
    private String etiqueta;

    /**
     *
     * @param ancho
     * @param alto
     * @param fondo
     * @param unidad
     */
    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    /**
     *
     * @return
     */
    public double getVolumen() {
        double volumen = (double) ancho * alto * fondo;
        if (unidad == Unidad.CM) {
            volumen /= 1000000; // convertir de cm^3 a m^3
        }
        return volumen;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String toString() {
        return "Caja (" + ancho + "x" + alto + "x" + fondo + " " + unidad + ", etiqueta: " + etiqueta + ")";
    }
}
