package Calendario.Clases;

public class Calendario {

    //variables de instancia para representar el año, mes y día del calendario.
    private int año;
    private int mes;
    private int dia;

    /**
     *
     * @param año
     * @param mes
     * @param dia
     */
    // Verificamos si la fecha pasada como parámetros es válida llamando al método fechaEsValida
    public Calendario(int año, int mes, int dia) {
        if (fechaEsValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Fecha inválida");
        }
    }
    //Verificamos si el día es menor que los días en el mes actual.Si es así, incrementa el día en uno.
    //De lo contrario, reinicia el día a uno y llama al método incrementarMes para avanzar al siguiente mes.
    public void incrementarDia(int cantidadDias) {
        for (int i = 0; i < cantidadDias; i++) {
            if (dia < diasEnMes(año, mes)) {
                dia++;
            } else {
                dia = 1;
                int cantidadMeses = 0;
                incrementarMes(cantidadMeses);
            }
        }
    }
    /**
     *
     * @param año
     * @param mes
     * @return
     */
    private static int diasEnMes(int año, int mes) {
        switch (mes) {// Determina el número de días en el mes actual dependiendo del mes y si es un año bisiesto.
            case 2:
                return esAñoBisiesto(año) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    /**
     *
     * @param año
     * @return
     */
    private static boolean esAñoBisiesto(int año) { // Determina si un año es bisiesto

        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    /**
     *
     * @param cantidadMeses
     */
    public void incrementarMes(int cantidadMeses) { // Incrementa el mes actual por la cantidad de meses especificada.
        int totalMeses = mes + cantidadMeses; // Calcula el total de meses sumando el mes actual y la cantidad de meses especificada

        // Si el total de meses es menor o igual a 12, simplemente se actualiza el mes.
        // De lo contrario, se calcula el nuevo mes y el año correspondiente.
        if (totalMeses <= 12) {
            mes = totalMeses;
        } else {
            int añosParaIncrementar = totalMeses / 12; // Calcula cuántos años hay que incrementar
            int nuevoMes = totalMeses % 12; // Calcula el nuevo mes después de restar los años completos

            if (nuevoMes == 0) { // Si el nuevo mes es 0, se debe considerar como el mes 12 del año anterior.
                mes = 12;
                incrementarAño(añosParaIncrementar - 1); // Se resta 1 porque el mes es diciembre del año anterior
            } else {
                mes = nuevoMes; // Se actualiza el mes con el nuevo valor
                incrementarAño(añosParaIncrementar); // Se incrementa el año con la cantidad de años necesaria
            }
        }
    }

    /**
     *
     * @param cantidad
     */
    public void incrementarAño(int cantidad) { // Incrementa el año actual en la cantidad especificada.

        if (año + cantidad > 0 ) {
            año += cantidad;
        } else {
            throw new IllegalArgumentException("Año inválido");
        }
    }


    public void mostrar() { // Muestra la fecha en formato día/mes/año.

        String nombreMes;
        switch (mes) {
            case 1:
                nombreMes = "enero";
                break;
            case 2:
                nombreMes = "febrero";
                break;
            case 3:
                nombreMes = "marzo";
                break;
            case 4:
                nombreMes = "abril";
                break;
            case 5:
                nombreMes = "mayo";
                break;
            case 6:
                nombreMes = "junio";
                break;
            case 7:
                nombreMes = "julio";
                break;
            case 8:
                nombreMes = "agosto";
                break;
            case 9:
                nombreMes = "septiembre";
                break;
            case 10:
                nombreMes = "octubre";
                break;
            case 11:
                nombreMes = "noviembre";
                break;
            case 12:
                nombreMes = "diciembre";
                break;
            default:
                nombreMes = "mes inválido";
        }
        System.out.println(dia + " de " + nombreMes + " del " + año);
    }

    /**
     *
     * @param otraFecha
     * @return
     */
    public boolean iguales(Calendario otraFecha) { // Comparamos si las  dos fechas son iguales.
        return this.año == otraFecha.año &&
                this.mes == otraFecha.mes &&
                this.dia == otraFecha.dia;
    }

    /**
     *
     * @param año
     * @param mes
     * @param dia
     * @return
     */
    public static boolean fechaEsValida(int año, int mes, int dia) {// Verifica si una fecha es válida.
        if (año < 0 || año > 9999 || mes < 1 || mes > 12 || dia < 1 || dia > diasEnMes(año, mes)) {
            return false;
        }
        return true;
    }
}
