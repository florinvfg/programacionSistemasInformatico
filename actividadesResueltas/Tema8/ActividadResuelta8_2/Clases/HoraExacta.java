package ActividadResuelta8_2.Clases;

public class HoraExacta extends Hora { //heredamos de la clase Hora
    private static boolean correcto = false;
    protected int segundos;
    public HoraExacta (int hora, int minutos, int segundos) {
        super(hora, minutos); //aprovechamos el constructor de la superclase
        this.segundos = segundos; //permitiria asignar cualquier valor a los segundos
        if (!setSegundos(segundos)) { //mejor usar el metodo para asignar valores
            System.out.println("segundos incorrectos ");

        }

    }
    //añadimos un metodo que asigna los segundos
    public boolean setSegundos(int segundos) {
        this.segundos = segundos;
        if (0 <= segundos && segundos < 60) { // si esta en rango valido
            this.segundos = segundos; //modificamos los segundos
            correcto = true;
        }
        return correcto;

    }
    @Override //sustituimos el metodo para incrementar segundos en lugar de minutos
    public void inc() {
        segundos++;
        if (segundos > 59) {//si los segundos son mayores que 59
            segundos = 0; //inicializamos los segundos
            super.inc(); //+1 con el metodo inc() de la superclase,que incrementa minutos

        }
    }
    @Override //sustituimos toString()para mostrar los segundos
    public String toString() {
        String result = super.toString(); // utilizamos toString()de la superclase
        result += ":" + segundos; //añadimos los segundos
        return result;
    }
}


