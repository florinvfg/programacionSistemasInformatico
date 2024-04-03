package ActividadDeAplicacion7_15.Clases;

public class Calendario {
    private int año;
    private int mes;
    private int dia;

    /**
     *
     * @param año
     * @param mes
     * @param dia
     */
    public Calendario(int año, int mes, int dia) {
        if (esFechaValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Fecha no válida.");
        }
    }
//incrementamos dia
    public void incrementarDia() {
        if (dia < diasEnMes(año, mes)) {
            dia++;
        } else {
            dia = 1;
            if (mes < 12) {
                mes++;
            } else {
                mes = 1;
                año++;
            }
        }
    }
//incrementamos mes
    public void incrementarMes() {
        if (mes < 12) {
            mes++;
        } else {
            mes = 1;
            año++;
        }
    }
//incrementamos año
    public void incrementarAño(int cantidad) {
        año += cantidad;
    }
//mostramos
    public void mostrar() {
        System.out.println("Fecha: " + año + "/" + mes + "/" + dia);
    }

    public boolean iguales(Calendario otraFecha) {
        return this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }

    private boolean esFechaValida(int año, int mes, int dia) {
        if (año < 1 || mes < 1 || mes > 12 || dia < 1 || dia > diasEnMes(año, mes)) {
            return false;
        }
        return true;
    }

    private int diasEnMes(int año, int mes) {
        switch (mes) {
            case 2:
                return 28; // Febrero tiene 28 días por simplicidad
            case 4:
            case 6:
            case 9:
            case 11:
                return 30; // Meses con 30 días
            default:
                return 31; // Meses con 31 días
        }
    }
}