package ActividadResuelta_InstrumentoMusical.Clases;

import static ActividadResuelta_InstrumentoMusical.Clases.Nota.Do;

public class Campana extends Instrumento{
    private int numDinDon;
    public Campana(){

    }
    public Campana(int numDinDon){
        this.numDinDon = numDinDon;
    }
    @Override
   public void interpretar(){
        for (Nota n:melodia){
           switch (n){
               case SI -> System.out.println("Din");
               case Do -> System.out.println("Don");
           }
        }
        System.out.println("");
    }
}
