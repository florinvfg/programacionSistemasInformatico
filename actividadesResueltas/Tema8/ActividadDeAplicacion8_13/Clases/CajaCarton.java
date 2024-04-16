package ActividadDeAplicacion8_13.Clases;

public class CajaCarton extends Caja {
    private static final double PORCENTAJE_VOLUMEN_REAL = 0.8;

    /**
     *
     * @param ancho
     * @param alto
     * @param fondo
     * @param unidad
     */
    public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
        super(ancho, alto, fondo, Unidad.CM);
    }

    /**
     *
     * @return
     */
    @Override
    public double getVolumen() {
        return super.getVolumen() * PORCENTAJE_VOLUMEN_REAL;
    }

    /**
     *
     * @return
     */
    public double getSuperficieTotal() { //el método getSuperficieTotal() para calcular la superficie total de cartón
        double superficie = 0;
        superficie += (2 * getAreaFrontal());
        superficie += (2 * getAreaLateral());
        superficie += (2 * getAreaSuperior());
        return superficie;
    }

    /**
     *
     * @return
     */
    public double getAreaFrontal() { //el método getAreaFrontal() para calcular el area frontal de cartón
        return getAncho() * getAncho();
    }

    /**
     *
     * @return
     */
    public int getAncho() {
        return ancho;
    }

    /**
     *
     * @return
     */
    public double getAreaLateral() { // para calcular area lateral
        return getFondo() * getAlto();

    }

    /**
     *
     * @return
     */
    public int getFondo() {
        return fondo;
    }

    /**
     *
     * @return
     */
    public double getAreaSuperior() { // para calcular area superior
        return getAncho() * getFondo();
    }

    /**
     *
     * @return
     */
    public int getAlto() {
        return alto;

    }
}
