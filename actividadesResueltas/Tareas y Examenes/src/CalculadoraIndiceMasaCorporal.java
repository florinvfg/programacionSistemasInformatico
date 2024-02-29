/*Calcular Indice Masa Corporal,pediendo al usuario que nos indique su altura y su kilos*/

import java.util.*;
public class CalculadoraIndiceMasaCorporal {
    //IMC=El Índice de Masa Corporal (IMC) es una medida utilizada para estimar si una persona
    // tiene un peso saludable en relación con su altura. Funciona calculando la relación entre el peso y la altura
    // de una persona.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n✭✭✭✭✭✭ Calculadora de Índice de Masa Corporal (IMC) ✭✭✭✭✭✭");

        // Solicitar al usuario que ingrese su peso en kilogramos
        System.out.print("\n ➬ Qual es su peso en kilogramos ⁇ indicalo ➩ ");
        double peso = Double.parseDouble(sc.nextLine());

        // Solicitar al usuario que ingrese su altura en metros
        System.out.print(" ➬ Qual es su altura en metros ⁇ indicalo ➩ ");
        double altura = Double.parseDouble(sc.nextLine());

        // Calcular el IMC utilizando la fórmula: IMC = peso / (altura * altura)
        double imc = peso / (altura * altura);

        // Mostrar el IMC calculado
        System.out.println("\nSu Índice de Masa Corporal (IMC) es ➬ " + imc + "   Explicacion : El (IMC) se mide en unidades de kg/m² (kilogramos por metro cuadrado).");

        // Interpretar el IMC y mostrar el resultado

        interpretarIMC(imc);
        //IMC=El Índice de Masa Corporal (IMC) es una medida utilizada para estimar si una persona
        // tiene un peso saludable en relación con su altura. Funciona calculando la relación entre el peso y la altura
        // de una persona.




        sc.close();
    }

    // Método para interpretar el IMC y mostrar un mensaje correspondiente
    static void interpretarIMC(double imc) {
        //Las comparaciones utilizadas en las condiciones if representan diferentes
        // rangos del Índice de Masa Corporal (IMC) que se utilizan comúnmente para categorizar el peso de una persona según
        // los estándares de la Organización Mundial de la Salud (OMS).
        if (imc < 18.5) {
            // Si el IMC es menor que 18.5, se considera que la persona tiene bajo peso
            System.out.println("Interpretación del IMC \uD83D\uDE44➬ Bajo peso");
        } else if (imc < 25) {
            // Si el IMC no es menor que 18.5 (ya que ya se ha comprobado en la condición anterior)
            // pero es menor que 25, se considera que la persona tiene un peso dentro del rango normal.
            System.out.println("Interpretación del IMC ➬ Peso normal");
        } else if (imc < 30) {
            // Si el IMC no es menor que 25 (ya que ya se ha comprobado en la condición anterior) pero
            // es menor que 30, se considera que la persona tiene sobrepeso.
            System.out.println("Interpretación del IMC\uD83E\uDEE8 ➬ Sobrepeso");
        } else {
            //Si ninguna de las condiciones anteriores es verdadera (es decir, el IMC es 30 o superior),
            // se considera que la persona tiene obesidad
            System.out.println("Interpretación del IMC\uD83D\uDE28 ➬ Obesidad");
        }

    }
}


