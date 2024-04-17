package ActividadResuelta9_7_Irina.Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Implementar la Interface comparable en la clase Socio para que por defecto
 * se ordene segun los numeros de identificacion de forma creciente
 */
public class Socio {

    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;

    /**
     *
     * @param id
     * @param nombre
     * @param fechaNacimiento
     */
    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        // Establecer la fecha de nacimiento en formato Español
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
    }

    /**
     *
     * @return
     */
    public int edad() {
        return (int) fechaNacimiento.until(LocalDate.now()).getYears();
    }

    /**
     *
     * @param otroSocio
     * @return
     */
    public int compareTo(Socio otroSocio) {
        return Integer.compare(this.id, otroSocio.id);
    }
    // Definición de constantes para colores de texto en la consola
    final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
    final String YELLOW = "\033[0;33m"; // Color amarillo
    final String BLUE = "\033[0;34m"; // Color azul

    @Override
    public String toString() {
        return BLUE+"Socio"+RESET +
                " id=" + id +
                ", nombre='"+YELLOW + nombre + RESET+'\'' +
                ", fechaNacimiento=" + fechaNacimiento +
               YELLOW+ ", edad=" +RESET+ BLUE+edad()
                ;
    }
}