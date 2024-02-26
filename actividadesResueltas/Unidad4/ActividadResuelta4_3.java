/*Realizar una funcion que calcule y muestre el area o el volumen de un cilindro,segun se espesifique.
* Para distinguir un caso de otro se le pasara como opcion un numero:1(para el area) o 2 (para el volumen)
* Ademas, hay que pasarle a la funcion el radio de la base y la altura.
* area=2PI * radio *(altura+radio)
* volumen=PI*radio cuadrado*altura*/
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
import java.util.Scanner;
public class ActividadResuelta4_3 {
    public static void main(String[] args) {


   /* static void areaVolumenCilindro(double radio, double altura, int opcion) {
        double volumen, area;
        switch (opcion){
        case 1 -> {
            volumen = Math.PI * Math.pow(radio, 2) * altura;//aplicamos la formula
            System.out.println("El area es de: " + volumen);
        }
        case 2 -> {
            area = 2 * Math.PI * radio * (altura + radio);
            System.out.println("El area es de: " + area);
        }
        default -> System.out.println("Indicador del calculo erroneo");
    }
}

        public static void main(String[] args) {
        /*Recordamos que el area de un cilindro es 2*PI*radio*(altura+radio)y la formula para el
         * volumen es PI*(radio al cuadrado)+altura*/
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca radio ☞ ");
        double radio = sc.nextDouble();
        System.out.println("Introduzca altura ☞ ");
        double alt = sc.nextDouble();
        System.out.println("Que desea calcular (1 (area)/ 2 (volumen): ");
        int tipoCalculo = sc.nextInt();
        areaVolumenCilindro(radio, alt, tipoCalculo);
    }
}*/






//  Otra opcion de hacerlo

 Scanner sc = new Scanner(System.in);

                System.out.println("Ingrese el número correspondiente a la opción deseada:");
                System.out.println("1 - Calcular el área de la base del cilindro");
                System.out.println("2 - Calcular el volumen del cilindro");
                int opcion = sc.nextInt();

                System.out.println("Ingrese el radio de la base del cilindro:");
                double radio = sc.nextDouble();
                System.out.println("Ingrese la altura del cilindro:");
                double altura = sc.nextDouble();

                if (opcion == 1) {
                    double areaBase = calcularAreaBaseCilindro(radio);
                    System.out.println("El área de la base del cilindro es: " + areaBase);
                } else if (opcion == 2) {
                    double volumen = calcularVolumenCilindro(radio, altura);
                    System.out.println("El volumen del cilindro es: " + volumen);
                } else {
                    System.out.println("Opción inválida. Por favor, seleccione 1 o 2.");
                }

                sc.close();
            }

            public static double calcularAreaBaseCilindro(double radio) {
                return Math.PI * Math.pow(radio, 2);
            }

            public static double calcularVolumenCilindro(double radio, double altura) {
                return Math.PI * Math.pow(radio, 2) * altura;
            }
}





