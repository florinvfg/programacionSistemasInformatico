package ActividadResuelta7_7Irina.Clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Texto {
    private final int LONGITUDMAX;
    private String cadena;
    LocalDate fechaCreacion;
    LocalTime horaModificacion;
    static final String VOCALES = "aeiou";
    private String cadAgregar;

    public Texto(int longitud) {
        cadena = "";
        //creamos la cadena
        this.LONGITUDMAX = longitud;
        //guardamos la fecha de creacion
        fechaCreacion = LocalDate.now();
        horaModificacion = null;//no se modifica nada
    }

    //añadir un caracter al final de la cadena
    public void addFinal(char c) {
        if (this.LONGITUDMAX > cadena.length()) {//valida que tenga espacio segun la longitud
            cadena += c;//agregamos la letra al final de la cadena
            horaModificacion = LocalTime.now();//se actualiza la hora de modificacion
        }
    }

    //Añadir al principo de la cadena
    public void addPrincipio(char c) {
        if (LONGITUDMAX > cadena.length()) {
            cadena = c + cadena;
            horaModificacion = LocalTime.now();
        }
    }

    //Agregar al final una cadena
    public void addCadenaFinal(String cadAgregar) {
        if (LONGITUDMAX > (cadAgregar.length() + cadena.length())) {
            cadena = cadAgregar + cadena;
            horaModificacion = LocalTime.now();
        }

    }
    //HAY QUE CONTAR LAS VOCALES QUE HAY EN LA CADENA
    public int contarVocales(){
        int contador=0;
        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))){//enviamos a comparar al metodo esvocal si la letra esta en la cadena VOCALES
              contador++;
            }

        }
        return contador;
    }

    private boolean esVocal(char c){
        boolean vocal = false;
        c=Character.toLowerCase(c);//para pasarlo a minuscula
        if (VOCALES.indexOf(c)!=-1){//esto indica que si existe la coincidencia de la letra en la cadena de vocales
            vocal=true;
        }
        return vocal;
    }
    //Agregar cadena al principio
    public void addCadenaPrincipio(String cadAgregar){
        if (LONGITUDMAX>(cadAgregar.length()+cadena.length())){
            cadena=cadAgregar+cadena;
            horaModificacion=LocalTime.now();
        }

    }

    @Override
    public String toString() {
        return "Texto{" +
                "LONGITUDMAX=" + LONGITUDMAX +
                ", cadena='" + cadena + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", horaModificacion=" + horaModificacion +
                '}';
    }

}
