package ActividadResuelta9_8.Modelo;

public class Socio implements Comparable<Socio> {
    // Atributos de la clase Socio
    private int id; // Número de identificación del socio
    private String nombre; // Nombre del socio
    private String apellido; // Apellido del socio



    /**
     * Constructor de la clase Socio
     * @param id
     * @param nombre
     * @param apellido
     */
    public Socio(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }



    /**
     * Método para comparar los socios por nombre
     * @param otro the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Socio otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    // Métodos getter y setter de la clase Socio
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    /**
     * Sobrescribir el método toString() para imprimir los detalles del objeto Socio
     * @return
     */
    @Override
    public String toString() {
        return "\nSocio" + " id=" + id +
                " nombre:'" + nombre +
                '\'' + "  apellido:'" + apellido +
                '\'' ;
    }
}