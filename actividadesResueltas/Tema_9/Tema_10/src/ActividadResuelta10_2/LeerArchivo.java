package ActividadResuelta10_2;
import java.io.FileReader;
import java.io.IOException;




public class LeerArchivo {
    public static void main(String[] args) {
        String texto = "";
        FileReader in = null;

        try {
            in = new FileReader("C:\\ruta\\completa\\del\\archivo\\Main.java");
            int c = in.read();
            while (c != -1) {
                texto = texto + (char) c;
                c = in.read();
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        System.out.println("Contenido del archivo Main.java:");
        System.out.println(texto);
    }
}
