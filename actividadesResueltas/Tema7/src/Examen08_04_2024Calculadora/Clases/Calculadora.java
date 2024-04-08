package Examen08_04_2024Calculadora.Clases;


import java.util.Scanner;

public class Calculadora {



    Scanner sc = new Scanner(System.in);
    String operacionesRealizadas = String.valueOf(0);
    int contadorOperaciones = 0;

    /**
     *
     */
    public void incrementarContadorOperaciones() {
        contadorOperaciones++;
    }

    /**
     *
     * @return
     */
    public String getOperacionesRealizadas() {
        return operacionesRealizadas;
    }

    /**
     *
     * @param operacionesRealizadas
     */
    public void setOperacionesRealizadas(String operacionesRealizadas) {
        this.operacionesRealizadas = operacionesRealizadas;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public double suma(double num1, double num2) {
        operacionesRealizadas=(num1 + " + " + num2 + " = " + (num1 + num2));
        incrementarContadorOperaciones();
        return num1 + num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public double resta(double num1, double num2) {
        operacionesRealizadas=(num1 + " - " + num2 + " = " + (num1 - num2));
        incrementarContadorOperaciones();
        return num1 - num2;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public double multiplicacion(double num1, double num2) {
        operacionesRealizadas=(num1 + " * " + num2 + " = " + (num1 * num2));
        incrementarContadorOperaciones();
        return num1 * num2;
    }

    /**
     *
     * @param dividendo
     * @param divisor
     * @return
     */
    public double division(double dividendo, double divisor) {
        if (divisor != 0) {
            operacionesRealizadas=(dividendo + " / " + divisor + " = " + (dividendo / divisor));
            incrementarContadorOperaciones();
            return dividendo / divisor;
        } else {
            throw new ArithmeticException("\uD83D\uDE2F ¡División por cero!");
        }
    }

    /**
     *
     * @param dividendo
     * @param divisor
     * @return
     */
    public int resto(int dividendo, int divisor) {
        if (divisor != 0) {
            operacionesRealizadas=(dividendo + " / " + divisor + " = " + (dividendo / divisor));
            incrementarContadorOperaciones();
            return dividendo % divisor;
        } else {
            throw new ArithmeticException("\uD83D\uDE2F ¡División por cero!");
        }
    }

    /**
     *
     * @param base
     * @param exponente
     * @return
     */
    public double exponencial(double base, double exponente) {
        operacionesRealizadas=(base + " ^ " + exponente + " = " + Math.pow(base, exponente));
        incrementarContadorOperaciones();
        return Math.pow(base, exponente);
    }

    /**
     *
     * @return
     */
    public String getContadorOperaciones() {
        return String.valueOf(contadorOperaciones);
    }
}
