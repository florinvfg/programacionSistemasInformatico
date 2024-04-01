package Explicacion_Locale_irina;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
//Isertar una fecha
        LocalDate fechaCumple=LocalDate.of(2024,05,04);

        //fecha actual
        LocalDate fechahoy=LocalDate.now();
        LocalDate fechaMas4=fechahoy.plus(4, ChronoUnit.DAYS);
        System.out.println(fechaMas4);
        //RESTAR 4 dias
        LocalDate fechaMenos5=fechahoy.minus(5,ChronoUnit.DAYS);
        System.out.println(fechaMenos5);
        //tambien se puede utilizar plusdays...plusMonths..plusYears
        fechaMenos5=fechahoy.minusDays(5);
        System.out.println(fechaMenos5);
        //de una fecha podemos tomar un dato
        //solo dia,solo año,solo mes
        System.out.println("El dia de hoy es " +fechahoy.getDayOfWeek());
        System.out.println("El dia de hoy es " +fechahoy.getDayOfMonth());
        System.out.println("El dia de hoy es " + fechahoy.getDayOfYear());

        //para el mes y para el año
        System.out.println("Indica la fecha de nacimiento");
        LocalDate fechaNacimiento=LocalDate.of(1975,9,6);
        System.out.println("Florin tiene " + (LocalDate.now().getYear()-fechaNacimiento.getYear()));

        //como saber si el año es bisiesto
        boolean bisiesto = fechahoy.isLeapYear();
        System.out.println("Este año es Bisiesto-> " + bisiesto);

        //comparar dos fechas ->boolean
        boolean despues=fechaNacimiento.isAfter(fechahoy);//falso
        System.out.println("la fecha de nacimiento de florin es despues que la de hoy-> " + despues);
        boolean antes=fechaNacimiento.isBefore(fechahoy);
        System.out.println("la fecha de nacimiento de Florin es antes que la de hoy "+ antes);

        //si necesitamos saber el periodo de tiempo que ha pasado dos fechas->util
        //el resultado no es de tipo LocalDate si no de tipo Period
        Period periodoF=fechahoy.until(fechaNacimiento);
        System.out.println("El tiempo que ha pasado desde que Florin nacio -> " +periodoF.getDays()+ "dias");
        System.out.println("El tiempo que ha pasado desde que Florin nacio -> " +periodoF.getMonths()+ "meses");
        System.out.println("El tiempo que ha pasado desde que Florin nacio -> " +periodoF.getYears()+ "años");

        //mostrar fecha en formato español
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-MM-yyyy");//definir el formato de fecha
        System.out.println("La fecha en formato Español es " + fechaNacimiento.format(formato));

        //otra forma de dar formato a fecha
        DateTimeFormatter formato2=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault());
        System.out.println(fechahoy.format(formato2));
        DateTimeFormatter formato3=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        System.out.println(fechahoy.format(formato3));
        DateTimeFormatter formato4=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault());
        System.out.println(fechahoy.format(formato4));
        DateTimeFormatter formato5=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.getDefault());
        System.out.println(fechahoy.format(formato5).toUpperCase());

        /**
         * HORAS
         * */
        LocalTime horaA= LocalTime.now();
        System.out.println("La hora actual es-> "+ horaA);
        int hora=horaA.getHour();
        int minutos=horaA.getMinute();
        int segundos=horaA.getSecond();
        //loas mismos metodos ..ejemplo,sumarle 5 horas a la hora actual**minus o plus
        LocalTime horaMas5=horaA.plus(5,ChronoUnit.HOURS);
        System.out.println("Dentro de cinco horas seran las " +horaMas5);

        //calcular el periodo de tiempo entre dos horas
        //duracion->se utiliza para calcilar la duracion entre dos horas
        Duration duracion=Duration.between(LocalTime.of(23,50,25), horaA);
        System.out.println("Tiempo entre las dos horas-> "+duracion);
      DateTimeFormatter formato6=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("La hora actual formateada -> " + horaA.format(formato6));

    }
}
