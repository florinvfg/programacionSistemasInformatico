package ActividadResuelta7_13.Clases;

public class Pila {

    private Lista lista;

    public Pila() {
        lista = new Lista();
    }

    public void apilar(Integer elemento) {
        lista.insertarFinal(elemento);
    }

    public Integer desapilar() {
        return lista.eliminar(lista.tabla.length - 1);
    }

    public void mostrar() {
        lista.mostrar();

    }

}
