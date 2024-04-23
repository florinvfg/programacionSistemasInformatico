package ActividadResuelta10_2;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String texto = "";
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("C:\\Users\\Programador\\IdeaProjects\\Tema_10\\src\\ActividadResuelta10_2\\Main.java"));
            String linea;
            while ((linea = in.readLine()) != null) {
                texto += linea + "\n";
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el flujo: " + ex.getMessage());

                }
            }
        }

        System.out.println("\nContenido del archivo Main.java:");
        System.out.println(texto);
    }
}
