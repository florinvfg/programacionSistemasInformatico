package ActividadResuelta8_3.Clases;

public class Hora {
    protected int hora, minutos; // Atributos protegidos, pensando para heredar

    // Constructor
    Hora(int hora, int minutos) {
        if (!setHora(hora)) { // Utilizamos métodos de asignación que comprueban los valores
            System.out.println("La hora es incorrecta");
        }
        if (!setMinutos(minutos)) { // Utilizamos métodos de asignación que comprueban los valores
            System.out.println("Los minutos no son válidos");
        }
    }

    // Método para incrementar la hora en un minuto
    public void inc() {
        minutos++; // Incrementamos los minutos en 1
        if (minutos > 59) { // Si los minutos superan los 59
            minutos = 0; // Reiniciamos los minutos
            hora++; // Incrementamos la hora en 1
            if (hora > 23) { // Si la hora supera las 23
                hora = 0; // Reiniciamos la hora
            }
        }
    }

    // Método para asignar los minutos
    public boolean setMinutos(int minutos) {
        boolean correcto = false; // Valor por defecto
        if (0 <= minutos && minutos < 60) { // Comprobamos si los minutos son válidos
            this.minutos = minutos; // Asignamos los minutos
            correcto = true; // Indicamos que la asignación fue correcta
        }
        return correcto;
    }

    // Método para asignar la hora
    public boolean setHora(int hora) {
        boolean correcto = false; // Valor por defecto
        if (0 <= hora && hora < 24) { // Comprobamos si la hora es válida
            this.hora = hora; // Asignamos la hora
            correcto = true; // Indicamos que la asignación fue correcta
        }
        return correcto;
    }

    // Método toString para imprimir la hora
    @Override
    public String toString() {
        return hora + ":" + (minutos < 10 ? "0" + minutos : minutos); // Formateamos los minutos para que siempre tengan dos dígitos
    }
}
