package Unidad3;
/*Desarollar un juego que ayude a mejorar el calculo mental de la suma.El jugador tendra que introducir la solucion de la suma de dos numeros
* aleatorios comprendidos entre 1 y 100.Mientras la solucion sea correcta, el juego continuara.En caso contrario,el
* programa terminara y mostrara el numero  de operaciones realizadas correctamente*/

import javax.swing.*;
public class ActividadResuelta3_5ConMenu {
    //con monstrar en pantalla
    public static void main(String[] args) {
String menu=" ";
byte opcion=0;
char simbolo=' ';
String salida=" ";
int operando1,operando2,resultado=0,resultadoUser=0,contador=0;
do {
    menu=" ";
    menu+="1. Sumar \n";
    menu+="2.Restar\n";
    menu+="3.Multiplicar\n";
    menu+="4.Salir \n";
    // Se solicita al usuario elegir una opción del menú.
    opcion=(byte) Integer.parseInt(JOptionPane.showInputDialog(menu));
    // Se generan dos operandos aleatorios entre 1 y 100.
    operando1= (int) (Math.random()*100+1);
    operando2= (int) (Math.random()*100+1);
    // Se utiliza una estructura switch para realizar la operación correspondiente según la opción elegida.
    switch (opcion){
        case 1 ->{
            simbolo= '+';
            resultado=operando1 + operando2;
            salida=operando1 + " " + simbolo + operando2;
        }
        case 2 ->{
            simbolo= '-';
            resultado=operando1 - operando2;
            salida=operando1 + " " + simbolo + operando2;
        }
        case 3 ->{
            simbolo= '*';
            resultado=operando1 * operando2;
            salida=operando1 + " " + simbolo * operando2;
        }
    }
    if (opcion!=4) {// Si la opción elegida no es salir (4), se solicita al usuario ingresar el resultado.
        if (opcion != 4) {
        resultadoUser=Integer.parseInt(JOptionPane.showInputDialog(salida));
    }
    ++contador; // Se incrementa el contador de intentos.
}while (opcion!=4 && resultadoUser==resultado);
JOptionPane.showMessageDialog(null,contador);// Se muestra un mensaje con la cantidad de intentos realizados.

    }
}
