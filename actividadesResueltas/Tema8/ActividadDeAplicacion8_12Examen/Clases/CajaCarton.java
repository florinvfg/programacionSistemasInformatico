package ActividadDeAplicacion8_12Examen.Clases;

public class CajaCarton extends Caja {
    private static final double PORCENTAJE_VOLUMEN_REAL = 0.8;

    public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
        super(ancho, alto, fondo, unidad);
    }
    public static double getMetrosCuadradosCartonTotal(Caja caja1, Caja caja2) {
        double areaCartonCaja1 = caja1.getSuperficieTotal();
        double areaCartonCaja2 = caja2.getSuperficieTotal();
        return areaCartonCaja1 + areaCartonCaja2;
    }



    @Override
    public double getVolumen() {
        return super.getVolumen() * PORCENTAJE_VOLUMEN_REAL;
    }

    public double getSuperficieTotal() {
        double superficie = 0;
        superficie += (2 * getAreaFrontal());
        superficie += (2 * getAreaLateral());
        superficie += (2 * getAreaSuperior());
        return superficie;
    }

    public double getAreaFrontal() {
        return getAncho() * getAlto();
    }

    private double getAlto() {
        return getAncho() * getAlto();
    }

    private double getAncho() {
        return getAlto() * PORCENTAJE_VOLUMEN_REAL;
    }

    public double getAreaLateral() {
        return getFondo() * getAlto();
    }

    private double getFondo() {
        return getAlto() * PORCENTAJE_VOLUMEN_REAL;
    }

    public double getAreaSuperior() {
        return getAncho() * getFondo();
    }
}


