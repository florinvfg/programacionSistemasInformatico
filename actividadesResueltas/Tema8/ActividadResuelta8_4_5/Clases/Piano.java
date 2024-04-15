package ActividadResuelta8_4_5.Clases;

public class Piano extends Instrumento {
    // podemos añadir tantos atributos y metodos como necesitamos
    public Piano() {
        super(); //constructor de superclase
    }
    @Override //implementamos el metodo abstracto
    //recoremos las notas y las interpretaremos de la forma especifica del piano.
    public void interpretar () {
        for (Nota nota : melodia) { //obtener el objeto para  la nota
            switch (nota) {
                case DO:
                    System.out.println("do ");
                    break;

                case RE:
                    System.out.println("re ");
                    break;

                case MI:
                    System.out.println("mi ");
                    break;

                case FA:
                    System.out.println("fa ");
                    break;

                case SOL:
                    System.out.println("sol ");
                    break;

                case LA:
                    System.out.println("la ");
                    break;

                case SI:
                    System.out.println("si ");
                    break;
            }
        }
        System.out.println("");
    }
}



