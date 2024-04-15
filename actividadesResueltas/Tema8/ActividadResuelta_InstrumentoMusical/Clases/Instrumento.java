package ActividadResuelta_InstrumentoMusical.Clases;

import java.util.Arrays;

public abstract class Instrumento {
    protected Nota[] melodia;
    public Instrumento() {
        melodia = new Nota[0];
    }

    /**
     * Metodo que agrega una nota al array
     * @param n
     */
    public void agregarNota(Nota n){
        //incrementar un sitio en el array para insertar la nueva nota
        melodia= Arrays.copyOf(melodia,melodia.length+1);
        melodia[melodia.length-1]=n;
    }
    abstract void interpretar();



}
