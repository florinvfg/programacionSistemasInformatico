package ActividadDeAplicacion_9_13.Modelo;

import java.util.Comparator;

// Comparador por edad
public class ComparadorEdad implements Comparator<Futbolista> {
    @Override
    public int compare(Futbolista f1, Futbolista f2) {
        return Integer.compare(f1.getEdad(), f2.getEdad());
    }
}
