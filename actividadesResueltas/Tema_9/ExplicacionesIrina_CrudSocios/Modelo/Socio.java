package ExplicacionesIrina_CrudSocios.Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Socio implements Cloneable{
    private int id;
    private String nombre;
    LocalDate fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        //establecer la fecha de nacimiento en formato Español
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");//se crea el Formato
        this.fechaNacimiento=LocalDate.parse(fechaNacimiento,f); // se convierte un String en LocalDate


    }

    /**
     * Método para calcular a partir de la fecha de nacimiento, la edad de un socio.
     * Se utiliza "until" que significa una resta entre las dos fechas, fecha actual - fecha de nacimiento.
     * @return
     */
    public int edad(){
        return (int) this.fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

//    public int compareTo(Object oj){
//        int resultado;
//        //hacer un casting del tipo objeto a tipo Socio
//        Socio s=(Socio) oj;
//        if (this.id<s.id){
//            resultado =-1;
//        }else if (this.id>s.id){
//            resultado=1;
//        }else {
//            resultado=0;
//        }
//        return resultado;
//    }

    public int compareTo(Object oj){
        int resulado;
        Socio s=(Socio) oj;
        resulado=Integer.compare(this.id,s.id);
        return resulado;
    }
    public int getId(){return id;}

    /**
     *
     * @param o
     * @return
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return id == socio.id;
    }

    // Definición de constantes para colores de texto en la consola
    final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
    final String YELLOW = "\033[0;33m"; // Color amarillo
    final String BLUE = "\033[0;34m"; // Color azul


    /**
     *
     * @return
     */
    @Override
    public String toString() {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");//Se crea el Formato

        return BLUE+"Socio->"+RESET +
                "id=" + id +
                BLUE+" nombre='"+RESET + nombre  +
                ", fechaNacimiento=" + fechaNacimiento.format(f) +
                ", edad: "+YELLOW +edad()+RESET;
    }
}