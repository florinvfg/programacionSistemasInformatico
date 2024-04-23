package ExprecionesRegulares;

public class Services {

    public static boolean validarDNI(String texto) {
        boolean exito = false;
            if (texto.matches("\\b\\d{8}[A-HJ-NP-TV-Za-hj-np-tv-z]\\b")) {
                String letraDNI[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
                int numeros = Integer.parseInt(texto.substring(0, 8));
                int posicion = numeros % 23;
                if (texto.substring(8, 9).equalsIgnoreCase(letraDNI[posicion])) {
                    exito = true;
                }
            }
        return exito;
    }

}
