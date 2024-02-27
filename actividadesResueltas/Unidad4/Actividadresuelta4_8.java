/*Diseñar la funcion "Calculadora()",a que se le pasan dos numeros reales (operandos) y que operacion se desea realizar con ellos
* Las operaciones disponible son:sumar,restar,multiplicar y dividir.Estas se espicifican mediante un numero: 1 para la suma,2 para
* la resta,3 para la multiplicacion y 4 para divizion.La funcion devolvera el resultado de la opreacion mediante un numero real*/
//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]


import java.util.Scanner;

public class Actividadresuelta4_8 {
    public static void main(String[] args) {

      /*  for (int operacion = 1; operacion <= 4; operacion++){//todas las operaciones
            double resultado = calculadora(3.0, 4.0, operacion);//operamos con 3.0 y 4.0
            System.out.println(resultado);
    }
}
//Realiza la operacion indicada:
//1 ➦ suma
//2 ➦ resta
//3 ➦ multiplicacion
//4 ➦ division
static double calculadora(double a, double b, int operacion; double b, int operacion){
        double result;//resultado de la operacion
        result = switch (operacion) {
            case 1 ->//suma
                    a + b;//si solo existe una instruccion no hace falta escribir yield

            case 2 ->//resta
                    a - b;
            case 3 -> a * b;
            case 4 -> (double) a / b;
            //falta comprobar que no es una division por 0
            //el cast fuerza que la division sea real
            default -> {
                System.out.println("Operacion no valida");
                result= 0;//si la operacion no tiene sentido devolveremos 0
            }
        };
        return (result);*/


       // otra manera de hacerlo

        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese los dos operandos
        System.out.print("Ingrese el primer numero ➦ ");
        double operando1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero ➦ ");
        double operando2 = sc.nextInt();

        // Solicitar al usuario que ingrese el número de la operación deseada
        System.out.println("Elija la operación a realizar:");
        System.out.println("1. ➦ Sumar");
        System.out.println("2. ➦ Restar");
        System.out.println("3. ➦ Multiplicar");
        System.out.println("4. ➦ Dividir");
        int operacion = sc.nextInt();

        // Realizar la operación y mostrar el resultado
        double resultado = calculadora(operando1, operando2, operacion);
        System.out.println("El resultado es ➦ " + resultado);
    }

    // Función para realizar la operación especificada entre dos operandos
    static double calculadora(double operando1, double operando2, int operacion) {
        double resultado = 0;
        switch (operacion) {
            case 1:
                resultado = operando1 + operando2; // Suma
                break;
            case 2:
                resultado = operando1 - operando2; // Resta
                break;
            case 3:
                resultado = operando1 * operando2; // Multiplicación
                break;
            case 4:
                if (operando2 != 0) {
                    resultado = operando1 / operando2; // División
                } else {
                    System.err.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.err.println("Operación no válida.");
        }
        return resultado;


    }
}