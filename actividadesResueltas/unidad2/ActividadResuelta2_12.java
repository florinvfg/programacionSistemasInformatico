package unidad2;
import java.util.*;
/*Pedir el dia, mes y año de una ficha e indicar si la fecea es correcta.Hay que tener en cuenta
* que existen meses con 28, 30 y 31 dias (no se consideran los años bisiestos)*/

public class ActividadResuelta2_12 {
    //Hay que tener en cuenta que no todos los meses tienen el mismo numero de dias.
    public static void main(String[] args) {
        int dia, mes, anyo;
        boolean fechaCorrecta;//variable que indica si la fecha es corecta

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un día: ");
        dia = sc.nextInt();

        System.out.print("Introduzca el mes: ");
        mes = sc.nextInt();

        System.out.print("Introduzca el año: ");
        anyo = sc.nextInt();

        if (anyo == 0){//el unico año que no existe es el 0
            fechaCorrecta = false;
        } else {
            //primero comprobaremos febrero (mes = 2)
            if (mes == 2 && (1 <= dia && dia <=28)) {//veremos si es un mes de 20 dias
                fechaCorrecta = true;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1 <= dia && dia <=30)){
                fechaCorrecta = true;
            } else {//comprobaremos si es un mes de 31 dias
                if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (1 <= dia && dia <= 31)) {
                    fechaCorrecta = true;
                } else {//en cualquier otro caso
                    fechaCorrecta = false;
                }
            }
            if (fechaCorrecta) {
                System.out.println("Fecha corecta: ©©©© " + dia + "/" + mes + "/" + anyo + " ©©©©");
            } else {
                System.out.println("Fecha incorrecta.©©©©  ");
            }
        }
    }
}
