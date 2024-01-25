package unidad2;
import java.util.*;
/*Modifica la actividad de aplicacion 2.17 para que,ademas de los dos numeros
* aleatorios,tambien aparezca la opercion que debe realizar el jugador:
* suma, resta o multiplicacion*/
public class ActividadDeAplicacion2_18 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
  char simbolo =' ';
        int num1 = (int) (Math.random() * 100 + 1);
        int num2 = (int) (Math.random() * 100 + 1);
        //suma,resta y multiplica
        int operacion = (int) (Math.random() * 3 + 1);
       int resultado =0;
        switch (operacion) {

            case 1 -> {//suma
                    simbolo='+';
                    resultado = num1 + num2;}
            case 2 ->{//resta
                    simbolo='-';
                    resultado = num1 - num2;}
            case 3 -> {//multiplicar
                    simbolo='*';
                    resultado = num1 * num2;
            }

    }
    System.out.println("cuanto es " + num1 + " " + simbolo + " " + num2 + "?");
    int resultUser= sn.nextInt();
    if (resultado==resultUser){
        System.out.println("corecto");
    }else{
        System.err.println("incorecto !!");

    }
}

} //De otra manera
/* int rand1, rand2, rand3, n1, result = 0;
        String operMat = null;

        System.out.println("Juego de las operaciones matemáticas. Suma, resta o multiplica los siguientes números:");

        rand1 = (int)(Math.random() * 99 + 1);
        rand2 = (int)(Math.random() * 99 + 1);
        rand3 = (int)(Math.random() * 3);

        switch (rand3) {
            case 0:
                operMat = "Suma";
                result = rand1 + rand2;
                break;
            case 1:
                operMat = "Resta";
                result = rand1 - rand2;
                break;
            case 2:
                operMat = "Multiplica";
                result = rand1 * rand2;
                break;
                 }

        System.out.print(operMat);
        System.out.print(" el número " + rand1);
        System.out.println(" y el número " + rand2);

        System.out.print("Introduce el resultado: ");
        n1 = sc.nextInt();

        if (result == n1){
            System.out.println("El resultado es correcto.");
        } else {
            System.out.println("El resultado es incorrecto.");
        }          */
