package ActividadResuelta8_3.Clases;

public class HoraExacta extends Hora { // Heredamos de la clase Hora
    private static boolean correcto = false;
    protected int segundos;

    // Constructor que aprovecha el constructor de la superclase Hora
    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        if (!setSegundos(segundos)) { // Utilizamos el método para asignar valores a los segundos
            System.out.println("Segundos incorrectos");
        }
    }

    // Método para asignar los segundos
    public boolean setSegundos(int segundos) {
        if (0 <= segundos && segundos < 60) { // Comprobamos si los segundos están en un rango válido
            this.segundos = segundos; // Asignamos los segundos
            correcto = true;
        }
        return correcto;
    }

    // Sustituimos el método para incrementar segundos en lugar de minutos
    @Override
    public void inc() {
        segundos++;
        if (segundos > 59) { // Si los segundos superan los 59
            segundos = 0; // Reiniciamos los segundos
            super.inc(); // Incrementamos la hora y los minutos con el método inc() de la superclase
        }
    }

    // Sustituimos toString() para mostrar también los segundos
    @Override
    public String toString() {
        String result = super.toString(); // Utilizamos toString() de la superclase
        result += ":" + segundos; // Añadimos los segundos
        return result;
    }

    // Método equals para comparar objetos HoraExacta
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof HoraExacta)) return false;
        HoraExacta otroReloj = (HoraExacta) o; // Obtenemos el objeto otroReloj
        return this.hora == otroReloj.hora && this.minutos == otroReloj.minutos && this.segundos == otroReloj.segundos;
    }
}
