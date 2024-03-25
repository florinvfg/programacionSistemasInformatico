/**
 *@autor [̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
 * @param Enunciado:
 * El preprocesador del lenguaje C elimina los comentarios (/* ... */
/**del código fuente antes de compilar. Diseña un programa que lea por teclado una sentencia en C,
 *y elimine los comentarios.
 *  Sentencia:
 *  if (a==3)  igual a tres  a++;incrementamos a
 *  Salida: if (a==3) a++;
        */



import java.util.*;

public class ActividadDeAplicacion6_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese la sentencia en C
        mostrar("\n\tIngrese la sentencia en C:");
        /**
         * Ejemplo de sentencia:
         * if (numero % 2 == 0) {
         *     printf("El número es par");
         * } else {
         *     printf("El número es impar");
         * }
         * */
        String sentencia = sc.nextLine();

        // Eliminar los comentarios de la sentencia
        String sentenciaSinComentarios = eliminarComentarios(sentencia);

        // Mostrar la sentencia sin comentarios
        mostrar("Salida:");
        mostrar(sentenciaSinComentarios);
    }

    // Función para eliminar los comentarios de una sentencia en C
    public static String eliminarComentarios(String sentencia) {
        StringBuilder resultado = new StringBuilder();
        boolean enComentario = false;

        for (int i = 0; i < sentencia.length(); i++) {
            char actual = sentencia.charAt(i);

            if (enComentario) {
                // Si estamos dentro de un comentario de bloque, buscamos el cierre del comentario
                if (actual == '*' && i < sentencia.length() - 1 && sentencia.charAt(i + 1) == '/') {
                    enComentario = false;
                    i++; // Saltar el siguiente carácter '/'
                }
            } else {
                // Si no estamos dentro de un comentario, añadimos el carácter al resultado
                if (actual == '/' && i < sentencia.length() - 1 && sentencia.charAt(i + 1) == '*') {
                    // Inicio de comentario de bloque
                    enComentario = true;
                    i++; // Saltar el siguiente carácter '*'
                } else if (actual == '/' && i < sentencia.length() - 1 && sentencia.charAt(i + 1) == '/') {
                    // Comentario de línea, ignorar el resto de la línea
                    break;
                } else {
                    resultado.append(actual);
                }
            }
        }

        return resultado.toString();

    }
    /**
     * Metodos de salida de mensaje en consola con interlineado
     * @param texto*/

    public static void mostrar (String texto){
        System.out.println("\t" + texto);
    }
    /**
     * Metodos de salida de mensaje en consola Sin interlineado
     * @param texto*/

    public static void mostrarSinLn (String texto) {
        System.out.print("\t" + texto);

    }
}
