import java.util.Arrays;

//[̲̅Y][̲̅o][̲̅ ][̲̅V][̲̅F][̲̅G]
public class BusquedaOrdenada {
    public static void main(String[] args) {
    int numeros[]={13,15,18,12,11,16,19,17};
    mostrar("Longitud" +numeros.length);
    mostrar("Sin ordenar");
    mostrar(Arrays.toString(numeros));
    Arrays.sort(numeros);
    mostrar("Ordenado");
    mostrar(Arrays.toString(numeros));
    //Despues de ordenar el Array se puede buscar un elemnto con la clase binarySeach(nombreArray,elemntoBuscar
        //el resultado de esta clase es un entero si es positivo es el indice donde se encuntra
        //si es negativo que 0 es el indice donde deberia ir posicionado ese elemnto buscado pero que no se encuentra
        int pos=Arrays.binarySearch(numeros,15);
        mostrar("posicion " + pos);
if (pos<0){
    mostrar("Este numero no existe");
    int indiceInsertar=pos-1;
}
        int indiceInsertar=pos-1;
mostrar("Si el numero no existe en la tabla deberia coger la posicion 0");




    }
    public static void mostrar(String texto){System.out.println("\t"+texto);}



}

