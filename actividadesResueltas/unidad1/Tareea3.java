package unidad1;
import java.util.Scanner;

/* Teniendo como base,que el 10% de un colegio esta formando por todos los alumnos,solicita cuantas niñas y cuanto niños hay,e indica el procentaje de cada uno.Por ejemplo:
Existe 84 niñas y 78 niños,el 10% de los niños del colegio 162niños,
51.85% son niñas
48.148 son niños
Recordemos las regla de tres */
public class Tareea3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Indica el numero de niñas ");
        short ninas = sc.nextShort();
        System.out.println("Indica el numero de niños ");
        short ninos = sc.nextShort();
        double totalMatriculados=ninas+ninos;
        double porcentajeNinas=(double)(ninas*100/totalMatriculados);//regla de 3
        double porcentajeNinos=(double)(ninos*100/totalMatriculados);//regla de 3
        System.out.println("El procentaje de niñas matriculadas es: " +porcentajeNinas);
        System.out.println("El procentaje de niños matriculados es: " +porcentajeNinos);
    }
}
