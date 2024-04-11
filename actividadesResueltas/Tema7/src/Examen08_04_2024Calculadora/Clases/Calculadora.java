package Examen08_04_2024Calculadora.Clases;


import java.util.Scanner;

public class Calculadora {



    Scanner sc = new Scanner(System.in);
    // Declaramos una variable operacionesRealizadas de tipo String, inicializada con el valor "0"
    String operacionesRealizadas = String.valueOf(0);
    // Declaramos una variable contadorOperaciones de tipo entero, inicializada con el valor 0
    int contadorOperaciones = 0;


    public void incrementarContadorOperaciones() {//Método que incrementa el contador de operaciones en uno
        contadorOperaciones++;
    }

    /**
     * Devuelve el valor de la variable operacionesRealizadas.
     * @return El valor de operacionesRealizadas.
     */
    public String getOperacionesRealizadas() {
        return operacionesRealizadas;
    }

    /**
     *Establece el valor de la variable operacionesRealizadas.
     *
     * @param operacionesRealizadas El nuevo valor para operacionesRealizadas.
     */
    public void setOperacionesRealizadas(String operacionesRealizadas) {
        this.operacionesRealizadas = operacionesRealizadas;
    }

    /**
     *Realiza la suma de dos números y actualiza la variable operacionesRealizadas con la operación realizada.
     *
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * @return La suma de los dos números.
     */
    public double suma(double num1, double num2) {
        operacionesRealizadas=(num1 + " + " + num2 + " = " + (num1 + num2));
        incrementarContadorOperaciones();
        return num1 + num2;
    }

    /**
     *Realiza la resta de dos números y actualiza la variable operacionesRealizadas con la operación realizada.
     *
     * @param num1 El número del que se resta.
     * @param num2 El número que se resta
     * @return     La resta de los dos números.
     */
    public double resta(double num1, double num2) {
        operacionesRealizadas=(num1 + " - " + num2 + " = " + (num1 - num2));
        incrementarContadorOperaciones();
        return num1 - num2;
    }

    /**
     *Realiza la multiplicación de dos números y actualiza la variable operacionesRealizadas con la operación realizada.
     *
     * @param num1 primer número a multiplicar.
     * @param num2 segundo número a multiplicar.
     * @return     resultado de la multiplicación.
     */
    public double multiplicacion(double num1, double num2) {
        // Actualiza operacionesRealizadas con la operación de multiplicación realizada
        operacionesRealizadas=(num1 + " * " + num2 + " = " + (num1 * num2));
        // Incrementa el contador de operaciones
        incrementarContadorOperaciones();
        // Devuelve el resultado de la multiplicación
        return num1 * num2;
    }

    /**
     *  Realiza la división de dos números y actualiza la variable operacionesRealizadas con la operación realizada.
     *
     * @param dividendo número que se va a dividir (dividendo).
     * @param divisor   número por el que se va a dividir (divisor).
     * @return          cociente de la división.
     */
    public double division(double dividendo, double divisor) {
        // Verificamos que el divisor no sea cero para evitar una división por cero
        if (divisor != 0) {
            // Actualiza operacionesRealizadas con la operación de división realizada
            operacionesRealizadas=(dividendo + " / " + divisor + " = " + (dividendo / divisor));
            // Incrementa el contador de operaciones
            incrementarContadorOperaciones();
            // Devuelve el resultado de la división
            return dividendo / divisor;
        } else {
            // Lanza una excepción si se intenta dividir por cero
            throw new ArithmeticException("\uD83D\uDE2F ¡División por cero!");
        }
    }

    /**
     * Calcula el resto de la división de dos números enteros y actualiza la variable operacionesRealizadas con la operación realizada.
     *
     * @param dividendo número que se va a dividir (dividendo).
     * @param divisor   número por el que se va a dividir (divisor).
     * @return          El resto de la división.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */
    public int resto(int dividendo, int divisor) {
        // Verificamos que el divisor no sea cero para evitar una división por cero
        if (divisor != 0) {
            // Actualizamos operacionesRealizadas con la operación de división realizada
            operacionesRealizadas=(dividendo + " / " + divisor + " = " + (dividendo / divisor));
            // Incrementa el contador de operaciones
            incrementarContadorOperaciones();
            // Devuelve el resto de la división
            return dividendo % divisor;
        } else {
            // Lanza una excepción si se intenta dividir por cero
            throw new ArithmeticException("\uD83D\uDE2F ¡División por cero!");
        }
    }

    /**
     * Calculamos la potencia de un número elevado a otro número y actualiza la variable operacionesRealizadas con la operación realizada.
     *
     * @param base      base de la potencia.
     * @param exponente exponente de la potencia.
     * @return          resultado de la potencia.
     */
    public double exponencial(double base, double exponente) {
        // Calculamos la potencia de base elevado a exponente
        double resultado = Math.pow(base, exponente);
        // Actualizamos operacionesRealizadas con la operación de potencia realizada
        operacionesRealizadas=(base + " ^ " + exponente + " = " + Math.pow(base, exponente));
        // Incrementa el contador de operaciones
        incrementarContadorOperaciones();
        return Math.pow(base, exponente);
    }

    /**
     * Devuelvemos  el valor actual del contador de operaciones.
     *
     * @return      el valor del contador de operaciones.
     */
    public String getContadorOperaciones() {
        return String.valueOf(contadorOperaciones);
    }
}
