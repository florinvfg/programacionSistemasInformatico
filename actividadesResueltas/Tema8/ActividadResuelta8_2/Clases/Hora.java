package ActividadResuelta8_2.Clases;

public class Hora {
    protected int hora, minutos; // atributos protejidos,pensando para heredear

    Hora(int hora, int minutos) { // construtor
        this.hora = 0; // valores por defecto
        this.minutos = 0; // valores por defecto
        if (!setHora(hora)) { // usamos metodos de asigmacion,que conprueban los valores
            System.out.println(" La hora es incorecta ");
        }
        if (!setMinutos(minutos)) { // usamos metodos de asigmacion,
            System.out.println(" Los minutos no son validos ");
        }
    }

    public void inc() {
        minutos++; // metodo para incrementar la hora +1 minuto
        if (minutos > 59) { // comprobamos si los sobrepesan 59
            minutos = 0; // reseteamos los minutos
            hora++; // incrementamos la hora +1 hora
            if (hora > 23) { // comprobamos si los sobrepesan 23
                hora = 0; // reseteamos la hora
            }
        }
    }

    public boolean setMinutos(int minutos) { // metodo para asignar minutos
        boolean corecto = false; // valores por defecto
        if (0 <= minutos && minutos <= 60) {
            this.minutos = minutos; // asignamos los minutos
            corecto = true; // asgnamos correcto
        }
        return corecto;
    }

    public boolean setHora(int hora) {
        boolean correcto = false; // valores por defecto
        if (0 <= hora && hora <= 24) { // comprobamos si los sobrepesan 24
            this.hora = hora; // asignamos la hora
            correcto = true; // asignamos correcto

        }
        return correcto;

    }

    @Override // indica que estamos sustityendo (overriding) el metodo
    public String toString() { // metodo para imprimir la hora
        String result;
        result = hora + ":" + minutos;
        return result;
    }
}
