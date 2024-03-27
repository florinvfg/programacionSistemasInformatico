


package ActividadResuelta7_7.Clase;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
    /**
     * La clase Texto contendrá:
     * - un String (donde guardaremos la cadena de caracteres)
     * - un número entero que indicará la longitud máxima del texto
     * - fecha de creación del texto
     * - y la fecha y hora de la última modificación
     * **/
    public String numVocales;
    private String cad;//cadena de caracteres
    LocalDate creacion;
    LocalDateTime ultimaModificacion;
    private final int LONGITUD_MAX;//del Texto.Una vez asignado no varia
    static final String VOCALES = "aeiouáéíóú";//cadena de constante y estatica
    //que contiene todas las posibles vocales en minusculas

    public Texto(int longitudMax) {
        cad = "";//cad referencia un objeto String con valor "",no se puede usar
        /**
         * cad=null,en este caso cad no referencia ningun
         * objeto y no es posible usar sus metodos
         * */
        this.LONGITUD_MAX = longitudMax;
        creacion = LocalDate.now();
        ultimaModificacion = null;//aun no se ha modificado nada
    }
    /**
     * Añade un caracter al final de Texto,
     * siempre y cuando quede sitio
     * */
    public void addFinal(char c){
        if (LONGITUD_MAX > cad.length()) {
            cad = cad + c;//concatena el caracter al final
            ultimaModificacion = LocalDateTime.now();
        }
    }

    /**
     * Añade una cadena al final de Texto
     * siempre y cuando quede sitio
     * */
    public void addFinal(String c){
        if (LONGITUD_MAX >= cad.length() + c.length()) {
            cad = cad + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    /**
     * Añade un caracter al comienzo del Texto
     * siempre y cuando quede sitio
     * */
    public void addPrincipio(char c){
        if (LONGITUD_MAX > cad.length()) {
            cad = c + cad;
            ultimaModificacion = LocalDateTime.now();
        }
    }
/**
 * Añade una cadena al comienzo del Texto
 * siempre y cuando quede sitio
 * */
    public void addPrincipio(String c){
        if (LONGITUD_MAX >= cad.length() + c.length() + c.length()) {
            cad = c + cad;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void mostrar() {
        System.out.println("Texto creado el " + creacion);
        System.out.println("Ultima modificacion:" + ultimaModificacion);
        System.out.println(cad);

    }

    /**
     * Devuelve el numero de vocales presentes en el texto
     * */
    public int numVocales() {
        int voc = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (esVocal(cad.charAt(i))) {
                voc++;
            }
        }
        return (voc);
    }

    /**
     * Comprueba si el caracter pasado es una vocal
     * mayuscula/minuscula/acentuada
     * */
    private boolean esVocal(char c) {
        boolean vocal = false;
        c = Character.toLowerCase(c);//convertimos el caracter en minuscula
        if (VOCALES.indexOf(c) != -1) {//buscamos el caracter (en minuscula) en las posibles vocales
            vocal = true;
        }
        return (vocal);
    }
}

