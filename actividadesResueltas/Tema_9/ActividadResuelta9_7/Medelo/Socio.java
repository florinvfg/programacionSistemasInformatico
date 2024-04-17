package ActividadResuelta9_7.Medelo;

public class Socio {

    // Definición de constantes para colores de texto en la consola
    final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
    final String YELLOW = "\033[0;33m"; // Color amarillo
    final String BLUE = "\033[0;34m"; // Color azul

    private int id;
    private String nombre;
    private String fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return YELLOW+"Socio "+RESET+" {" +BLUE+
                "id="+ id +RESET+
                ", nombre='"+BLUE + nombre + RESET+'\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
