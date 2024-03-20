import java.util.Scanner;

public class ActividadResuelta6_11Diferente {

    // Métodos de salida de mensaje en consola con interlineado
    public static void mostrar(String texto) {
        System.out.println("\t" + texto); // Se imprime directamente en la consola
    }

    // Métodos de salida de mensaje en consola Sin interlineado
    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto); // Se imprime directamente en la consola
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Definir los conjuntos 1 y 2
        char[] conjunto1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] conjunto2 = {'w', 'b', 'q', 'd', 't', 'f', 'g', 'h', 'x', 'n', 'k', 'l', 'm',
                'j', 'o', 'e', 'c', 'r', 's', 't', 'u', 'v', 'a', 'i', 'y', 'z'};

        // Variable para controlar la ejecución del programa
        boolean salir = false;

        while (!salir) {
            // Pedir al usuario que ingrese el texto a codificar
            mostrar("Ingrese el texto a procesar: ");
            String texto = sc.nextLine();

            // Pedir al usuario que ingrese la acción a realizar
            mostrar("¿Qué desea hacer?\n1. Codificar\n2. Decodificar\n3. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Codificar el texto e imprimir el resultado
                    String textoCodificado = codificarTexto(conjunto1, conjunto2, texto);
                    mostrar("Texto codificado: " + textoCodificado);
                    break;
                case 2:
                    // Decodificar el texto e imprimir el resultado
                    String textoDecodificado = decodificarTexto(conjunto1, conjunto2, texto);
                    mostrar("Texto decodificado: " + textoDecodificado);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    mostrar("Opción no válida.");
            }
        }

        // Cerrar el scanner
        sc.close();
    }
    private static String codificarTexto(char[] conjunto1, char[] conjunto2, String texto) {
        return texto;
    }

    private static String decodificarTexto(char[] conjunto1, char[] conjunto2, String texto) {
        return texto;
    }

    // Función para codificar un carácter según los conjuntos 1 y 2
    public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
        // Convertir el carácter a minúscula para comparación
        c = Character.toLowerCase(c);

        // Buscar el índice del carácter en el conjunto 1
        int index = -1;
        for (int i = 0; i < conjunto1.length; i++) {
            if (conjunto1[i] == c) {
                index = i;
                break;
            }
        }

        // Si el carácter está en el conjunto 1, devolver su correspondiente en el conjunto 2
        if (index != -1) {
            return conjunto2[index];
        }

        // Si el carácter no está en el conjunto 1, devolver el mismo carácter
        return c;
    }

    // Función para decodificar un carácter según los conjuntos 1 y 2
    public static char decodifica(char[] conjunto1, char[] conjunto2, char c) {
        // Convertir el carácter a minúscula para comparación
        c = Character.toLowerCase(c);

        // Buscar el índice del carácter en el conjunto 2
        int index = -1;
        for (int i = 0; i < conjunto2.length; i++) {
            if (conjunto2[i] == c) {
                index = i;
                break;
            }
        }

        // Si el carácter está en el conjunto 2, devolver su correspondiente en el conjunto 1
        if (index != -1) {
            return conjunto1[index];
        }

        // Si el carácter no está en el conjunto 2, devolver el mismo carácter
        return c;
    }

    // Función para procesar un texto usando la función codifica o decodifica según la opción
    public static String procesarTexto(char[] conjunto1, char[] conjunto2, String texto, char opcion) {
        StringBuilder textoProcesado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            char cProcesado;
            if (opcion == 'C') {
                cProcesado = codifica(conjunto1, conjunto2, Character.toLowerCase(c));
            } else if (opcion == 'D') {
                cProcesado = decodifica(conjunto1, conjunto2, Character.toLowerCase(c));
            } else {
                // Opción inválida, devolver el mismo carácter
                cProcesado = c;
            }
            textoProcesado.append(cProcesado);
        }
        return textoProcesado.toString();
    }
}
