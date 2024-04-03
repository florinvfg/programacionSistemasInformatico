package ActividadResuelta7_13_Irina.Clases;

public class Pila {
    private Lista lista;

    public Pila() {
        lista = new Lista();
    }
        public void apilar (Integer elemento) {
            lista.insertarPrincipio(elemento);
        }
            public void desapilar() {
                lista.eliminar(0);
            }
            public void mostrar() {
                lista.mostrar();
            }
}

