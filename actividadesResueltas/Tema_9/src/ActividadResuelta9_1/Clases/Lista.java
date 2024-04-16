package ActividadResuelta9_1.Clases;

import java.util.Arrays;


    public class Lista implements InterfaceCola {
        private String[] tabla; // Cambio a arreglo de cadenas de texto

        public Lista() {
            tabla = new String[0];
        }

        public void insertarPrincipio(String nuevo) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
            tabla[0] = nuevo;
        }

        public void insertarFinal(String nuevo) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = nuevo;
        }

        void insertarFinal(ActividadResuelta9_1.Clases.Lista otraLista) {
            int tamIni = tabla.length; // tamaño inicial tabla
            tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
            System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
        }

        public void insertar(int posicion, String nuevo) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
            tabla[posicion] = nuevo;
        }

        public String eliminar(int indice) {
            String eliminado = null;
            if (indice >= 0 && indice < tabla.length) {
                eliminado = tabla[indice];
                for (int i = indice + 1; i < tabla.length - 1; i++) {
                    tabla[i - 1] = tabla[i];
                }
                tabla = Arrays.copyOf(tabla, tabla.length - 1);
            }
            return eliminado;
        }

        public int buscar(String claveBusqueda) {
            int indice = -1;
            for (int i = 0; i < tabla.length && indice == -1; i++) {
                if (tabla[i].equals(claveBusqueda)) {
                    indice = i;
                }
            }
            return indice;
        }

        public int numeroElementos() {
            return tabla.length;
        }

        public void mostrar() {
            System.out.println(BLUE + "Lista: " + Arrays.toString(tabla) + RESET);
        }

        @Override
        public void encolar(String nuevo) {
            insertarFinal(nuevo);
        }

        @Override
        public String desencolar() {
            return eliminar(0);
        }

        static final String RESET = "\033[0m";  // Restablece el color a su estado predeterminado
        static final String YELLOW = "\033[0;33m"; // Color amarillo
        static final String BLUE = "\033[0;34m"; // Color azul
    }

