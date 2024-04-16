package ActividadDeAplicacion8_12Examen.Clases;


public class Caja {
    private final int ancho;
    private final int alto;
    private final int fondo;
    private final Unidad unidad;
    private String etiqueta;

    protected double getSuperficieTotal() {
        return alto * ancho;
    }

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
        double volumen = ancho * alto * fondo;
        if (unidad == Unidad.CM) {
            volumen /= 1000000.0; // Convertir de cm^3 a m^3
        }
        return volumen;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Etiqueta: " + etiqueta + ", Dimensiones: " + ancho + "x" + alto + "x" + fondo + " " + unidad;
    }



}
