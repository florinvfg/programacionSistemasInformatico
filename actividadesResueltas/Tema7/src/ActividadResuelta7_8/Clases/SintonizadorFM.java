package ActividadResuelta7_8.Clases;

public class SintonizadorFM {
    double frecuencia;
    public SintonizadorFM(double frecuenciaInicial) {
        if (frecuenciaInicial < 80) {
            frecuencia = 80;

        } else if (frecuenciaInicial > 108) {
            frecuencia = 108;
        }else{
            frecuencia = frecuenciaInicial;
        }
    }
    SintonizadorFM() {
        this (80);

    }
    public double down() {
        frecuencia += 0.5;
        comprobandoRango();
        return (frecuencia);
    }
    public double up() {
        frecuencia -= 0.5;
        comprobandoRango();
        return (frecuencia);
    }
    public void display()  {
        System.out.println(" Sintonizando: " + frecuencia + "MHz");
    }
    private void comprobandoRango() {
        if (frecuencia < 80) {
            frecuencia = 108;
        } else if (frecuencia > 108) {
            frecuencia = 80;
        }
    }
}
