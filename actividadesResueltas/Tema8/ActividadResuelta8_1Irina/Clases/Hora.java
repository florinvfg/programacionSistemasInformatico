package ActividadResuelta8_1Irina.Clases;

public class Hora {
    protected int hora, minutos;

    /**
     *
     * @param hora
     * @param minutos
     */
    public Hora(int hora, int minutos) {
       if (!setHora(hora)){
           System.out.println("La hora no es corecta");
       }
       if (!setMinutos(minutos)){
           System.out.println("Los minutos no son corecta");
       }

    }

    //metodo validar hora

    /**
     *
     * @param hora
     * @return
     */
    public boolean setHora(int hora) {
        boolean correcto = false;
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            correcto = true;
        }
        return correcto;
    }

    /**
     *
     * @param minutos
     * @return
     */
    public boolean setMinutos(int minutos) {
        boolean correcto = false;
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
            correcto = true;
        }
        return correcto;
    }



    public void incrementar() {
        this.minutos++;
        if (this.minutos > 59) {
            this.hora++;
            this.minutos = 0;

            if (this.hora == 23) {
                this.hora = 0;
            }
        }
    }

    @Override
    public String toString() {
        String horaMuestra;
        String minutosMuestra;
        if (this.hora <= 9) {
            horaMuestra="0"+String.valueOf(this.hora);
        }else {
            horaMuestra=String.valueOf(this.hora);

        }
        if (this.minutos <= 9) {
            minutosMuestra="0"+String.valueOf(this.minutos);
        } else {
            minutosMuestra=String.valueOf(this.minutos);
        }
        return "Hora[" + horaMuestra + ":" +minutosMuestra + "]";
    }
}
