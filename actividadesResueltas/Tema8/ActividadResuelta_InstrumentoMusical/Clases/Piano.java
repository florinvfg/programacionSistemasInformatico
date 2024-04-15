package ActividadResuelta_InstrumentoMusical.Clases;

public class Piano extends Instrumento {
    public Piano() {
        super();
    }

    @Override
    public void interpretar() {
        for (Nota nota : melodia) {//recoremos el array que se genera en la llamada
            switch (nota) {
                case Do -> System.out.println("Do");
                case RE -> System.out.println("Re");
                case MI -> System.out.println("Mi");
                case FA -> System.out.println("Fa");
                case SOL -> System.out.println("Sol");
                case SI -> System.out.println("Si");

            }

        }
        System.out.println("");
    }
}