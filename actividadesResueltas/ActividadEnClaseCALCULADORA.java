package unidad2;
import java.sql.SQLOutput;
import java.util.*;
public class ActividadEnClaseCALCULADORA {
    public static void main(String[] args) {
int opcion, valor1=0, valor2=0;
double resultado=0;
Scanner sn=new Scanner(System.in);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("°°°°°°°°°°°° OPERACION CALCULADORA °°°°°°°°°°°°°°°");
        System.out.println("---          1: SUMAR                             ");
        System.out.println("---          2: RESTAR                            ");
        System.out.println("---          3: MULTIPLICAR                       ");
        System.out.println("---          4: DIVIDIR                           ");
        System.out.println("---          5: SALIR                             ");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("Indique tu opcion : ");
        opcion = sn.nextInt();

        if (opcion>=1 && opcion<=4 ){
            System.out.println("Indique el valor de valor1-> ");
            valor1 = sn.nextInt();
            System.out.println("Idique el valor de valor2 -> ");
            valor2 =sn.nextInt();

        }
        switch (opcion){
            case 1:{resultado=valor1+valor2;
                    break;
            }
            case 2: {resultado = valor1 - valor2;
                break;
            }
            case 3: {resultado = valor1 * valor2;
                break;
            }
            case 4: {
                resultado = valor1 / valor2;
                break;
            }
            case 5: {
                System.out.println(" ADIOS ");
                break;
            }
            default:{
                System.err.println("Tu seleccion no existe en el MENU ");
            }

            }
        System.out.println("El resultado de tu seleccion es: " + resultado + " ©©©©  ");

    }
}
