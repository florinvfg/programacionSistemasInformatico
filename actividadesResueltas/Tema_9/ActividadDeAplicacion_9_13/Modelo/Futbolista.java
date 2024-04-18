package ActividadDeAplicacion_9_13.Modelo;

import java.util.Objects;

// Clase Futbolista
public class Futbolista implements Comparable<Futbolista> {
    private String dni;
    private String nombre;
    private int edad;
    private int numGoles;

    // Constructor
    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    // Métodos toString() y equals()
    @Override
    public String toString() {
        return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", numGoles=" + numGoles + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista that = (Futbolista) o;
        return Objects.equals(dni, that.dni);
    }

    // Método compareTo() basado en el DNI
    @Override
    public int compareTo(Futbolista otro) {
        return dni.compareTo(otro.dni);
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumGoles() {
        return numGoles;
    }
}

