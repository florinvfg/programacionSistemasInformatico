package ActividadDeAplicacion_9_13.Modelo;

import java.util.Comparator;

// Comparador por nombre
public class ComparadorNombre implements Comparator<Futbolista> {
    @Override
    public int compare(Futbolista f1, Futbolista f2) {
        return f1.getNombre().compareTo(f2.getNombre());
    }
}
