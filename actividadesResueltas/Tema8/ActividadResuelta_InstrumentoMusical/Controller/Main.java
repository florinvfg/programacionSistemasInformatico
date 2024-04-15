package ActividadResuelta_InstrumentoMusical.Controller;

import ActividadResuelta_InstrumentoMusical.Clases.Campana;
import ActividadResuelta_InstrumentoMusical.Clases.Nota;
import ActividadResuelta_InstrumentoMusical.Clases.Piano;

public class Main {
    public static void main(String[] args) {
        Nota cancion[]={Nota.MI,Nota.RE,Nota.MI,Nota.SI,Nota.RE,Nota.Do,Nota.LA};
        Piano miPiano=new Piano();
        for (Nota n:cancion){
            miPiano.agregarNota(n);
        }

miPiano.interpretar();
        Campana miCampana=new Campana();
        for (Nota n:cancion){
            miCampana.agregarNota(n);
        }
        miCampana.interpretar();
    }
}
